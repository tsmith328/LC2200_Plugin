/*
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.validation

import org.team38.assembly.lC2200.IInstruction
import org.eclipse.xtext.validation.Check
import org.team38.assembly.lC2200.LC2200Package
import org.team38.assembly.lC2200.WordDirective
import org.eclipse.emf.ecore.EObject
import org.team38.assembly.LabelHandler
import org.team38.assembly.lC2200.Program
import org.team38.assembly.lC2200.Instruction
import org.eclipse.emf.common.util.EList
import org.team38.assembly.lC2200.Line

/**
 * Provide various semantic checks for written LC-2200 code.
 * 
 */
class LC2200Validator extends AbstractLC2200Validator {
	
	/** Warning Codes */
	public static final val DECIMAL_IMMEDIATE_VALUE = "Immediate Value is decimal";
	public static final val EXTREME_IMMEDIATE_VALUE = "Immediate Value is too extreme";
	public static final val INVALID_LABEL = "Label is invalid";
	public static final val OUT_OF_RANGE_LABEL = "Label is out of range";
	public static final val DUPLICATE_LABEL = "Label already exists";
	
	/**
	 * Checks whether I-instruction immediate values can be
	 * represented in 5 bits (for 16-bit instructions)
	 * 
	 * @param instr - The IInstruction to check
	 */
	@Check
	def checkInstructionImmediate(IInstruction instr) {
		//Ignore label I-Instructions
		if(instr.getI_opcode().eClass().getName().equals("IInstructionLabelTrans")) {
			return
		}
		
		var imm = instr.getImm();
		var immInt = 0;
		
		try {
			if(imm.indexOf("0x") != -1) {
				immInt = Integer.parseInt(imm.substring(2), 16)
			} else {
				immInt = Integer.parseInt(imm)			
			}
		} catch(Exception e) {		
			warning("Immediate values should be hex or decimal integers", LC2200Package.Literals.IINSTRUCTION__IMM, DECIMAL_IMMEDIATE_VALUE)	
		}
		
		if(immInt < -16) {
			warning("Signed 5 bit immediate values should be between -16 and 15", LC2200Package.Literals.IINSTRUCTION__IMM, EXTREME_IMMEDIATE_VALUE, "-16")	
		}
		if(immInt > 15) {
			warning("Signed 5 bit immediate values should be between -16 and 15", LC2200Package.Literals.IINSTRUCTION__IMM, EXTREME_IMMEDIATE_VALUE, "15")	
		}
	}
	
	/**
	 * Check whether word immediate values can fit
	 * within 16 bits.
	 * 
	 * @param word - The word directive to check
	 */
	@Check
	def checkWordImmediate(WordDirective word) {
		var imm = word.getImm();
		var immInt = 0;
		
		try {
			if(imm.indexOf("0x") != -1) {
				immInt = Integer.parseInt(imm.substring(2), 16)
			} else {
				immInt = Integer.parseInt(imm)			
			}
		} catch(Exception e) {		
			warning("Immediate values should be integers", LC2200Package.Literals.WORD_DIRECTIVE__IMM, DECIMAL_IMMEDIATE_VALUE)	
		}
		
		if(immInt < -65536) {
			warning("Signed 16 bit immediate values should be between -65536 and 65535", LC2200Package.Literals.WORD_DIRECTIVE__IMM, EXTREME_IMMEDIATE_VALUE, "-65536")	
		}
		if(immInt > 65535) {
			warning("Signed 16 bit immediate values should be between -65536 and 65535", LC2200Package.Literals.WORD_DIRECTIVE__IMM, EXTREME_IMMEDIATE_VALUE, "65535")	
		}
	}
	
	/**
	 * Check whether the offset to a label in a branching
	 * I-type instruction can fit into the 5 bit immediate.
	 * 
	 * @param instr - The IInstruction to check
	 */
	@Check
	def checkLabelIsValid(IInstruction instr) {
		if(instr.getI_opcode().eClass().getName().equals("IInstructionLabelTrans")) {	
			var labelTrans = instr.getLabel();
			var label = labelTrans.getLabel();
			
			var root = (instr as EObject);
			var parent = instr.eContainer() as Instruction;
			
			while(root.eContainer() != null) {
				root = root.eContainer();
			}
			
			if (root.eClass().getName().equals("Program")) {
				var labelTable = LabelHandler.populateLabels(root as Program);
				if(labelTable.get(label) == null) {
					warning("Label does not exist", LC2200Package.Literals.IINSTRUCTION__LABEL, INVALID_LABEL, labelTable.keySet);
				} else if(labelTable.get(label) != -1) {					
					var EList<EObject> lines = (root as Program).getLines();
					var offset = 0;
					var found = false
					for(var i = 0; i < lines.length() && !found; i++) {
						if(parent.equals(lines.get(i))) {
							found = true;			
							var dif = labelTable.get(label) - offset;
							if(dif > 15 || dif < -16) {
								warning("Label offset cannot fit into 5 bits", LC2200Package.Literals.IINSTRUCTION__LABEL, OUT_OF_RANGE_LABEL)
							}
						}
						if(!lines.get(i).eClass().getName().equals("LineEnd")) {
							offset++;						
						}
					}		
				}
			}
		}			
	}
	
	/**
	 * Check whether there are duplicate label declarations
	 * 
	 * @param line - The line to check
	 */
	@Check
	def checkDuplicateLabel(Line line) {
		if(line.eClass().getName().equals("Instruction") || line.eClass().getName().equals("Directive")) {
			var labelBeg = line.getLabel()
			var label = labelBeg.getLabel()
			label = label.replaceAll(":", "")
			
			var root = (line as EObject);		
					
			while(root.eContainer() != null) {
				root = root.eContainer();
			}
			
			if (root.eClass().getName().equals("Program")) {
				var labelTable = LabelHandler.populateLabels(root as Program);
				if(labelTable.get(label) == -1) {
					warning("Duplicate label", LC2200Package.Literals.LINE__LABEL, DUPLICATE_LABEL)
				}
			}			
		}
	}
}

