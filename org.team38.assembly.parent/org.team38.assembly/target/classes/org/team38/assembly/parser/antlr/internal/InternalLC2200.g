/*
 * generated by Xtext 2.9.1
 */
grammar InternalLC2200;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.team38.assembly.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.team38.assembly.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.team38.assembly.services.LC2200GrammarAccess;

}

@parser::members {

 	private LC2200GrammarAccess grammarAccess;

    public InternalLC2200Parser(TokenStream input, LC2200GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected LC2200GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getProgramAccess().getProgramAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getLineEndsLineEndParserRuleCall_1_0());
				}
				lv_lineEnds_1_0=ruleLineEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"lineEnds",
						lv_lineEnds_1_0,
						"org.team38.assembly.LC2200.LineEnd");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_2_0_0());
					}
					lv_lines_2_0=ruleLine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProgramRule());
						}
						add(
							$current,
							"lines",
							lv_lines_2_0,
							"org.team38.assembly.LC2200.Line");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getProgramAccess().getLineEndsLineEndParserRuleCall_2_1_0());
					}
					lv_lineEnds_3_0=ruleLineEnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProgramRule());
						}
						add(
							$current,
							"lineEnds",
							lv_lineEnds_3_0,
							"org.team38.assembly.LC2200.LineEnd");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_3_0());
				}
				lv_lines_4_0=ruleLine
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"lines",
						lv_lines_4_0,
						"org.team38.assembly.LC2200.Line");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleLine
entryRuleLine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLineRule()); }
	iv_ruleLine=ruleLine
	{ $current=$iv_ruleLine.current; }
	EOF;

// Rule Line
ruleLine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLineAccess().getInstructionParserRuleCall_0());
		}
		this_Instruction_0=ruleInstruction
		{
			$current = $this_Instruction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLineAccess().getDirectiveParserRuleCall_1());
		}
		this_Directive_1=ruleDirective
		{
			$current = $this_Directive_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getInstructionAccess().getLabelLabelBegParserRuleCall_0_0());
				}
				lv_label_0_0=ruleLabelBeg
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstructionRule());
					}
					set(
						$current,
						"label",
						lv_label_0_0,
						"org.team38.assembly.LC2200.LabelBeg");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionRInstructionParserRuleCall_1_0_0());
					}
					lv_instruction_1_1=ruleRInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstructionRule());
						}
						set(
							$current,
							"instruction",
							lv_instruction_1_1,
							"org.team38.assembly.LC2200.RInstruction");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionIInstructionParserRuleCall_1_0_1());
					}
					lv_instruction_1_2=ruleIInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstructionRule());
						}
						set(
							$current,
							"instruction",
							lv_instruction_1_2,
							"org.team38.assembly.LC2200.IInstruction");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionJInstructionParserRuleCall_1_0_2());
					}
					lv_instruction_1_3=ruleJInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstructionRule());
						}
						set(
							$current,
							"instruction",
							lv_instruction_1_3,
							"org.team38.assembly.LC2200.JInstruction");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionOInstructionParserRuleCall_1_0_3());
					}
					lv_instruction_1_4=ruleOInstruction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInstructionRule());
						}
						set(
							$current,
							"instruction",
							lv_instruction_1_4,
							"org.team38.assembly.LC2200.OInstruction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleDirective
entryRuleDirective returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDirectiveRule()); }
	iv_ruleDirective=ruleDirective
	{ $current=$iv_ruleDirective.current; }
	EOF;

// Rule Directive
ruleDirective returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDirectiveAccess().getLabelLabelBegParserRuleCall_0_0());
				}
				lv_label_0_0=ruleLabelBeg
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDirectiveRule());
					}
					set(
						$current,
						"label",
						lv_label_0_0,
						"org.team38.assembly.LC2200.LabelBeg");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getDirectiveAccess().getDirectiveNOOPDirectiveParserRuleCall_1_0_0());
					}
					lv_directive_1_1=ruleNOOPDirective
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDirectiveRule());
						}
						set(
							$current,
							"directive",
							lv_directive_1_1,
							"org.team38.assembly.LC2200.NOOPDirective");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getDirectiveAccess().getDirectiveWordDirectiveParserRuleCall_1_0_1());
					}
					lv_directive_1_2=ruleWordDirective
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDirectiveRule());
						}
						set(
							$current,
							"directive",
							lv_directive_1_2,
							"org.team38.assembly.LC2200.WordDirective");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getDirectiveAccess().getDirectiveLADirectiveParserRuleCall_1_0_2());
					}
					lv_directive_1_3=ruleLADirective
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDirectiveRule());
						}
						set(
							$current,
							"directive",
							lv_directive_1_3,
							"org.team38.assembly.LC2200.LADirective");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleRInstruction
entryRuleRInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRInstructionRule()); }
	iv_ruleRInstruction=ruleRInstruction
	{ $current=$iv_ruleRInstruction.current; }
	EOF;

// Rule RInstruction
ruleRInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRInstructionAccess().getR_opcodeRInstructionTransParserRuleCall_0_0());
				}
				lv_r_opcode_0_0=ruleRInstructionTrans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRInstructionRule());
					}
					set(
						$current,
						"r_opcode",
						lv_r_opcode_0_0,
						"org.team38.assembly.LC2200.RInstructionTrans");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRInstructionAccess().getReg1RegTransParserRuleCall_1_0());
				}
				lv_reg1_1_0=ruleRegTrans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRInstructionRule());
					}
					set(
						$current,
						"reg1",
						lv_reg1_1_0,
						"org.team38.assembly.LC2200.RegTrans");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_COMMA_2=RULE_COMMA
		{
			newLeafNode(this_COMMA_2, grammarAccess.getRInstructionAccess().getCOMMATerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRInstructionAccess().getReg2RegTransParserRuleCall_3_0());
				}
				lv_reg2_3_0=ruleRegTrans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRInstructionRule());
					}
					set(
						$current,
						"reg2",
						lv_reg2_3_0,
						"org.team38.assembly.LC2200.RegTrans");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_COMMA_4=RULE_COMMA
		{
			newLeafNode(this_COMMA_4, grammarAccess.getRInstructionAccess().getCOMMATerminalRuleCall_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRInstructionAccess().getReg3RegTransParserRuleCall_5_0());
				}
				lv_reg3_5_0=ruleRegTrans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRInstructionRule());
					}
					set(
						$current,
						"reg3",
						lv_reg3_5_0,
						"org.team38.assembly.LC2200.RegTrans");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleIInstruction
entryRuleIInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIInstructionRule()); }
	iv_ruleIInstruction=ruleIInstruction
	{ $current=$iv_ruleIInstruction.current; }
	EOF;

// Rule IInstruction
ruleIInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getIInstructionAccess().getI_opcodeIInstructionImmTransParserRuleCall_0_0_0());
					}
					lv_i_opcode_0_0=ruleIInstructionImmTrans
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIInstructionRule());
						}
						set(
							$current,
							"i_opcode",
							lv_i_opcode_0_0,
							"org.team38.assembly.LC2200.IInstructionImmTrans");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getIInstructionAccess().getReg1RegTransParserRuleCall_0_1_0());
					}
					lv_reg1_1_0=ruleRegTrans
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIInstructionRule());
						}
						set(
							$current,
							"reg1",
							lv_reg1_1_0,
							"org.team38.assembly.LC2200.RegTrans");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_COMMA_2=RULE_COMMA
			{
				newLeafNode(this_COMMA_2, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_0_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIInstructionAccess().getReg2RegTransParserRuleCall_0_3_0());
					}
					lv_reg2_3_0=ruleRegTrans
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIInstructionRule());
						}
						set(
							$current,
							"reg2",
							lv_reg2_3_0,
							"org.team38.assembly.LC2200.RegTrans");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_COMMA_4=RULE_COMMA
			{
				newLeafNode(this_COMMA_4, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_0_4());
			}
			(
				(
					lv_imm_5_0=RULE_IMMEDIATE
					{
						newLeafNode(lv_imm_5_0, grammarAccess.getIInstructionAccess().getImmIMMEDIATETerminalRuleCall_0_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"imm",
							lv_imm_5_0,
							"org.team38.assembly.LC2200.IMMEDIATE");
					}
				)
			)
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getIInstructionAccess().getI_opcodeIInstructionOffsetTransParserRuleCall_1_0_0());
					}
					lv_i_opcode_6_0=ruleIInstructionOffsetTrans
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIInstructionRule());
						}
						set(
							$current,
							"i_opcode",
							lv_i_opcode_6_0,
							"org.team38.assembly.LC2200.IInstructionOffsetTrans");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getIInstructionAccess().getReg1RegTransParserRuleCall_1_1_0());
					}
					lv_reg1_7_0=ruleRegTrans
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIInstructionRule());
						}
						set(
							$current,
							"reg1",
							lv_reg1_7_0,
							"org.team38.assembly.LC2200.RegTrans");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_COMMA_8=RULE_COMMA
			{
				newLeafNode(this_COMMA_8, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_1_2());
			}
			(
				(
					lv_imm_9_0=RULE_IMMEDIATE
					{
						newLeafNode(lv_imm_9_0, grammarAccess.getIInstructionAccess().getImmIMMEDIATETerminalRuleCall_1_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"imm",
							lv_imm_9_0,
							"org.team38.assembly.LC2200.IMMEDIATE");
					}
				)
			)
			this_LPAREN_10=RULE_LPAREN
			{
				newLeafNode(this_LPAREN_10, grammarAccess.getIInstructionAccess().getLPARENTerminalRuleCall_1_4());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIInstructionAccess().getReg2RegTransParserRuleCall_1_5_0());
					}
					lv_reg2_11_0=ruleRegTrans
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIInstructionRule());
						}
						set(
							$current,
							"reg2",
							lv_reg2_11_0,
							"org.team38.assembly.LC2200.RegTrans");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_RPAREN_12=RULE_RPAREN
			{
				newLeafNode(this_RPAREN_12, grammarAccess.getIInstructionAccess().getRPARENTerminalRuleCall_1_6());
			}
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getIInstructionAccess().getI_opcodeIInstructionLabelTransParserRuleCall_2_0_0());
					}
					lv_i_opcode_13_0=ruleIInstructionLabelTrans
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIInstructionRule());
						}
						set(
							$current,
							"i_opcode",
							lv_i_opcode_13_0,
							"org.team38.assembly.LC2200.IInstructionLabelTrans");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getIInstructionAccess().getReg1RegTransParserRuleCall_2_1_0());
					}
					lv_reg1_14_0=ruleRegTrans
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIInstructionRule());
						}
						set(
							$current,
							"reg1",
							lv_reg1_14_0,
							"org.team38.assembly.LC2200.RegTrans");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_COMMA_15=RULE_COMMA
			{
				newLeafNode(this_COMMA_15, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_2_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIInstructionAccess().getReg2RegTransParserRuleCall_2_3_0());
					}
					lv_reg2_16_0=ruleRegTrans
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIInstructionRule());
						}
						set(
							$current,
							"reg2",
							lv_reg2_16_0,
							"org.team38.assembly.LC2200.RegTrans");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_COMMA_17=RULE_COMMA
			{
				newLeafNode(this_COMMA_17, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_2_4());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIInstructionAccess().getLabelLabelEndParserRuleCall_2_5_0());
					}
					lv_label_18_0=ruleLabelEnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIInstructionRule());
						}
						set(
							$current,
							"label",
							lv_label_18_0,
							"org.team38.assembly.LC2200.LabelEnd");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleJInstruction
entryRuleJInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJInstructionRule()); }
	iv_ruleJInstruction=ruleJInstruction
	{ $current=$iv_ruleJInstruction.current; }
	EOF;

// Rule JInstruction
ruleJInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getJInstructionAccess().getJ_opcodeJInstructionTransParserRuleCall_0_0());
				}
				lv_j_opcode_0_0=ruleJInstructionTrans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJInstructionRule());
					}
					set(
						$current,
						"j_opcode",
						lv_j_opcode_0_0,
						"org.team38.assembly.LC2200.JInstructionTrans");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getJInstructionAccess().getReg1RegTransParserRuleCall_1_0());
				}
				lv_reg1_1_0=ruleRegTrans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJInstructionRule());
					}
					set(
						$current,
						"reg1",
						lv_reg1_1_0,
						"org.team38.assembly.LC2200.RegTrans");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_COMMA_2=RULE_COMMA
		{
			newLeafNode(this_COMMA_2, grammarAccess.getJInstructionAccess().getCOMMATerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJInstructionAccess().getReg2RegTransParserRuleCall_3_0());
				}
				lv_reg2_3_0=ruleRegTrans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJInstructionRule());
					}
					set(
						$current,
						"reg2",
						lv_reg2_3_0,
						"org.team38.assembly.LC2200.RegTrans");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOInstruction
entryRuleOInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOInstructionRule()); }
	iv_ruleOInstruction=ruleOInstruction
	{ $current=$iv_ruleOInstruction.current; }
	EOF;

// Rule OInstruction
ruleOInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_o_opcode_0_0=RULE_OOP
			{
				newLeafNode(lv_o_opcode_0_0, grammarAccess.getOInstructionAccess().getO_opcodeOOPTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getOInstructionRule());
				}
				setWithLastConsumed(
					$current,
					"o_opcode",
					lv_o_opcode_0_0,
					"org.team38.assembly.LC2200.OOP");
			}
		)
	)
;

// Entry rule entryRuleNOOPDirective
entryRuleNOOPDirective returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNOOPDirectiveRule()); }
	iv_ruleNOOPDirective=ruleNOOPDirective
	{ $current=$iv_ruleNOOPDirective.current; }
	EOF;

// Rule NOOPDirective
ruleNOOPDirective returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_n_dir_0_0=RULE_NOOP
			{
				newLeafNode(lv_n_dir_0_0, grammarAccess.getNOOPDirectiveAccess().getN_dirNOOPTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNOOPDirectiveRule());
				}
				setWithLastConsumed(
					$current,
					"n_dir",
					lv_n_dir_0_0,
					"org.team38.assembly.LC2200.NOOP");
			}
		)
	)
;

// Entry rule entryRuleWordDirective
entryRuleWordDirective returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWordDirectiveRule()); }
	iv_ruleWordDirective=ruleWordDirective
	{ $current=$iv_ruleWordDirective.current; }
	EOF;

// Rule WordDirective
ruleWordDirective returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getWordDirectiveAccess().getW_dirWordTransParserRuleCall_0_0());
				}
				lv_w_dir_0_0=ruleWordTrans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWordDirectiveRule());
					}
					set(
						$current,
						"w_dir",
						lv_w_dir_0_0,
						"org.team38.assembly.LC2200.WordTrans");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_imm_1_0=RULE_IMMEDIATE
				{
					newLeafNode(lv_imm_1_0, grammarAccess.getWordDirectiveAccess().getImmIMMEDIATETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWordDirectiveRule());
					}
					setWithLastConsumed(
						$current,
						"imm",
						lv_imm_1_0,
						"org.team38.assembly.LC2200.IMMEDIATE");
				}
			)
		)
	)
;

// Entry rule entryRuleLADirective
entryRuleLADirective returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLADirectiveRule()); }
	iv_ruleLADirective=ruleLADirective
	{ $current=$iv_ruleLADirective.current; }
	EOF;

// Rule LADirective
ruleLADirective returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getLADirectiveAccess().getLa_dirLATransParserRuleCall_0_0());
				}
				lv_la_dir_0_0=ruleLATrans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLADirectiveRule());
					}
					set(
						$current,
						"la_dir",
						lv_la_dir_0_0,
						"org.team38.assembly.LC2200.LATrans");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLADirectiveAccess().getRegRegTransParserRuleCall_1_0());
				}
				lv_reg_1_0=ruleRegTrans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLADirectiveRule());
					}
					set(
						$current,
						"reg",
						lv_reg_1_0,
						"org.team38.assembly.LC2200.RegTrans");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_COMMA_2=RULE_COMMA
		{
			newLeafNode(this_COMMA_2, grammarAccess.getLADirectiveAccess().getCOMMATerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLADirectiveAccess().getLabelLabelEndParserRuleCall_3_0());
				}
				lv_label_3_0=ruleLabelEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLADirectiveRule());
					}
					set(
						$current,
						"label",
						lv_label_3_0,
						"org.team38.assembly.LC2200.LabelEnd");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRInstructionTrans
entryRuleRInstructionTrans returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRInstructionTransRule()); }
	iv_ruleRInstructionTrans=ruleRInstructionTrans
	{ $current=$iv_ruleRInstructionTrans.current; }
	EOF;

// Rule RInstructionTrans
ruleRInstructionTrans returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_r_opcode_0_0=RULE_ROP
			{
				newLeafNode(lv_r_opcode_0_0, grammarAccess.getRInstructionTransAccess().getR_opcodeROPTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRInstructionTransRule());
				}
				setWithLastConsumed(
					$current,
					"r_opcode",
					lv_r_opcode_0_0,
					"org.team38.assembly.LC2200.ROP");
			}
		)
	)
;

// Entry rule entryRuleIInstructionImmTrans
entryRuleIInstructionImmTrans returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIInstructionImmTransRule()); }
	iv_ruleIInstructionImmTrans=ruleIInstructionImmTrans
	{ $current=$iv_ruleIInstructionImmTrans.current; }
	EOF;

// Rule IInstructionImmTrans
ruleIInstructionImmTrans returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_i_opcode_0_0=RULE_IOP_IMM
			{
				newLeafNode(lv_i_opcode_0_0, grammarAccess.getIInstructionImmTransAccess().getI_opcodeIOP_IMMTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIInstructionImmTransRule());
				}
				setWithLastConsumed(
					$current,
					"i_opcode",
					lv_i_opcode_0_0,
					"org.team38.assembly.LC2200.IOP_IMM");
			}
		)
	)
;

// Entry rule entryRuleIInstructionOffsetTrans
entryRuleIInstructionOffsetTrans returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIInstructionOffsetTransRule()); }
	iv_ruleIInstructionOffsetTrans=ruleIInstructionOffsetTrans
	{ $current=$iv_ruleIInstructionOffsetTrans.current; }
	EOF;

// Rule IInstructionOffsetTrans
ruleIInstructionOffsetTrans returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_i_opcode_0_0=RULE_IOP_OFFSET
			{
				newLeafNode(lv_i_opcode_0_0, grammarAccess.getIInstructionOffsetTransAccess().getI_opcodeIOP_OFFSETTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIInstructionOffsetTransRule());
				}
				setWithLastConsumed(
					$current,
					"i_opcode",
					lv_i_opcode_0_0,
					"org.team38.assembly.LC2200.IOP_OFFSET");
			}
		)
	)
;

// Entry rule entryRuleIInstructionLabelTrans
entryRuleIInstructionLabelTrans returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIInstructionLabelTransRule()); }
	iv_ruleIInstructionLabelTrans=ruleIInstructionLabelTrans
	{ $current=$iv_ruleIInstructionLabelTrans.current; }
	EOF;

// Rule IInstructionLabelTrans
ruleIInstructionLabelTrans returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_i_opcode_0_0=RULE_IOP_LABEL
			{
				newLeafNode(lv_i_opcode_0_0, grammarAccess.getIInstructionLabelTransAccess().getI_opcodeIOP_LABELTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIInstructionLabelTransRule());
				}
				setWithLastConsumed(
					$current,
					"i_opcode",
					lv_i_opcode_0_0,
					"org.team38.assembly.LC2200.IOP_LABEL");
			}
		)
	)
;

// Entry rule entryRuleJInstructionTrans
entryRuleJInstructionTrans returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJInstructionTransRule()); }
	iv_ruleJInstructionTrans=ruleJInstructionTrans
	{ $current=$iv_ruleJInstructionTrans.current; }
	EOF;

// Rule JInstructionTrans
ruleJInstructionTrans returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_j_opcode_0_0=RULE_JOP
			{
				newLeafNode(lv_j_opcode_0_0, grammarAccess.getJInstructionTransAccess().getJ_opcodeJOPTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getJInstructionTransRule());
				}
				setWithLastConsumed(
					$current,
					"j_opcode",
					lv_j_opcode_0_0,
					"org.team38.assembly.LC2200.JOP");
			}
		)
	)
;

// Entry rule entryRuleWordTrans
entryRuleWordTrans returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWordTransRule()); }
	iv_ruleWordTrans=ruleWordTrans
	{ $current=$iv_ruleWordTrans.current; }
	EOF;

// Rule WordTrans
ruleWordTrans returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_word_0_0=RULE_WORD
			{
				newLeafNode(lv_word_0_0, grammarAccess.getWordTransAccess().getWordWORDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getWordTransRule());
				}
				setWithLastConsumed(
					$current,
					"word",
					lv_word_0_0,
					"org.team38.assembly.LC2200.WORD");
			}
		)
	)
;

// Entry rule entryRuleLATrans
entryRuleLATrans returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLATransRule()); }
	iv_ruleLATrans=ruleLATrans
	{ $current=$iv_ruleLATrans.current; }
	EOF;

// Rule LATrans
ruleLATrans returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_la_0_0=RULE_LA
			{
				newLeafNode(lv_la_0_0, grammarAccess.getLATransAccess().getLaLATerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLATransRule());
				}
				setWithLastConsumed(
					$current,
					"la",
					lv_la_0_0,
					"org.team38.assembly.LC2200.LA");
			}
		)
	)
;

// Entry rule entryRuleCommentTrans
entryRuleCommentTrans returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommentTransRule()); }
	iv_ruleCommentTrans=ruleCommentTrans
	{ $current=$iv_ruleCommentTrans.current; }
	EOF;

// Rule CommentTrans
ruleCommentTrans returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCommentTransAccess().getCommentTransAction_0(),
					$current);
			}
		)
		this_COMMENT_1=RULE_COMMENT
		{
			newLeafNode(this_COMMENT_1, grammarAccess.getCommentTransAccess().getCOMMENTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleLineEnd
entryRuleLineEnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLineEndRule()); }
	iv_ruleLineEnd=ruleLineEnd
	{ $current=$iv_ruleLineEnd.current; }
	EOF;

// Rule LineEnd
ruleLineEnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLineEndAccess().getLineEndAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLineEndAccess().getCommentCommentTransParserRuleCall_1_0());
				}
				lv_comment_1_0=ruleCommentTrans
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLineEndRule());
					}
					set(
						$current,
						"comment",
						lv_comment_1_0,
						"org.team38.assembly.LC2200.CommentTrans");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		this_NEWLINE_2=RULE_NEWLINE
		{
			newLeafNode(this_NEWLINE_2, grammarAccess.getLineEndAccess().getNEWLINETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleRegTrans
entryRuleRegTrans returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegTransRule()); }
	iv_ruleRegTrans=ruleRegTrans
	{ $current=$iv_ruleRegTrans.current; }
	EOF;

// Rule RegTrans
ruleRegTrans returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_reg_0_0=RULE_REG
			{
				newLeafNode(lv_reg_0_0, grammarAccess.getRegTransAccess().getRegREGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRegTransRule());
				}
				setWithLastConsumed(
					$current,
					"reg",
					lv_reg_0_0,
					"org.team38.assembly.LC2200.REG");
			}
		)
	)
;

// Entry rule entryRuleLabelBeg
entryRuleLabelBeg returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLabelBegRule()); }
	iv_ruleLabelBeg=ruleLabelBeg
	{ $current=$iv_ruleLabelBeg.current; }
	EOF;

// Rule LabelBeg
ruleLabelBeg returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_label_0_0=RULE_LABEL
			{
				newLeafNode(lv_label_0_0, grammarAccess.getLabelBegAccess().getLabelLABELTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLabelBegRule());
				}
				setWithLastConsumed(
					$current,
					"label",
					lv_label_0_0,
					"org.team38.assembly.LC2200.LABEL");
			}
		)
	)
;

// Entry rule entryRuleLabelEnd
entryRuleLabelEnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLabelEndRule()); }
	iv_ruleLabelEnd=ruleLabelEnd
	{ $current=$iv_ruleLabelEnd.current; }
	EOF;

// Rule LabelEnd
ruleLabelEnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_label_0_0=RULE_LABEL_IMM
			{
				newLeafNode(lv_label_0_0, grammarAccess.getLabelEndAccess().getLabelLABEL_IMMTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLabelEndRule());
				}
				setWithLastConsumed(
					$current,
					"label",
					lv_label_0_0,
					"org.team38.assembly.LC2200.LABEL_IMM");
			}
		)
	)
;

RULE_WS : (' '|'\t')+;

RULE_LA : 'la';

RULE_WORD : '.word';

RULE_OOP : ('halt'|'ei'|'di'|'reti');

RULE_NOOP : 'noop';

RULE_JOP : 'jalr';

RULE_ROP : ('add'|'nand');

RULE_IOP_IMM : 'addi';

RULE_IOP_OFFSET : ('lw'|'sw');

RULE_IOP_LABEL : 'beq';

RULE_LPAREN : '(';

RULE_RPAREN : ')';

RULE_COMMA : ',';

RULE_COMMENT : '!' ~(('\n'|'\r'))*;

RULE_NEWLINE : ' '* '\r'? '\n';

RULE_REG : ('$zero'|'$at'|'$v0'|'$a0'|'$a1'|'$a2'|'$t0'|'$t1'|'$t2'|'$s0'|'$s1'|'$s2'|'$k0'|'$sp'|'$fp'|'$ra');

RULE_IMMEDIATE : ('0x' ('0'..'9'|('a'|'b'|'c'|'d'|'e'|'f'))+|'-'? RULE_INT);

RULE_LABEL_IMM : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_LABEL : RULE_LABEL_IMM ':';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ANY_OTHER : .;
