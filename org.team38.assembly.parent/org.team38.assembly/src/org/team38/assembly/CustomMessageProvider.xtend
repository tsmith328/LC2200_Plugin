package org.team38.assembly

import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage

class CustomMessageProvider extends SyntaxErrorMessageProvider {
	
	public static val String IMMEDIATE = "immediate"
	public static val String RULE_REG = "register"
	public static val String COMMA = "comma"
	public static val String INSTR_START = "start_instruction"
	public static val String INSTR_END = "end_instruction"
	public static val String LABEL = "label"
	public static val String PAREN = "parenthesis"
	
	
	override getSyntaxErrorMessage(IParserErrorContext context) {
		
		val String msgDefault = context.getDefaultMessage(); 
		
		if (msgDefault.contains('IMMEDIATE')) {
			return new SyntaxErrorMessage("Expecting an immediate value, i.e. an integer.", IMMEDIATE)
		} else if (msgDefault.contains('RULE_REG')) {
			return new SyntaxErrorMessage("Expecting a valid register, e.g. $t0.", RULE_REG)
		} else if (msgDefault.contains('COMMA')) {
			return new SyntaxErrorMessage("Expecting a comma.", COMMA)
		} else if (msgDefault.contains('LABEL_IMM')) {
			return new SyntaxErrorMessage("Missing label", LABEL)
		} else if (msgDefault.contains('extraneous')) {
			return new SyntaxErrorMessage("Expecting label or instruction.", INSTR_START)
		} else if (msgDefault.contains('EOF')) {
			return new SyntaxErrorMessage("Expecting end of instruction.", INSTR_END)
		} else if (msgDefault.contains('LABEL')) {
			return new SyntaxErrorMessage("Expecting a pre-defined label.", LABEL)
		} else if (msgDefault.contains('PAREN')) {
			return new SyntaxErrorMessage("Missing a parenthesis.", PAREN)
		} else if (msgDefault.contains('viable')) {
			return new SyntaxErrorMessage("Expecting instruction afterwards", LABEL)
		}

        super.getSyntaxErrorMessage(context)

    }
	
	
}