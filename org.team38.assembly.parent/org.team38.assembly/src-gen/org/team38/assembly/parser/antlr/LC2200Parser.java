/*
 * generated by Xtext 2.9.2
 */
package org.team38.assembly.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.team38.assembly.parser.antlr.internal.InternalLC2200Parser;
import org.team38.assembly.services.LC2200GrammarAccess;

public class LC2200Parser extends AbstractAntlrParser {

	@Inject
	private LC2200GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLC2200Parser createParser(XtextTokenStream stream) {
		return new InternalLC2200Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public LC2200GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LC2200GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
