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
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getLinesInstructionParserRuleCall_0_0());
				}
				lv_lines_0_1=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"lines",
						lv_lines_0_1,
						"org.team38.assembly.LC2200.Instruction");
					afterParserOrEnumRuleCall();
				}
				    |
				{
					newCompositeNode(grammarAccess.getProgramAccess().getLinesDirectiveParserRuleCall_0_1());
				}
				lv_lines_0_2=ruleDirective
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"lines",
						lv_lines_0_2,
						"org.team38.assembly.LC2200.Directive");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)*
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
				lv_label_0_0=RULE_LABEL
				{
					newLeafNode(lv_label_0_0, grammarAccess.getInstructionAccess().getLabelLABELTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstructionRule());
					}
					setWithLastConsumed(
						$current,
						"label",
						lv_label_0_0,
						"org.team38.assembly.LC2200.LABEL");
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
		(
			this_SL_COMMENT_2=RULE_SL_COMMENT
			{
				newLeafNode(this_SL_COMMENT_2, grammarAccess.getInstructionAccess().getSL_COMMENTTerminalRuleCall_2());
			}
		)?
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
				lv_label_0_0=RULE_LABEL
				{
					newLeafNode(lv_label_0_0, grammarAccess.getDirectiveAccess().getLabelLABELTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDirectiveRule());
					}
					setWithLastConsumed(
						$current,
						"label",
						lv_label_0_0,
						"org.team38.assembly.LC2200.LABEL");
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
				)
			)
		)
		(
			this_SL_COMMENT_2=RULE_SL_COMMENT
			{
				newLeafNode(this_SL_COMMENT_2, grammarAccess.getDirectiveAccess().getSL_COMMENTTerminalRuleCall_2());
			}
		)?
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
				lv_r_opcode_0_0=RULE_ROP
				{
					newLeafNode(lv_r_opcode_0_0, grammarAccess.getRInstructionAccess().getR_opcodeROPTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRInstructionRule());
					}
					setWithLastConsumed(
						$current,
						"r_opcode",
						lv_r_opcode_0_0,
						"org.team38.assembly.LC2200.ROP");
				}
			)
		)
		(
			(
				lv_reg1_1_0=RULE_REG
				{
					newLeafNode(lv_reg1_1_0, grammarAccess.getRInstructionAccess().getReg1REGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRInstructionRule());
					}
					setWithLastConsumed(
						$current,
						"reg1",
						lv_reg1_1_0,
						"org.team38.assembly.LC2200.REG");
				}
			)
		)
		this_COMMA_2=RULE_COMMA
		{
			newLeafNode(this_COMMA_2, grammarAccess.getRInstructionAccess().getCOMMATerminalRuleCall_2());
		}
		(
			(
				lv_reg2_3_0=RULE_REG
				{
					newLeafNode(lv_reg2_3_0, grammarAccess.getRInstructionAccess().getReg2REGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRInstructionRule());
					}
					setWithLastConsumed(
						$current,
						"reg2",
						lv_reg2_3_0,
						"org.team38.assembly.LC2200.REG");
				}
			)
		)
		this_COMMA_4=RULE_COMMA
		{
			newLeafNode(this_COMMA_4, grammarAccess.getRInstructionAccess().getCOMMATerminalRuleCall_4());
		}
		(
			(
				lv_reg3_5_0=RULE_REG
				{
					newLeafNode(lv_reg3_5_0, grammarAccess.getRInstructionAccess().getReg3REGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRInstructionRule());
					}
					setWithLastConsumed(
						$current,
						"reg3",
						lv_reg3_5_0,
						"org.team38.assembly.LC2200.REG");
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
					lv_i_opcode_0_0=RULE_IOP_IMM
					{
						newLeafNode(lv_i_opcode_0_0, grammarAccess.getIInstructionAccess().getI_opcodeIOP_IMMTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"i_opcode",
							lv_i_opcode_0_0,
							"org.team38.assembly.LC2200.IOP_IMM");
					}
				)
			)
			(
				(
					lv_reg1_1_0=RULE_REG
					{
						newLeafNode(lv_reg1_1_0, grammarAccess.getIInstructionAccess().getReg1REGTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"reg1",
							lv_reg1_1_0,
							"org.team38.assembly.LC2200.REG");
					}
				)
			)
			this_COMMA_2=RULE_COMMA
			{
				newLeafNode(this_COMMA_2, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_0_2());
			}
			(
				(
					lv_reg2_3_0=RULE_REG
					{
						newLeafNode(lv_reg2_3_0, grammarAccess.getIInstructionAccess().getReg2REGTerminalRuleCall_0_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"reg2",
							lv_reg2_3_0,
							"org.team38.assembly.LC2200.REG");
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
					lv_i_opcode_6_0=RULE_IOP_OFFSET
					{
						newLeafNode(lv_i_opcode_6_0, grammarAccess.getIInstructionAccess().getI_opcodeIOP_OFFSETTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"i_opcode",
							lv_i_opcode_6_0,
							"org.team38.assembly.LC2200.IOP_OFFSET");
					}
				)
			)
			(
				(
					lv_reg1_7_0=RULE_REG
					{
						newLeafNode(lv_reg1_7_0, grammarAccess.getIInstructionAccess().getReg1REGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"reg1",
							lv_reg1_7_0,
							"org.team38.assembly.LC2200.REG");
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
					lv_reg2_11_0=RULE_REG
					{
						newLeafNode(lv_reg2_11_0, grammarAccess.getIInstructionAccess().getReg2REGTerminalRuleCall_1_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"reg2",
							lv_reg2_11_0,
							"org.team38.assembly.LC2200.REG");
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
					lv_i_opcode_13_0=RULE_IOP_LABEL
					{
						newLeafNode(lv_i_opcode_13_0, grammarAccess.getIInstructionAccess().getI_opcodeIOP_LABELTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"i_opcode",
							lv_i_opcode_13_0,
							"org.team38.assembly.LC2200.IOP_LABEL");
					}
				)
			)
			(
				(
					lv_reg1_14_0=RULE_REG
					{
						newLeafNode(lv_reg1_14_0, grammarAccess.getIInstructionAccess().getReg1REGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"reg1",
							lv_reg1_14_0,
							"org.team38.assembly.LC2200.REG");
					}
				)
			)
			this_COMMA_15=RULE_COMMA
			{
				newLeafNode(this_COMMA_15, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_2_2());
			}
			(
				(
					lv_reg2_16_0=RULE_REG
					{
						newLeafNode(lv_reg2_16_0, grammarAccess.getIInstructionAccess().getReg2REGTerminalRuleCall_2_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"reg2",
							lv_reg2_16_0,
							"org.team38.assembly.LC2200.REG");
					}
				)
			)
			this_COMMA_17=RULE_COMMA
			{
				newLeafNode(this_COMMA_17, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_2_4());
			}
			(
				(
					lv_imm_18_0=RULE_LABEL_IMM
					{
						newLeafNode(lv_imm_18_0, grammarAccess.getIInstructionAccess().getImmLABEL_IMMTerminalRuleCall_2_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIInstructionRule());
						}
						setWithLastConsumed(
							$current,
							"imm",
							lv_imm_18_0,
							"org.team38.assembly.LC2200.LABEL_IMM");
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
				lv_j_opcode_0_0=RULE_JOP
				{
					newLeafNode(lv_j_opcode_0_0, grammarAccess.getJInstructionAccess().getJ_opcodeJOPTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJInstructionRule());
					}
					setWithLastConsumed(
						$current,
						"j_opcode",
						lv_j_opcode_0_0,
						"org.team38.assembly.LC2200.JOP");
				}
			)
		)
		(
			(
				lv_reg1_1_0=RULE_REG
				{
					newLeafNode(lv_reg1_1_0, grammarAccess.getJInstructionAccess().getReg1REGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJInstructionRule());
					}
					setWithLastConsumed(
						$current,
						"reg1",
						lv_reg1_1_0,
						"org.team38.assembly.LC2200.REG");
				}
			)
		)
		this_COMMA_2=RULE_COMMA
		{
			newLeafNode(this_COMMA_2, grammarAccess.getJInstructionAccess().getCOMMATerminalRuleCall_2());
		}
		(
			(
				lv_reg2_3_0=RULE_REG
				{
					newLeafNode(lv_reg2_3_0, grammarAccess.getJInstructionAccess().getReg2REGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJInstructionRule());
					}
					setWithLastConsumed(
						$current,
						"reg2",
						lv_reg2_3_0,
						"org.team38.assembly.LC2200.REG");
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
				lv_w_dir_0_0=RULE_WORD
				{
					newLeafNode(lv_w_dir_0_0, grammarAccess.getWordDirectiveAccess().getW_dirWORDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWordDirectiveRule());
					}
					setWithLastConsumed(
						$current,
						"w_dir",
						lv_w_dir_0_0,
						"org.team38.assembly.LC2200.WORD");
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

RULE_SL_COMMENT : ';' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ML_COMMENT : EOF;

RULE_NEWLINE : '\n';

RULE_REG : ('$zero'|'$at'|'$v0'|'$a0'|'$a1'|'$a2'|'$t0'|'$t1'|'$t2'|'$s0'|'$s1'|'$s2'|'$k0'|'$sp'|'$fp'|'$ra');

RULE_IMMEDIATE : ('0x'|'-')? RULE_INT;

RULE_LABEL_IMM : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_LABEL : RULE_LABEL_IMM ':';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
