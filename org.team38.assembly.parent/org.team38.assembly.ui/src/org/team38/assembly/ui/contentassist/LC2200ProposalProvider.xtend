/*
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.RuleCall
import org.team38.assembly.LabelHandler
import org.team38.assembly.lC2200.Program

/**
 * Provides custom content assistant proposals
 * 
 */
class LC2200ProposalProvider extends AbstractLC2200ProposalProvider {
	/**
	 * Constant arrays of proposals for registers
	 */
	val REGTRANS_PROPOSALS = #[
		'$zero',
		'$at',
		'$v0',
		'$a0',
		'$a1',
		'$a2',
		'$t0',
		'$t1',
		'$t2',
		'$s0',
		'$s1',
		'$s2',
		'$k0',
		'$sp',
		'$fp',
		'$ra'
	]		
	
	/**
	 * Displays register names when prompted to code assist 
	 * on a RegTrans grammar element.
	 * 
	 * @param model - The RegTrans node
	 * @param ruleCall - The rule call that the RegTrans is contained in
	 * @param context - Current context
	 * @param acceptor - Adds valid proposals to be displayed
	 */
	override 	
	def complete_RegTrans(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_RegTrans(model, ruleCall, context, acceptor);
		for(proposal : REGTRANS_PROPOSALS) {
			acceptor.accept(createCompletionProposal(proposal, context));
		}		
	}
	
	/**
	 * Displays existing label names when prompted to code
	 * assist on a LabelEnd grammar element.
	 * 
	 * @param model - The LabelEnd node
	 * @param ruleCall - The rule call that the LabelEnd is contained in
	 * @param context - Current context
	 * @param acceptor - Adds valid proposals to be displayed
	 */
	 override
	 def complete_LabelEnd(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
	 	super.complete_LabelEnd(model, ruleCall, context, acceptor);
	 	
	 	var root = model;				
		while(root.eContainer() != null) {
			root = root.eContainer();
		}
		
	 	var labels = LabelHandler.populateLabels(root as Program);
	 	
	 	for(label : labels.keySet()) {
	 		acceptor.accept(createCompletionProposal(label, context));
	 	}
	 }
	
}
