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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLC2200Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMA", "RULE_IMMEDIATE", "RULE_LPAREN", "RULE_RPAREN", "RULE_OOP", "RULE_NOOP", "RULE_ROP", "RULE_IOP_IMM", "RULE_IOP_OFFSET", "RULE_IOP_LABEL", "RULE_JOP", "RULE_WORD", "RULE_LA", "RULE_COMMENT", "RULE_NEWLINE", "RULE_REG", "RULE_LABEL", "RULE_LABEL_IMM", "RULE_WS", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER"
    };
    public static final int RULE_LABEL=20;
    public static final int RULE_LA=16;
    public static final int RULE_IMMEDIATE=5;
    public static final int RULE_NEWLINE=18;
    public static final int RULE_WORD=15;
    public static final int RULE_REG=19;
    public static final int RULE_STRING=25;
    public static final int RULE_ROP=10;
    public static final int RULE_LPAREN=6;
    public static final int RULE_SL_COMMENT=27;
    public static final int RULE_IOP_OFFSET=12;
    public static final int RULE_JOP=14;
    public static final int RULE_OOP=8;
    public static final int RULE_LABEL_IMM=21;
    public static final int EOF=-1;
    public static final int RULE_NOOP=9;
    public static final int RULE_ID=24;
    public static final int RULE_COMMA=4;
    public static final int RULE_WS=22;
    public static final int RULE_COMMENT=17;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_RPAREN=7;
    public static final int RULE_IOP_LABEL=13;
    public static final int RULE_INT=23;
    public static final int RULE_ML_COMMENT=26;
    public static final int RULE_IOP_IMM=11;

    // delegates
    // delegators


        public InternalLC2200Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLC2200Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLC2200Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalLC2200.g"; }



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




    // $ANTLR start "entryRuleProgram"
    // InternalLC2200.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalLC2200.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalLC2200.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalLC2200.g:71:1: ruleProgram returns [EObject current=null] : ( () ( (lv_lines_1_0= ruleLineEnd ) )* ( ( (lv_lines_2_0= ruleLine ) ) ( (lv_lines_3_0= ruleLineEnd ) )+ )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_lines_1_0 = null;

        EObject lv_lines_2_0 = null;

        EObject lv_lines_3_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:77:2: ( ( () ( (lv_lines_1_0= ruleLineEnd ) )* ( ( (lv_lines_2_0= ruleLine ) ) ( (lv_lines_3_0= ruleLineEnd ) )+ )* ) )
            // InternalLC2200.g:78:2: ( () ( (lv_lines_1_0= ruleLineEnd ) )* ( ( (lv_lines_2_0= ruleLine ) ) ( (lv_lines_3_0= ruleLineEnd ) )+ )* )
            {
            // InternalLC2200.g:78:2: ( () ( (lv_lines_1_0= ruleLineEnd ) )* ( ( (lv_lines_2_0= ruleLine ) ) ( (lv_lines_3_0= ruleLineEnd ) )+ )* )
            // InternalLC2200.g:79:3: () ( (lv_lines_1_0= ruleLineEnd ) )* ( ( (lv_lines_2_0= ruleLine ) ) ( (lv_lines_3_0= ruleLineEnd ) )+ )*
            {
            // InternalLC2200.g:79:3: ()
            // InternalLC2200.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            // InternalLC2200.g:86:3: ( (lv_lines_1_0= ruleLineEnd ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_COMMENT && LA1_0<=RULE_NEWLINE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLC2200.g:87:4: (lv_lines_1_0= ruleLineEnd )
            	    {
            	    // InternalLC2200.g:87:4: (lv_lines_1_0= ruleLineEnd )
            	    // InternalLC2200.g:88:5: lv_lines_1_0= ruleLineEnd
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getLinesLineEndParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_lines_1_0=ruleLineEnd();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lines",
            	    						lv_lines_1_0,
            	    						"org.team38.assembly.LC2200.LineEnd");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalLC2200.g:105:3: ( ( (lv_lines_2_0= ruleLine ) ) ( (lv_lines_3_0= ruleLineEnd ) )+ )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_OOP && LA3_0<=RULE_LA)||LA3_0==RULE_LABEL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLC2200.g:106:4: ( (lv_lines_2_0= ruleLine ) ) ( (lv_lines_3_0= ruleLineEnd ) )+
            	    {
            	    // InternalLC2200.g:106:4: ( (lv_lines_2_0= ruleLine ) )
            	    // InternalLC2200.g:107:5: (lv_lines_2_0= ruleLine )
            	    {
            	    // InternalLC2200.g:107:5: (lv_lines_2_0= ruleLine )
            	    // InternalLC2200.g:108:6: lv_lines_2_0= ruleLine
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getLinesLineParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_lines_2_0=ruleLine();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lines",
            	    							lv_lines_2_0,
            	    							"org.team38.assembly.LC2200.Line");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalLC2200.g:125:4: ( (lv_lines_3_0= ruleLineEnd ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>=RULE_COMMENT && LA2_0<=RULE_NEWLINE)) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalLC2200.g:126:5: (lv_lines_3_0= ruleLineEnd )
            	    	    {
            	    	    // InternalLC2200.g:126:5: (lv_lines_3_0= ruleLineEnd )
            	    	    // InternalLC2200.g:127:6: lv_lines_3_0= ruleLineEnd
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getProgramAccess().getLinesLineEndParserRuleCall_2_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_lines_3_0=ruleLineEnd();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"lines",
            	    	    							lv_lines_3_0,
            	    	    							"org.team38.assembly.LC2200.LineEnd");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleLine"
    // InternalLC2200.g:149:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalLC2200.g:149:45: (iv_ruleLine= ruleLine EOF )
            // InternalLC2200.g:150:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalLC2200.g:156:1: ruleLine returns [EObject current=null] : (this_Instruction_0= ruleInstruction | this_Directive_1= ruleDirective ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        EObject this_Instruction_0 = null;

        EObject this_Directive_1 = null;



        	enterRule();

        try {
            // InternalLC2200.g:162:2: ( (this_Instruction_0= ruleInstruction | this_Directive_1= ruleDirective ) )
            // InternalLC2200.g:163:2: (this_Instruction_0= ruleInstruction | this_Directive_1= ruleDirective )
            {
            // InternalLC2200.g:163:2: (this_Instruction_0= ruleInstruction | this_Directive_1= ruleDirective )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_LABEL:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_NOOP||(LA4_1>=RULE_WORD && LA4_1<=RULE_LA)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_OOP||(LA4_1>=RULE_ROP && LA4_1<=RULE_JOP)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_OOP:
            case RULE_ROP:
            case RULE_IOP_IMM:
            case RULE_IOP_OFFSET:
            case RULE_IOP_LABEL:
            case RULE_JOP:
                {
                alt4=1;
                }
                break;
            case RULE_NOOP:
            case RULE_WORD:
            case RULE_LA:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLC2200.g:164:3: this_Instruction_0= ruleInstruction
                    {

                    			newCompositeNode(grammarAccess.getLineAccess().getInstructionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instruction_0=ruleInstruction();

                    state._fsp--;


                    			current = this_Instruction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLC2200.g:173:3: this_Directive_1= ruleDirective
                    {

                    			newCompositeNode(grammarAccess.getLineAccess().getDirectiveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Directive_1=ruleDirective();

                    state._fsp--;


                    			current = this_Directive_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleInstruction"
    // InternalLC2200.g:185:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalLC2200.g:185:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalLC2200.g:186:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalLC2200.g:192:1: ruleInstruction returns [EObject current=null] : ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_label_0_0 = null;

        EObject lv_instruction_1_1 = null;

        EObject lv_instruction_1_2 = null;

        EObject lv_instruction_1_3 = null;

        EObject lv_instruction_1_4 = null;



        	enterRule();

        try {
            // InternalLC2200.g:198:2: ( ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) ) )
            // InternalLC2200.g:199:2: ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) )
            {
            // InternalLC2200.g:199:2: ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) )
            // InternalLC2200.g:200:3: ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) )
            {
            // InternalLC2200.g:200:3: ( (lv_label_0_0= ruleLabelBeg ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LABEL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLC2200.g:201:4: (lv_label_0_0= ruleLabelBeg )
                    {
                    // InternalLC2200.g:201:4: (lv_label_0_0= ruleLabelBeg )
                    // InternalLC2200.g:202:5: lv_label_0_0= ruleLabelBeg
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getLabelLabelBegParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_label_0_0=ruleLabelBeg();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"label",
                    						lv_label_0_0,
                    						"org.team38.assembly.LC2200.LabelBeg");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLC2200.g:219:3: ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) )
            // InternalLC2200.g:220:4: ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) )
            {
            // InternalLC2200.g:220:4: ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) )
            // InternalLC2200.g:221:5: (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction )
            {
            // InternalLC2200.g:221:5: (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ROP:
                {
                alt6=1;
                }
                break;
            case RULE_IOP_IMM:
            case RULE_IOP_OFFSET:
            case RULE_IOP_LABEL:
                {
                alt6=2;
                }
                break;
            case RULE_JOP:
                {
                alt6=3;
                }
                break;
            case RULE_OOP:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLC2200.g:222:6: lv_instruction_1_1= ruleRInstruction
                    {

                    						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionRInstructionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_instruction_1_1=ruleRInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstructionRule());
                    						}
                    						set(
                    							current,
                    							"instruction",
                    							lv_instruction_1_1,
                    							"org.team38.assembly.LC2200.RInstruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLC2200.g:238:6: lv_instruction_1_2= ruleIInstruction
                    {

                    						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionIInstructionParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_instruction_1_2=ruleIInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstructionRule());
                    						}
                    						set(
                    							current,
                    							"instruction",
                    							lv_instruction_1_2,
                    							"org.team38.assembly.LC2200.IInstruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalLC2200.g:254:6: lv_instruction_1_3= ruleJInstruction
                    {

                    						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionJInstructionParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_instruction_1_3=ruleJInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstructionRule());
                    						}
                    						set(
                    							current,
                    							"instruction",
                    							lv_instruction_1_3,
                    							"org.team38.assembly.LC2200.JInstruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalLC2200.g:270:6: lv_instruction_1_4= ruleOInstruction
                    {

                    						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionOInstructionParserRuleCall_1_0_3());
                    					
                    pushFollow(FOLLOW_2);
                    lv_instruction_1_4=ruleOInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstructionRule());
                    						}
                    						set(
                    							current,
                    							"instruction",
                    							lv_instruction_1_4,
                    							"org.team38.assembly.LC2200.OInstruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleDirective"
    // InternalLC2200.g:292:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // InternalLC2200.g:292:50: (iv_ruleDirective= ruleDirective EOF )
            // InternalLC2200.g:293:2: iv_ruleDirective= ruleDirective EOF
            {
             newCompositeNode(grammarAccess.getDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirective=ruleDirective();

            state._fsp--;

             current =iv_ruleDirective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // InternalLC2200.g:299:1: ruleDirective returns [EObject current=null] : ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) ) ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        EObject lv_label_0_0 = null;

        EObject lv_directive_1_1 = null;

        EObject lv_directive_1_2 = null;

        EObject lv_directive_1_3 = null;



        	enterRule();

        try {
            // InternalLC2200.g:305:2: ( ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) ) ) )
            // InternalLC2200.g:306:2: ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) ) )
            {
            // InternalLC2200.g:306:2: ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) ) )
            // InternalLC2200.g:307:3: ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) )
            {
            // InternalLC2200.g:307:3: ( (lv_label_0_0= ruleLabelBeg ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LABEL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLC2200.g:308:4: (lv_label_0_0= ruleLabelBeg )
                    {
                    // InternalLC2200.g:308:4: (lv_label_0_0= ruleLabelBeg )
                    // InternalLC2200.g:309:5: lv_label_0_0= ruleLabelBeg
                    {

                    					newCompositeNode(grammarAccess.getDirectiveAccess().getLabelLabelBegParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_label_0_0=ruleLabelBeg();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDirectiveRule());
                    					}
                    					set(
                    						current,
                    						"label",
                    						lv_label_0_0,
                    						"org.team38.assembly.LC2200.LabelBeg");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLC2200.g:326:3: ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) )
            // InternalLC2200.g:327:4: ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) )
            {
            // InternalLC2200.g:327:4: ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) )
            // InternalLC2200.g:328:5: (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective )
            {
            // InternalLC2200.g:328:5: (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_NOOP:
                {
                alt8=1;
                }
                break;
            case RULE_WORD:
                {
                alt8=2;
                }
                break;
            case RULE_LA:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalLC2200.g:329:6: lv_directive_1_1= ruleNOOPDirective
                    {

                    						newCompositeNode(grammarAccess.getDirectiveAccess().getDirectiveNOOPDirectiveParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_directive_1_1=ruleNOOPDirective();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectiveRule());
                    						}
                    						set(
                    							current,
                    							"directive",
                    							lv_directive_1_1,
                    							"org.team38.assembly.LC2200.NOOPDirective");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLC2200.g:345:6: lv_directive_1_2= ruleWordDirective
                    {

                    						newCompositeNode(grammarAccess.getDirectiveAccess().getDirectiveWordDirectiveParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_directive_1_2=ruleWordDirective();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectiveRule());
                    						}
                    						set(
                    							current,
                    							"directive",
                    							lv_directive_1_2,
                    							"org.team38.assembly.LC2200.WordDirective");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalLC2200.g:361:6: lv_directive_1_3= ruleLADirective
                    {

                    						newCompositeNode(grammarAccess.getDirectiveAccess().getDirectiveLADirectiveParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_directive_1_3=ruleLADirective();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectiveRule());
                    						}
                    						set(
                    							current,
                    							"directive",
                    							lv_directive_1_3,
                    							"org.team38.assembly.LC2200.LADirective");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleRInstruction"
    // InternalLC2200.g:383:1: entryRuleRInstruction returns [EObject current=null] : iv_ruleRInstruction= ruleRInstruction EOF ;
    public final EObject entryRuleRInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRInstruction = null;


        try {
            // InternalLC2200.g:383:53: (iv_ruleRInstruction= ruleRInstruction EOF )
            // InternalLC2200.g:384:2: iv_ruleRInstruction= ruleRInstruction EOF
            {
             newCompositeNode(grammarAccess.getRInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRInstruction=ruleRInstruction();

            state._fsp--;

             current =iv_ruleRInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRInstruction"


    // $ANTLR start "ruleRInstruction"
    // InternalLC2200.g:390:1: ruleRInstruction returns [EObject current=null] : ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) ) ;
    public final EObject ruleRInstruction() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_2=null;
        Token this_COMMA_4=null;
        EObject lv_r_opcode_0_0 = null;

        EObject lv_reg1_1_0 = null;

        EObject lv_reg2_3_0 = null;

        EObject lv_reg3_5_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:396:2: ( ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) ) )
            // InternalLC2200.g:397:2: ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) )
            {
            // InternalLC2200.g:397:2: ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) )
            // InternalLC2200.g:398:3: ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) )
            {
            // InternalLC2200.g:398:3: ( (lv_r_opcode_0_0= ruleRInstructionTrans ) )
            // InternalLC2200.g:399:4: (lv_r_opcode_0_0= ruleRInstructionTrans )
            {
            // InternalLC2200.g:399:4: (lv_r_opcode_0_0= ruleRInstructionTrans )
            // InternalLC2200.g:400:5: lv_r_opcode_0_0= ruleRInstructionTrans
            {

            					newCompositeNode(grammarAccess.getRInstructionAccess().getR_opcodeRInstructionTransParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_r_opcode_0_0=ruleRInstructionTrans();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRInstructionRule());
            					}
            					set(
            						current,
            						"r_opcode",
            						lv_r_opcode_0_0,
            						"org.team38.assembly.LC2200.RInstructionTrans");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLC2200.g:417:3: ( (lv_reg1_1_0= ruleRegTrans ) )
            // InternalLC2200.g:418:4: (lv_reg1_1_0= ruleRegTrans )
            {
            // InternalLC2200.g:418:4: (lv_reg1_1_0= ruleRegTrans )
            // InternalLC2200.g:419:5: lv_reg1_1_0= ruleRegTrans
            {

            					newCompositeNode(grammarAccess.getRInstructionAccess().getReg1RegTransParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_reg1_1_0=ruleRegTrans();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRInstructionRule());
            					}
            					set(
            						current,
            						"reg1",
            						lv_reg1_1_0,
            						"org.team38.assembly.LC2200.RegTrans");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            			newLeafNode(this_COMMA_2, grammarAccess.getRInstructionAccess().getCOMMATerminalRuleCall_2());
            		
            // InternalLC2200.g:440:3: ( (lv_reg2_3_0= ruleRegTrans ) )
            // InternalLC2200.g:441:4: (lv_reg2_3_0= ruleRegTrans )
            {
            // InternalLC2200.g:441:4: (lv_reg2_3_0= ruleRegTrans )
            // InternalLC2200.g:442:5: lv_reg2_3_0= ruleRegTrans
            {

            					newCompositeNode(grammarAccess.getRInstructionAccess().getReg2RegTransParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_reg2_3_0=ruleRegTrans();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRInstructionRule());
            					}
            					set(
            						current,
            						"reg2",
            						lv_reg2_3_0,
            						"org.team38.assembly.LC2200.RegTrans");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            			newLeafNode(this_COMMA_4, grammarAccess.getRInstructionAccess().getCOMMATerminalRuleCall_4());
            		
            // InternalLC2200.g:463:3: ( (lv_reg3_5_0= ruleRegTrans ) )
            // InternalLC2200.g:464:4: (lv_reg3_5_0= ruleRegTrans )
            {
            // InternalLC2200.g:464:4: (lv_reg3_5_0= ruleRegTrans )
            // InternalLC2200.g:465:5: lv_reg3_5_0= ruleRegTrans
            {

            					newCompositeNode(grammarAccess.getRInstructionAccess().getReg3RegTransParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_reg3_5_0=ruleRegTrans();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRInstructionRule());
            					}
            					set(
            						current,
            						"reg3",
            						lv_reg3_5_0,
            						"org.team38.assembly.LC2200.RegTrans");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRInstruction"


    // $ANTLR start "entryRuleIInstruction"
    // InternalLC2200.g:486:1: entryRuleIInstruction returns [EObject current=null] : iv_ruleIInstruction= ruleIInstruction EOF ;
    public final EObject entryRuleIInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstruction = null;


        try {
            // InternalLC2200.g:486:53: (iv_ruleIInstruction= ruleIInstruction EOF )
            // InternalLC2200.g:487:2: iv_ruleIInstruction= ruleIInstruction EOF
            {
             newCompositeNode(grammarAccess.getIInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIInstruction=ruleIInstruction();

            state._fsp--;

             current =iv_ruleIInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIInstruction"


    // $ANTLR start "ruleIInstruction"
    // InternalLC2200.g:493:1: ruleIInstruction returns [EObject current=null] : ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) ) ;
    public final EObject ruleIInstruction() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_2=null;
        Token this_COMMA_4=null;
        Token lv_imm_5_0=null;
        Token this_COMMA_8=null;
        Token lv_imm_9_0=null;
        Token this_LPAREN_10=null;
        Token this_RPAREN_12=null;
        Token this_COMMA_15=null;
        Token this_COMMA_17=null;
        EObject lv_i_opcode_0_0 = null;

        EObject lv_reg1_1_0 = null;

        EObject lv_reg2_3_0 = null;

        EObject lv_i_opcode_6_0 = null;

        EObject lv_reg1_7_0 = null;

        EObject lv_reg2_11_0 = null;

        EObject lv_i_opcode_13_0 = null;

        EObject lv_reg1_14_0 = null;

        EObject lv_reg2_16_0 = null;

        EObject lv_label_18_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:499:2: ( ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) ) )
            // InternalLC2200.g:500:2: ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) )
            {
            // InternalLC2200.g:500:2: ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_IOP_IMM:
                {
                alt9=1;
                }
                break;
            case RULE_IOP_OFFSET:
                {
                alt9=2;
                }
                break;
            case RULE_IOP_LABEL:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalLC2200.g:501:3: ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) )
                    {
                    // InternalLC2200.g:501:3: ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) )
                    // InternalLC2200.g:502:4: ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) )
                    {
                    // InternalLC2200.g:502:4: ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) )
                    // InternalLC2200.g:503:5: (lv_i_opcode_0_0= ruleIInstructionImmTrans )
                    {
                    // InternalLC2200.g:503:5: (lv_i_opcode_0_0= ruleIInstructionImmTrans )
                    // InternalLC2200.g:504:6: lv_i_opcode_0_0= ruleIInstructionImmTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getI_opcodeIInstructionImmTransParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_i_opcode_0_0=ruleIInstructionImmTrans();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIInstructionRule());
                    						}
                    						set(
                    							current,
                    							"i_opcode",
                    							lv_i_opcode_0_0,
                    							"org.team38.assembly.LC2200.IInstructionImmTrans");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLC2200.g:521:4: ( (lv_reg1_1_0= ruleRegTrans ) )
                    // InternalLC2200.g:522:5: (lv_reg1_1_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:522:5: (lv_reg1_1_0= ruleRegTrans )
                    // InternalLC2200.g:523:6: lv_reg1_1_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg1RegTransParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_reg1_1_0=ruleRegTrans();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIInstructionRule());
                    						}
                    						set(
                    							current,
                    							"reg1",
                    							lv_reg1_1_0,
                    							"org.team38.assembly.LC2200.RegTrans");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_7); 

                    				newLeafNode(this_COMMA_2, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_0_2());
                    			
                    // InternalLC2200.g:544:4: ( (lv_reg2_3_0= ruleRegTrans ) )
                    // InternalLC2200.g:545:5: (lv_reg2_3_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:545:5: (lv_reg2_3_0= ruleRegTrans )
                    // InternalLC2200.g:546:6: lv_reg2_3_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg2RegTransParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_reg2_3_0=ruleRegTrans();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIInstructionRule());
                    						}
                    						set(
                    							current,
                    							"reg2",
                    							lv_reg2_3_0,
                    							"org.team38.assembly.LC2200.RegTrans");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_9); 

                    				newLeafNode(this_COMMA_4, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_0_4());
                    			
                    // InternalLC2200.g:567:4: ( (lv_imm_5_0= RULE_IMMEDIATE ) )
                    // InternalLC2200.g:568:5: (lv_imm_5_0= RULE_IMMEDIATE )
                    {
                    // InternalLC2200.g:568:5: (lv_imm_5_0= RULE_IMMEDIATE )
                    // InternalLC2200.g:569:6: lv_imm_5_0= RULE_IMMEDIATE
                    {
                    lv_imm_5_0=(Token)match(input,RULE_IMMEDIATE,FOLLOW_2); 

                    						newLeafNode(lv_imm_5_0, grammarAccess.getIInstructionAccess().getImmIMMEDIATETerminalRuleCall_0_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIInstructionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"imm",
                    							lv_imm_5_0,
                    							"org.team38.assembly.LC2200.IMMEDIATE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:587:3: ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN )
                    {
                    // InternalLC2200.g:587:3: ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN )
                    // InternalLC2200.g:588:4: ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN
                    {
                    // InternalLC2200.g:588:4: ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) )
                    // InternalLC2200.g:589:5: (lv_i_opcode_6_0= ruleIInstructionOffsetTrans )
                    {
                    // InternalLC2200.g:589:5: (lv_i_opcode_6_0= ruleIInstructionOffsetTrans )
                    // InternalLC2200.g:590:6: lv_i_opcode_6_0= ruleIInstructionOffsetTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getI_opcodeIInstructionOffsetTransParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_i_opcode_6_0=ruleIInstructionOffsetTrans();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIInstructionRule());
                    						}
                    						set(
                    							current,
                    							"i_opcode",
                    							lv_i_opcode_6_0,
                    							"org.team38.assembly.LC2200.IInstructionOffsetTrans");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLC2200.g:607:4: ( (lv_reg1_7_0= ruleRegTrans ) )
                    // InternalLC2200.g:608:5: (lv_reg1_7_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:608:5: (lv_reg1_7_0= ruleRegTrans )
                    // InternalLC2200.g:609:6: lv_reg1_7_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg1RegTransParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_reg1_7_0=ruleRegTrans();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIInstructionRule());
                    						}
                    						set(
                    							current,
                    							"reg1",
                    							lv_reg1_7_0,
                    							"org.team38.assembly.LC2200.RegTrans");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_9); 

                    				newLeafNode(this_COMMA_8, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_1_2());
                    			
                    // InternalLC2200.g:630:4: ( (lv_imm_9_0= RULE_IMMEDIATE ) )
                    // InternalLC2200.g:631:5: (lv_imm_9_0= RULE_IMMEDIATE )
                    {
                    // InternalLC2200.g:631:5: (lv_imm_9_0= RULE_IMMEDIATE )
                    // InternalLC2200.g:632:6: lv_imm_9_0= RULE_IMMEDIATE
                    {
                    lv_imm_9_0=(Token)match(input,RULE_IMMEDIATE,FOLLOW_10); 

                    						newLeafNode(lv_imm_9_0, grammarAccess.getIInstructionAccess().getImmIMMEDIATETerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIInstructionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"imm",
                    							lv_imm_9_0,
                    							"org.team38.assembly.LC2200.IMMEDIATE");
                    					

                    }


                    }

                    this_LPAREN_10=(Token)match(input,RULE_LPAREN,FOLLOW_7); 

                    				newLeafNode(this_LPAREN_10, grammarAccess.getIInstructionAccess().getLPARENTerminalRuleCall_1_4());
                    			
                    // InternalLC2200.g:652:4: ( (lv_reg2_11_0= ruleRegTrans ) )
                    // InternalLC2200.g:653:5: (lv_reg2_11_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:653:5: (lv_reg2_11_0= ruleRegTrans )
                    // InternalLC2200.g:654:6: lv_reg2_11_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg2RegTransParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_reg2_11_0=ruleRegTrans();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIInstructionRule());
                    						}
                    						set(
                    							current,
                    							"reg2",
                    							lv_reg2_11_0,
                    							"org.team38.assembly.LC2200.RegTrans");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_RPAREN_12=(Token)match(input,RULE_RPAREN,FOLLOW_2); 

                    				newLeafNode(this_RPAREN_12, grammarAccess.getIInstructionAccess().getRPARENTerminalRuleCall_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:677:3: ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) )
                    {
                    // InternalLC2200.g:677:3: ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) )
                    // InternalLC2200.g:678:4: ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) )
                    {
                    // InternalLC2200.g:678:4: ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) )
                    // InternalLC2200.g:679:5: (lv_i_opcode_13_0= ruleIInstructionLabelTrans )
                    {
                    // InternalLC2200.g:679:5: (lv_i_opcode_13_0= ruleIInstructionLabelTrans )
                    // InternalLC2200.g:680:6: lv_i_opcode_13_0= ruleIInstructionLabelTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getI_opcodeIInstructionLabelTransParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_i_opcode_13_0=ruleIInstructionLabelTrans();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIInstructionRule());
                    						}
                    						set(
                    							current,
                    							"i_opcode",
                    							lv_i_opcode_13_0,
                    							"org.team38.assembly.LC2200.IInstructionLabelTrans");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLC2200.g:697:4: ( (lv_reg1_14_0= ruleRegTrans ) )
                    // InternalLC2200.g:698:5: (lv_reg1_14_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:698:5: (lv_reg1_14_0= ruleRegTrans )
                    // InternalLC2200.g:699:6: lv_reg1_14_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg1RegTransParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_reg1_14_0=ruleRegTrans();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIInstructionRule());
                    						}
                    						set(
                    							current,
                    							"reg1",
                    							lv_reg1_14_0,
                    							"org.team38.assembly.LC2200.RegTrans");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_15=(Token)match(input,RULE_COMMA,FOLLOW_7); 

                    				newLeafNode(this_COMMA_15, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_2_2());
                    			
                    // InternalLC2200.g:720:4: ( (lv_reg2_16_0= ruleRegTrans ) )
                    // InternalLC2200.g:721:5: (lv_reg2_16_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:721:5: (lv_reg2_16_0= ruleRegTrans )
                    // InternalLC2200.g:722:6: lv_reg2_16_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg2RegTransParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_reg2_16_0=ruleRegTrans();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIInstructionRule());
                    						}
                    						set(
                    							current,
                    							"reg2",
                    							lv_reg2_16_0,
                    							"org.team38.assembly.LC2200.RegTrans");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_12); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_2_4());
                    			
                    // InternalLC2200.g:743:4: ( (lv_label_18_0= ruleLabelEnd ) )
                    // InternalLC2200.g:744:5: (lv_label_18_0= ruleLabelEnd )
                    {
                    // InternalLC2200.g:744:5: (lv_label_18_0= ruleLabelEnd )
                    // InternalLC2200.g:745:6: lv_label_18_0= ruleLabelEnd
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getLabelLabelEndParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_label_18_0=ruleLabelEnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIInstructionRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_18_0,
                    							"org.team38.assembly.LC2200.LabelEnd");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIInstruction"


    // $ANTLR start "entryRuleJInstruction"
    // InternalLC2200.g:767:1: entryRuleJInstruction returns [EObject current=null] : iv_ruleJInstruction= ruleJInstruction EOF ;
    public final EObject entryRuleJInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJInstruction = null;


        try {
            // InternalLC2200.g:767:53: (iv_ruleJInstruction= ruleJInstruction EOF )
            // InternalLC2200.g:768:2: iv_ruleJInstruction= ruleJInstruction EOF
            {
             newCompositeNode(grammarAccess.getJInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJInstruction=ruleJInstruction();

            state._fsp--;

             current =iv_ruleJInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJInstruction"


    // $ANTLR start "ruleJInstruction"
    // InternalLC2200.g:774:1: ruleJInstruction returns [EObject current=null] : ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) ) ;
    public final EObject ruleJInstruction() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_2=null;
        EObject lv_j_opcode_0_0 = null;

        EObject lv_reg1_1_0 = null;

        EObject lv_reg2_3_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:780:2: ( ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) ) )
            // InternalLC2200.g:781:2: ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) )
            {
            // InternalLC2200.g:781:2: ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) )
            // InternalLC2200.g:782:3: ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) )
            {
            // InternalLC2200.g:782:3: ( (lv_j_opcode_0_0= ruleJInstructionTrans ) )
            // InternalLC2200.g:783:4: (lv_j_opcode_0_0= ruleJInstructionTrans )
            {
            // InternalLC2200.g:783:4: (lv_j_opcode_0_0= ruleJInstructionTrans )
            // InternalLC2200.g:784:5: lv_j_opcode_0_0= ruleJInstructionTrans
            {

            					newCompositeNode(grammarAccess.getJInstructionAccess().getJ_opcodeJInstructionTransParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_j_opcode_0_0=ruleJInstructionTrans();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJInstructionRule());
            					}
            					set(
            						current,
            						"j_opcode",
            						lv_j_opcode_0_0,
            						"org.team38.assembly.LC2200.JInstructionTrans");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLC2200.g:801:3: ( (lv_reg1_1_0= ruleRegTrans ) )
            // InternalLC2200.g:802:4: (lv_reg1_1_0= ruleRegTrans )
            {
            // InternalLC2200.g:802:4: (lv_reg1_1_0= ruleRegTrans )
            // InternalLC2200.g:803:5: lv_reg1_1_0= ruleRegTrans
            {

            					newCompositeNode(grammarAccess.getJInstructionAccess().getReg1RegTransParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_reg1_1_0=ruleRegTrans();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJInstructionRule());
            					}
            					set(
            						current,
            						"reg1",
            						lv_reg1_1_0,
            						"org.team38.assembly.LC2200.RegTrans");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            			newLeafNode(this_COMMA_2, grammarAccess.getJInstructionAccess().getCOMMATerminalRuleCall_2());
            		
            // InternalLC2200.g:824:3: ( (lv_reg2_3_0= ruleRegTrans ) )
            // InternalLC2200.g:825:4: (lv_reg2_3_0= ruleRegTrans )
            {
            // InternalLC2200.g:825:4: (lv_reg2_3_0= ruleRegTrans )
            // InternalLC2200.g:826:5: lv_reg2_3_0= ruleRegTrans
            {

            					newCompositeNode(grammarAccess.getJInstructionAccess().getReg2RegTransParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_reg2_3_0=ruleRegTrans();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJInstructionRule());
            					}
            					set(
            						current,
            						"reg2",
            						lv_reg2_3_0,
            						"org.team38.assembly.LC2200.RegTrans");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJInstruction"


    // $ANTLR start "entryRuleOInstruction"
    // InternalLC2200.g:847:1: entryRuleOInstruction returns [EObject current=null] : iv_ruleOInstruction= ruleOInstruction EOF ;
    public final EObject entryRuleOInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOInstruction = null;


        try {
            // InternalLC2200.g:847:53: (iv_ruleOInstruction= ruleOInstruction EOF )
            // InternalLC2200.g:848:2: iv_ruleOInstruction= ruleOInstruction EOF
            {
             newCompositeNode(grammarAccess.getOInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOInstruction=ruleOInstruction();

            state._fsp--;

             current =iv_ruleOInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOInstruction"


    // $ANTLR start "ruleOInstruction"
    // InternalLC2200.g:854:1: ruleOInstruction returns [EObject current=null] : ( (lv_o_opcode_0_0= RULE_OOP ) ) ;
    public final EObject ruleOInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_o_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:860:2: ( ( (lv_o_opcode_0_0= RULE_OOP ) ) )
            // InternalLC2200.g:861:2: ( (lv_o_opcode_0_0= RULE_OOP ) )
            {
            // InternalLC2200.g:861:2: ( (lv_o_opcode_0_0= RULE_OOP ) )
            // InternalLC2200.g:862:3: (lv_o_opcode_0_0= RULE_OOP )
            {
            // InternalLC2200.g:862:3: (lv_o_opcode_0_0= RULE_OOP )
            // InternalLC2200.g:863:4: lv_o_opcode_0_0= RULE_OOP
            {
            lv_o_opcode_0_0=(Token)match(input,RULE_OOP,FOLLOW_2); 

            				newLeafNode(lv_o_opcode_0_0, grammarAccess.getOInstructionAccess().getO_opcodeOOPTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOInstructionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"o_opcode",
            					lv_o_opcode_0_0,
            					"org.team38.assembly.LC2200.OOP");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOInstruction"


    // $ANTLR start "entryRuleNOOPDirective"
    // InternalLC2200.g:882:1: entryRuleNOOPDirective returns [EObject current=null] : iv_ruleNOOPDirective= ruleNOOPDirective EOF ;
    public final EObject entryRuleNOOPDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOOPDirective = null;


        try {
            // InternalLC2200.g:882:54: (iv_ruleNOOPDirective= ruleNOOPDirective EOF )
            // InternalLC2200.g:883:2: iv_ruleNOOPDirective= ruleNOOPDirective EOF
            {
             newCompositeNode(grammarAccess.getNOOPDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNOOPDirective=ruleNOOPDirective();

            state._fsp--;

             current =iv_ruleNOOPDirective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNOOPDirective"


    // $ANTLR start "ruleNOOPDirective"
    // InternalLC2200.g:889:1: ruleNOOPDirective returns [EObject current=null] : ( (lv_n_dir_0_0= RULE_NOOP ) ) ;
    public final EObject ruleNOOPDirective() throws RecognitionException {
        EObject current = null;

        Token lv_n_dir_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:895:2: ( ( (lv_n_dir_0_0= RULE_NOOP ) ) )
            // InternalLC2200.g:896:2: ( (lv_n_dir_0_0= RULE_NOOP ) )
            {
            // InternalLC2200.g:896:2: ( (lv_n_dir_0_0= RULE_NOOP ) )
            // InternalLC2200.g:897:3: (lv_n_dir_0_0= RULE_NOOP )
            {
            // InternalLC2200.g:897:3: (lv_n_dir_0_0= RULE_NOOP )
            // InternalLC2200.g:898:4: lv_n_dir_0_0= RULE_NOOP
            {
            lv_n_dir_0_0=(Token)match(input,RULE_NOOP,FOLLOW_2); 

            				newLeafNode(lv_n_dir_0_0, grammarAccess.getNOOPDirectiveAccess().getN_dirNOOPTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNOOPDirectiveRule());
            				}
            				setWithLastConsumed(
            					current,
            					"n_dir",
            					lv_n_dir_0_0,
            					"org.team38.assembly.LC2200.NOOP");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNOOPDirective"


    // $ANTLR start "entryRuleWordDirective"
    // InternalLC2200.g:917:1: entryRuleWordDirective returns [EObject current=null] : iv_ruleWordDirective= ruleWordDirective EOF ;
    public final EObject entryRuleWordDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordDirective = null;


        try {
            // InternalLC2200.g:917:54: (iv_ruleWordDirective= ruleWordDirective EOF )
            // InternalLC2200.g:918:2: iv_ruleWordDirective= ruleWordDirective EOF
            {
             newCompositeNode(grammarAccess.getWordDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWordDirective=ruleWordDirective();

            state._fsp--;

             current =iv_ruleWordDirective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWordDirective"


    // $ANTLR start "ruleWordDirective"
    // InternalLC2200.g:924:1: ruleWordDirective returns [EObject current=null] : ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) ) ;
    public final EObject ruleWordDirective() throws RecognitionException {
        EObject current = null;

        Token lv_imm_1_0=null;
        EObject lv_w_dir_0_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:930:2: ( ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) ) )
            // InternalLC2200.g:931:2: ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) )
            {
            // InternalLC2200.g:931:2: ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) )
            // InternalLC2200.g:932:3: ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) )
            {
            // InternalLC2200.g:932:3: ( (lv_w_dir_0_0= ruleWordTrans ) )
            // InternalLC2200.g:933:4: (lv_w_dir_0_0= ruleWordTrans )
            {
            // InternalLC2200.g:933:4: (lv_w_dir_0_0= ruleWordTrans )
            // InternalLC2200.g:934:5: lv_w_dir_0_0= ruleWordTrans
            {

            					newCompositeNode(grammarAccess.getWordDirectiveAccess().getW_dirWordTransParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_w_dir_0_0=ruleWordTrans();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWordDirectiveRule());
            					}
            					set(
            						current,
            						"w_dir",
            						lv_w_dir_0_0,
            						"org.team38.assembly.LC2200.WordTrans");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLC2200.g:951:3: ( (lv_imm_1_0= RULE_IMMEDIATE ) )
            // InternalLC2200.g:952:4: (lv_imm_1_0= RULE_IMMEDIATE )
            {
            // InternalLC2200.g:952:4: (lv_imm_1_0= RULE_IMMEDIATE )
            // InternalLC2200.g:953:5: lv_imm_1_0= RULE_IMMEDIATE
            {
            lv_imm_1_0=(Token)match(input,RULE_IMMEDIATE,FOLLOW_2); 

            					newLeafNode(lv_imm_1_0, grammarAccess.getWordDirectiveAccess().getImmIMMEDIATETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWordDirectiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"imm",
            						lv_imm_1_0,
            						"org.team38.assembly.LC2200.IMMEDIATE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWordDirective"


    // $ANTLR start "entryRuleLADirective"
    // InternalLC2200.g:973:1: entryRuleLADirective returns [EObject current=null] : iv_ruleLADirective= ruleLADirective EOF ;
    public final EObject entryRuleLADirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLADirective = null;


        try {
            // InternalLC2200.g:973:52: (iv_ruleLADirective= ruleLADirective EOF )
            // InternalLC2200.g:974:2: iv_ruleLADirective= ruleLADirective EOF
            {
             newCompositeNode(grammarAccess.getLADirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLADirective=ruleLADirective();

            state._fsp--;

             current =iv_ruleLADirective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLADirective"


    // $ANTLR start "ruleLADirective"
    // InternalLC2200.g:980:1: ruleLADirective returns [EObject current=null] : ( ( (lv_la_dir_0_0= ruleLATrans ) ) ( (lv_reg_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_label_3_0= ruleLabelEnd ) ) ) ;
    public final EObject ruleLADirective() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_2=null;
        EObject lv_la_dir_0_0 = null;

        EObject lv_reg_1_0 = null;

        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:986:2: ( ( ( (lv_la_dir_0_0= ruleLATrans ) ) ( (lv_reg_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_label_3_0= ruleLabelEnd ) ) ) )
            // InternalLC2200.g:987:2: ( ( (lv_la_dir_0_0= ruleLATrans ) ) ( (lv_reg_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_label_3_0= ruleLabelEnd ) ) )
            {
            // InternalLC2200.g:987:2: ( ( (lv_la_dir_0_0= ruleLATrans ) ) ( (lv_reg_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_label_3_0= ruleLabelEnd ) ) )
            // InternalLC2200.g:988:3: ( (lv_la_dir_0_0= ruleLATrans ) ) ( (lv_reg_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_label_3_0= ruleLabelEnd ) )
            {
            // InternalLC2200.g:988:3: ( (lv_la_dir_0_0= ruleLATrans ) )
            // InternalLC2200.g:989:4: (lv_la_dir_0_0= ruleLATrans )
            {
            // InternalLC2200.g:989:4: (lv_la_dir_0_0= ruleLATrans )
            // InternalLC2200.g:990:5: lv_la_dir_0_0= ruleLATrans
            {

            					newCompositeNode(grammarAccess.getLADirectiveAccess().getLa_dirLATransParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_la_dir_0_0=ruleLATrans();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLADirectiveRule());
            					}
            					set(
            						current,
            						"la_dir",
            						lv_la_dir_0_0,
            						"org.team38.assembly.LC2200.LATrans");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLC2200.g:1007:3: ( (lv_reg_1_0= ruleRegTrans ) )
            // InternalLC2200.g:1008:4: (lv_reg_1_0= ruleRegTrans )
            {
            // InternalLC2200.g:1008:4: (lv_reg_1_0= ruleRegTrans )
            // InternalLC2200.g:1009:5: lv_reg_1_0= ruleRegTrans
            {

            					newCompositeNode(grammarAccess.getLADirectiveAccess().getRegRegTransParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_reg_1_0=ruleRegTrans();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLADirectiveRule());
            					}
            					set(
            						current,
            						"reg",
            						lv_reg_1_0,
            						"org.team38.assembly.LC2200.RegTrans");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_12); 

            			newLeafNode(this_COMMA_2, grammarAccess.getLADirectiveAccess().getCOMMATerminalRuleCall_2());
            		
            // InternalLC2200.g:1030:3: ( (lv_label_3_0= ruleLabelEnd ) )
            // InternalLC2200.g:1031:4: (lv_label_3_0= ruleLabelEnd )
            {
            // InternalLC2200.g:1031:4: (lv_label_3_0= ruleLabelEnd )
            // InternalLC2200.g:1032:5: lv_label_3_0= ruleLabelEnd
            {

            					newCompositeNode(grammarAccess.getLADirectiveAccess().getLabelLabelEndParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_3_0=ruleLabelEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLADirectiveRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_3_0,
            						"org.team38.assembly.LC2200.LabelEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLADirective"


    // $ANTLR start "entryRuleRInstructionTrans"
    // InternalLC2200.g:1053:1: entryRuleRInstructionTrans returns [EObject current=null] : iv_ruleRInstructionTrans= ruleRInstructionTrans EOF ;
    public final EObject entryRuleRInstructionTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRInstructionTrans = null;


        try {
            // InternalLC2200.g:1053:58: (iv_ruleRInstructionTrans= ruleRInstructionTrans EOF )
            // InternalLC2200.g:1054:2: iv_ruleRInstructionTrans= ruleRInstructionTrans EOF
            {
             newCompositeNode(grammarAccess.getRInstructionTransRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRInstructionTrans=ruleRInstructionTrans();

            state._fsp--;

             current =iv_ruleRInstructionTrans; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRInstructionTrans"


    // $ANTLR start "ruleRInstructionTrans"
    // InternalLC2200.g:1060:1: ruleRInstructionTrans returns [EObject current=null] : ( (lv_r_opcode_0_0= RULE_ROP ) ) ;
    public final EObject ruleRInstructionTrans() throws RecognitionException {
        EObject current = null;

        Token lv_r_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1066:2: ( ( (lv_r_opcode_0_0= RULE_ROP ) ) )
            // InternalLC2200.g:1067:2: ( (lv_r_opcode_0_0= RULE_ROP ) )
            {
            // InternalLC2200.g:1067:2: ( (lv_r_opcode_0_0= RULE_ROP ) )
            // InternalLC2200.g:1068:3: (lv_r_opcode_0_0= RULE_ROP )
            {
            // InternalLC2200.g:1068:3: (lv_r_opcode_0_0= RULE_ROP )
            // InternalLC2200.g:1069:4: lv_r_opcode_0_0= RULE_ROP
            {
            lv_r_opcode_0_0=(Token)match(input,RULE_ROP,FOLLOW_2); 

            				newLeafNode(lv_r_opcode_0_0, grammarAccess.getRInstructionTransAccess().getR_opcodeROPTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRInstructionTransRule());
            				}
            				setWithLastConsumed(
            					current,
            					"r_opcode",
            					lv_r_opcode_0_0,
            					"org.team38.assembly.LC2200.ROP");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRInstructionTrans"


    // $ANTLR start "entryRuleIInstructionImmTrans"
    // InternalLC2200.g:1088:1: entryRuleIInstructionImmTrans returns [EObject current=null] : iv_ruleIInstructionImmTrans= ruleIInstructionImmTrans EOF ;
    public final EObject entryRuleIInstructionImmTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstructionImmTrans = null;


        try {
            // InternalLC2200.g:1088:61: (iv_ruleIInstructionImmTrans= ruleIInstructionImmTrans EOF )
            // InternalLC2200.g:1089:2: iv_ruleIInstructionImmTrans= ruleIInstructionImmTrans EOF
            {
             newCompositeNode(grammarAccess.getIInstructionImmTransRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIInstructionImmTrans=ruleIInstructionImmTrans();

            state._fsp--;

             current =iv_ruleIInstructionImmTrans; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIInstructionImmTrans"


    // $ANTLR start "ruleIInstructionImmTrans"
    // InternalLC2200.g:1095:1: ruleIInstructionImmTrans returns [EObject current=null] : ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) ;
    public final EObject ruleIInstructionImmTrans() throws RecognitionException {
        EObject current = null;

        Token lv_i_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1101:2: ( ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) )
            // InternalLC2200.g:1102:2: ( (lv_i_opcode_0_0= RULE_IOP_IMM ) )
            {
            // InternalLC2200.g:1102:2: ( (lv_i_opcode_0_0= RULE_IOP_IMM ) )
            // InternalLC2200.g:1103:3: (lv_i_opcode_0_0= RULE_IOP_IMM )
            {
            // InternalLC2200.g:1103:3: (lv_i_opcode_0_0= RULE_IOP_IMM )
            // InternalLC2200.g:1104:4: lv_i_opcode_0_0= RULE_IOP_IMM
            {
            lv_i_opcode_0_0=(Token)match(input,RULE_IOP_IMM,FOLLOW_2); 

            				newLeafNode(lv_i_opcode_0_0, grammarAccess.getIInstructionImmTransAccess().getI_opcodeIOP_IMMTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIInstructionImmTransRule());
            				}
            				setWithLastConsumed(
            					current,
            					"i_opcode",
            					lv_i_opcode_0_0,
            					"org.team38.assembly.LC2200.IOP_IMM");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIInstructionImmTrans"


    // $ANTLR start "entryRuleIInstructionOffsetTrans"
    // InternalLC2200.g:1123:1: entryRuleIInstructionOffsetTrans returns [EObject current=null] : iv_ruleIInstructionOffsetTrans= ruleIInstructionOffsetTrans EOF ;
    public final EObject entryRuleIInstructionOffsetTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstructionOffsetTrans = null;


        try {
            // InternalLC2200.g:1123:64: (iv_ruleIInstructionOffsetTrans= ruleIInstructionOffsetTrans EOF )
            // InternalLC2200.g:1124:2: iv_ruleIInstructionOffsetTrans= ruleIInstructionOffsetTrans EOF
            {
             newCompositeNode(grammarAccess.getIInstructionOffsetTransRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIInstructionOffsetTrans=ruleIInstructionOffsetTrans();

            state._fsp--;

             current =iv_ruleIInstructionOffsetTrans; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIInstructionOffsetTrans"


    // $ANTLR start "ruleIInstructionOffsetTrans"
    // InternalLC2200.g:1130:1: ruleIInstructionOffsetTrans returns [EObject current=null] : ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) ) ;
    public final EObject ruleIInstructionOffsetTrans() throws RecognitionException {
        EObject current = null;

        Token lv_i_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1136:2: ( ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) ) )
            // InternalLC2200.g:1137:2: ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) )
            {
            // InternalLC2200.g:1137:2: ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) )
            // InternalLC2200.g:1138:3: (lv_i_opcode_0_0= RULE_IOP_OFFSET )
            {
            // InternalLC2200.g:1138:3: (lv_i_opcode_0_0= RULE_IOP_OFFSET )
            // InternalLC2200.g:1139:4: lv_i_opcode_0_0= RULE_IOP_OFFSET
            {
            lv_i_opcode_0_0=(Token)match(input,RULE_IOP_OFFSET,FOLLOW_2); 

            				newLeafNode(lv_i_opcode_0_0, grammarAccess.getIInstructionOffsetTransAccess().getI_opcodeIOP_OFFSETTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIInstructionOffsetTransRule());
            				}
            				setWithLastConsumed(
            					current,
            					"i_opcode",
            					lv_i_opcode_0_0,
            					"org.team38.assembly.LC2200.IOP_OFFSET");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIInstructionOffsetTrans"


    // $ANTLR start "entryRuleIInstructionLabelTrans"
    // InternalLC2200.g:1158:1: entryRuleIInstructionLabelTrans returns [EObject current=null] : iv_ruleIInstructionLabelTrans= ruleIInstructionLabelTrans EOF ;
    public final EObject entryRuleIInstructionLabelTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstructionLabelTrans = null;


        try {
            // InternalLC2200.g:1158:63: (iv_ruleIInstructionLabelTrans= ruleIInstructionLabelTrans EOF )
            // InternalLC2200.g:1159:2: iv_ruleIInstructionLabelTrans= ruleIInstructionLabelTrans EOF
            {
             newCompositeNode(grammarAccess.getIInstructionLabelTransRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIInstructionLabelTrans=ruleIInstructionLabelTrans();

            state._fsp--;

             current =iv_ruleIInstructionLabelTrans; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIInstructionLabelTrans"


    // $ANTLR start "ruleIInstructionLabelTrans"
    // InternalLC2200.g:1165:1: ruleIInstructionLabelTrans returns [EObject current=null] : ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) ) ;
    public final EObject ruleIInstructionLabelTrans() throws RecognitionException {
        EObject current = null;

        Token lv_i_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1171:2: ( ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) ) )
            // InternalLC2200.g:1172:2: ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) )
            {
            // InternalLC2200.g:1172:2: ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) )
            // InternalLC2200.g:1173:3: (lv_i_opcode_0_0= RULE_IOP_LABEL )
            {
            // InternalLC2200.g:1173:3: (lv_i_opcode_0_0= RULE_IOP_LABEL )
            // InternalLC2200.g:1174:4: lv_i_opcode_0_0= RULE_IOP_LABEL
            {
            lv_i_opcode_0_0=(Token)match(input,RULE_IOP_LABEL,FOLLOW_2); 

            				newLeafNode(lv_i_opcode_0_0, grammarAccess.getIInstructionLabelTransAccess().getI_opcodeIOP_LABELTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIInstructionLabelTransRule());
            				}
            				setWithLastConsumed(
            					current,
            					"i_opcode",
            					lv_i_opcode_0_0,
            					"org.team38.assembly.LC2200.IOP_LABEL");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIInstructionLabelTrans"


    // $ANTLR start "entryRuleJInstructionTrans"
    // InternalLC2200.g:1193:1: entryRuleJInstructionTrans returns [EObject current=null] : iv_ruleJInstructionTrans= ruleJInstructionTrans EOF ;
    public final EObject entryRuleJInstructionTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJInstructionTrans = null;


        try {
            // InternalLC2200.g:1193:58: (iv_ruleJInstructionTrans= ruleJInstructionTrans EOF )
            // InternalLC2200.g:1194:2: iv_ruleJInstructionTrans= ruleJInstructionTrans EOF
            {
             newCompositeNode(grammarAccess.getJInstructionTransRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJInstructionTrans=ruleJInstructionTrans();

            state._fsp--;

             current =iv_ruleJInstructionTrans; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJInstructionTrans"


    // $ANTLR start "ruleJInstructionTrans"
    // InternalLC2200.g:1200:1: ruleJInstructionTrans returns [EObject current=null] : ( (lv_j_opcode_0_0= RULE_JOP ) ) ;
    public final EObject ruleJInstructionTrans() throws RecognitionException {
        EObject current = null;

        Token lv_j_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1206:2: ( ( (lv_j_opcode_0_0= RULE_JOP ) ) )
            // InternalLC2200.g:1207:2: ( (lv_j_opcode_0_0= RULE_JOP ) )
            {
            // InternalLC2200.g:1207:2: ( (lv_j_opcode_0_0= RULE_JOP ) )
            // InternalLC2200.g:1208:3: (lv_j_opcode_0_0= RULE_JOP )
            {
            // InternalLC2200.g:1208:3: (lv_j_opcode_0_0= RULE_JOP )
            // InternalLC2200.g:1209:4: lv_j_opcode_0_0= RULE_JOP
            {
            lv_j_opcode_0_0=(Token)match(input,RULE_JOP,FOLLOW_2); 

            				newLeafNode(lv_j_opcode_0_0, grammarAccess.getJInstructionTransAccess().getJ_opcodeJOPTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJInstructionTransRule());
            				}
            				setWithLastConsumed(
            					current,
            					"j_opcode",
            					lv_j_opcode_0_0,
            					"org.team38.assembly.LC2200.JOP");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJInstructionTrans"


    // $ANTLR start "entryRuleWordTrans"
    // InternalLC2200.g:1228:1: entryRuleWordTrans returns [EObject current=null] : iv_ruleWordTrans= ruleWordTrans EOF ;
    public final EObject entryRuleWordTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordTrans = null;


        try {
            // InternalLC2200.g:1228:50: (iv_ruleWordTrans= ruleWordTrans EOF )
            // InternalLC2200.g:1229:2: iv_ruleWordTrans= ruleWordTrans EOF
            {
             newCompositeNode(grammarAccess.getWordTransRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWordTrans=ruleWordTrans();

            state._fsp--;

             current =iv_ruleWordTrans; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWordTrans"


    // $ANTLR start "ruleWordTrans"
    // InternalLC2200.g:1235:1: ruleWordTrans returns [EObject current=null] : ( (lv_word_0_0= RULE_WORD ) ) ;
    public final EObject ruleWordTrans() throws RecognitionException {
        EObject current = null;

        Token lv_word_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1241:2: ( ( (lv_word_0_0= RULE_WORD ) ) )
            // InternalLC2200.g:1242:2: ( (lv_word_0_0= RULE_WORD ) )
            {
            // InternalLC2200.g:1242:2: ( (lv_word_0_0= RULE_WORD ) )
            // InternalLC2200.g:1243:3: (lv_word_0_0= RULE_WORD )
            {
            // InternalLC2200.g:1243:3: (lv_word_0_0= RULE_WORD )
            // InternalLC2200.g:1244:4: lv_word_0_0= RULE_WORD
            {
            lv_word_0_0=(Token)match(input,RULE_WORD,FOLLOW_2); 

            				newLeafNode(lv_word_0_0, grammarAccess.getWordTransAccess().getWordWORDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWordTransRule());
            				}
            				setWithLastConsumed(
            					current,
            					"word",
            					lv_word_0_0,
            					"org.team38.assembly.LC2200.WORD");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWordTrans"


    // $ANTLR start "entryRuleLATrans"
    // InternalLC2200.g:1263:1: entryRuleLATrans returns [EObject current=null] : iv_ruleLATrans= ruleLATrans EOF ;
    public final EObject entryRuleLATrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLATrans = null;


        try {
            // InternalLC2200.g:1263:48: (iv_ruleLATrans= ruleLATrans EOF )
            // InternalLC2200.g:1264:2: iv_ruleLATrans= ruleLATrans EOF
            {
             newCompositeNode(grammarAccess.getLATransRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLATrans=ruleLATrans();

            state._fsp--;

             current =iv_ruleLATrans; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLATrans"


    // $ANTLR start "ruleLATrans"
    // InternalLC2200.g:1270:1: ruleLATrans returns [EObject current=null] : ( (lv_la_0_0= RULE_LA ) ) ;
    public final EObject ruleLATrans() throws RecognitionException {
        EObject current = null;

        Token lv_la_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1276:2: ( ( (lv_la_0_0= RULE_LA ) ) )
            // InternalLC2200.g:1277:2: ( (lv_la_0_0= RULE_LA ) )
            {
            // InternalLC2200.g:1277:2: ( (lv_la_0_0= RULE_LA ) )
            // InternalLC2200.g:1278:3: (lv_la_0_0= RULE_LA )
            {
            // InternalLC2200.g:1278:3: (lv_la_0_0= RULE_LA )
            // InternalLC2200.g:1279:4: lv_la_0_0= RULE_LA
            {
            lv_la_0_0=(Token)match(input,RULE_LA,FOLLOW_2); 

            				newLeafNode(lv_la_0_0, grammarAccess.getLATransAccess().getLaLATerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLATransRule());
            				}
            				setWithLastConsumed(
            					current,
            					"la",
            					lv_la_0_0,
            					"org.team38.assembly.LC2200.LA");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLATrans"


    // $ANTLR start "entryRuleCommentTrans"
    // InternalLC2200.g:1298:1: entryRuleCommentTrans returns [EObject current=null] : iv_ruleCommentTrans= ruleCommentTrans EOF ;
    public final EObject entryRuleCommentTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentTrans = null;


        try {
            // InternalLC2200.g:1298:53: (iv_ruleCommentTrans= ruleCommentTrans EOF )
            // InternalLC2200.g:1299:2: iv_ruleCommentTrans= ruleCommentTrans EOF
            {
             newCompositeNode(grammarAccess.getCommentTransRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommentTrans=ruleCommentTrans();

            state._fsp--;

             current =iv_ruleCommentTrans; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentTrans"


    // $ANTLR start "ruleCommentTrans"
    // InternalLC2200.g:1305:1: ruleCommentTrans returns [EObject current=null] : ( () this_COMMENT_1= RULE_COMMENT ) ;
    public final EObject ruleCommentTrans() throws RecognitionException {
        EObject current = null;

        Token this_COMMENT_1=null;


        	enterRule();

        try {
            // InternalLC2200.g:1311:2: ( ( () this_COMMENT_1= RULE_COMMENT ) )
            // InternalLC2200.g:1312:2: ( () this_COMMENT_1= RULE_COMMENT )
            {
            // InternalLC2200.g:1312:2: ( () this_COMMENT_1= RULE_COMMENT )
            // InternalLC2200.g:1313:3: () this_COMMENT_1= RULE_COMMENT
            {
            // InternalLC2200.g:1313:3: ()
            // InternalLC2200.g:1314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommentTransAccess().getCommentTransAction_0(),
            					current);
            			

            }

            this_COMMENT_1=(Token)match(input,RULE_COMMENT,FOLLOW_2); 

            			newLeafNode(this_COMMENT_1, grammarAccess.getCommentTransAccess().getCOMMENTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentTrans"


    // $ANTLR start "entryRuleLineEnd"
    // InternalLC2200.g:1328:1: entryRuleLineEnd returns [EObject current=null] : iv_ruleLineEnd= ruleLineEnd EOF ;
    public final EObject entryRuleLineEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineEnd = null;


        try {
            // InternalLC2200.g:1328:48: (iv_ruleLineEnd= ruleLineEnd EOF )
            // InternalLC2200.g:1329:2: iv_ruleLineEnd= ruleLineEnd EOF
            {
             newCompositeNode(grammarAccess.getLineEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineEnd=ruleLineEnd();

            state._fsp--;

             current =iv_ruleLineEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineEnd"


    // $ANTLR start "ruleLineEnd"
    // InternalLC2200.g:1335:1: ruleLineEnd returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleCommentTrans ) )? this_NEWLINE_2= RULE_NEWLINE ) ;
    public final EObject ruleLineEnd() throws RecognitionException {
        EObject current = null;

        Token this_NEWLINE_2=null;
        EObject lv_comment_1_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:1341:2: ( ( () ( (lv_comment_1_0= ruleCommentTrans ) )? this_NEWLINE_2= RULE_NEWLINE ) )
            // InternalLC2200.g:1342:2: ( () ( (lv_comment_1_0= ruleCommentTrans ) )? this_NEWLINE_2= RULE_NEWLINE )
            {
            // InternalLC2200.g:1342:2: ( () ( (lv_comment_1_0= ruleCommentTrans ) )? this_NEWLINE_2= RULE_NEWLINE )
            // InternalLC2200.g:1343:3: () ( (lv_comment_1_0= ruleCommentTrans ) )? this_NEWLINE_2= RULE_NEWLINE
            {
            // InternalLC2200.g:1343:3: ()
            // InternalLC2200.g:1344:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineEndAccess().getLineEndAction_0(),
            					current);
            			

            }

            // InternalLC2200.g:1350:3: ( (lv_comment_1_0= ruleCommentTrans ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_COMMENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLC2200.g:1351:4: (lv_comment_1_0= ruleCommentTrans )
                    {
                    // InternalLC2200.g:1351:4: (lv_comment_1_0= ruleCommentTrans )
                    // InternalLC2200.g:1352:5: lv_comment_1_0= ruleCommentTrans
                    {

                    					newCompositeNode(grammarAccess.getLineEndAccess().getCommentCommentTransParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_comment_1_0=ruleCommentTrans();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLineEndRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"org.team38.assembly.LC2200.CommentTrans");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

            			newLeafNode(this_NEWLINE_2, grammarAccess.getLineEndAccess().getNEWLINETerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineEnd"


    // $ANTLR start "entryRuleRegTrans"
    // InternalLC2200.g:1377:1: entryRuleRegTrans returns [EObject current=null] : iv_ruleRegTrans= ruleRegTrans EOF ;
    public final EObject entryRuleRegTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegTrans = null;


        try {
            // InternalLC2200.g:1377:49: (iv_ruleRegTrans= ruleRegTrans EOF )
            // InternalLC2200.g:1378:2: iv_ruleRegTrans= ruleRegTrans EOF
            {
             newCompositeNode(grammarAccess.getRegTransRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegTrans=ruleRegTrans();

            state._fsp--;

             current =iv_ruleRegTrans; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegTrans"


    // $ANTLR start "ruleRegTrans"
    // InternalLC2200.g:1384:1: ruleRegTrans returns [EObject current=null] : ( (lv_reg_0_0= RULE_REG ) ) ;
    public final EObject ruleRegTrans() throws RecognitionException {
        EObject current = null;

        Token lv_reg_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1390:2: ( ( (lv_reg_0_0= RULE_REG ) ) )
            // InternalLC2200.g:1391:2: ( (lv_reg_0_0= RULE_REG ) )
            {
            // InternalLC2200.g:1391:2: ( (lv_reg_0_0= RULE_REG ) )
            // InternalLC2200.g:1392:3: (lv_reg_0_0= RULE_REG )
            {
            // InternalLC2200.g:1392:3: (lv_reg_0_0= RULE_REG )
            // InternalLC2200.g:1393:4: lv_reg_0_0= RULE_REG
            {
            lv_reg_0_0=(Token)match(input,RULE_REG,FOLLOW_2); 

            				newLeafNode(lv_reg_0_0, grammarAccess.getRegTransAccess().getRegREGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRegTransRule());
            				}
            				setWithLastConsumed(
            					current,
            					"reg",
            					lv_reg_0_0,
            					"org.team38.assembly.LC2200.REG");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegTrans"


    // $ANTLR start "entryRuleLabelBeg"
    // InternalLC2200.g:1412:1: entryRuleLabelBeg returns [EObject current=null] : iv_ruleLabelBeg= ruleLabelBeg EOF ;
    public final EObject entryRuleLabelBeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelBeg = null;


        try {
            // InternalLC2200.g:1412:49: (iv_ruleLabelBeg= ruleLabelBeg EOF )
            // InternalLC2200.g:1413:2: iv_ruleLabelBeg= ruleLabelBeg EOF
            {
             newCompositeNode(grammarAccess.getLabelBegRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelBeg=ruleLabelBeg();

            state._fsp--;

             current =iv_ruleLabelBeg; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelBeg"


    // $ANTLR start "ruleLabelBeg"
    // InternalLC2200.g:1419:1: ruleLabelBeg returns [EObject current=null] : ( (lv_label_0_0= RULE_LABEL ) ) ;
    public final EObject ruleLabelBeg() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1425:2: ( ( (lv_label_0_0= RULE_LABEL ) ) )
            // InternalLC2200.g:1426:2: ( (lv_label_0_0= RULE_LABEL ) )
            {
            // InternalLC2200.g:1426:2: ( (lv_label_0_0= RULE_LABEL ) )
            // InternalLC2200.g:1427:3: (lv_label_0_0= RULE_LABEL )
            {
            // InternalLC2200.g:1427:3: (lv_label_0_0= RULE_LABEL )
            // InternalLC2200.g:1428:4: lv_label_0_0= RULE_LABEL
            {
            lv_label_0_0=(Token)match(input,RULE_LABEL,FOLLOW_2); 

            				newLeafNode(lv_label_0_0, grammarAccess.getLabelBegAccess().getLabelLABELTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLabelBegRule());
            				}
            				setWithLastConsumed(
            					current,
            					"label",
            					lv_label_0_0,
            					"org.team38.assembly.LC2200.LABEL");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelBeg"


    // $ANTLR start "entryRuleLabelEnd"
    // InternalLC2200.g:1447:1: entryRuleLabelEnd returns [EObject current=null] : iv_ruleLabelEnd= ruleLabelEnd EOF ;
    public final EObject entryRuleLabelEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelEnd = null;


        try {
            // InternalLC2200.g:1447:49: (iv_ruleLabelEnd= ruleLabelEnd EOF )
            // InternalLC2200.g:1448:2: iv_ruleLabelEnd= ruleLabelEnd EOF
            {
             newCompositeNode(grammarAccess.getLabelEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelEnd=ruleLabelEnd();

            state._fsp--;

             current =iv_ruleLabelEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelEnd"


    // $ANTLR start "ruleLabelEnd"
    // InternalLC2200.g:1454:1: ruleLabelEnd returns [EObject current=null] : ( (lv_label_0_0= RULE_LABEL_IMM ) ) ;
    public final EObject ruleLabelEnd() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1460:2: ( ( (lv_label_0_0= RULE_LABEL_IMM ) ) )
            // InternalLC2200.g:1461:2: ( (lv_label_0_0= RULE_LABEL_IMM ) )
            {
            // InternalLC2200.g:1461:2: ( (lv_label_0_0= RULE_LABEL_IMM ) )
            // InternalLC2200.g:1462:3: (lv_label_0_0= RULE_LABEL_IMM )
            {
            // InternalLC2200.g:1462:3: (lv_label_0_0= RULE_LABEL_IMM )
            // InternalLC2200.g:1463:4: lv_label_0_0= RULE_LABEL_IMM
            {
            lv_label_0_0=(Token)match(input,RULE_LABEL_IMM,FOLLOW_2); 

            				newLeafNode(lv_label_0_0, grammarAccess.getLabelEndAccess().getLabelLABEL_IMMTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLabelEndRule());
            				}
            				setWithLastConsumed(
            					current,
            					"label",
            					lv_label_0_0,
            					"org.team38.assembly.LC2200.LABEL_IMM");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelEnd"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000017FF02L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000017FF00L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000107D00L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000011FF00L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});

}