/*
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.team38.assembly.services.LC2200GrammarAccess;

@SuppressWarnings("all")
public class LC2200SyntacticSequencer extends AbstractSyntacticSequencer {

	protected LC2200GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Directive___COMMENTTerminalRuleCall_2_0_or_NEWLINETerminalRuleCall_2_1__q;
	protected AbstractElementAlias match_Instruction___COMMENTTerminalRuleCall_2_0_or_NEWLINETerminalRuleCall_2_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LC2200GrammarAccess) access;
		match_Directive___COMMENTTerminalRuleCall_2_0_or_NEWLINETerminalRuleCall_2_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDirectiveAccess().getCOMMENTTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getDirectiveAccess().getNEWLINETerminalRuleCall_2_1()));
		match_Instruction___COMMENTTerminalRuleCall_2_0_or_NEWLINETerminalRuleCall_2_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getInstructionAccess().getCOMMENTTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getInstructionAccess().getNEWLINETerminalRuleCall_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOMMENTRule())
			return getCOMMENTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIMMEDIATERule())
			return getIMMEDIATEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLABEL_IMMRule())
			return getLABEL_IMMToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLPARENRule())
			return getLPARENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNEWLINERule())
			return getNEWLINEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getREGRule())
			return getREGToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRPARENRule())
			return getRPARENToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COMMA:
	 * 	','
	 * ;
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal COMMENT:
	 * 	';' !('\n'|'\r')* ('\r'? '\n')?
	 * ;
	 */
	protected String getCOMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal IMMEDIATE:
	 * 	('0x')?(INT)
	 * ;
	 */
	protected String getIMMEDIATEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal LABEL_IMM:
	 * 	('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 * ;
	 */
	protected String getLABEL_IMMToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal LPAREN:
	 * 	'('
	 * ;
	 */
	protected String getLPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal NEWLINE:
	 * 	'\n'
	 * ;
	 */
	protected String getNEWLINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	/**
	 * terminal REG:
	 * 	'$zero' |
	 * 	'$at'	|
	 * 	'$v0'	|
	 * 	'$a0'	|
	 * 	'$a1'	|
	 * 	'$a2'	|
	 * 	'$a3'	|
	 * 	'$a4'	|
	 * 	'$s0'	|
	 * 	'$s1'	|
	 * 	'$s2'	|
	 * 	'$s3'	|
	 * 	'$k0'	|
	 * 	'$sp'	|
	 * 	'$fp'	|
	 * 	'$ra'
	 * ;
	 */
	protected String getREGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$zero";
	}
	
	/**
	 * terminal RPAREN:
	 * 	')'
	 * ;
	 */
	protected String getRPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Directive___COMMENTTerminalRuleCall_2_0_or_NEWLINETerminalRuleCall_2_1__q.equals(syntax))
				emit_Directive___COMMENTTerminalRuleCall_2_0_or_NEWLINETerminalRuleCall_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Instruction___COMMENTTerminalRuleCall_2_0_or_NEWLINETerminalRuleCall_2_1__q.equals(syntax))
				emit_Instruction___COMMENTTerminalRuleCall_2_0_or_NEWLINETerminalRuleCall_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (COMMENT | NEWLINE)?
	 *
	 * This ambiguous syntax occurs at:
	 *     directive=NOOPDirective (ambiguity) (rule end)
	 *     directive=WordDirective (ambiguity) (rule end)
	 */
	protected void emit_Directive___COMMENTTerminalRuleCall_2_0_or_NEWLINETerminalRuleCall_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (COMMENT | NEWLINE)?
	 *
	 * This ambiguous syntax occurs at:
	 *     instruction=IInstruction (ambiguity) (rule end)
	 *     instruction=JInstruction (ambiguity) (rule end)
	 *     instruction=OInstruction (ambiguity) (rule end)
	 *     instruction=RInstruction (ambiguity) (rule end)
	 */
	protected void emit_Instruction___COMMENTTerminalRuleCall_2_0_or_NEWLINETerminalRuleCall_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
