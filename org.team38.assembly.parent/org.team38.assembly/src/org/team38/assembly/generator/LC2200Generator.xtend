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
import org.team38.assembly.lC2200.OInstruction
import org.team38.assembly.lC2200.RInstruction
import org.team38.assembly.lC2200.JInstruction
import org.team38.assembly.lC2200.IInstruction
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import java.util.HashMap;
/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LC2200Generator extends AbstractGenerator {
	private StringBuffer assembledOutput;
	private HashMap<String, Integer> labelTable;
	private int offset;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		assembledOutput = new StringBuffer()
		var e_root = resource.getContents().get(0)
		if (e_root.eClass().getName().equals("Program")) {
			compileProgram(e_root as Program)
		}
		fsa.generateFile("helloworld.txt", assembledOutput.toString())
	}
	
	def compileProgram(Program root) {
		var EList<EObject> lines = root.getLines();
		for(line : lines) {
			if (line.eClass().getName().equals("Directive")) {
				compileDirective(line as Directive)
			}
			else if (line.eClass().getName().equals("Instruction")) {
				compileInstruction(line as Instruction)
			}
		}	
	}
	
	def compileDirective(Directive dir) {
		//Has Label
		var dirType = dir.getDirective()
			if (dirType.eClass().getName().equals("NOOPDirective")) {
				compileNOOP(dirType as NOOPDirective)
			}
			else if (dirType.eClass().getName().equals("WordDirective")) {
				compileWord(dirType as WordDirective)
			}
	}
	
	def compileInstruction(Instruction instr) {
		//Has Label
		var instrType = instr.getInstruction()
			if(instrType.eClass().getName().equals("IInstruction")) {
				compileIInstruction(instrType as IInstruction)
			}
			else if(instrType.eClass().getName().equals("RInstruction")) {
				compileRInstruction(instrType as RInstruction)
			}	
			else if(instrType.eClass().getName().equals("JInstruction")) {
				compileJInstruction(instrType as JInstruction)
			}	
			else if(instrType.eClass().getName().equals("OInstruction")) {
				compileOInstruction(instrType as OInstruction)
			}			
	}
	
	def compileNOOP(NOOPDirective noop) {
		println("NOOP ASSEMBLY")
	}
	
	def compileWord(WordDirective word) {		
		var wordImm = word.getImm()
		assembledOutput.append("Word ASSEMBLY " + wordImm)
	}
	
	def compileIInstruction(IInstruction iInstr) {
		iInstr.getI_opcode()
		iInstr.getReg1()
		iInstr.getReg2()
		iInstr.getImm()
		
		println("iinstr ASSEMBLY")
	}
	
	def compileRInstruction(RInstruction rInstr) {
		rInstr.getR_opcode()
		rInstr.getReg1()
		rInstr.getReg2()
		rInstr.getReg3()
		
		println("rinstr ASSEMBLY")
	}
	
	def compileJInstruction(JInstruction jInstr) {
		jInstr.getJ_opcode()
		jInstr.getReg1()
		jInstr.getReg2()
		
		println("jinstr ASSEMBLY")
	}
	
	def compileOInstruction(OInstruction oInstr) {
		oInstr.getO_opcode()
		
		println("oinstr ASSEMBLY")
	}
	
	def regToBinary(String reg) {
		
	}
	
	def immToBinary(String imm) {
		
	}
	

    
}
