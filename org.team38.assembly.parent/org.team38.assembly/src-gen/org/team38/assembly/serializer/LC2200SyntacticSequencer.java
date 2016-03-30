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
	protected AbstractElementAlias match_Directive___ML_COMMENTTerminalRuleCall_3_0_or_NEWLINETerminalRuleCall_3_1__q;
	protected AbstractElementAlias match_Instruction___ML_COMMENTTerminalRuleCall_3_0_or_NEWLINETerminalRuleCall_3_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LC2200GrammarAccess) access;
		match_Directive___ML_COMMENTTerminalRuleCall_3_0_or_NEWLINETerminalRuleCall_3_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDirectiveAccess().getML_COMMENTTerminalRuleCall_3_0()), new TokenAlias(false, false, grammarAccess.getDirectiveAccess().getNEWLINETerminalRuleCall_3_1()));
		match_Instruction___ML_COMMENTTerminalRuleCall_3_0_or_NEWLINETerminalRuleCall_3_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getInstructionAccess().getML_COMMENTTerminalRuleCall_3_0()), new TokenAlias(false, false, grammarAccess.getInstructionAccess().getNEWLINETerminalRuleCall_3_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLPARENRule())
			return getLPARENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getML_COMMENTRule())
			return getML_COMMENTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNEWLINERule())
			return getNEWLINEToken(semanticObject, ruleCall, node);
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
	 * terminal ML_COMMENT:
	 * 	EOF
	 * ;
	 */
	protected String getML_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
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
			if (match_Directive___ML_COMMENTTerminalRuleCall_3_0_or_NEWLINETerminalRuleCall_3_1__q.equals(syntax))
				emit_Directive___ML_COMMENTTerminalRuleCall_3_0_or_NEWLINETerminalRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Instruction___ML_COMMENTTerminalRuleCall_3_0_or_NEWLINETerminalRuleCall_3_1__q.equals(syntax))
				emit_Instruction___ML_COMMENTTerminalRuleCall_3_0_or_NEWLINETerminalRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (ML_COMMENT | NEWLINE)?
	 *
	 * This ambiguous syntax occurs at:
	 *     comment=CommentTrans (ambiguity) (rule end)
	 *     directive=LADirective (ambiguity) (rule end)
	 *     directive=NOOPDirective (ambiguity) (rule end)
	 *     directive=WordDirective (ambiguity) (rule end)
	 */
	protected void emit_Directive___ML_COMMENTTerminalRuleCall_3_0_or_NEWLINETerminalRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (ML_COMMENT | NEWLINE)?
	 *
	 * This ambiguous syntax occurs at:
	 *     comment=CommentTrans (ambiguity) (rule end)
	 *     instruction=IInstruction (ambiguity) (rule end)
	 *     instruction=JInstruction (ambiguity) (rule end)
	 *     instruction=OInstruction (ambiguity) (rule end)
	 *     instruction=RInstruction (ambiguity) (rule end)
	 */
	protected void emit_Instruction___ML_COMMENTTerminalRuleCall_3_0_or_NEWLINETerminalRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
