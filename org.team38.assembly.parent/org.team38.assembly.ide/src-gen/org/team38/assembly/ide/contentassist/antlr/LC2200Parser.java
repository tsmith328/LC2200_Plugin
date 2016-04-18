/*
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.team38.assembly.ide.contentassist.antlr.internal.InternalLC2200Parser;
import org.team38.assembly.services.LC2200GrammarAccess;

public class LC2200Parser extends AbstractContentAssistParser {

	@Inject
	private LC2200GrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalLC2200Parser createParser() {
		InternalLC2200Parser result = new InternalLC2200Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getLineAccess().getAlternatives(), "rule__Line__Alternatives");
					put(grammarAccess.getInstructionAccess().getInstructionAlternatives_1_0(), "rule__Instruction__InstructionAlternatives_1_0");
					put(grammarAccess.getDirectiveAccess().getDirectiveAlternatives_1_0(), "rule__Directive__DirectiveAlternatives_1_0");
					put(grammarAccess.getIInstructionAccess().getAlternatives(), "rule__IInstruction__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgramAccess().getGroup_2(), "rule__Program__Group_2__0");
					put(grammarAccess.getInstructionAccess().getGroup(), "rule__Instruction__Group__0");
					put(grammarAccess.getDirectiveAccess().getGroup(), "rule__Directive__Group__0");
					put(grammarAccess.getRInstructionAccess().getGroup(), "rule__RInstruction__Group__0");
					put(grammarAccess.getIInstructionAccess().getGroup_0(), "rule__IInstruction__Group_0__0");
					put(grammarAccess.getIInstructionAccess().getGroup_1(), "rule__IInstruction__Group_1__0");
					put(grammarAccess.getIInstructionAccess().getGroup_2(), "rule__IInstruction__Group_2__0");
					put(grammarAccess.getJInstructionAccess().getGroup(), "rule__JInstruction__Group__0");
					put(grammarAccess.getWordDirectiveAccess().getGroup(), "rule__WordDirective__Group__0");
					put(grammarAccess.getLADirectiveAccess().getGroup(), "rule__LADirective__Group__0");
					put(grammarAccess.getCommentTransAccess().getGroup(), "rule__CommentTrans__Group__0");
					put(grammarAccess.getLineEndAccess().getGroup(), "rule__LineEnd__Group__0");
					put(grammarAccess.getProgramAccess().getLinesAssignment_1(), "rule__Program__LinesAssignment_1");
					put(grammarAccess.getProgramAccess().getLinesAssignment_2_0(), "rule__Program__LinesAssignment_2_0");
					put(grammarAccess.getProgramAccess().getLinesAssignment_2_1(), "rule__Program__LinesAssignment_2_1");
					put(grammarAccess.getProgramAccess().getLinesAssignment_3(), "rule__Program__LinesAssignment_3");
					put(grammarAccess.getInstructionAccess().getLabelAssignment_0(), "rule__Instruction__LabelAssignment_0");
					put(grammarAccess.getInstructionAccess().getInstructionAssignment_1(), "rule__Instruction__InstructionAssignment_1");
					put(grammarAccess.getDirectiveAccess().getLabelAssignment_0(), "rule__Directive__LabelAssignment_0");
					put(grammarAccess.getDirectiveAccess().getDirectiveAssignment_1(), "rule__Directive__DirectiveAssignment_1");
					put(grammarAccess.getRInstructionAccess().getR_opcodeAssignment_0(), "rule__RInstruction__R_opcodeAssignment_0");
					put(grammarAccess.getRInstructionAccess().getReg1Assignment_1(), "rule__RInstruction__Reg1Assignment_1");
					put(grammarAccess.getRInstructionAccess().getReg2Assignment_3(), "rule__RInstruction__Reg2Assignment_3");
					put(grammarAccess.getRInstructionAccess().getReg3Assignment_5(), "rule__RInstruction__Reg3Assignment_5");
					put(grammarAccess.getIInstructionAccess().getI_opcodeAssignment_0_0(), "rule__IInstruction__I_opcodeAssignment_0_0");
					put(grammarAccess.getIInstructionAccess().getReg1Assignment_0_1(), "rule__IInstruction__Reg1Assignment_0_1");
					put(grammarAccess.getIInstructionAccess().getReg2Assignment_0_3(), "rule__IInstruction__Reg2Assignment_0_3");
					put(grammarAccess.getIInstructionAccess().getImmAssignment_0_5(), "rule__IInstruction__ImmAssignment_0_5");
					put(grammarAccess.getIInstructionAccess().getI_opcodeAssignment_1_0(), "rule__IInstruction__I_opcodeAssignment_1_0");
					put(grammarAccess.getIInstructionAccess().getReg1Assignment_1_1(), "rule__IInstruction__Reg1Assignment_1_1");
					put(grammarAccess.getIInstructionAccess().getImmAssignment_1_3(), "rule__IInstruction__ImmAssignment_1_3");
					put(grammarAccess.getIInstructionAccess().getReg2Assignment_1_5(), "rule__IInstruction__Reg2Assignment_1_5");
					put(grammarAccess.getIInstructionAccess().getI_opcodeAssignment_2_0(), "rule__IInstruction__I_opcodeAssignment_2_0");
					put(grammarAccess.getIInstructionAccess().getReg1Assignment_2_1(), "rule__IInstruction__Reg1Assignment_2_1");
					put(grammarAccess.getIInstructionAccess().getReg2Assignment_2_3(), "rule__IInstruction__Reg2Assignment_2_3");
					put(grammarAccess.getIInstructionAccess().getLabelAssignment_2_5(), "rule__IInstruction__LabelAssignment_2_5");
					put(grammarAccess.getJInstructionAccess().getJ_opcodeAssignment_0(), "rule__JInstruction__J_opcodeAssignment_0");
					put(grammarAccess.getJInstructionAccess().getReg1Assignment_1(), "rule__JInstruction__Reg1Assignment_1");
					put(grammarAccess.getJInstructionAccess().getReg2Assignment_3(), "rule__JInstruction__Reg2Assignment_3");
					put(grammarAccess.getOInstructionAccess().getO_opcodeAssignment(), "rule__OInstruction__O_opcodeAssignment");
					put(grammarAccess.getNOOPDirectiveAccess().getN_dirAssignment(), "rule__NOOPDirective__N_dirAssignment");
					put(grammarAccess.getWordDirectiveAccess().getW_dirAssignment_0(), "rule__WordDirective__W_dirAssignment_0");
					put(grammarAccess.getWordDirectiveAccess().getImmAssignment_1(), "rule__WordDirective__ImmAssignment_1");
					put(grammarAccess.getLADirectiveAccess().getLa_dirAssignment_0(), "rule__LADirective__La_dirAssignment_0");
					put(grammarAccess.getLADirectiveAccess().getRegAssignment_1(), "rule__LADirective__RegAssignment_1");
					put(grammarAccess.getLADirectiveAccess().getLabelAssignment_3(), "rule__LADirective__LabelAssignment_3");
					put(grammarAccess.getRInstructionTransAccess().getR_opcodeAssignment(), "rule__RInstructionTrans__R_opcodeAssignment");
					put(grammarAccess.getIInstructionImmTransAccess().getI_opcodeAssignment(), "rule__IInstructionImmTrans__I_opcodeAssignment");
					put(grammarAccess.getIInstructionOffsetTransAccess().getI_opcodeAssignment(), "rule__IInstructionOffsetTrans__I_opcodeAssignment");
					put(grammarAccess.getIInstructionLabelTransAccess().getI_opcodeAssignment(), "rule__IInstructionLabelTrans__I_opcodeAssignment");
					put(grammarAccess.getJInstructionTransAccess().getJ_opcodeAssignment(), "rule__JInstructionTrans__J_opcodeAssignment");
					put(grammarAccess.getWordTransAccess().getWordAssignment(), "rule__WordTrans__WordAssignment");
					put(grammarAccess.getLATransAccess().getLaAssignment(), "rule__LATrans__LaAssignment");
					put(grammarAccess.getLineEndAccess().getCommentAssignment_1(), "rule__LineEnd__CommentAssignment_1");
					put(grammarAccess.getRegTransAccess().getRegAssignment(), "rule__RegTrans__RegAssignment");
					put(grammarAccess.getLabelBegAccess().getLabelAssignment(), "rule__LabelBeg__LabelAssignment");
					put(grammarAccess.getLabelEndAccess().getLabelAssignment(), "rule__LabelEnd__LabelAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalLC2200Parser typedParser = (InternalLC2200Parser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LC2200GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LC2200GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
