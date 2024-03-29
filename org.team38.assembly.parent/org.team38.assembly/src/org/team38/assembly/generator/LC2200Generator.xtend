/*
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.generator

import java.util.HashMap
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.team38.assembly.LabelHandler
import org.team38.assembly.lC2200.Directive
import org.team38.assembly.lC2200.IInstruction
import org.team38.assembly.lC2200.IInstructionImmTrans
import org.team38.assembly.lC2200.IInstructionLabelTrans
import org.team38.assembly.lC2200.IInstructionOffsetTrans
import org.team38.assembly.lC2200.Instruction
import org.team38.assembly.lC2200.JInstruction
import org.team38.assembly.lC2200.JInstructionTrans
import org.team38.assembly.lC2200.LADirective
import org.team38.assembly.lC2200.NOOPDirective
import org.team38.assembly.lC2200.OInstruction
import org.team38.assembly.lC2200.Program
import org.team38.assembly.lC2200.RInstruction
import org.team38.assembly.lC2200.RInstructionTrans
import org.team38.assembly.lC2200.RegTrans
import org.team38.assembly.lC2200.WordDirective
import org.eclipse.ui.PlatformUI
import org.team38.assembly.AssembledView

/**
 * Generates binary output from the assembled instructions
 * 
 */
class LC2200Generator extends AbstractGenerator {
	/**
	 * A buffer which will accumulate the pretty print generated binary
	 */
	private StringBuffer assembledOutput;
	
	/**
	 * A buffer which will accumulate the 16 bit generated hex
	 */
	private StringBuffer hex16Output;
	
	/**
	 * A buffer which will accumulate the 32 bit generated hex
	 */
	private StringBuffer hex32Output;
	 
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
	 * The view which shows the assembled code
	 */
	private AssembledView assembled;
	
	/**
	 * The ID for the view which shows assembled code
	 */
	private final String ASSEMBLED_VIEW_ID = "org.team38.assembly.assembledview"

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
		hex16Output = new StringBuffer();
		hex32Output = new StringBuffer();
		offset = 0;
		
		var e_root = resource.getContents().get(0);
		
		if(e_root != null) {			
			if (e_root.eClass().getName().equals("Program")) {
				labelTable = LabelHandler.populateLabels(e_root as Program);
				compileProgram(e_root as Program);
			}		
		}
		
		filename = resource.toString();

		var binFile = filename.substring(filename.lastIndexOf("/"), filename.length() - 2) + "bin";
		var hex16File = filename.substring(filename.lastIndexOf("/"), filename.length() - 3) + "-16.lc";
		var hex32File = filename.substring(filename.lastIndexOf("/"), filename.length() - 3) + "-32.lc";
		fsa.generateFile(binFile, assembledOutput.toString().trim());
		fsa.generateFile(hex16File, hex16Output.toString().trim());
		fsa.generateFile(hex32File, hex32Output.toString().trim());
		
		// Updates the assembled code view to show updated assembly code
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			override run() {
				var wb = PlatformUI.getWorkbench();
				var active = wb.getActiveWorkbenchWindow();
				var page = active.getActivePage();
				assembled = page.showView(ASSEMBLED_VIEW_ID) as AssembledView;
				//assembled = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(ASSEMBLED_VIEW_ID)
						//		as AssembledView;
				assembled.updateView(assembledOutput.toString().trim());
			}
		});
	}
	
	
	/**
	 * Handle the root of the parse tree. Call appropriate
	 * method for Directives and Instructions respectively
	 * 
	 * @param root - The root of the parse tree
	 */
	def private compileProgram(Program root) {
		var EList<EObject> nodes = root.eContents();
		
		for(node : nodes) {
			if (node.eClass().getName().equals("Directive")) {
				compileDirective(node as Directive);
				offset++;
			} else if (node.eClass().getName().equals("Instruction")) {
				compileInstruction(node as Instruction);
				offset++;
			} else if(node.eClass().getName().equals("LineEnd")) {
				assembledOutput.append("\n");
			}			
		}	
	}
	
	/**
	 * Handle the Directive node of the parse tree. Call the 
	 * method for NOOPDirective, WordDirective, and LADirective 
	 * node types.
	 * 
	 * @param dir - The directive node of the parse tree
	 */
	def private compileDirective(Directive dir) {
		var dirType = dir.getDirective();
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
	def private compileInstruction(Instruction instr) {
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
	def private compileLA(LADirective la) {
		var labelTrans = la.getLabel();
		var regTrans = la.getReg();
		
		var reg = regTrans.getReg();
		var immBin16 = "";
		var immBin32 = "";
		var label = "";
		
		//Get address of label for immediate value
		if (labelTrans != null) {
			label = labelTrans.getLabel();
			if (label != null) {
				var labelLine = labelTable.get(label);
				if(labelLine != null) {
					immBin16 = immToBinary(Integer.toString(labelLine), 5);
					immBin32 = immToBinary(Integer.toString(labelLine), 20);
				} else {
					immBin16 = "xxxxx";
					immBin32 = "xxxxxxxxxxxxxxxxxxxx"
				}
			} else {
				label = "";
			}
		}
		
		var reg1Bin = regToBinary(reg);
		var reg2Bin = regToBinary("$zero");
		var opBin16 = opToBinary16("addi");
		var opBin32 = opToBinary32("addi");
		
		if(opBin16 != "") {
			assembledOutput.append('''OP: �opBin16�  RX: �reg1Bin�  RY: �reg2Bin�  IM: �immBin16�''');
						
			var hex16 = binToHex('''�opBin16��reg1Bin��reg2Bin��immBin16�''');
			hex16Output.append(hex16 + " ");
		} else {
			assembledOutput.append('''Not supported in 16-bit architecture''');
		}		
		
		var hex32 = binToHex('''�opBin32��reg1Bin��reg2Bin��immBin32�''');
		hex32Output.append(hex32 + " ")
		
	}
	
	/**
	 * Generate the binary output for the NOOP node.
	 * 
	 * @param noop - The noop node
	 */
	def private compileNOOP(NOOPDirective noop) {

		assembledOutput.append('''NOOP: 0000000000000000''');
		
		hex16Output.append("0000 ");
		hex32Output.append("00000000 ");
	}
	
	/**
	 * Generate the binary for the WordDirective node.
	 * Use a helper method to convert the immediate to binary.
	 * 
	 * @param word - The word node
	 */
	def private compileWord(WordDirective word) {		
		var wordImm = word.getImm();
		
		var wordImmBin16 = immToBinary(wordImm, 16);
		var wordImmBin32 = immToBinary(wordImm, 32);
		
		assembledOutput.append('''WORD: �wordImmBin16�''');
		
		var hex16 = binToHex('''�wordImmBin16�''');
		hex16Output.append(hex16 + " ");
		
		var hex32 = binToHex('''�wordImmBin32�''');
		hex32Output.append(hex32 + " ");
	}
	
	/**
	 * Generate the binary for the I-type instruction node. Use
	 * helper methods to convert registers/opcode/immediate to binary.
	 * 
	 * @param iInstr - The IInstruction node
	 */
	def private compileIInstruction(IInstruction iInstr) {		
		var op = "";
		var opTrans = iInstr.getI_opcode();
		
		if(opTrans instanceof IInstructionImmTrans) {
			op = (opTrans as IInstructionImmTrans).getI_opcode();
		} else if(opTrans instanceof IInstructionOffsetTrans) {
			op = (opTrans as IInstructionOffsetTrans).getI_opcode();
		} else if (opTrans instanceof IInstructionLabelTrans){
			op = (opTrans as IInstructionLabelTrans).getI_opcode();
		}
		var reg1Trans = iInstr.getReg1();		
		var reg2Trans = iInstr.getReg2();
		var labelTrans = iInstr.getLabel();
		
		var reg1 = (reg1Trans as RegTrans).getReg();
		var reg2 = (reg2Trans as RegTrans).getReg();
		var imm = iInstr.getImm();
		
		var opBin16 = opToBinary16(op.toString());
		var opBin32 = opToBinary32(op.toString());
		var reg1Bin = regToBinary(reg1.toString());
		var reg2Bin = regToBinary(reg2.toString());
		var immBin16 = "";
		var immBin32 = "";
		
		//Find offset to branched label
		if(op.equals("beq")) {
			if (labelTrans != null) {
				var label = labelTrans.getLabel();
				if (label != null) {
					var labelLine = labelTable.get(label);
					if(labelLine != null) {
						var dif = labelLine - offset;
						immBin16 = immToBinary(Integer.toString(dif), 5);
						immBin32 = immToBinary(Integer.toString(dif), 20);
					} else {
						immBin16 = "xxxxx";
						immBin32 = "xxxxxxxxxxxxxxxxxxxx"
					}
				}
			}			
		} else {
			immBin16 = immToBinary(imm, 5);
			immBin32 = immToBinary(imm, 20);
		}		
		
		if(opBin16 != "") {
			assembledOutput.append('''OP: �opBin16�  RX: �reg1Bin�  RY: �reg2Bin�  IM: �immBin16�''');			
			var hex16 = binToHex('''�opBin16��reg1Bin��reg2Bin��immBin16�''')
			hex16Output.append(hex16 + " ");
		} else {
			assembledOutput.append('''Not supported in 16-bit architecture''');
		}	
		var hex32 = binToHex('''�opBin32��reg1Bin��reg2Bin��immBin32�''')
		hex32Output.append(hex32 + " ");
		
	}
	
	/**
	 * Generate the binary for the R-type instruction. Use
	 * helper methods to convert registers/opcode/immediate to binary.
	 * 
	 * @param rInstr - The RInstruction node
	 */
	def private compileRInstruction(RInstruction rInstr) {
		var opTrans = rInstr.getR_opcode();		
		var reg1Trans = rInstr.getReg1();		
		var reg2Trans = rInstr.getReg2();		
		var reg3Trans = rInstr.getReg3();
		
		var op = (opTrans as RInstructionTrans).getR_opcode();
		var reg1 = (reg1Trans as RegTrans).getReg();
		var reg2 = (reg2Trans as RegTrans).getReg();
		var reg3 = (reg3Trans as RegTrans).getReg();
		
		var opBin16 = opToBinary16(op.toString());
		var opBin32 = opToBinary32(op.toString());
		var reg1Bin = regToBinary(reg1.toString());
		var reg2Bin = regToBinary(reg2.toString());
		var reg3Bin = regToBinary(reg3.toString());
		
		if(opBin16 != "") {
			assembledOutput.append('''OP: �opBin16�  RX: �reg1Bin�  RY: �reg2Bin�  RZ: �reg3Bin�  UNUSED: 0''');
			
			var hex16 = binToHex('''�opBin16��reg1Bin��reg2Bin��reg3Bin�0''')
			hex16Output.append(hex16 + " ");
		} else {
			assembledOutput.append('''Not supported in 16-bit architecture''');
		}	
		
		var hex32 = binToHex('''�opBin32��reg1Bin��reg2Bin�0000000000000000�reg3Bin�''');
		hex32Output.append(hex32 + " ");
	}
	
	/**
	 * Generate the binary for the J-type instruction. Use
	 * helper methods to convert registers/opcode/immediate to binary.
	 * 
	 * @param jInstr - The JInstruction node
	 */
	def private compileJInstruction(JInstruction jInstr) {
		var opTrans = jInstr.getJ_opcode();		
		var reg1Trans = jInstr.getReg1();		
		var reg2Trans = jInstr.getReg2();
		
		
		var op = (opTrans as JInstructionTrans).getJ_opcode();
		var reg1 = (reg1Trans as RegTrans).getReg();
		var reg2 = (reg2Trans as RegTrans).getReg();
		
		var opBin16 = opToBinary16(op.toString());
		var opBin32 = opToBinary32(op.toString());
		var reg1Bin = regToBinary(reg1.toString());
		var reg2Bin = regToBinary(reg2.toString());
		
		if(opBin16 != "") {
			assembledOutput.append('''OP: �opBin16�  RX: �reg1Bin�  RY: �reg2Bin�  Unused: 00000''');
			
			var hex16 = binToHex('''�opBin16��reg1Bin��reg2Bin�00000''')
			hex16Output.append(hex16 + " ");
		} else {
			assembledOutput.append('''Not supported in 16-bit architecture''');
		}		
		
		var hex32 = binToHex('''�opBin32��reg1Bin��reg2Bin�00000000000000000000''');
		hex32Output.append(hex32 + " ");
	}
	
	/**
	 * Generate the binary for the O-type instruction. Use
	 * helper methods to convert the opcode to binary.
	 * 
	 * @param oInstr - The OInstruction node
	 */
	def private compileOInstruction(OInstruction oInstr) {
		var op = oInstr.getO_opcode();
		
		var opBin16 = opToBinary16(op);
		var opBin32 = opToBinary32(op);
		
		//Don't show unsupported 16 bit instructions
		if(opBin16 != "") {			
			assembledOutput.append('''OP: �opBin16�  UNUSED: 000000000000''');		
			
			var hex16 = binToHex('''�opBin16�0000000000000''')
			hex16Output.append(hex16 + " ");
		} else {
			assembledOutput.append('''Not supported in 16-bit architecture''');
		}
				
		var hex32 = binToHex('''�opBin32�0000000000000000000000000000''')
		hex32Output.append(hex32 + " ");
	}
	
	/**
	 * Helper method to convert opcodes into 32-bit binary form.
	 * 
	 * @param op - The opcode to be converted to binary
	 */
	def private opToBinary32(String op) {
		switch (op) {
			case "add":
				return "0000"
			case "nand":
				return "0001"
			case "addi":
				return "0010"
			case "lw":
				return "0011"
			case "sw":
				return "0100"
			case "beq":
				return "0101"
			case "jalr":
				return "0110"
			case "halt":
				return "0111"
			case "ei":
				return "1100"
			case "di":
				return "1101"
			case "reti":
				return "1100"
			case "boni":
				return "1101"
			case "bonj":
				return "1110"
			case "bonr":
				return "1000"
			case "bono":
				return "1001"
			default:
				return ""
		}
	}
	
	/**
	 * Helper method to convert opcodes into 16-bit binary form.
	 * 
	 * @param op - The opcode to be converted to binary
	 */
	def private opToBinary16(String op) {
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
	def private regToBinary(String reg) {
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
				return "0100"
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
	def private immToBinary(String imm, int bitLength) {
		var immBin = ""		
		
		try {
			var immLong = 0l;
			//Handle Hex or Decimal separately
			if(imm.indexOf("0x") != -1) {
				immLong = Long.parseLong(imm.substring(2), 16);				
			} else {
				immLong = Long.parseLong(imm);
			}			
			immBin = Long.toBinaryString(immLong);
		} catch(NumberFormatException e) {			
			immBin = "xxxxx";
		}		
		
		//Shorten negative number bit strings
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
	
	/**
	 * Helper method to convert binary into hex string.
	 * 
	 * @param bin - The binary string
	 */
	 def private binToHex(String bin) {
	 	var hex = ""

	 	if(bin.length() == 16 || bin.length() == 32) {
	 		try {
			 	var binLong = Long.parseLong(bin,2);
			 	hex = Long.toString(binLong, 16);
			 	
			 	while(hex.length() < bin.length()/4) {
			 		hex = "0" + hex;
			 	}		 	
		 	} catch(NumberFormatException e) {
		 		if(bin.length() == 16) {
		 			hex = "xxxx"
		 		} else {
		 			hex = "xxxxxxxx"
		 		}
		 	}	 	
	 	}	
	 	return hex	 	
	 }
	

    
}
