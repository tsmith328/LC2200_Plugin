/*
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.team38.assembly.lC2200.Program
import org.team38.assembly.lC2200.Directive
import org.team38.assembly.lC2200.Instruction
import org.team38.assembly.lC2200.NOOPDirective
import org.team38.assembly.lC2200.WordDirective
import org.team38.assembly.lC2200.LADirective
import org.team38.assembly.lC2200.OInstruction
import org.team38.assembly.lC2200.RInstruction
import org.team38.assembly.lC2200.JInstruction
import org.team38.assembly.lC2200.IInstruction
import org.team38.assembly.lC2200.RInstructionTrans
import org.team38.assembly.lC2200.IInstructionImmTrans
import org.team38.assembly.lC2200.IInstructionOffsetTrans
import org.team38.assembly.lC2200.IInstructionLabelTrans
import org.team38.assembly.lC2200.JInstructionTrans
import org.team38.assembly.lC2200.RegTrans
import org.eclipse.emf.common.util.EList;
import java.util.HashMap;
import org.team38.assembly.LabelHandler
import org.team38.assembly.lC2200.Line

/**
 * Generates binary output from the assembled instructions
 * 
 */
class LC2200Generator extends AbstractGenerator {
	/**
	 * A buffer which will accumulate the generated binary
	 */
	private StringBuffer assembledOutput;
	 
	/**
	 * A hash map storing the location of all labels for calculating branches
	 */
	private HashMap<String, Integer> labelTable;
	
	/**
	 * An integer used to keep track of current line being assembled
	 */
	private int offset;
	
	/**
	 * The name of the generated file
	 */
	private String filename;

	/**
	 * doGenerate is called when user saves their assembly code and will
	 * save generated binary output to a file. The code is scanned to obtain
	 * label locations, and then compiled line by line.
	 * 
	 * @param resource - Used to obtain the parse tree
	 * @param fsa - Used to save the file to disk
	 * @param context - Unused 
	 */
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		assembledOutput = new StringBuffer();		
		offset = 0;
		
		var e_root = resource.getContents().get(0);
		
		if(e_root != null) {			
			if (e_root.eClass().getName().equals("Program")) {
				labelTable = LabelHandler.populateLabels(e_root as Program);
				compileProgram(e_root as Program);
			}		
		}
		
		filename = resource.toString();
		filename = filename.substring(0, filename.length() - 2) + "bin";
		
		fsa.generateFile(filename, assembledOutput.toString().trim());
	}
	
	
	/**
	 * Handle the root of the parse tree. Call appropriate
	 * method for Directives and Instructions respectively
	 * 
	 * @param root - The root of the parse tree
	 */
	def compileProgram(Program root) {
		var EList<Line> lines = root.getLines();
		
		for(line : lines) {
			if (line.eClass().getName().equals("Directive")) {
				compileDirective(line as Directive);
			}
			else if (line.eClass().getName().equals("Instruction")) {
				compileInstruction(line as Instruction);
			}
			offset++;
		}	
	}
	
	/**
	 * Handle the Directive node of the parse tree. Call the 
	 * method for NOOPDirective, WordDirective, and LADirective 
	 * node types.
	 * 
	 * @param dir - The directive node of the parse tree
	 */
	def compileDirective(Directive dir) {
		var dirType = dir.getDirective()
		if (dirType.eClass().getName().equals("NOOPDirective")) {
			compileNOOP(dirType as NOOPDirective);
		}
		else if (dirType.eClass().getName().equals("WordDirective")) {
			compileWord(dirType as WordDirective);
		}
		else if (dirType.eClass().getName().equals("LADirective")) {
			compileLA(dirType as LADirective);
		}
	}
	
	/**
	 * Handle the Instruction node of the parse tree. Call the method corresponding
	 * to the instruction type.
	 * 
	 * @param instr - The instruction node of the parse tree
	 */
	def compileInstruction(Instruction instr) {
		var instrType = instr.getInstruction()
		if(instrType.eClass().getName().equals("IInstruction")) {
			compileIInstruction(instrType as IInstruction);
		}
		else if(instrType.eClass().getName().equals("RInstruction")) {
			compileRInstruction(instrType as RInstruction);
		}	
		else if(instrType.eClass().getName().equals("JInstruction")) {
			compileJInstruction(instrType as JInstruction);
		}	
		else if(instrType.eClass().getName().equals("OInstruction")) {
			compileOInstruction(instrType as OInstruction);
		}			
	}
	
	/**
	 * Generate the binary output for an LADirective node. Use helper
	 * methods to convert labels/registers/opcode to binary form.
	 * 
	 * @param la - The node to generate binary for
	 */
	def compileLA(LADirective la) {
		var labelTrans = la.getLabel();
		var regTrans = la.getReg();
		var reg = regTrans.getReg();
		var immBin = "";
		if (labelTrans != null) {
			var label = labelTrans.getLabel();
			if (label != null) {
				var labelLine = labelTable.get(label);
				if(labelLine != null) {
					immBin = immToBinary(Integer.toString(labelLine), 5);
				} else {
					immBin = "00000";
				}
			}
		}
		var reg1Bin = regToBinary(reg);
		var reg2Bin = regToBinary("$zero");
		var opBin = opToBinary("addi");
		
		assembledOutput.append('''�opBin� �reg1Bin� �reg2Bin� �immBin�
		''');
		
	}
	
	/**
	 * Generate the binary output for the NOOP node.
	 * 
	 * @param noop - The noop node
	 */
	def compileNOOP(NOOPDirective noop) {
		assembledOutput.append('''0000000000000000
		''');
	}
	
	/**
	 * Generate the binary for the WordDirective node.
	 * Use a helper method to convert the immediate to binary.
	 * 
	 * @param word - The word node
	 */
	def compileWord(WordDirective word) {		
		var wordImm = word.getImm();
		
		var wordImmBin = immToBinary(wordImm, 16)
		assembledOutput.append('''�wordImmBin�
		''');
	}
	
	/**
	 * Generate the binary for the I-type instruction node. Use
	 * helper methods to convert registers/opcode/immediate to binary.
	 * 
	 * @param iInstr - The IInstruction node
	 */
	def compileIInstruction(IInstruction iInstr) {
		var opTrans = iInstr.getI_opcode();
		var op = "";
		if(opTrans instanceof IInstructionImmTrans) {
			op = (opTrans as IInstructionImmTrans).getI_opcode();
		} else if(opTrans instanceof IInstructionOffsetTrans) {
			op = (opTrans as IInstructionOffsetTrans).getI_opcode();
		}		
		else if (opTrans instanceof IInstructionLabelTrans){
			op = (opTrans as IInstructionLabelTrans).getI_opcode();
		}
		var reg1Trans = iInstr.getReg1();
		var reg1 = (reg1Trans as RegTrans).getReg();
		var reg2Trans = iInstr.getReg2();
		var reg2 = (reg2Trans as RegTrans).getReg();
		var imm = iInstr.getImm();
		var labelTrans = iInstr.getLabel();
		
		var opBin = opToBinary(op.toString());
		var reg1Bin = regToBinary(reg1.toString());
		var reg2Bin = regToBinary(reg2.toString());
		var immBin = "";
		
		if(op.equals("beq")) {
			if (labelTrans != null) {
				var label = labelTrans.getLabel();
				if (label != null) {
					var labelLine = labelTable.get(label);
					if(labelLine != null) {
						var dif = labelLine - offset;
						if(dif < 15 && dif > -16) {
							immBin = immToBinary(Integer.toString(dif), 5);
						} else {
							immBin = "xxxxx";
						}		
					} else {
						immBin = "xxxxx";
					}
				}
			}
			
		} else {
			immBin = immToBinary(imm, 5);
		}		
		
		assembledOutput.append('''�opBin� �reg1Bin� �reg2Bin� �immBin�
		''');
	}
	
	/**
	 * Generate the binary for the R-type instruction. Use
	 * helper methods to convert registers/opcode/immediate to binary.
	 * 
	 * @param rInstr - The RInstruction node
	 */
	def compileRInstruction(RInstruction rInstr) {
		var opTrans = rInstr.getR_opcode();
		var op = (opTrans as RInstructionTrans).getR_opcode();
		var reg1Trans = rInstr.getReg1();
		var reg1 = (reg1Trans as RegTrans).getReg();
		var reg2Trans = rInstr.getReg2();
		var reg2 = (reg2Trans as RegTrans).getReg();
		var reg3Trans = rInstr.getReg3();
		var reg3 = (reg3Trans as RegTrans).getReg();
		
		var opBin = opToBinary(op.toString());
		var reg1Bin = regToBinary(reg1.toString());
		var reg2Bin = regToBinary(reg2.toString());
		var reg3Bin = regToBinary(reg3.toString());
		
		assembledOutput.append('''�opBin� �reg1Bin� �reg2Bin� �reg3Bin� 0
		''');
	}
	
	/**
	 * Generate the binary for the J-type instruction. Use
	 * helper methods to convert registers/opcode/immediate to binary.
	 * 
	 * @param jInstr - The JInstruction node
	 */
	def compileJInstruction(JInstruction jInstr) {
		var opTrans = jInstr.getJ_opcode();
		var op = (opTrans as JInstructionTrans).getJ_opcode();
		var reg1Trans = jInstr.getReg1();
		var reg1 = (reg1Trans as RegTrans).getReg();
		var reg2Trans = jInstr.getReg2();
		var reg2 = (reg2Trans as RegTrans).getReg();
		
		var opBin = opToBinary(op.toString());
		var reg1Bin = regToBinary(reg1.toString());
		var reg2Bin = regToBinary(reg2.toString());
		
		assembledOutput.append('''�opBin� �reg1Bin� �reg2Bin� 00000
		''');
	}
	
	/**
	 * Generate the binary for the O-type instruction. Use
	 * helper methods to convert the opcode to binary.
	 * 
	 * @param oInstr - The OInstruction node
	 */
	def compileOInstruction(OInstruction oInstr) {
		var op = oInstr.getO_opcode();
		
		var opBin = opToBinary(op);
		assembledOutput.append('''�opBin� 00000000000 0
		''');
	}
	
	/**
	 * Helper method to convert opcodes into binary form.
	 * 
	 * @param op - The opcode to be converted to binary
	 */
	def opToBinary(String op) {
		switch (op) {
			case "add":
				return "000"
			case "nand":
				return "001"
			case "addi":
				return "010"
			case "lw":
				return "011"
			case "sw":
				return "100"
			case "beq":
				return "101"
			case "jalr":
				return "110"
			case "halt":
				return "111"
			default:
				return ""
		}
	}
	
	/**
	 * Helper method to convert registers to binary.
	 * 
	 * @param reg - The register to convert to binary
	 */
	def regToBinary(String reg) {
		switch (reg) {
			case "$zero":
				return "0000"
			case "$at":	
				return "0001"
			case "$v0":	
				return "0010"
			case "$a0":	
				return "0011"
			case "$a1":	
				return "0010"
			case "$a2":	
				return "0101"
			case "$t0":	
				return "0110"
			case "$t1":	
				return "0111"
			case"$t2":	
				return "1000"
			case "$s0":	
				return "1001"
			case "$s1":	
				return "1010"
			case "$s2":	
				return "1011"
			case"$k0":	
				return "1100"
			case "$sp":
				return "1101"	
			case "$fp":	
				return "1110"
			case "$ra":
				return "1111"
			default:
				return ""
		}
	}
	
	/**
	 * Helper method to convert immediate values into a binary string.
	 * 
	 * @param imm - The immediate to convert
	 * @param bitLength - The length of the final bit string
	 */
	def immToBinary(String imm, int bitLength) {
		var immBin = ""		
		//Handle Hex or Decimal separately
		try {
			if(imm.indexOf("0x") != -1) {
				immBin = Integer.toBinaryString(Integer.parseInt(imm.substring(2), 16));
			} else {
				immBin = Integer.toBinaryString(Integer.parseInt(imm));
			}
		} catch(NumberFormatException e) {			
			immBin = "xxxxx";
		}		
		
		//Get string 5 bits long
		if(immBin.length() > bitLength) {
			immBin = immBin.substring(immBin.length() - bitLength, immBin.length())
		}
		else {
			while(immBin.length() - bitLength < 0) {
				immBin = "0" + immBin
			}
		}
		
		return immBin
		
	}
	

    
}
