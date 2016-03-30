/*
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.team38.assembly.lC2200.Instruction
import org.team38.assembly.lC2200.Directive
import org.team38.assembly.lC2200.NOOPDirective
import org.team38.assembly.lC2200.WordDirective
import org.team38.assembly.lC2200.LADirective
import org.team38.assembly.lC2200.OInstruction
import org.team38.assembly.lC2200.RInstruction
import org.team38.assembly.lC2200.JInstruction
import org.team38.assembly.lC2200.IInstruction

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class LC2200LabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	def text(Instruction instr) {
		'Instruction'
	}
	
	def text(Directive dir) {
		'Directive'
	}
	
	def text(NOOPDirective noop) {
		'Noop'
	}
	
	def text(WordDirective word) {
		'Word'
	}
	
	def text(LADirective la) {
		'Load Address'
	}
	
	def text(OInstruction oinstr) {
		'O-Instruction'
	}
	
	def text(IInstruction iinstr) {
		'I-Instruction'
	}
	
	def text(RInstruction rinstr) {
		'R-Instruction'
	}
	
	def text(JInstruction jinstr) {
		'J-Instruction'
	}
	

	// Labels and icons can be computed like this:
	
//	def text(Greeting ele) {
//		'A greeting to ' + ele.name
//	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
