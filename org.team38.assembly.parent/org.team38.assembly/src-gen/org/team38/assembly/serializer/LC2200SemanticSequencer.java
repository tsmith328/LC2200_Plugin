/*
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.team38.assembly.lC2200.CommentTrans;
import org.team38.assembly.lC2200.Directive;
import org.team38.assembly.lC2200.IInstruction;
import org.team38.assembly.lC2200.IInstructionImmTrans;
import org.team38.assembly.lC2200.IInstructionLabelTrans;
import org.team38.assembly.lC2200.IInstructionOffsetTrans;
import org.team38.assembly.lC2200.Instruction;
import org.team38.assembly.lC2200.JInstruction;
import org.team38.assembly.lC2200.JInstructionTrans;
import org.team38.assembly.lC2200.LADirective;
import org.team38.assembly.lC2200.LATrans;
import org.team38.assembly.lC2200.LC2200Package;
import org.team38.assembly.lC2200.LabelBeg;
import org.team38.assembly.lC2200.LabelEnd;
import org.team38.assembly.lC2200.LineEnd;
import org.team38.assembly.lC2200.NOOPDirective;
import org.team38.assembly.lC2200.OInstruction;
import org.team38.assembly.lC2200.Program;
import org.team38.assembly.lC2200.RInstruction;
import org.team38.assembly.lC2200.RInstructionTrans;
import org.team38.assembly.lC2200.RegTrans;
import org.team38.assembly.lC2200.WordDirective;
import org.team38.assembly.lC2200.WordTrans;
import org.team38.assembly.services.LC2200GrammarAccess;

@SuppressWarnings("all")
public class LC2200SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LC2200GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LC2200Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LC2200Package.COMMENT_TRANS:
				sequence_CommentTrans(context, (CommentTrans) semanticObject); 
				return; 
			case LC2200Package.DIRECTIVE:
				sequence_Directive(context, (Directive) semanticObject); 
				return; 
			case LC2200Package.IINSTRUCTION:
				sequence_IInstruction(context, (IInstruction) semanticObject); 
				return; 
			case LC2200Package.IINSTRUCTION_IMM_TRANS:
				sequence_IInstructionImmTrans(context, (IInstructionImmTrans) semanticObject); 
				return; 
			case LC2200Package.IINSTRUCTION_LABEL_TRANS:
				sequence_IInstructionLabelTrans(context, (IInstructionLabelTrans) semanticObject); 
				return; 
			case LC2200Package.IINSTRUCTION_OFFSET_TRANS:
				sequence_IInstructionOffsetTrans(context, (IInstructionOffsetTrans) semanticObject); 
				return; 
			case LC2200Package.INSTRUCTION:
				sequence_Instruction(context, (Instruction) semanticObject); 
				return; 
			case LC2200Package.JINSTRUCTION:
				sequence_JInstruction(context, (JInstruction) semanticObject); 
				return; 
			case LC2200Package.JINSTRUCTION_TRANS:
				sequence_JInstructionTrans(context, (JInstructionTrans) semanticObject); 
				return; 
			case LC2200Package.LA_DIRECTIVE:
				sequence_LADirective(context, (LADirective) semanticObject); 
				return; 
			case LC2200Package.LA_TRANS:
				sequence_LATrans(context, (LATrans) semanticObject); 
				return; 
			case LC2200Package.LABEL_BEG:
				sequence_LabelBeg(context, (LabelBeg) semanticObject); 
				return; 
			case LC2200Package.LABEL_END:
				sequence_LabelEnd(context, (LabelEnd) semanticObject); 
				return; 
			case LC2200Package.LINE_END:
				sequence_LineEnd(context, (LineEnd) semanticObject); 
				return; 
			case LC2200Package.NOOP_DIRECTIVE:
				sequence_NOOPDirective(context, (NOOPDirective) semanticObject); 
				return; 
			case LC2200Package.OINSTRUCTION:
				sequence_OInstruction(context, (OInstruction) semanticObject); 
				return; 
			case LC2200Package.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case LC2200Package.RINSTRUCTION:
				sequence_RInstruction(context, (RInstruction) semanticObject); 
				return; 
			case LC2200Package.RINSTRUCTION_TRANS:
				sequence_RInstructionTrans(context, (RInstructionTrans) semanticObject); 
				return; 
			case LC2200Package.REG_TRANS:
				sequence_RegTrans(context, (RegTrans) semanticObject); 
				return; 
			case LC2200Package.WORD_DIRECTIVE:
				sequence_WordDirective(context, (WordDirective) semanticObject); 
				return; 
			case LC2200Package.WORD_TRANS:
				sequence_WordTrans(context, (WordTrans) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CommentTrans returns CommentTrans
	 *
	 * Constraint:
	 *     {CommentTrans}
	 */
	protected void sequence_CommentTrans(ISerializationContext context, CommentTrans semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Line returns Directive
	 *     Directive returns Directive
	 *
	 * Constraint:
	 *     (label=LabelBeg? (directive=NOOPDirective | directive=WordDirective | directive=LADirective))
	 */
	protected void sequence_Directive(ISerializationContext context, Directive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IInstructionImmTrans returns IInstructionImmTrans
	 *
	 * Constraint:
	 *     i_opcode=IOP_IMM
	 */
	protected void sequence_IInstructionImmTrans(ISerializationContext context, IInstructionImmTrans semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.IINSTRUCTION_IMM_TRANS__IOPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.IINSTRUCTION_IMM_TRANS__IOPCODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIInstructionImmTransAccess().getI_opcodeIOP_IMMTerminalRuleCall_0(), semanticObject.getI_opcode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     IInstructionLabelTrans returns IInstructionLabelTrans
	 *
	 * Constraint:
	 *     i_opcode=IOP_LABEL
	 */
	protected void sequence_IInstructionLabelTrans(ISerializationContext context, IInstructionLabelTrans semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.IINSTRUCTION_LABEL_TRANS__IOPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.IINSTRUCTION_LABEL_TRANS__IOPCODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIInstructionLabelTransAccess().getI_opcodeIOP_LABELTerminalRuleCall_0(), semanticObject.getI_opcode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     IInstructionOffsetTrans returns IInstructionOffsetTrans
	 *
	 * Constraint:
	 *     i_opcode=IOP_OFFSET
	 */
	protected void sequence_IInstructionOffsetTrans(ISerializationContext context, IInstructionOffsetTrans semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.IINSTRUCTION_OFFSET_TRANS__IOPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.IINSTRUCTION_OFFSET_TRANS__IOPCODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIInstructionOffsetTransAccess().getI_opcodeIOP_OFFSETTerminalRuleCall_0(), semanticObject.getI_opcode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     IInstruction returns IInstruction
	 *
	 * Constraint:
	 *     (
	 *         (i_opcode=IInstructionImmTrans reg1=RegTrans reg2=RegTrans imm=IMMEDIATE) | 
	 *         (i_opcode=IInstructionOffsetTrans reg1=RegTrans imm=IMMEDIATE reg2=RegTrans) | 
	 *         (i_opcode=IInstructionLabelTrans reg1=RegTrans reg2=RegTrans label=LabelEnd)
	 *     )
	 */
	protected void sequence_IInstruction(ISerializationContext context, IInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Line returns Instruction
	 *     Instruction returns Instruction
	 *
	 * Constraint:
	 *     (label=LabelBeg? (instruction=RInstruction | instruction=IInstruction | instruction=JInstruction | instruction=OInstruction))
	 */
	protected void sequence_Instruction(ISerializationContext context, Instruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JInstructionTrans returns JInstructionTrans
	 *
	 * Constraint:
	 *     j_opcode=JOP
	 */
	protected void sequence_JInstructionTrans(ISerializationContext context, JInstructionTrans semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.JINSTRUCTION_TRANS__JOPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.JINSTRUCTION_TRANS__JOPCODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJInstructionTransAccess().getJ_opcodeJOPTerminalRuleCall_0(), semanticObject.getJ_opcode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JInstruction returns JInstruction
	 *
	 * Constraint:
	 *     (j_opcode=JInstructionTrans reg1=RegTrans reg2=RegTrans)
	 */
	protected void sequence_JInstruction(ISerializationContext context, JInstruction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.JINSTRUCTION__JOPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.JINSTRUCTION__JOPCODE));
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.JINSTRUCTION__REG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.JINSTRUCTION__REG1));
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.JINSTRUCTION__REG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.JINSTRUCTION__REG2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJInstructionAccess().getJ_opcodeJInstructionTransParserRuleCall_0_0(), semanticObject.getJ_opcode());
		feeder.accept(grammarAccess.getJInstructionAccess().getReg1RegTransParserRuleCall_1_0(), semanticObject.getReg1());
		feeder.accept(grammarAccess.getJInstructionAccess().getReg2RegTransParserRuleCall_3_0(), semanticObject.getReg2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LADirective returns LADirective
	 *
	 * Constraint:
	 *     (la_dir=LATrans reg=RegTrans label=LabelEnd)
	 */
	protected void sequence_LADirective(ISerializationContext context, LADirective semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.LA_DIRECTIVE__LA_DIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.LA_DIRECTIVE__LA_DIR));
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.LA_DIRECTIVE__REG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.LA_DIRECTIVE__REG));
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.LA_DIRECTIVE__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.LA_DIRECTIVE__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLADirectiveAccess().getLa_dirLATransParserRuleCall_0_0(), semanticObject.getLa_dir());
		feeder.accept(grammarAccess.getLADirectiveAccess().getRegRegTransParserRuleCall_1_0(), semanticObject.getReg());
		feeder.accept(grammarAccess.getLADirectiveAccess().getLabelLabelEndParserRuleCall_3_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LATrans returns LATrans
	 *
	 * Constraint:
	 *     la=LA
	 */
	protected void sequence_LATrans(ISerializationContext context, LATrans semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.LA_TRANS__LA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.LA_TRANS__LA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLATransAccess().getLaLATerminalRuleCall_0(), semanticObject.getLa());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LabelBeg returns LabelBeg
	 *
	 * Constraint:
	 *     label=LABEL
	 */
	protected void sequence_LabelBeg(ISerializationContext context, LabelBeg semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.LABEL_BEG__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.LABEL_BEG__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLabelBegAccess().getLabelLABELTerminalRuleCall_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LabelEnd returns LabelEnd
	 *
	 * Constraint:
	 *     label=LABEL_IMM
	 */
	protected void sequence_LabelEnd(ISerializationContext context, LabelEnd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.LABEL_END__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.LABEL_END__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLabelEndAccess().getLabelLABEL_IMMTerminalRuleCall_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LineEnd returns LineEnd
	 *
	 * Constraint:
	 *     comment=CommentTrans?
	 */
	protected void sequence_LineEnd(ISerializationContext context, LineEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NOOPDirective returns NOOPDirective
	 *
	 * Constraint:
	 *     n_dir=NOOP
	 */
	protected void sequence_NOOPDirective(ISerializationContext context, NOOPDirective semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.NOOP_DIRECTIVE__NDIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.NOOP_DIRECTIVE__NDIR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNOOPDirectiveAccess().getN_dirNOOPTerminalRuleCall_0(), semanticObject.getN_dir());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OInstruction returns OInstruction
	 *
	 * Constraint:
	 *     o_opcode=OOP
	 */
	protected void sequence_OInstruction(ISerializationContext context, OInstruction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.OINSTRUCTION__OOPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.OINSTRUCTION__OOPCODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOInstructionAccess().getO_opcodeOOPTerminalRuleCall_0(), semanticObject.getO_opcode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:

	 *     (lines+=LineEnd* (lines+=Line lines+=LineEnd+)* lines+=Line?)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RInstructionTrans returns RInstructionTrans
	 *
	 * Constraint:
	 *     r_opcode=ROP
	 */
	protected void sequence_RInstructionTrans(ISerializationContext context, RInstructionTrans semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.RINSTRUCTION_TRANS__ROPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.RINSTRUCTION_TRANS__ROPCODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRInstructionTransAccess().getR_opcodeROPTerminalRuleCall_0(), semanticObject.getR_opcode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RInstruction returns RInstruction
	 *
	 * Constraint:
	 *     (r_opcode=RInstructionTrans reg1=RegTrans reg2=RegTrans reg3=RegTrans)
	 */
	protected void sequence_RInstruction(ISerializationContext context, RInstruction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.RINSTRUCTION__ROPCODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.RINSTRUCTION__ROPCODE));
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.RINSTRUCTION__REG1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.RINSTRUCTION__REG1));
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.RINSTRUCTION__REG2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.RINSTRUCTION__REG2));
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.RINSTRUCTION__REG3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.RINSTRUCTION__REG3));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRInstructionAccess().getR_opcodeRInstructionTransParserRuleCall_0_0(), semanticObject.getR_opcode());
		feeder.accept(grammarAccess.getRInstructionAccess().getReg1RegTransParserRuleCall_1_0(), semanticObject.getReg1());
		feeder.accept(grammarAccess.getRInstructionAccess().getReg2RegTransParserRuleCall_3_0(), semanticObject.getReg2());
		feeder.accept(grammarAccess.getRInstructionAccess().getReg3RegTransParserRuleCall_5_0(), semanticObject.getReg3());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RegTrans returns RegTrans
	 *
	 * Constraint:
	 *     reg=REG
	 */
	protected void sequence_RegTrans(ISerializationContext context, RegTrans semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.REG_TRANS__REG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.REG_TRANS__REG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRegTransAccess().getRegREGTerminalRuleCall_0(), semanticObject.getReg());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WordDirective returns WordDirective
	 *
	 * Constraint:
	 *     (w_dir=WordTrans imm=IMMEDIATE)
	 */
	protected void sequence_WordDirective(ISerializationContext context, WordDirective semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.WORD_DIRECTIVE__WDIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.WORD_DIRECTIVE__WDIR));
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.WORD_DIRECTIVE__IMM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.WORD_DIRECTIVE__IMM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWordDirectiveAccess().getW_dirWordTransParserRuleCall_0_0(), semanticObject.getW_dir());
		feeder.accept(grammarAccess.getWordDirectiveAccess().getImmIMMEDIATETerminalRuleCall_1_0(), semanticObject.getImm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WordTrans returns WordTrans
	 *
	 * Constraint:
	 *     word=WORD
	 */
	protected void sequence_WordTrans(ISerializationContext context, WordTrans semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LC2200Package.Literals.WORD_TRANS__WORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LC2200Package.Literals.WORD_TRANS__WORD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWordTransAccess().getWordWORDTerminalRuleCall_0(), semanticObject.getWord());
		feeder.finish();
	}
	
	
}
