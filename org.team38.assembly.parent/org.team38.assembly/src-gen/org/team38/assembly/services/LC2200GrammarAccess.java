/*
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LC2200GrammarAccess extends AbstractGrammarElementFinder {
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.Program");
		private final Assignment cProgramAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cProgramAlternatives_0 = (Alternatives)cProgramAssignment.eContents().get(0);
		private final RuleCall cProgramInstructionParserRuleCall_0_0 = (RuleCall)cProgramAlternatives_0.eContents().get(0);
		private final RuleCall cProgramDirectiveParserRuleCall_0_1 = (RuleCall)cProgramAlternatives_0.eContents().get(1);
		
		////Rules
		//Program:
		//	program+=(Instruction | Directive)*;
		@Override public ParserRule getRule() { return rule; }
		
		//program+=(Instruction | Directive)*
		public Assignment getProgramAssignment() { return cProgramAssignment; }
		
		//(Instruction | Directive)
		public Alternatives getProgramAlternatives_0() { return cProgramAlternatives_0; }
		
		//Instruction
		public RuleCall getProgramInstructionParserRuleCall_0_0() { return cProgramInstructionParserRuleCall_0_0; }
		
		//Directive
		public RuleCall getProgramDirectiveParserRuleCall_0_1() { return cProgramDirectiveParserRuleCall_0_1; }
	}
	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.Instruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLabelAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLabelLABELTerminalRuleCall_0_0 = (RuleCall)cLabelAssignment_0.eContents().get(0);
		private final Assignment cInstructionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cInstructionAlternatives_1_0 = (Alternatives)cInstructionAssignment_1.eContents().get(0);
		private final RuleCall cInstructionRInstructionParserRuleCall_1_0_0 = (RuleCall)cInstructionAlternatives_1_0.eContents().get(0);
		private final RuleCall cInstructionIInstructionParserRuleCall_1_0_1 = (RuleCall)cInstructionAlternatives_1_0.eContents().get(1);
		private final RuleCall cInstructionJInstructionParserRuleCall_1_0_2 = (RuleCall)cInstructionAlternatives_1_0.eContents().get(2);
		private final RuleCall cInstructionOInstructionParserRuleCall_1_0_3 = (RuleCall)cInstructionAlternatives_1_0.eContents().get(3);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final RuleCall cCOMMENTTerminalRuleCall_2_0 = (RuleCall)cAlternatives_2.eContents().get(0);
		private final RuleCall cNEWLINETerminalRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		
		//Instruction:
		//	label=LABEL? instruction=(RInstruction | IInstruction | JInstruction | OInstruction) (COMMENT | NEWLINE)?;
		@Override public ParserRule getRule() { return rule; }
		
		//label=LABEL? instruction=(RInstruction | IInstruction | JInstruction | OInstruction) (COMMENT | NEWLINE)?
		public Group getGroup() { return cGroup; }
		
		//label=LABEL?
		public Assignment getLabelAssignment_0() { return cLabelAssignment_0; }
		
		//LABEL
		public RuleCall getLabelLABELTerminalRuleCall_0_0() { return cLabelLABELTerminalRuleCall_0_0; }
		
		//instruction=(RInstruction | IInstruction | JInstruction | OInstruction)
		public Assignment getInstructionAssignment_1() { return cInstructionAssignment_1; }
		
		//(RInstruction | IInstruction | JInstruction | OInstruction)
		public Alternatives getInstructionAlternatives_1_0() { return cInstructionAlternatives_1_0; }
		
		//RInstruction
		public RuleCall getInstructionRInstructionParserRuleCall_1_0_0() { return cInstructionRInstructionParserRuleCall_1_0_0; }
		
		//IInstruction
		public RuleCall getInstructionIInstructionParserRuleCall_1_0_1() { return cInstructionIInstructionParserRuleCall_1_0_1; }
		
		//JInstruction
		public RuleCall getInstructionJInstructionParserRuleCall_1_0_2() { return cInstructionJInstructionParserRuleCall_1_0_2; }
		
		//OInstruction
		public RuleCall getInstructionOInstructionParserRuleCall_1_0_3() { return cInstructionOInstructionParserRuleCall_1_0_3; }
		
		//(COMMENT | NEWLINE)?
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//COMMENT
		public RuleCall getCOMMENTTerminalRuleCall_2_0() { return cCOMMENTTerminalRuleCall_2_0; }
		
		//NEWLINE
		public RuleCall getNEWLINETerminalRuleCall_2_1() { return cNEWLINETerminalRuleCall_2_1; }
	}
	public class DirectiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.Directive");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLabelAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLabelLABELTerminalRuleCall_0_0 = (RuleCall)cLabelAssignment_0.eContents().get(0);
		private final Assignment cDirectiveAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cDirectiveAlternatives_1_0 = (Alternatives)cDirectiveAssignment_1.eContents().get(0);
		private final RuleCall cDirectiveNOOPDirectiveParserRuleCall_1_0_0 = (RuleCall)cDirectiveAlternatives_1_0.eContents().get(0);
		private final RuleCall cDirectiveWordDirectiveParserRuleCall_1_0_1 = (RuleCall)cDirectiveAlternatives_1_0.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final RuleCall cCOMMENTTerminalRuleCall_2_0 = (RuleCall)cAlternatives_2.eContents().get(0);
		private final RuleCall cNEWLINETerminalRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		
		//Directive:
		//	label=LABEL? directive=(NOOPDirective | WordDirective) (COMMENT | NEWLINE)?;
		@Override public ParserRule getRule() { return rule; }
		
		//label=LABEL? directive=(NOOPDirective | WordDirective) (COMMENT | NEWLINE)?
		public Group getGroup() { return cGroup; }
		
		//label=LABEL?
		public Assignment getLabelAssignment_0() { return cLabelAssignment_0; }
		
		//LABEL
		public RuleCall getLabelLABELTerminalRuleCall_0_0() { return cLabelLABELTerminalRuleCall_0_0; }
		
		//directive=(NOOPDirective | WordDirective)
		public Assignment getDirectiveAssignment_1() { return cDirectiveAssignment_1; }
		
		//(NOOPDirective | WordDirective)
		public Alternatives getDirectiveAlternatives_1_0() { return cDirectiveAlternatives_1_0; }
		
		//NOOPDirective
		public RuleCall getDirectiveNOOPDirectiveParserRuleCall_1_0_0() { return cDirectiveNOOPDirectiveParserRuleCall_1_0_0; }
		
		//WordDirective
		public RuleCall getDirectiveWordDirectiveParserRuleCall_1_0_1() { return cDirectiveWordDirectiveParserRuleCall_1_0_1; }
		
		//(COMMENT | NEWLINE)?
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//COMMENT
		public RuleCall getCOMMENTTerminalRuleCall_2_0() { return cCOMMENTTerminalRuleCall_2_0; }
		
		//NEWLINE
		public RuleCall getNEWLINETerminalRuleCall_2_1() { return cNEWLINETerminalRuleCall_2_1; }
	}
	public class RInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.RInstruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cR_opcodeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cR_opcodeROPTerminalRuleCall_0_0 = (RuleCall)cR_opcodeAssignment_0.eContents().get(0);
		private final RuleCall cREGTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cREGTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final RuleCall cCOMMATerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final RuleCall cREGTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//RInstruction:
		//	r_opcode=ROP REG COMMA REG COMMA REG;
		@Override public ParserRule getRule() { return rule; }
		
		//r_opcode=ROP REG COMMA REG COMMA REG
		public Group getGroup() { return cGroup; }
		
		//r_opcode=ROP
		public Assignment getR_opcodeAssignment_0() { return cR_opcodeAssignment_0; }
		
		//ROP
		public RuleCall getR_opcodeROPTerminalRuleCall_0_0() { return cR_opcodeROPTerminalRuleCall_0_0; }
		
		//REG
		public RuleCall getREGTerminalRuleCall_1() { return cREGTerminalRuleCall_1; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_2() { return cCOMMATerminalRuleCall_2; }
		
		//REG
		public RuleCall getREGTerminalRuleCall_3() { return cREGTerminalRuleCall_3; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_4() { return cCOMMATerminalRuleCall_4; }
		
		//REG
		public RuleCall getREGTerminalRuleCall_5() { return cREGTerminalRuleCall_5; }
	}
	public class IInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.IInstruction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cI_opcodeAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cI_opcodeIOP_IMMTerminalRuleCall_0_0_0 = (RuleCall)cI_opcodeAssignment_0_0.eContents().get(0);
		private final RuleCall cREGTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_0_2 = (RuleCall)cGroup_0.eContents().get(2);
		private final RuleCall cREGTerminalRuleCall_0_3 = (RuleCall)cGroup_0.eContents().get(3);
		private final RuleCall cCOMMATerminalRuleCall_0_4 = (RuleCall)cGroup_0.eContents().get(4);
		private final RuleCall cIMMEDIATETerminalRuleCall_0_5 = (RuleCall)cGroup_0.eContents().get(5);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cI_opcodeAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cI_opcodeIOP_OFFSETTerminalRuleCall_1_0_0 = (RuleCall)cI_opcodeAssignment_1_0.eContents().get(0);
		private final RuleCall cREGTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final RuleCall cIMMEDIATETerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		private final RuleCall cLPARENTerminalRuleCall_1_4 = (RuleCall)cGroup_1.eContents().get(4);
		private final RuleCall cREGTerminalRuleCall_1_5 = (RuleCall)cGroup_1.eContents().get(5);
		private final RuleCall cRPARENTerminalRuleCall_1_6 = (RuleCall)cGroup_1.eContents().get(6);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Assignment cI_opcodeAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cI_opcodeIOP_LABELTerminalRuleCall_2_0_0 = (RuleCall)cI_opcodeAssignment_2_0.eContents().get(0);
		private final RuleCall cREGTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		private final RuleCall cREGTerminalRuleCall_2_3 = (RuleCall)cGroup_2.eContents().get(3);
		private final RuleCall cCOMMATerminalRuleCall_2_4 = (RuleCall)cGroup_2.eContents().get(4);
		private final RuleCall cLABEL_IMMTerminalRuleCall_2_5 = (RuleCall)cGroup_2.eContents().get(5);
		
		//IInstruction:
		//	i_opcode=IOP_IMM REG COMMA REG COMMA IMMEDIATE | i_opcode=IOP_OFFSET REG COMMA IMMEDIATE LPAREN REG RPAREN |
		//	i_opcode=IOP_LABEL REG COMMA REG COMMA LABEL_IMM;
		@Override public ParserRule getRule() { return rule; }
		
		//i_opcode=IOP_IMM REG COMMA REG COMMA IMMEDIATE | i_opcode=IOP_OFFSET REG COMMA IMMEDIATE LPAREN REG RPAREN |
		//i_opcode=IOP_LABEL REG COMMA REG COMMA LABEL_IMM
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//i_opcode=IOP_IMM REG COMMA REG COMMA IMMEDIATE
		public Group getGroup_0() { return cGroup_0; }
		
		//i_opcode=IOP_IMM
		public Assignment getI_opcodeAssignment_0_0() { return cI_opcodeAssignment_0_0; }
		
		//IOP_IMM
		public RuleCall getI_opcodeIOP_IMMTerminalRuleCall_0_0_0() { return cI_opcodeIOP_IMMTerminalRuleCall_0_0_0; }
		
		//REG
		public RuleCall getREGTerminalRuleCall_0_1() { return cREGTerminalRuleCall_0_1; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_0_2() { return cCOMMATerminalRuleCall_0_2; }
		
		//REG
		public RuleCall getREGTerminalRuleCall_0_3() { return cREGTerminalRuleCall_0_3; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_0_4() { return cCOMMATerminalRuleCall_0_4; }
		
		//IMMEDIATE
		public RuleCall getIMMEDIATETerminalRuleCall_0_5() { return cIMMEDIATETerminalRuleCall_0_5; }
		
		//i_opcode=IOP_OFFSET REG COMMA IMMEDIATE LPAREN REG RPAREN
		public Group getGroup_1() { return cGroup_1; }
		
		//i_opcode=IOP_OFFSET
		public Assignment getI_opcodeAssignment_1_0() { return cI_opcodeAssignment_1_0; }
		
		//IOP_OFFSET
		public RuleCall getI_opcodeIOP_OFFSETTerminalRuleCall_1_0_0() { return cI_opcodeIOP_OFFSETTerminalRuleCall_1_0_0; }
		
		//REG
		public RuleCall getREGTerminalRuleCall_1_1() { return cREGTerminalRuleCall_1_1; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_2() { return cCOMMATerminalRuleCall_1_2; }
		
		//IMMEDIATE
		public RuleCall getIMMEDIATETerminalRuleCall_1_3() { return cIMMEDIATETerminalRuleCall_1_3; }
		
		//LPAREN
		public RuleCall getLPARENTerminalRuleCall_1_4() { return cLPARENTerminalRuleCall_1_4; }
		
		//REG
		public RuleCall getREGTerminalRuleCall_1_5() { return cREGTerminalRuleCall_1_5; }
		
		//RPAREN
		public RuleCall getRPARENTerminalRuleCall_1_6() { return cRPARENTerminalRuleCall_1_6; }
		
		//i_opcode=IOP_LABEL REG COMMA REG COMMA LABEL_IMM
		public Group getGroup_2() { return cGroup_2; }
		
		//i_opcode=IOP_LABEL
		public Assignment getI_opcodeAssignment_2_0() { return cI_opcodeAssignment_2_0; }
		
		//IOP_LABEL
		public RuleCall getI_opcodeIOP_LABELTerminalRuleCall_2_0_0() { return cI_opcodeIOP_LABELTerminalRuleCall_2_0_0; }
		
		//REG
		public RuleCall getREGTerminalRuleCall_2_1() { return cREGTerminalRuleCall_2_1; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_2_2() { return cCOMMATerminalRuleCall_2_2; }
		
		//REG
		public RuleCall getREGTerminalRuleCall_2_3() { return cREGTerminalRuleCall_2_3; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_2_4() { return cCOMMATerminalRuleCall_2_4; }
		
		//LABEL_IMM
		public RuleCall getLABEL_IMMTerminalRuleCall_2_5() { return cLABEL_IMMTerminalRuleCall_2_5; }
	}
	public class JInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.JInstruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cJ_opcodeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cJ_opcodeJOPTerminalRuleCall_0_0 = (RuleCall)cJ_opcodeAssignment_0.eContents().get(0);
		private final RuleCall cREGTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cREGTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//JInstruction:
		//	j_opcode=JOP REG COMMA REG;
		@Override public ParserRule getRule() { return rule; }
		
		//j_opcode=JOP REG COMMA REG
		public Group getGroup() { return cGroup; }
		
		//j_opcode=JOP
		public Assignment getJ_opcodeAssignment_0() { return cJ_opcodeAssignment_0; }
		
		//JOP
		public RuleCall getJ_opcodeJOPTerminalRuleCall_0_0() { return cJ_opcodeJOPTerminalRuleCall_0_0; }
		
		//REG
		public RuleCall getREGTerminalRuleCall_1() { return cREGTerminalRuleCall_1; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_2() { return cCOMMATerminalRuleCall_2; }
		
		//REG
		public RuleCall getREGTerminalRuleCall_3() { return cREGTerminalRuleCall_3; }
	}
	public class OInstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.OInstruction");
		private final Assignment cO_opcodeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cO_opcodeOOPTerminalRuleCall_0 = (RuleCall)cO_opcodeAssignment.eContents().get(0);
		
		//OInstruction:
		//	o_opcode=OOP;
		@Override public ParserRule getRule() { return rule; }
		
		//o_opcode=OOP
		public Assignment getO_opcodeAssignment() { return cO_opcodeAssignment; }
		
		//OOP
		public RuleCall getO_opcodeOOPTerminalRuleCall_0() { return cO_opcodeOOPTerminalRuleCall_0; }
	}
	public class NOOPDirectiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.NOOPDirective");
		private final Assignment cN_dirAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cN_dirNOOPTerminalRuleCall_0 = (RuleCall)cN_dirAssignment.eContents().get(0);
		
		//NOOPDirective:
		//	n_dir=NOOP;
		@Override public ParserRule getRule() { return rule; }
		
		//n_dir=NOOP
		public Assignment getN_dirAssignment() { return cN_dirAssignment; }
		
		//NOOP
		public RuleCall getN_dirNOOPTerminalRuleCall_0() { return cN_dirNOOPTerminalRuleCall_0; }
	}
	public class WordDirectiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.WordDirective");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cW_dirAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cW_dirWORDTerminalRuleCall_0_0 = (RuleCall)cW_dirAssignment_0.eContents().get(0);
		private final RuleCall cIMMEDIATETerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//WordDirective:
		//	w_dir=WORD IMMEDIATE;
		@Override public ParserRule getRule() { return rule; }
		
		//w_dir=WORD IMMEDIATE
		public Group getGroup() { return cGroup; }
		
		//w_dir=WORD
		public Assignment getW_dirAssignment_0() { return cW_dirAssignment_0; }
		
		//WORD
		public RuleCall getW_dirWORDTerminalRuleCall_0_0() { return cW_dirWORDTerminalRuleCall_0_0; }
		
		//IMMEDIATE
		public RuleCall getIMMEDIATETerminalRuleCall_1() { return cIMMEDIATETerminalRuleCall_1; }
	}
	
	
	private final ProgramElements pProgram;
	private final InstructionElements pInstruction;
	private final DirectiveElements pDirective;
	private final RInstructionElements pRInstruction;
	private final IInstructionElements pIInstruction;
	private final JInstructionElements pJInstruction;
	private final OInstructionElements pOInstruction;
	private final NOOPDirectiveElements pNOOPDirective;
	private final WordDirectiveElements pWordDirective;
	private final TerminalRule tNOOP;
	private final TerminalRule tWORD;
	private final TerminalRule tOOP;
	private final TerminalRule tJOP;
	private final TerminalRule tIOP_IMM;
	private final TerminalRule tIOP_OFFSET;
	private final TerminalRule tIOP_LABEL;
	private final TerminalRule tLPAREN;
	private final TerminalRule tRPAREN;
	private final TerminalRule tCOMMA;
	private final TerminalRule tCOMMENT;
	private final TerminalRule tNEWLINE;
	private final TerminalRule tROP;
	private final TerminalRule tREG;
	private final TerminalRule tIMMEDIATE;
	private final TerminalRule tLABEL_IMM;
	private final TerminalRule tLABEL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LC2200GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgram = new ProgramElements();
		this.pInstruction = new InstructionElements();
		this.pDirective = new DirectiveElements();
		this.pRInstruction = new RInstructionElements();
		this.pIInstruction = new IInstructionElements();
		this.pJInstruction = new JInstructionElements();
		this.pOInstruction = new OInstructionElements();
		this.pNOOPDirective = new NOOPDirectiveElements();
		this.pWordDirective = new WordDirectiveElements();
		this.tNOOP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.NOOP");
		this.tWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.WORD");
		this.tOOP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.OOP");
		this.tJOP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.JOP");
		this.tIOP_IMM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.IOP_IMM");
		this.tIOP_OFFSET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.IOP_OFFSET");
		this.tIOP_LABEL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.IOP_LABEL");
		this.tLPAREN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.LPAREN");
		this.tRPAREN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.RPAREN");
		this.tCOMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.COMMA");
		this.tCOMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.COMMENT");
		this.tNEWLINE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.NEWLINE");
		this.tROP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.ROP");
		this.tREG = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.REG");
		this.tIMMEDIATE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.IMMEDIATE");
		this.tLABEL_IMM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.LABEL_IMM");
		this.tLABEL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.team38.assembly.LC2200.LABEL");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.team38.assembly.LC2200".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	////Rules
	//Program:
	//	program+=(Instruction | Directive)*;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//Instruction:
	//	label=LABEL? instruction=(RInstruction | IInstruction | JInstruction | OInstruction) (COMMENT | NEWLINE)?;
	public InstructionElements getInstructionAccess() {
		return pInstruction;
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}
	
	//Directive:
	//	label=LABEL? directive=(NOOPDirective | WordDirective) (COMMENT | NEWLINE)?;
	public DirectiveElements getDirectiveAccess() {
		return pDirective;
	}
	
	public ParserRule getDirectiveRule() {
		return getDirectiveAccess().getRule();
	}
	
	//RInstruction:
	//	r_opcode=ROP REG COMMA REG COMMA REG;
	public RInstructionElements getRInstructionAccess() {
		return pRInstruction;
	}
	
	public ParserRule getRInstructionRule() {
		return getRInstructionAccess().getRule();
	}
	
	//IInstruction:
	//	i_opcode=IOP_IMM REG COMMA REG COMMA IMMEDIATE | i_opcode=IOP_OFFSET REG COMMA IMMEDIATE LPAREN REG RPAREN |
	//	i_opcode=IOP_LABEL REG COMMA REG COMMA LABEL_IMM;
	public IInstructionElements getIInstructionAccess() {
		return pIInstruction;
	}
	
	public ParserRule getIInstructionRule() {
		return getIInstructionAccess().getRule();
	}
	
	//JInstruction:
	//	j_opcode=JOP REG COMMA REG;
	public JInstructionElements getJInstructionAccess() {
		return pJInstruction;
	}
	
	public ParserRule getJInstructionRule() {
		return getJInstructionAccess().getRule();
	}
	
	//OInstruction:
	//	o_opcode=OOP;
	public OInstructionElements getOInstructionAccess() {
		return pOInstruction;
	}
	
	public ParserRule getOInstructionRule() {
		return getOInstructionAccess().getRule();
	}
	
	//NOOPDirective:
	//	n_dir=NOOP;
	public NOOPDirectiveElements getNOOPDirectiveAccess() {
		return pNOOPDirective;
	}
	
	public ParserRule getNOOPDirectiveRule() {
		return getNOOPDirectiveAccess().getRule();
	}
	
	//WordDirective:
	//	w_dir=WORD IMMEDIATE;
	public WordDirectiveElements getWordDirectiveAccess() {
		return pWordDirective;
	}
	
	public ParserRule getWordDirectiveRule() {
		return getWordDirectiveAccess().getRule();
	}
	
	//terminal NOOP:
	//	'noop';
	public TerminalRule getNOOPRule() {
		return tNOOP;
	}
	
	//terminal WORD:
	//	'.word';
	public TerminalRule getWORDRule() {
		return tWORD;
	}
	
	//terminal OOP:
	//	'halt' |
	//	'ei' |
	//	'di' |
	//	'reti';
	public TerminalRule getOOPRule() {
		return tOOP;
	}
	
	//terminal JOP:
	//	'jalr';
	public TerminalRule getJOPRule() {
		return tJOP;
	}
	
	//terminal IOP_IMM:
	//	'addi';
	public TerminalRule getIOP_IMMRule() {
		return tIOP_IMM;
	}
	
	//terminal IOP_OFFSET:
	//	'lw' |
	//	'sw';
	public TerminalRule getIOP_OFFSETRule() {
		return tIOP_OFFSET;
	}
	
	//terminal IOP_LABEL:
	//	'beq';
	public TerminalRule getIOP_LABELRule() {
		return tIOP_LABEL;
	}
	
	//terminal LPAREN:
	//	'(';
	public TerminalRule getLPARENRule() {
		return tLPAREN;
	}
	
	//terminal RPAREN:
	//	')';
	public TerminalRule getRPARENRule() {
		return tRPAREN;
	}
	
	//terminal COMMA:
	//	',';
	public TerminalRule getCOMMARule() {
		return tCOMMA;
	}
	
	//terminal COMMENT:
	//	';' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getCOMMENTRule() {
		return tCOMMENT;
	}
	
	//terminal NEWLINE:
	//	'\n';
	public TerminalRule getNEWLINERule() {
		return tNEWLINE;
	}
	
	//terminal ROP:
	//	'add' |
	//	'nand';
	public TerminalRule getROPRule() {
		return tROP;
	}
	
	//terminal REG:
	//	'$zero' |
	//	'$at' |
	//	'$v0' |
	//	'$a0' |
	//	'$a1' |
	//	'$a2' |
	//	'$a3' |
	//	'$a4' |
	//	'$s0' |
	//	'$s1' |
	//	'$s2' |
	//	'$s3' |
	//	'$k0' |
	//	'$sp' |
	//	'$fp' |
	//	'$ra';
	public TerminalRule getREGRule() {
		return tREG;
	}
	
	//terminal IMMEDIATE:
	//	'0x'? INT;
	public TerminalRule getIMMEDIATERule() {
		return tIMMEDIATE;
	}
	
	//terminal LABEL_IMM:
	//	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getLABEL_IMMRule() {
		return tLABEL_IMM;
	}
	
	//terminal LABEL:
	//	LABEL_IMM ':';
	public TerminalRule getLABELRule() {
		return tLABEL;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
