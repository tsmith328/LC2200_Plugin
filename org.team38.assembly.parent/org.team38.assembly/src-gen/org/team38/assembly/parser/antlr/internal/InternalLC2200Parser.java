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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LABEL", "RULE_COMMENT", "RULE_NEWLINE", "RULE_ROP", "RULE_REG", "RULE_COMMA", "RULE_IOP_IMM", "RULE_IMMEDIATE", "RULE_IOP_OFFSET", "RULE_LPAREN", "RULE_RPAREN", "RULE_IOP_LABEL", "RULE_LABEL_IMM", "RULE_JOP", "RULE_OOP", "RULE_NOOP", "RULE_WORD", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_LABEL=4;
    public static final int RULE_IMMEDIATE=11;
    public static final int RULE_NEWLINE=6;
    public static final int RULE_WORD=20;
    public static final int RULE_REG=8;
    public static final int RULE_STRING=23;
    public static final int RULE_ROP=7;
    public static final int RULE_LPAREN=13;
    public static final int RULE_SL_COMMENT=25;
    public static final int RULE_IOP_OFFSET=12;
    public static final int RULE_JOP=17;
    public static final int RULE_OOP=18;
    public static final int RULE_LABEL_IMM=16;
    public static final int EOF=-1;
    public static final int RULE_NOOP=19;
    public static final int RULE_ID=22;
    public static final int RULE_COMMA=9;
    public static final int RULE_WS=26;
    public static final int RULE_COMMENT=5;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_RPAREN=14;
    public static final int RULE_IOP_LABEL=15;
    public static final int RULE_INT=21;
    public static final int RULE_ML_COMMENT=24;
    public static final int RULE_IOP_IMM=10;

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
    // InternalLC2200.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_program_0_1= ruleInstruction | lv_program_0_2= ruleDirective ) ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_1 = null;

        EObject lv_program_0_2 = null;



        	enterRule();

        try {
            // InternalLC2200.g:77:2: ( ( ( (lv_program_0_1= ruleInstruction | lv_program_0_2= ruleDirective ) ) )* )
            // InternalLC2200.g:78:2: ( ( (lv_program_0_1= ruleInstruction | lv_program_0_2= ruleDirective ) ) )*
            {
            // InternalLC2200.g:78:2: ( ( (lv_program_0_1= ruleInstruction | lv_program_0_2= ruleDirective ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_LABEL||LA2_0==RULE_ROP||LA2_0==RULE_IOP_IMM||LA2_0==RULE_IOP_OFFSET||LA2_0==RULE_IOP_LABEL||(LA2_0>=RULE_JOP && LA2_0<=RULE_WORD)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLC2200.g:79:3: ( (lv_program_0_1= ruleInstruction | lv_program_0_2= ruleDirective ) )
            	    {
            	    // InternalLC2200.g:79:3: ( (lv_program_0_1= ruleInstruction | lv_program_0_2= ruleDirective ) )
            	    // InternalLC2200.g:80:4: (lv_program_0_1= ruleInstruction | lv_program_0_2= ruleDirective )
            	    {
            	    // InternalLC2200.g:80:4: (lv_program_0_1= ruleInstruction | lv_program_0_2= ruleDirective )
            	    int alt1=2;
            	    switch ( input.LA(1) ) {
            	    case RULE_LABEL:
            	        {
            	        int LA1_1 = input.LA(2);

            	        if ( ((LA1_1>=RULE_NOOP && LA1_1<=RULE_WORD)) ) {
            	            alt1=2;
            	        }
            	        else if ( (LA1_1==RULE_ROP||LA1_1==RULE_IOP_IMM||LA1_1==RULE_IOP_OFFSET||LA1_1==RULE_IOP_LABEL||(LA1_1>=RULE_JOP && LA1_1<=RULE_OOP)) ) {
            	            alt1=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 1, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_ROP:
            	    case RULE_IOP_IMM:
            	    case RULE_IOP_OFFSET:
            	    case RULE_IOP_LABEL:
            	    case RULE_JOP:
            	    case RULE_OOP:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case RULE_NOOP:
            	    case RULE_WORD:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalLC2200.g:81:5: lv_program_0_1= ruleInstruction
            	            {

            	            					newCompositeNode(grammarAccess.getProgramAccess().getProgramInstructionParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_program_0_1=ruleInstruction();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getProgramRule());
            	            					}
            	            					add(
            	            						current,
            	            						"program",
            	            						lv_program_0_1,
            	            						"org.team38.assembly.LC2200.Instruction");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalLC2200.g:97:5: lv_program_0_2= ruleDirective
            	            {

            	            					newCompositeNode(grammarAccess.getProgramAccess().getProgramDirectiveParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_program_0_2=ruleDirective();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getProgramRule());
            	            					}
            	            					add(
            	            						current,
            	            						"program",
            	            						lv_program_0_2,
            	            						"org.team38.assembly.LC2200.Directive");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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


    // $ANTLR start "entryRuleInstruction"
    // InternalLC2200.g:118:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalLC2200.g:118:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalLC2200.g:119:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalLC2200.g:125:1: ruleInstruction returns [EObject current=null] : ( ( (lv_label_0_0= RULE_LABEL ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )? ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token this_COMMENT_2=null;
        Token this_NEWLINE_3=null;
        EObject lv_instruction_1_1 = null;

        EObject lv_instruction_1_2 = null;

        EObject lv_instruction_1_3 = null;

        EObject lv_instruction_1_4 = null;



        	enterRule();

        try {
            // InternalLC2200.g:131:2: ( ( ( (lv_label_0_0= RULE_LABEL ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )? ) )
            // InternalLC2200.g:132:2: ( ( (lv_label_0_0= RULE_LABEL ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )? )
            {
            // InternalLC2200.g:132:2: ( ( (lv_label_0_0= RULE_LABEL ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )? )
            // InternalLC2200.g:133:3: ( (lv_label_0_0= RULE_LABEL ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )?
            {
            // InternalLC2200.g:133:3: ( (lv_label_0_0= RULE_LABEL ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LABEL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLC2200.g:134:4: (lv_label_0_0= RULE_LABEL )
                    {
                    // InternalLC2200.g:134:4: (lv_label_0_0= RULE_LABEL )
                    // InternalLC2200.g:135:5: lv_label_0_0= RULE_LABEL
                    {
                    lv_label_0_0=(Token)match(input,RULE_LABEL,FOLLOW_4); 

                    					newLeafNode(lv_label_0_0, grammarAccess.getInstructionAccess().getLabelLABELTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInstructionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"label",
                    						lv_label_0_0,
                    						"org.team38.assembly.LC2200.LABEL");
                    				

                    }


                    }
                    break;

            }

            // InternalLC2200.g:151:3: ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) )
            // InternalLC2200.g:152:4: ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) )
            {
            // InternalLC2200.g:152:4: ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) )
            // InternalLC2200.g:153:5: (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction )
            {
            // InternalLC2200.g:153:5: (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ROP:
                {
                alt4=1;
                }
                break;
            case RULE_IOP_IMM:
            case RULE_IOP_OFFSET:
            case RULE_IOP_LABEL:
                {
                alt4=2;
                }
                break;
            case RULE_JOP:
                {
                alt4=3;
                }
                break;
            case RULE_OOP:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLC2200.g:154:6: lv_instruction_1_1= ruleRInstruction
                    {

                    						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionRInstructionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
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
                    // InternalLC2200.g:170:6: lv_instruction_1_2= ruleIInstruction
                    {

                    						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionIInstructionParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_5);
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
                    // InternalLC2200.g:186:6: lv_instruction_1_3= ruleJInstruction
                    {

                    						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionJInstructionParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_5);
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
                    // InternalLC2200.g:202:6: lv_instruction_1_4= ruleOInstruction
                    {

                    						newCompositeNode(grammarAccess.getInstructionAccess().getInstructionOInstructionParserRuleCall_1_0_3());
                    					
                    pushFollow(FOLLOW_5);
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

            // InternalLC2200.g:220:3: (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMMENT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_NEWLINE) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // InternalLC2200.g:221:4: this_COMMENT_2= RULE_COMMENT
                    {
                    this_COMMENT_2=(Token)match(input,RULE_COMMENT,FOLLOW_2); 

                    				newLeafNode(this_COMMENT_2, grammarAccess.getInstructionAccess().getCOMMENTTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLC2200.g:226:4: this_NEWLINE_3= RULE_NEWLINE
                    {
                    this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    				newLeafNode(this_NEWLINE_3, grammarAccess.getInstructionAccess().getNEWLINETerminalRuleCall_2_1());
                    			

                    }
                    break;

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
    // InternalLC2200.g:235:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // InternalLC2200.g:235:50: (iv_ruleDirective= ruleDirective EOF )
            // InternalLC2200.g:236:2: iv_ruleDirective= ruleDirective EOF
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
    // InternalLC2200.g:242:1: ruleDirective returns [EObject current=null] : ( ( (lv_label_0_0= RULE_LABEL ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) ) (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )? ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token this_COMMENT_2=null;
        Token this_NEWLINE_3=null;
        EObject lv_directive_1_1 = null;

        EObject lv_directive_1_2 = null;



        	enterRule();

        try {
            // InternalLC2200.g:248:2: ( ( ( (lv_label_0_0= RULE_LABEL ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) ) (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )? ) )
            // InternalLC2200.g:249:2: ( ( (lv_label_0_0= RULE_LABEL ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) ) (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )? )
            {
            // InternalLC2200.g:249:2: ( ( (lv_label_0_0= RULE_LABEL ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) ) (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )? )
            // InternalLC2200.g:250:3: ( (lv_label_0_0= RULE_LABEL ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) ) (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )?
            {
            // InternalLC2200.g:250:3: ( (lv_label_0_0= RULE_LABEL ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LABEL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLC2200.g:251:4: (lv_label_0_0= RULE_LABEL )
                    {
                    // InternalLC2200.g:251:4: (lv_label_0_0= RULE_LABEL )
                    // InternalLC2200.g:252:5: lv_label_0_0= RULE_LABEL
                    {
                    lv_label_0_0=(Token)match(input,RULE_LABEL,FOLLOW_6); 

                    					newLeafNode(lv_label_0_0, grammarAccess.getDirectiveAccess().getLabelLABELTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDirectiveRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"label",
                    						lv_label_0_0,
                    						"org.team38.assembly.LC2200.LABEL");
                    				

                    }


                    }
                    break;

            }

            // InternalLC2200.g:268:3: ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) )
            // InternalLC2200.g:269:4: ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) )
            {
            // InternalLC2200.g:269:4: ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) )
            // InternalLC2200.g:270:5: (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective )
            {
            // InternalLC2200.g:270:5: (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NOOP) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_WORD) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLC2200.g:271:6: lv_directive_1_1= ruleNOOPDirective
                    {

                    						newCompositeNode(grammarAccess.getDirectiveAccess().getDirectiveNOOPDirectiveParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
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
                    // InternalLC2200.g:287:6: lv_directive_1_2= ruleWordDirective
                    {

                    						newCompositeNode(grammarAccess.getDirectiveAccess().getDirectiveWordDirectiveParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_5);
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

            }


            }


            }

            // InternalLC2200.g:305:3: (this_COMMENT_2= RULE_COMMENT | this_NEWLINE_3= RULE_NEWLINE )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_COMMENT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_NEWLINE) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // InternalLC2200.g:306:4: this_COMMENT_2= RULE_COMMENT
                    {
                    this_COMMENT_2=(Token)match(input,RULE_COMMENT,FOLLOW_2); 

                    				newLeafNode(this_COMMENT_2, grammarAccess.getDirectiveAccess().getCOMMENTTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLC2200.g:311:4: this_NEWLINE_3= RULE_NEWLINE
                    {
                    this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    				newLeafNode(this_NEWLINE_3, grammarAccess.getDirectiveAccess().getNEWLINETerminalRuleCall_2_1());
                    			

                    }
                    break;

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
    // InternalLC2200.g:320:1: entryRuleRInstruction returns [EObject current=null] : iv_ruleRInstruction= ruleRInstruction EOF ;
    public final EObject entryRuleRInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRInstruction = null;


        try {
            // InternalLC2200.g:320:53: (iv_ruleRInstruction= ruleRInstruction EOF )
            // InternalLC2200.g:321:2: iv_ruleRInstruction= ruleRInstruction EOF
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
    // InternalLC2200.g:327:1: ruleRInstruction returns [EObject current=null] : ( ( (lv_r_opcode_0_0= RULE_ROP ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_REG_5= RULE_REG ) ;
    public final EObject ruleRInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_r_opcode_0_0=null;
        Token this_REG_1=null;
        Token this_COMMA_2=null;
        Token this_REG_3=null;
        Token this_COMMA_4=null;
        Token this_REG_5=null;


        	enterRule();

        try {
            // InternalLC2200.g:333:2: ( ( ( (lv_r_opcode_0_0= RULE_ROP ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_REG_5= RULE_REG ) )
            // InternalLC2200.g:334:2: ( ( (lv_r_opcode_0_0= RULE_ROP ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_REG_5= RULE_REG )
            {
            // InternalLC2200.g:334:2: ( ( (lv_r_opcode_0_0= RULE_ROP ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_REG_5= RULE_REG )
            // InternalLC2200.g:335:3: ( (lv_r_opcode_0_0= RULE_ROP ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_REG_5= RULE_REG
            {
            // InternalLC2200.g:335:3: ( (lv_r_opcode_0_0= RULE_ROP ) )
            // InternalLC2200.g:336:4: (lv_r_opcode_0_0= RULE_ROP )
            {
            // InternalLC2200.g:336:4: (lv_r_opcode_0_0= RULE_ROP )
            // InternalLC2200.g:337:5: lv_r_opcode_0_0= RULE_ROP
            {
            lv_r_opcode_0_0=(Token)match(input,RULE_ROP,FOLLOW_7); 

            					newLeafNode(lv_r_opcode_0_0, grammarAccess.getRInstructionAccess().getR_opcodeROPTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"r_opcode",
            						lv_r_opcode_0_0,
            						"org.team38.assembly.LC2200.ROP");
            				

            }


            }

            this_REG_1=(Token)match(input,RULE_REG,FOLLOW_8); 

            			newLeafNode(this_REG_1, grammarAccess.getRInstructionAccess().getREGTerminalRuleCall_1());
            		
            this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            			newLeafNode(this_COMMA_2, grammarAccess.getRInstructionAccess().getCOMMATerminalRuleCall_2());
            		
            this_REG_3=(Token)match(input,RULE_REG,FOLLOW_8); 

            			newLeafNode(this_REG_3, grammarAccess.getRInstructionAccess().getREGTerminalRuleCall_3());
            		
            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            			newLeafNode(this_COMMA_4, grammarAccess.getRInstructionAccess().getCOMMATerminalRuleCall_4());
            		
            this_REG_5=(Token)match(input,RULE_REG,FOLLOW_2); 

            			newLeafNode(this_REG_5, grammarAccess.getRInstructionAccess().getREGTerminalRuleCall_5());
            		

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
    // InternalLC2200.g:377:1: entryRuleIInstruction returns [EObject current=null] : iv_ruleIInstruction= ruleIInstruction EOF ;
    public final EObject entryRuleIInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstruction = null;


        try {
            // InternalLC2200.g:377:53: (iv_ruleIInstruction= ruleIInstruction EOF )
            // InternalLC2200.g:378:2: iv_ruleIInstruction= ruleIInstruction EOF
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
    // InternalLC2200.g:384:1: ruleIInstruction returns [EObject current=null] : ( ( ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_IMMEDIATE_5= RULE_IMMEDIATE ) | ( ( (lv_i_opcode_6_0= RULE_IOP_OFFSET ) ) this_REG_7= RULE_REG this_COMMA_8= RULE_COMMA this_IMMEDIATE_9= RULE_IMMEDIATE this_LPAREN_10= RULE_LPAREN this_REG_11= RULE_REG this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= RULE_IOP_LABEL ) ) this_REG_14= RULE_REG this_COMMA_15= RULE_COMMA this_REG_16= RULE_REG this_COMMA_17= RULE_COMMA this_LABEL_IMM_18= RULE_LABEL_IMM ) ) ;
    public final EObject ruleIInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_i_opcode_0_0=null;
        Token this_REG_1=null;
        Token this_COMMA_2=null;
        Token this_REG_3=null;
        Token this_COMMA_4=null;
        Token this_IMMEDIATE_5=null;
        Token lv_i_opcode_6_0=null;
        Token this_REG_7=null;
        Token this_COMMA_8=null;
        Token this_IMMEDIATE_9=null;
        Token this_LPAREN_10=null;
        Token this_REG_11=null;
        Token this_RPAREN_12=null;
        Token lv_i_opcode_13_0=null;
        Token this_REG_14=null;
        Token this_COMMA_15=null;
        Token this_REG_16=null;
        Token this_COMMA_17=null;
        Token this_LABEL_IMM_18=null;


        	enterRule();

        try {
            // InternalLC2200.g:390:2: ( ( ( ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_IMMEDIATE_5= RULE_IMMEDIATE ) | ( ( (lv_i_opcode_6_0= RULE_IOP_OFFSET ) ) this_REG_7= RULE_REG this_COMMA_8= RULE_COMMA this_IMMEDIATE_9= RULE_IMMEDIATE this_LPAREN_10= RULE_LPAREN this_REG_11= RULE_REG this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= RULE_IOP_LABEL ) ) this_REG_14= RULE_REG this_COMMA_15= RULE_COMMA this_REG_16= RULE_REG this_COMMA_17= RULE_COMMA this_LABEL_IMM_18= RULE_LABEL_IMM ) ) )
            // InternalLC2200.g:391:2: ( ( ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_IMMEDIATE_5= RULE_IMMEDIATE ) | ( ( (lv_i_opcode_6_0= RULE_IOP_OFFSET ) ) this_REG_7= RULE_REG this_COMMA_8= RULE_COMMA this_IMMEDIATE_9= RULE_IMMEDIATE this_LPAREN_10= RULE_LPAREN this_REG_11= RULE_REG this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= RULE_IOP_LABEL ) ) this_REG_14= RULE_REG this_COMMA_15= RULE_COMMA this_REG_16= RULE_REG this_COMMA_17= RULE_COMMA this_LABEL_IMM_18= RULE_LABEL_IMM ) )
            {
            // InternalLC2200.g:391:2: ( ( ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_IMMEDIATE_5= RULE_IMMEDIATE ) | ( ( (lv_i_opcode_6_0= RULE_IOP_OFFSET ) ) this_REG_7= RULE_REG this_COMMA_8= RULE_COMMA this_IMMEDIATE_9= RULE_IMMEDIATE this_LPAREN_10= RULE_LPAREN this_REG_11= RULE_REG this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= RULE_IOP_LABEL ) ) this_REG_14= RULE_REG this_COMMA_15= RULE_COMMA this_REG_16= RULE_REG this_COMMA_17= RULE_COMMA this_LABEL_IMM_18= RULE_LABEL_IMM ) )
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
                    // InternalLC2200.g:392:3: ( ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_IMMEDIATE_5= RULE_IMMEDIATE )
                    {
                    // InternalLC2200.g:392:3: ( ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_IMMEDIATE_5= RULE_IMMEDIATE )
                    // InternalLC2200.g:393:4: ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG this_COMMA_4= RULE_COMMA this_IMMEDIATE_5= RULE_IMMEDIATE
                    {
                    // InternalLC2200.g:393:4: ( (lv_i_opcode_0_0= RULE_IOP_IMM ) )
                    // InternalLC2200.g:394:5: (lv_i_opcode_0_0= RULE_IOP_IMM )
                    {
                    // InternalLC2200.g:394:5: (lv_i_opcode_0_0= RULE_IOP_IMM )
                    // InternalLC2200.g:395:6: lv_i_opcode_0_0= RULE_IOP_IMM
                    {
                    lv_i_opcode_0_0=(Token)match(input,RULE_IOP_IMM,FOLLOW_7); 

                    						newLeafNode(lv_i_opcode_0_0, grammarAccess.getIInstructionAccess().getI_opcodeIOP_IMMTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIInstructionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"i_opcode",
                    							lv_i_opcode_0_0,
                    							"org.team38.assembly.LC2200.IOP_IMM");
                    					

                    }


                    }

                    this_REG_1=(Token)match(input,RULE_REG,FOLLOW_8); 

                    				newLeafNode(this_REG_1, grammarAccess.getIInstructionAccess().getREGTerminalRuleCall_0_1());
                    			
                    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_7); 

                    				newLeafNode(this_COMMA_2, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_0_2());
                    			
                    this_REG_3=(Token)match(input,RULE_REG,FOLLOW_8); 

                    				newLeafNode(this_REG_3, grammarAccess.getIInstructionAccess().getREGTerminalRuleCall_0_3());
                    			
                    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_9); 

                    				newLeafNode(this_COMMA_4, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_0_4());
                    			
                    this_IMMEDIATE_5=(Token)match(input,RULE_IMMEDIATE,FOLLOW_2); 

                    				newLeafNode(this_IMMEDIATE_5, grammarAccess.getIInstructionAccess().getIMMEDIATETerminalRuleCall_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:433:3: ( ( (lv_i_opcode_6_0= RULE_IOP_OFFSET ) ) this_REG_7= RULE_REG this_COMMA_8= RULE_COMMA this_IMMEDIATE_9= RULE_IMMEDIATE this_LPAREN_10= RULE_LPAREN this_REG_11= RULE_REG this_RPAREN_12= RULE_RPAREN )
                    {
                    // InternalLC2200.g:433:3: ( ( (lv_i_opcode_6_0= RULE_IOP_OFFSET ) ) this_REG_7= RULE_REG this_COMMA_8= RULE_COMMA this_IMMEDIATE_9= RULE_IMMEDIATE this_LPAREN_10= RULE_LPAREN this_REG_11= RULE_REG this_RPAREN_12= RULE_RPAREN )
                    // InternalLC2200.g:434:4: ( (lv_i_opcode_6_0= RULE_IOP_OFFSET ) ) this_REG_7= RULE_REG this_COMMA_8= RULE_COMMA this_IMMEDIATE_9= RULE_IMMEDIATE this_LPAREN_10= RULE_LPAREN this_REG_11= RULE_REG this_RPAREN_12= RULE_RPAREN
                    {
                    // InternalLC2200.g:434:4: ( (lv_i_opcode_6_0= RULE_IOP_OFFSET ) )
                    // InternalLC2200.g:435:5: (lv_i_opcode_6_0= RULE_IOP_OFFSET )
                    {
                    // InternalLC2200.g:435:5: (lv_i_opcode_6_0= RULE_IOP_OFFSET )
                    // InternalLC2200.g:436:6: lv_i_opcode_6_0= RULE_IOP_OFFSET
                    {
                    lv_i_opcode_6_0=(Token)match(input,RULE_IOP_OFFSET,FOLLOW_7); 

                    						newLeafNode(lv_i_opcode_6_0, grammarAccess.getIInstructionAccess().getI_opcodeIOP_OFFSETTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIInstructionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"i_opcode",
                    							lv_i_opcode_6_0,
                    							"org.team38.assembly.LC2200.IOP_OFFSET");
                    					

                    }


                    }

                    this_REG_7=(Token)match(input,RULE_REG,FOLLOW_8); 

                    				newLeafNode(this_REG_7, grammarAccess.getIInstructionAccess().getREGTerminalRuleCall_1_1());
                    			
                    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_9); 

                    				newLeafNode(this_COMMA_8, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_1_2());
                    			
                    this_IMMEDIATE_9=(Token)match(input,RULE_IMMEDIATE,FOLLOW_10); 

                    				newLeafNode(this_IMMEDIATE_9, grammarAccess.getIInstructionAccess().getIMMEDIATETerminalRuleCall_1_3());
                    			
                    this_LPAREN_10=(Token)match(input,RULE_LPAREN,FOLLOW_7); 

                    				newLeafNode(this_LPAREN_10, grammarAccess.getIInstructionAccess().getLPARENTerminalRuleCall_1_4());
                    			
                    this_REG_11=(Token)match(input,RULE_REG,FOLLOW_11); 

                    				newLeafNode(this_REG_11, grammarAccess.getIInstructionAccess().getREGTerminalRuleCall_1_5());
                    			
                    this_RPAREN_12=(Token)match(input,RULE_RPAREN,FOLLOW_2); 

                    				newLeafNode(this_RPAREN_12, grammarAccess.getIInstructionAccess().getRPARENTerminalRuleCall_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:478:3: ( ( (lv_i_opcode_13_0= RULE_IOP_LABEL ) ) this_REG_14= RULE_REG this_COMMA_15= RULE_COMMA this_REG_16= RULE_REG this_COMMA_17= RULE_COMMA this_LABEL_IMM_18= RULE_LABEL_IMM )
                    {
                    // InternalLC2200.g:478:3: ( ( (lv_i_opcode_13_0= RULE_IOP_LABEL ) ) this_REG_14= RULE_REG this_COMMA_15= RULE_COMMA this_REG_16= RULE_REG this_COMMA_17= RULE_COMMA this_LABEL_IMM_18= RULE_LABEL_IMM )
                    // InternalLC2200.g:479:4: ( (lv_i_opcode_13_0= RULE_IOP_LABEL ) ) this_REG_14= RULE_REG this_COMMA_15= RULE_COMMA this_REG_16= RULE_REG this_COMMA_17= RULE_COMMA this_LABEL_IMM_18= RULE_LABEL_IMM
                    {
                    // InternalLC2200.g:479:4: ( (lv_i_opcode_13_0= RULE_IOP_LABEL ) )
                    // InternalLC2200.g:480:5: (lv_i_opcode_13_0= RULE_IOP_LABEL )
                    {
                    // InternalLC2200.g:480:5: (lv_i_opcode_13_0= RULE_IOP_LABEL )
                    // InternalLC2200.g:481:6: lv_i_opcode_13_0= RULE_IOP_LABEL
                    {
                    lv_i_opcode_13_0=(Token)match(input,RULE_IOP_LABEL,FOLLOW_7); 

                    						newLeafNode(lv_i_opcode_13_0, grammarAccess.getIInstructionAccess().getI_opcodeIOP_LABELTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIInstructionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"i_opcode",
                    							lv_i_opcode_13_0,
                    							"org.team38.assembly.LC2200.IOP_LABEL");
                    					

                    }


                    }

                    this_REG_14=(Token)match(input,RULE_REG,FOLLOW_8); 

                    				newLeafNode(this_REG_14, grammarAccess.getIInstructionAccess().getREGTerminalRuleCall_2_1());
                    			
                    this_COMMA_15=(Token)match(input,RULE_COMMA,FOLLOW_7); 

                    				newLeafNode(this_COMMA_15, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_2_2());
                    			
                    this_REG_16=(Token)match(input,RULE_REG,FOLLOW_8); 

                    				newLeafNode(this_REG_16, grammarAccess.getIInstructionAccess().getREGTerminalRuleCall_2_3());
                    			
                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_12); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_2_4());
                    			
                    this_LABEL_IMM_18=(Token)match(input,RULE_LABEL_IMM,FOLLOW_2); 

                    				newLeafNode(this_LABEL_IMM_18, grammarAccess.getIInstructionAccess().getLABEL_IMMTerminalRuleCall_2_5());
                    			

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
    // InternalLC2200.g:522:1: entryRuleJInstruction returns [EObject current=null] : iv_ruleJInstruction= ruleJInstruction EOF ;
    public final EObject entryRuleJInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJInstruction = null;


        try {
            // InternalLC2200.g:522:53: (iv_ruleJInstruction= ruleJInstruction EOF )
            // InternalLC2200.g:523:2: iv_ruleJInstruction= ruleJInstruction EOF
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
    // InternalLC2200.g:529:1: ruleJInstruction returns [EObject current=null] : ( ( (lv_j_opcode_0_0= RULE_JOP ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG ) ;
    public final EObject ruleJInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_j_opcode_0_0=null;
        Token this_REG_1=null;
        Token this_COMMA_2=null;
        Token this_REG_3=null;


        	enterRule();

        try {
            // InternalLC2200.g:535:2: ( ( ( (lv_j_opcode_0_0= RULE_JOP ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG ) )
            // InternalLC2200.g:536:2: ( ( (lv_j_opcode_0_0= RULE_JOP ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG )
            {
            // InternalLC2200.g:536:2: ( ( (lv_j_opcode_0_0= RULE_JOP ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG )
            // InternalLC2200.g:537:3: ( (lv_j_opcode_0_0= RULE_JOP ) ) this_REG_1= RULE_REG this_COMMA_2= RULE_COMMA this_REG_3= RULE_REG
            {
            // InternalLC2200.g:537:3: ( (lv_j_opcode_0_0= RULE_JOP ) )
            // InternalLC2200.g:538:4: (lv_j_opcode_0_0= RULE_JOP )
            {
            // InternalLC2200.g:538:4: (lv_j_opcode_0_0= RULE_JOP )
            // InternalLC2200.g:539:5: lv_j_opcode_0_0= RULE_JOP
            {
            lv_j_opcode_0_0=(Token)match(input,RULE_JOP,FOLLOW_7); 

            					newLeafNode(lv_j_opcode_0_0, grammarAccess.getJInstructionAccess().getJ_opcodeJOPTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"j_opcode",
            						lv_j_opcode_0_0,
            						"org.team38.assembly.LC2200.JOP");
            				

            }


            }

            this_REG_1=(Token)match(input,RULE_REG,FOLLOW_8); 

            			newLeafNode(this_REG_1, grammarAccess.getJInstructionAccess().getREGTerminalRuleCall_1());
            		
            this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            			newLeafNode(this_COMMA_2, grammarAccess.getJInstructionAccess().getCOMMATerminalRuleCall_2());
            		
            this_REG_3=(Token)match(input,RULE_REG,FOLLOW_2); 

            			newLeafNode(this_REG_3, grammarAccess.getJInstructionAccess().getREGTerminalRuleCall_3());
            		

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
    // InternalLC2200.g:571:1: entryRuleOInstruction returns [EObject current=null] : iv_ruleOInstruction= ruleOInstruction EOF ;
    public final EObject entryRuleOInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOInstruction = null;


        try {
            // InternalLC2200.g:571:53: (iv_ruleOInstruction= ruleOInstruction EOF )
            // InternalLC2200.g:572:2: iv_ruleOInstruction= ruleOInstruction EOF
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
    // InternalLC2200.g:578:1: ruleOInstruction returns [EObject current=null] : ( (lv_o_opcode_0_0= RULE_OOP ) ) ;
    public final EObject ruleOInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_o_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:584:2: ( ( (lv_o_opcode_0_0= RULE_OOP ) ) )
            // InternalLC2200.g:585:2: ( (lv_o_opcode_0_0= RULE_OOP ) )
            {
            // InternalLC2200.g:585:2: ( (lv_o_opcode_0_0= RULE_OOP ) )
            // InternalLC2200.g:586:3: (lv_o_opcode_0_0= RULE_OOP )
            {
            // InternalLC2200.g:586:3: (lv_o_opcode_0_0= RULE_OOP )
            // InternalLC2200.g:587:4: lv_o_opcode_0_0= RULE_OOP
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
    // InternalLC2200.g:606:1: entryRuleNOOPDirective returns [EObject current=null] : iv_ruleNOOPDirective= ruleNOOPDirective EOF ;
    public final EObject entryRuleNOOPDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOOPDirective = null;


        try {
            // InternalLC2200.g:606:54: (iv_ruleNOOPDirective= ruleNOOPDirective EOF )
            // InternalLC2200.g:607:2: iv_ruleNOOPDirective= ruleNOOPDirective EOF
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
    // InternalLC2200.g:613:1: ruleNOOPDirective returns [EObject current=null] : ( (lv_n_dir_0_0= RULE_NOOP ) ) ;
    public final EObject ruleNOOPDirective() throws RecognitionException {
        EObject current = null;

        Token lv_n_dir_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:619:2: ( ( (lv_n_dir_0_0= RULE_NOOP ) ) )
            // InternalLC2200.g:620:2: ( (lv_n_dir_0_0= RULE_NOOP ) )
            {
            // InternalLC2200.g:620:2: ( (lv_n_dir_0_0= RULE_NOOP ) )
            // InternalLC2200.g:621:3: (lv_n_dir_0_0= RULE_NOOP )
            {
            // InternalLC2200.g:621:3: (lv_n_dir_0_0= RULE_NOOP )
            // InternalLC2200.g:622:4: lv_n_dir_0_0= RULE_NOOP
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
    // InternalLC2200.g:641:1: entryRuleWordDirective returns [EObject current=null] : iv_ruleWordDirective= ruleWordDirective EOF ;
    public final EObject entryRuleWordDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordDirective = null;


        try {
            // InternalLC2200.g:641:54: (iv_ruleWordDirective= ruleWordDirective EOF )
            // InternalLC2200.g:642:2: iv_ruleWordDirective= ruleWordDirective EOF
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
    // InternalLC2200.g:648:1: ruleWordDirective returns [EObject current=null] : ( ( (lv_w_dir_0_0= RULE_WORD ) ) this_IMMEDIATE_1= RULE_IMMEDIATE ) ;
    public final EObject ruleWordDirective() throws RecognitionException {
        EObject current = null;

        Token lv_w_dir_0_0=null;
        Token this_IMMEDIATE_1=null;


        	enterRule();

        try {
            // InternalLC2200.g:654:2: ( ( ( (lv_w_dir_0_0= RULE_WORD ) ) this_IMMEDIATE_1= RULE_IMMEDIATE ) )
            // InternalLC2200.g:655:2: ( ( (lv_w_dir_0_0= RULE_WORD ) ) this_IMMEDIATE_1= RULE_IMMEDIATE )
            {
            // InternalLC2200.g:655:2: ( ( (lv_w_dir_0_0= RULE_WORD ) ) this_IMMEDIATE_1= RULE_IMMEDIATE )
            // InternalLC2200.g:656:3: ( (lv_w_dir_0_0= RULE_WORD ) ) this_IMMEDIATE_1= RULE_IMMEDIATE
            {
            // InternalLC2200.g:656:3: ( (lv_w_dir_0_0= RULE_WORD ) )
            // InternalLC2200.g:657:4: (lv_w_dir_0_0= RULE_WORD )
            {
            // InternalLC2200.g:657:4: (lv_w_dir_0_0= RULE_WORD )
            // InternalLC2200.g:658:5: lv_w_dir_0_0= RULE_WORD
            {
            lv_w_dir_0_0=(Token)match(input,RULE_WORD,FOLLOW_9); 

            					newLeafNode(lv_w_dir_0_0, grammarAccess.getWordDirectiveAccess().getW_dirWORDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWordDirectiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"w_dir",
            						lv_w_dir_0_0,
            						"org.team38.assembly.LC2200.WORD");
            				

            }


            }

            this_IMMEDIATE_1=(Token)match(input,RULE_IMMEDIATE,FOLLOW_2); 

            			newLeafNode(this_IMMEDIATE_1, grammarAccess.getWordDirectiveAccess().getIMMEDIATETerminalRuleCall_1());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001E9492L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000069490L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001E94F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});

}