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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_NEWLINE", "RULE_COMMA", "RULE_IMMEDIATE", "RULE_LPAREN", "RULE_RPAREN", "RULE_OOP", "RULE_NOOP", "RULE_ROP", "RULE_IOP_IMM", "RULE_IOP_OFFSET", "RULE_IOP_LABEL", "RULE_JOP", "RULE_WORD", "RULE_LA", "RULE_COMMENT", "RULE_REG", "RULE_LABEL", "RULE_LABEL_IMM", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_LABEL=21;
    public static final int RULE_LA=18;
    public static final int RULE_IMMEDIATE=7;
    public static final int RULE_NEWLINE=5;
    public static final int RULE_WORD=17;
    public static final int RULE_REG=20;
    public static final int RULE_STRING=25;
    public static final int RULE_ROP=12;
    public static final int RULE_LPAREN=8;
    public static final int RULE_SL_COMMENT=26;
    public static final int RULE_IOP_OFFSET=14;
    public static final int RULE_JOP=16;
    public static final int RULE_OOP=10;
    public static final int RULE_LABEL_IMM=22;
    public static final int EOF=-1;
    public static final int RULE_NOOP=11;
    public static final int RULE_ID=24;
    public static final int RULE_COMMA=6;
    public static final int RULE_WS=27;
    public static final int RULE_COMMENT=19;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_RPAREN=9;
    public static final int RULE_IOP_LABEL=15;
    public static final int RULE_INT=23;
    public static final int RULE_ML_COMMENT=4;
    public static final int RULE_IOP_IMM=13;

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
    // InternalLC2200.g:71:1: ruleProgram returns [EObject current=null] : ( () ( ( (lv_lines_1_1= ruleInstruction | lv_lines_1_2= ruleDirective ) ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_lines_1_1 = null;

        EObject lv_lines_1_2 = null;



        	enterRule();

        try {
            // InternalLC2200.g:77:2: ( ( () ( ( (lv_lines_1_1= ruleInstruction | lv_lines_1_2= ruleDirective ) ) )* ) )
            // InternalLC2200.g:78:2: ( () ( ( (lv_lines_1_1= ruleInstruction | lv_lines_1_2= ruleDirective ) ) )* )
            {
            // InternalLC2200.g:78:2: ( () ( ( (lv_lines_1_1= ruleInstruction | lv_lines_1_2= ruleDirective ) ) )* )
            // InternalLC2200.g:79:3: () ( ( (lv_lines_1_1= ruleInstruction | lv_lines_1_2= ruleDirective ) ) )*
            {
            // InternalLC2200.g:79:3: ()
            // InternalLC2200.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            // InternalLC2200.g:86:3: ( ( (lv_lines_1_1= ruleInstruction | lv_lines_1_2= ruleDirective ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_OOP && LA2_0<=RULE_LA)||LA2_0==RULE_LABEL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLC2200.g:87:4: ( (lv_lines_1_1= ruleInstruction | lv_lines_1_2= ruleDirective ) )
            	    {
            	    // InternalLC2200.g:87:4: ( (lv_lines_1_1= ruleInstruction | lv_lines_1_2= ruleDirective ) )
            	    // InternalLC2200.g:88:5: (lv_lines_1_1= ruleInstruction | lv_lines_1_2= ruleDirective )
            	    {
            	    // InternalLC2200.g:88:5: (lv_lines_1_1= ruleInstruction | lv_lines_1_2= ruleDirective )
            	    int alt1=2;
            	    switch ( input.LA(1) ) {
            	    case RULE_LABEL:
            	        {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==RULE_OOP||(LA1_1>=RULE_ROP && LA1_1<=RULE_JOP)) ) {
            	            alt1=1;
            	        }
            	        else if ( (LA1_1==RULE_NOOP||(LA1_1>=RULE_WORD && LA1_1<=RULE_LA)) ) {
            	            alt1=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 1, 1, input);

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
            	        alt1=1;
            	        }
            	        break;
            	    case RULE_NOOP:
            	    case RULE_WORD:
            	    case RULE_LA:
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
            	            // InternalLC2200.g:89:6: lv_lines_1_1= ruleInstruction
            	            {

            	            						newCompositeNode(grammarAccess.getProgramAccess().getLinesInstructionParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_3);
            	            lv_lines_1_1=ruleInstruction();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProgramRule());
            	            						}
            	            						add(
            	            							current,
            	            							"lines",
            	            							lv_lines_1_1,
            	            							"org.team38.assembly.LC2200.Instruction");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalLC2200.g:105:6: lv_lines_1_2= ruleDirective
            	            {

            	            						newCompositeNode(grammarAccess.getProgramAccess().getLinesDirectiveParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_3);
            	            lv_lines_1_2=ruleDirective();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProgramRule());
            	            						}
            	            						add(
            	            							current,
            	            							"lines",
            	            							lv_lines_1_2,
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
    // InternalLC2200.g:127:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalLC2200.g:127:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalLC2200.g:128:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalLC2200.g:134:1: ruleInstruction returns [EObject current=null] : ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token this_ML_COMMENT_3=null;
        Token this_NEWLINE_4=null;
        EObject lv_label_0_0 = null;

        EObject lv_instruction_1_1 = null;

        EObject lv_instruction_1_2 = null;

        EObject lv_instruction_1_3 = null;

        EObject lv_instruction_1_4 = null;

        EObject lv_comment_2_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:140:2: ( ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? ) )
            // InternalLC2200.g:141:2: ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? )
            {
            // InternalLC2200.g:141:2: ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? )
            // InternalLC2200.g:142:3: ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )?
            {
            // InternalLC2200.g:142:3: ( (lv_label_0_0= ruleLabelBeg ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LABEL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLC2200.g:143:4: (lv_label_0_0= ruleLabelBeg )
                    {
                    // InternalLC2200.g:143:4: (lv_label_0_0= ruleLabelBeg )
                    // InternalLC2200.g:144:5: lv_label_0_0= ruleLabelBeg
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getLabelLabelBegParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_4);
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

            // InternalLC2200.g:161:3: ( ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) ) )
            // InternalLC2200.g:162:4: ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) )
            {
            // InternalLC2200.g:162:4: ( (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction ) )
            // InternalLC2200.g:163:5: (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction )
            {
            // InternalLC2200.g:163:5: (lv_instruction_1_1= ruleRInstruction | lv_instruction_1_2= ruleIInstruction | lv_instruction_1_3= ruleJInstruction | lv_instruction_1_4= ruleOInstruction )
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
                    // InternalLC2200.g:164:6: lv_instruction_1_1= ruleRInstruction
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
                    // InternalLC2200.g:180:6: lv_instruction_1_2= ruleIInstruction
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
                    // InternalLC2200.g:196:6: lv_instruction_1_3= ruleJInstruction
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
                    // InternalLC2200.g:212:6: lv_instruction_1_4= ruleOInstruction
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

            // InternalLC2200.g:230:3: ( (lv_comment_2_0= ruleCommentTrans ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLC2200.g:231:4: (lv_comment_2_0= ruleCommentTrans )
                    {
                    // InternalLC2200.g:231:4: (lv_comment_2_0= ruleCommentTrans )
                    // InternalLC2200.g:232:5: lv_comment_2_0= ruleCommentTrans
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getCommentCommentTransParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_comment_2_0=ruleCommentTrans();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_2_0,
                    						"org.team38.assembly.LC2200.CommentTrans");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLC2200.g:249:3: (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ML_COMMENT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_NEWLINE) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // InternalLC2200.g:250:4: this_ML_COMMENT_3= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_3=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    				newLeafNode(this_ML_COMMENT_3, grammarAccess.getInstructionAccess().getML_COMMENTTerminalRuleCall_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLC2200.g:255:4: this_NEWLINE_4= RULE_NEWLINE
                    {
                    this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    				newLeafNode(this_NEWLINE_4, grammarAccess.getInstructionAccess().getNEWLINETerminalRuleCall_3_1());
                    			

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
    // InternalLC2200.g:264:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // InternalLC2200.g:264:50: (iv_ruleDirective= ruleDirective EOF )
            // InternalLC2200.g:265:2: iv_ruleDirective= ruleDirective EOF
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
    // InternalLC2200.g:271:1: ruleDirective returns [EObject current=null] : ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        Token this_ML_COMMENT_3=null;
        Token this_NEWLINE_4=null;
        EObject lv_label_0_0 = null;

        EObject lv_directive_1_1 = null;

        EObject lv_directive_1_2 = null;

        EObject lv_directive_1_3 = null;

        EObject lv_comment_2_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:277:2: ( ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? ) )
            // InternalLC2200.g:278:2: ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? )
            {
            // InternalLC2200.g:278:2: ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? )
            // InternalLC2200.g:279:3: ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )?
            {
            // InternalLC2200.g:279:3: ( (lv_label_0_0= ruleLabelBeg ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LABEL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLC2200.g:280:4: (lv_label_0_0= ruleLabelBeg )
                    {
                    // InternalLC2200.g:280:4: (lv_label_0_0= ruleLabelBeg )
                    // InternalLC2200.g:281:5: lv_label_0_0= ruleLabelBeg
                    {

                    					newCompositeNode(grammarAccess.getDirectiveAccess().getLabelLabelBegParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_7);
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

            // InternalLC2200.g:298:3: ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) ) )
            // InternalLC2200.g:299:4: ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) )
            {
            // InternalLC2200.g:299:4: ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective ) )
            // InternalLC2200.g:300:5: (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective )
            {
            // InternalLC2200.g:300:5: (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective | lv_directive_1_3= ruleLADirective )
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
                    // InternalLC2200.g:301:6: lv_directive_1_1= ruleNOOPDirective
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
                    // InternalLC2200.g:317:6: lv_directive_1_2= ruleWordDirective
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
                case 3 :
                    // InternalLC2200.g:333:6: lv_directive_1_3= ruleLADirective
                    {

                    						newCompositeNode(grammarAccess.getDirectiveAccess().getDirectiveLADirectiveParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_5);
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

            // InternalLC2200.g:351:3: ( (lv_comment_2_0= ruleCommentTrans ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_COMMENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLC2200.g:352:4: (lv_comment_2_0= ruleCommentTrans )
                    {
                    // InternalLC2200.g:352:4: (lv_comment_2_0= ruleCommentTrans )
                    // InternalLC2200.g:353:5: lv_comment_2_0= ruleCommentTrans
                    {

                    					newCompositeNode(grammarAccess.getDirectiveAccess().getCommentCommentTransParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_comment_2_0=ruleCommentTrans();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDirectiveRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_2_0,
                    						"org.team38.assembly.LC2200.CommentTrans");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalLC2200.g:370:3: (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ML_COMMENT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_NEWLINE) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // InternalLC2200.g:371:4: this_ML_COMMENT_3= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_3=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    				newLeafNode(this_ML_COMMENT_3, grammarAccess.getDirectiveAccess().getML_COMMENTTerminalRuleCall_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLC2200.g:376:4: this_NEWLINE_4= RULE_NEWLINE
                    {
                    this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    				newLeafNode(this_NEWLINE_4, grammarAccess.getDirectiveAccess().getNEWLINETerminalRuleCall_3_1());
                    			

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
    // InternalLC2200.g:385:1: entryRuleRInstruction returns [EObject current=null] : iv_ruleRInstruction= ruleRInstruction EOF ;
    public final EObject entryRuleRInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRInstruction = null;


        try {
            // InternalLC2200.g:385:53: (iv_ruleRInstruction= ruleRInstruction EOF )
            // InternalLC2200.g:386:2: iv_ruleRInstruction= ruleRInstruction EOF
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
    // InternalLC2200.g:392:1: ruleRInstruction returns [EObject current=null] : ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) ) ;
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
            // InternalLC2200.g:398:2: ( ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) ) )
            // InternalLC2200.g:399:2: ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) )
            {
            // InternalLC2200.g:399:2: ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) )
            // InternalLC2200.g:400:3: ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) )
            {
            // InternalLC2200.g:400:3: ( (lv_r_opcode_0_0= ruleRInstructionTrans ) )
            // InternalLC2200.g:401:4: (lv_r_opcode_0_0= ruleRInstructionTrans )
            {
            // InternalLC2200.g:401:4: (lv_r_opcode_0_0= ruleRInstructionTrans )
            // InternalLC2200.g:402:5: lv_r_opcode_0_0= ruleRInstructionTrans
            {

            					newCompositeNode(grammarAccess.getRInstructionAccess().getR_opcodeRInstructionTransParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalLC2200.g:419:3: ( (lv_reg1_1_0= ruleRegTrans ) )
            // InternalLC2200.g:420:4: (lv_reg1_1_0= ruleRegTrans )
            {
            // InternalLC2200.g:420:4: (lv_reg1_1_0= ruleRegTrans )
            // InternalLC2200.g:421:5: lv_reg1_1_0= ruleRegTrans
            {

            					newCompositeNode(grammarAccess.getRInstructionAccess().getReg1RegTransParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            			newLeafNode(this_COMMA_2, grammarAccess.getRInstructionAccess().getCOMMATerminalRuleCall_2());
            		
            // InternalLC2200.g:442:3: ( (lv_reg2_3_0= ruleRegTrans ) )
            // InternalLC2200.g:443:4: (lv_reg2_3_0= ruleRegTrans )
            {
            // InternalLC2200.g:443:4: (lv_reg2_3_0= ruleRegTrans )
            // InternalLC2200.g:444:5: lv_reg2_3_0= ruleRegTrans
            {

            					newCompositeNode(grammarAccess.getRInstructionAccess().getReg2RegTransParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            			newLeafNode(this_COMMA_4, grammarAccess.getRInstructionAccess().getCOMMATerminalRuleCall_4());
            		
            // InternalLC2200.g:465:3: ( (lv_reg3_5_0= ruleRegTrans ) )
            // InternalLC2200.g:466:4: (lv_reg3_5_0= ruleRegTrans )
            {
            // InternalLC2200.g:466:4: (lv_reg3_5_0= ruleRegTrans )
            // InternalLC2200.g:467:5: lv_reg3_5_0= ruleRegTrans
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
    // InternalLC2200.g:488:1: entryRuleIInstruction returns [EObject current=null] : iv_ruleIInstruction= ruleIInstruction EOF ;
    public final EObject entryRuleIInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstruction = null;


        try {
            // InternalLC2200.g:488:53: (iv_ruleIInstruction= ruleIInstruction EOF )
            // InternalLC2200.g:489:2: iv_ruleIInstruction= ruleIInstruction EOF
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
    // InternalLC2200.g:495:1: ruleIInstruction returns [EObject current=null] : ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) ) ;
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
            // InternalLC2200.g:501:2: ( ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) ) )
            // InternalLC2200.g:502:2: ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) )
            {
            // InternalLC2200.g:502:2: ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_IOP_IMM:
                {
                alt11=1;
                }
                break;
            case RULE_IOP_OFFSET:
                {
                alt11=2;
                }
                break;
            case RULE_IOP_LABEL:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalLC2200.g:503:3: ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) )
                    {
                    // InternalLC2200.g:503:3: ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) )
                    // InternalLC2200.g:504:4: ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) )
                    {
                    // InternalLC2200.g:504:4: ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) )
                    // InternalLC2200.g:505:5: (lv_i_opcode_0_0= ruleIInstructionImmTrans )
                    {
                    // InternalLC2200.g:505:5: (lv_i_opcode_0_0= ruleIInstructionImmTrans )
                    // InternalLC2200.g:506:6: lv_i_opcode_0_0= ruleIInstructionImmTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getI_opcodeIInstructionImmTransParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalLC2200.g:523:4: ( (lv_reg1_1_0= ruleRegTrans ) )
                    // InternalLC2200.g:524:5: (lv_reg1_1_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:524:5: (lv_reg1_1_0= ruleRegTrans )
                    // InternalLC2200.g:525:6: lv_reg1_1_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg1RegTransParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    				newLeafNode(this_COMMA_2, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_0_2());
                    			
                    // InternalLC2200.g:546:4: ( (lv_reg2_3_0= ruleRegTrans ) )
                    // InternalLC2200.g:547:5: (lv_reg2_3_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:547:5: (lv_reg2_3_0= ruleRegTrans )
                    // InternalLC2200.g:548:6: lv_reg2_3_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg2RegTransParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_10); 

                    				newLeafNode(this_COMMA_4, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_0_4());
                    			
                    // InternalLC2200.g:569:4: ( (lv_imm_5_0= RULE_IMMEDIATE ) )
                    // InternalLC2200.g:570:5: (lv_imm_5_0= RULE_IMMEDIATE )
                    {
                    // InternalLC2200.g:570:5: (lv_imm_5_0= RULE_IMMEDIATE )
                    // InternalLC2200.g:571:6: lv_imm_5_0= RULE_IMMEDIATE
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
                    // InternalLC2200.g:589:3: ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN )
                    {
                    // InternalLC2200.g:589:3: ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN )
                    // InternalLC2200.g:590:4: ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN
                    {
                    // InternalLC2200.g:590:4: ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) )
                    // InternalLC2200.g:591:5: (lv_i_opcode_6_0= ruleIInstructionOffsetTrans )
                    {
                    // InternalLC2200.g:591:5: (lv_i_opcode_6_0= ruleIInstructionOffsetTrans )
                    // InternalLC2200.g:592:6: lv_i_opcode_6_0= ruleIInstructionOffsetTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getI_opcodeIInstructionOffsetTransParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalLC2200.g:609:4: ( (lv_reg1_7_0= ruleRegTrans ) )
                    // InternalLC2200.g:610:5: (lv_reg1_7_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:610:5: (lv_reg1_7_0= ruleRegTrans )
                    // InternalLC2200.g:611:6: lv_reg1_7_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg1RegTransParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_10); 

                    				newLeafNode(this_COMMA_8, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_1_2());
                    			
                    // InternalLC2200.g:632:4: ( (lv_imm_9_0= RULE_IMMEDIATE ) )
                    // InternalLC2200.g:633:5: (lv_imm_9_0= RULE_IMMEDIATE )
                    {
                    // InternalLC2200.g:633:5: (lv_imm_9_0= RULE_IMMEDIATE )
                    // InternalLC2200.g:634:6: lv_imm_9_0= RULE_IMMEDIATE
                    {
                    lv_imm_9_0=(Token)match(input,RULE_IMMEDIATE,FOLLOW_11); 

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

                    this_LPAREN_10=(Token)match(input,RULE_LPAREN,FOLLOW_8); 

                    				newLeafNode(this_LPAREN_10, grammarAccess.getIInstructionAccess().getLPARENTerminalRuleCall_1_4());
                    			
                    // InternalLC2200.g:654:4: ( (lv_reg2_11_0= ruleRegTrans ) )
                    // InternalLC2200.g:655:5: (lv_reg2_11_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:655:5: (lv_reg2_11_0= ruleRegTrans )
                    // InternalLC2200.g:656:6: lv_reg2_11_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg2RegTransParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_12);
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
                    // InternalLC2200.g:679:3: ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) )
                    {
                    // InternalLC2200.g:679:3: ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) )
                    // InternalLC2200.g:680:4: ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) )
                    {
                    // InternalLC2200.g:680:4: ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) )
                    // InternalLC2200.g:681:5: (lv_i_opcode_13_0= ruleIInstructionLabelTrans )
                    {
                    // InternalLC2200.g:681:5: (lv_i_opcode_13_0= ruleIInstructionLabelTrans )
                    // InternalLC2200.g:682:6: lv_i_opcode_13_0= ruleIInstructionLabelTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getI_opcodeIInstructionLabelTransParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalLC2200.g:699:4: ( (lv_reg1_14_0= ruleRegTrans ) )
                    // InternalLC2200.g:700:5: (lv_reg1_14_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:700:5: (lv_reg1_14_0= ruleRegTrans )
                    // InternalLC2200.g:701:6: lv_reg1_14_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg1RegTransParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    this_COMMA_15=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    				newLeafNode(this_COMMA_15, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_2_2());
                    			
                    // InternalLC2200.g:722:4: ( (lv_reg2_16_0= ruleRegTrans ) )
                    // InternalLC2200.g:723:5: (lv_reg2_16_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:723:5: (lv_reg2_16_0= ruleRegTrans )
                    // InternalLC2200.g:724:6: lv_reg2_16_0= ruleRegTrans
                    {

                    						newCompositeNode(grammarAccess.getIInstructionAccess().getReg2RegTransParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_13); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getIInstructionAccess().getCOMMATerminalRuleCall_2_4());
                    			
                    // InternalLC2200.g:745:4: ( (lv_label_18_0= ruleLabelEnd ) )
                    // InternalLC2200.g:746:5: (lv_label_18_0= ruleLabelEnd )
                    {
                    // InternalLC2200.g:746:5: (lv_label_18_0= ruleLabelEnd )
                    // InternalLC2200.g:747:6: lv_label_18_0= ruleLabelEnd
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
    // InternalLC2200.g:769:1: entryRuleJInstruction returns [EObject current=null] : iv_ruleJInstruction= ruleJInstruction EOF ;
    public final EObject entryRuleJInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJInstruction = null;


        try {
            // InternalLC2200.g:769:53: (iv_ruleJInstruction= ruleJInstruction EOF )
            // InternalLC2200.g:770:2: iv_ruleJInstruction= ruleJInstruction EOF
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
    // InternalLC2200.g:776:1: ruleJInstruction returns [EObject current=null] : ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) ) ;
    public final EObject ruleJInstruction() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_2=null;
        EObject lv_j_opcode_0_0 = null;

        EObject lv_reg1_1_0 = null;

        EObject lv_reg2_3_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:782:2: ( ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) ) )
            // InternalLC2200.g:783:2: ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) )
            {
            // InternalLC2200.g:783:2: ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) )
            // InternalLC2200.g:784:3: ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) )
            {
            // InternalLC2200.g:784:3: ( (lv_j_opcode_0_0= ruleJInstructionTrans ) )
            // InternalLC2200.g:785:4: (lv_j_opcode_0_0= ruleJInstructionTrans )
            {
            // InternalLC2200.g:785:4: (lv_j_opcode_0_0= ruleJInstructionTrans )
            // InternalLC2200.g:786:5: lv_j_opcode_0_0= ruleJInstructionTrans
            {

            					newCompositeNode(grammarAccess.getJInstructionAccess().getJ_opcodeJInstructionTransParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalLC2200.g:803:3: ( (lv_reg1_1_0= ruleRegTrans ) )
            // InternalLC2200.g:804:4: (lv_reg1_1_0= ruleRegTrans )
            {
            // InternalLC2200.g:804:4: (lv_reg1_1_0= ruleRegTrans )
            // InternalLC2200.g:805:5: lv_reg1_1_0= ruleRegTrans
            {

            					newCompositeNode(grammarAccess.getJInstructionAccess().getReg1RegTransParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            			newLeafNode(this_COMMA_2, grammarAccess.getJInstructionAccess().getCOMMATerminalRuleCall_2());
            		
            // InternalLC2200.g:826:3: ( (lv_reg2_3_0= ruleRegTrans ) )
            // InternalLC2200.g:827:4: (lv_reg2_3_0= ruleRegTrans )
            {
            // InternalLC2200.g:827:4: (lv_reg2_3_0= ruleRegTrans )
            // InternalLC2200.g:828:5: lv_reg2_3_0= ruleRegTrans
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
    // InternalLC2200.g:849:1: entryRuleOInstruction returns [EObject current=null] : iv_ruleOInstruction= ruleOInstruction EOF ;
    public final EObject entryRuleOInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOInstruction = null;


        try {
            // InternalLC2200.g:849:53: (iv_ruleOInstruction= ruleOInstruction EOF )
            // InternalLC2200.g:850:2: iv_ruleOInstruction= ruleOInstruction EOF
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
    // InternalLC2200.g:856:1: ruleOInstruction returns [EObject current=null] : ( (lv_o_opcode_0_0= RULE_OOP ) ) ;
    public final EObject ruleOInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_o_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:862:2: ( ( (lv_o_opcode_0_0= RULE_OOP ) ) )
            // InternalLC2200.g:863:2: ( (lv_o_opcode_0_0= RULE_OOP ) )
            {
            // InternalLC2200.g:863:2: ( (lv_o_opcode_0_0= RULE_OOP ) )
            // InternalLC2200.g:864:3: (lv_o_opcode_0_0= RULE_OOP )
            {
            // InternalLC2200.g:864:3: (lv_o_opcode_0_0= RULE_OOP )
            // InternalLC2200.g:865:4: lv_o_opcode_0_0= RULE_OOP
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
    // InternalLC2200.g:884:1: entryRuleNOOPDirective returns [EObject current=null] : iv_ruleNOOPDirective= ruleNOOPDirective EOF ;
    public final EObject entryRuleNOOPDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOOPDirective = null;


        try {
            // InternalLC2200.g:884:54: (iv_ruleNOOPDirective= ruleNOOPDirective EOF )
            // InternalLC2200.g:885:2: iv_ruleNOOPDirective= ruleNOOPDirective EOF
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
    // InternalLC2200.g:891:1: ruleNOOPDirective returns [EObject current=null] : ( (lv_n_dir_0_0= RULE_NOOP ) ) ;
    public final EObject ruleNOOPDirective() throws RecognitionException {
        EObject current = null;

        Token lv_n_dir_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:897:2: ( ( (lv_n_dir_0_0= RULE_NOOP ) ) )
            // InternalLC2200.g:898:2: ( (lv_n_dir_0_0= RULE_NOOP ) )
            {
            // InternalLC2200.g:898:2: ( (lv_n_dir_0_0= RULE_NOOP ) )
            // InternalLC2200.g:899:3: (lv_n_dir_0_0= RULE_NOOP )
            {
            // InternalLC2200.g:899:3: (lv_n_dir_0_0= RULE_NOOP )
            // InternalLC2200.g:900:4: lv_n_dir_0_0= RULE_NOOP
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
    // InternalLC2200.g:919:1: entryRuleWordDirective returns [EObject current=null] : iv_ruleWordDirective= ruleWordDirective EOF ;
    public final EObject entryRuleWordDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordDirective = null;


        try {
            // InternalLC2200.g:919:54: (iv_ruleWordDirective= ruleWordDirective EOF )
            // InternalLC2200.g:920:2: iv_ruleWordDirective= ruleWordDirective EOF
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
    // InternalLC2200.g:926:1: ruleWordDirective returns [EObject current=null] : ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) ) ;
    public final EObject ruleWordDirective() throws RecognitionException {
        EObject current = null;

        Token lv_imm_1_0=null;
        EObject lv_w_dir_0_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:932:2: ( ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) ) )
            // InternalLC2200.g:933:2: ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) )
            {
            // InternalLC2200.g:933:2: ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) )
            // InternalLC2200.g:934:3: ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) )
            {
            // InternalLC2200.g:934:3: ( (lv_w_dir_0_0= ruleWordTrans ) )
            // InternalLC2200.g:935:4: (lv_w_dir_0_0= ruleWordTrans )
            {
            // InternalLC2200.g:935:4: (lv_w_dir_0_0= ruleWordTrans )
            // InternalLC2200.g:936:5: lv_w_dir_0_0= ruleWordTrans
            {

            					newCompositeNode(grammarAccess.getWordDirectiveAccess().getW_dirWordTransParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalLC2200.g:953:3: ( (lv_imm_1_0= RULE_IMMEDIATE ) )
            // InternalLC2200.g:954:4: (lv_imm_1_0= RULE_IMMEDIATE )
            {
            // InternalLC2200.g:954:4: (lv_imm_1_0= RULE_IMMEDIATE )
            // InternalLC2200.g:955:5: lv_imm_1_0= RULE_IMMEDIATE
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
    // InternalLC2200.g:975:1: entryRuleLADirective returns [EObject current=null] : iv_ruleLADirective= ruleLADirective EOF ;
    public final EObject entryRuleLADirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLADirective = null;


        try {
            // InternalLC2200.g:975:52: (iv_ruleLADirective= ruleLADirective EOF )
            // InternalLC2200.g:976:2: iv_ruleLADirective= ruleLADirective EOF
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
    // InternalLC2200.g:982:1: ruleLADirective returns [EObject current=null] : ( ( (lv_la_dir_0_0= ruleLATrans ) ) ( (lv_reg_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_label_3_0= ruleLabelEnd ) ) ) ;
    public final EObject ruleLADirective() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_2=null;
        EObject lv_la_dir_0_0 = null;

        EObject lv_reg_1_0 = null;

        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:988:2: ( ( ( (lv_la_dir_0_0= ruleLATrans ) ) ( (lv_reg_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_label_3_0= ruleLabelEnd ) ) ) )
            // InternalLC2200.g:989:2: ( ( (lv_la_dir_0_0= ruleLATrans ) ) ( (lv_reg_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_label_3_0= ruleLabelEnd ) ) )
            {
            // InternalLC2200.g:989:2: ( ( (lv_la_dir_0_0= ruleLATrans ) ) ( (lv_reg_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_label_3_0= ruleLabelEnd ) ) )
            // InternalLC2200.g:990:3: ( (lv_la_dir_0_0= ruleLATrans ) ) ( (lv_reg_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_label_3_0= ruleLabelEnd ) )
            {
            // InternalLC2200.g:990:3: ( (lv_la_dir_0_0= ruleLATrans ) )
            // InternalLC2200.g:991:4: (lv_la_dir_0_0= ruleLATrans )
            {
            // InternalLC2200.g:991:4: (lv_la_dir_0_0= ruleLATrans )
            // InternalLC2200.g:992:5: lv_la_dir_0_0= ruleLATrans
            {

            					newCompositeNode(grammarAccess.getLADirectiveAccess().getLa_dirLATransParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalLC2200.g:1009:3: ( (lv_reg_1_0= ruleRegTrans ) )
            // InternalLC2200.g:1010:4: (lv_reg_1_0= ruleRegTrans )
            {
            // InternalLC2200.g:1010:4: (lv_reg_1_0= ruleRegTrans )
            // InternalLC2200.g:1011:5: lv_reg_1_0= ruleRegTrans
            {

            					newCompositeNode(grammarAccess.getLADirectiveAccess().getRegRegTransParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            			newLeafNode(this_COMMA_2, grammarAccess.getLADirectiveAccess().getCOMMATerminalRuleCall_2());
            		
            // InternalLC2200.g:1032:3: ( (lv_label_3_0= ruleLabelEnd ) )
            // InternalLC2200.g:1033:4: (lv_label_3_0= ruleLabelEnd )
            {
            // InternalLC2200.g:1033:4: (lv_label_3_0= ruleLabelEnd )
            // InternalLC2200.g:1034:5: lv_label_3_0= ruleLabelEnd
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
    // InternalLC2200.g:1055:1: entryRuleRInstructionTrans returns [EObject current=null] : iv_ruleRInstructionTrans= ruleRInstructionTrans EOF ;
    public final EObject entryRuleRInstructionTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRInstructionTrans = null;


        try {
            // InternalLC2200.g:1055:58: (iv_ruleRInstructionTrans= ruleRInstructionTrans EOF )
            // InternalLC2200.g:1056:2: iv_ruleRInstructionTrans= ruleRInstructionTrans EOF
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
    // InternalLC2200.g:1062:1: ruleRInstructionTrans returns [EObject current=null] : ( (lv_r_opcode_0_0= RULE_ROP ) ) ;
    public final EObject ruleRInstructionTrans() throws RecognitionException {
        EObject current = null;

        Token lv_r_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1068:2: ( ( (lv_r_opcode_0_0= RULE_ROP ) ) )
            // InternalLC2200.g:1069:2: ( (lv_r_opcode_0_0= RULE_ROP ) )
            {
            // InternalLC2200.g:1069:2: ( (lv_r_opcode_0_0= RULE_ROP ) )
            // InternalLC2200.g:1070:3: (lv_r_opcode_0_0= RULE_ROP )
            {
            // InternalLC2200.g:1070:3: (lv_r_opcode_0_0= RULE_ROP )
            // InternalLC2200.g:1071:4: lv_r_opcode_0_0= RULE_ROP
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
    // InternalLC2200.g:1090:1: entryRuleIInstructionImmTrans returns [EObject current=null] : iv_ruleIInstructionImmTrans= ruleIInstructionImmTrans EOF ;
    public final EObject entryRuleIInstructionImmTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstructionImmTrans = null;


        try {
            // InternalLC2200.g:1090:61: (iv_ruleIInstructionImmTrans= ruleIInstructionImmTrans EOF )
            // InternalLC2200.g:1091:2: iv_ruleIInstructionImmTrans= ruleIInstructionImmTrans EOF
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
    // InternalLC2200.g:1097:1: ruleIInstructionImmTrans returns [EObject current=null] : ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) ;
    public final EObject ruleIInstructionImmTrans() throws RecognitionException {
        EObject current = null;

        Token lv_i_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1103:2: ( ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) )
            // InternalLC2200.g:1104:2: ( (lv_i_opcode_0_0= RULE_IOP_IMM ) )
            {
            // InternalLC2200.g:1104:2: ( (lv_i_opcode_0_0= RULE_IOP_IMM ) )
            // InternalLC2200.g:1105:3: (lv_i_opcode_0_0= RULE_IOP_IMM )
            {
            // InternalLC2200.g:1105:3: (lv_i_opcode_0_0= RULE_IOP_IMM )
            // InternalLC2200.g:1106:4: lv_i_opcode_0_0= RULE_IOP_IMM
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
    // InternalLC2200.g:1125:1: entryRuleIInstructionOffsetTrans returns [EObject current=null] : iv_ruleIInstructionOffsetTrans= ruleIInstructionOffsetTrans EOF ;
    public final EObject entryRuleIInstructionOffsetTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstructionOffsetTrans = null;


        try {
            // InternalLC2200.g:1125:64: (iv_ruleIInstructionOffsetTrans= ruleIInstructionOffsetTrans EOF )
            // InternalLC2200.g:1126:2: iv_ruleIInstructionOffsetTrans= ruleIInstructionOffsetTrans EOF
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
    // InternalLC2200.g:1132:1: ruleIInstructionOffsetTrans returns [EObject current=null] : ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) ) ;
    public final EObject ruleIInstructionOffsetTrans() throws RecognitionException {
        EObject current = null;

        Token lv_i_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1138:2: ( ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) ) )
            // InternalLC2200.g:1139:2: ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) )
            {
            // InternalLC2200.g:1139:2: ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) )
            // InternalLC2200.g:1140:3: (lv_i_opcode_0_0= RULE_IOP_OFFSET )
            {
            // InternalLC2200.g:1140:3: (lv_i_opcode_0_0= RULE_IOP_OFFSET )
            // InternalLC2200.g:1141:4: lv_i_opcode_0_0= RULE_IOP_OFFSET
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
    // InternalLC2200.g:1160:1: entryRuleIInstructionLabelTrans returns [EObject current=null] : iv_ruleIInstructionLabelTrans= ruleIInstructionLabelTrans EOF ;
    public final EObject entryRuleIInstructionLabelTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstructionLabelTrans = null;


        try {
            // InternalLC2200.g:1160:63: (iv_ruleIInstructionLabelTrans= ruleIInstructionLabelTrans EOF )
            // InternalLC2200.g:1161:2: iv_ruleIInstructionLabelTrans= ruleIInstructionLabelTrans EOF
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
    // InternalLC2200.g:1167:1: ruleIInstructionLabelTrans returns [EObject current=null] : ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) ) ;
    public final EObject ruleIInstructionLabelTrans() throws RecognitionException {
        EObject current = null;

        Token lv_i_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1173:2: ( ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) ) )
            // InternalLC2200.g:1174:2: ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) )
            {
            // InternalLC2200.g:1174:2: ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) )
            // InternalLC2200.g:1175:3: (lv_i_opcode_0_0= RULE_IOP_LABEL )
            {
            // InternalLC2200.g:1175:3: (lv_i_opcode_0_0= RULE_IOP_LABEL )
            // InternalLC2200.g:1176:4: lv_i_opcode_0_0= RULE_IOP_LABEL
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
    // InternalLC2200.g:1195:1: entryRuleJInstructionTrans returns [EObject current=null] : iv_ruleJInstructionTrans= ruleJInstructionTrans EOF ;
    public final EObject entryRuleJInstructionTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJInstructionTrans = null;


        try {
            // InternalLC2200.g:1195:58: (iv_ruleJInstructionTrans= ruleJInstructionTrans EOF )
            // InternalLC2200.g:1196:2: iv_ruleJInstructionTrans= ruleJInstructionTrans EOF
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
    // InternalLC2200.g:1202:1: ruleJInstructionTrans returns [EObject current=null] : ( (lv_j_opcode_0_0= RULE_JOP ) ) ;
    public final EObject ruleJInstructionTrans() throws RecognitionException {
        EObject current = null;

        Token lv_j_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1208:2: ( ( (lv_j_opcode_0_0= RULE_JOP ) ) )
            // InternalLC2200.g:1209:2: ( (lv_j_opcode_0_0= RULE_JOP ) )
            {
            // InternalLC2200.g:1209:2: ( (lv_j_opcode_0_0= RULE_JOP ) )
            // InternalLC2200.g:1210:3: (lv_j_opcode_0_0= RULE_JOP )
            {
            // InternalLC2200.g:1210:3: (lv_j_opcode_0_0= RULE_JOP )
            // InternalLC2200.g:1211:4: lv_j_opcode_0_0= RULE_JOP
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
    // InternalLC2200.g:1230:1: entryRuleWordTrans returns [EObject current=null] : iv_ruleWordTrans= ruleWordTrans EOF ;
    public final EObject entryRuleWordTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordTrans = null;


        try {
            // InternalLC2200.g:1230:50: (iv_ruleWordTrans= ruleWordTrans EOF )
            // InternalLC2200.g:1231:2: iv_ruleWordTrans= ruleWordTrans EOF
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
    // InternalLC2200.g:1237:1: ruleWordTrans returns [EObject current=null] : ( (lv_word_0_0= RULE_WORD ) ) ;
    public final EObject ruleWordTrans() throws RecognitionException {
        EObject current = null;

        Token lv_word_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1243:2: ( ( (lv_word_0_0= RULE_WORD ) ) )
            // InternalLC2200.g:1244:2: ( (lv_word_0_0= RULE_WORD ) )
            {
            // InternalLC2200.g:1244:2: ( (lv_word_0_0= RULE_WORD ) )
            // InternalLC2200.g:1245:3: (lv_word_0_0= RULE_WORD )
            {
            // InternalLC2200.g:1245:3: (lv_word_0_0= RULE_WORD )
            // InternalLC2200.g:1246:4: lv_word_0_0= RULE_WORD
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
    // InternalLC2200.g:1265:1: entryRuleLATrans returns [EObject current=null] : iv_ruleLATrans= ruleLATrans EOF ;
    public final EObject entryRuleLATrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLATrans = null;


        try {
            // InternalLC2200.g:1265:48: (iv_ruleLATrans= ruleLATrans EOF )
            // InternalLC2200.g:1266:2: iv_ruleLATrans= ruleLATrans EOF
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
    // InternalLC2200.g:1272:1: ruleLATrans returns [EObject current=null] : ( (lv_la_0_0= RULE_LA ) ) ;
    public final EObject ruleLATrans() throws RecognitionException {
        EObject current = null;

        Token lv_la_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1278:2: ( ( (lv_la_0_0= RULE_LA ) ) )
            // InternalLC2200.g:1279:2: ( (lv_la_0_0= RULE_LA ) )
            {
            // InternalLC2200.g:1279:2: ( (lv_la_0_0= RULE_LA ) )
            // InternalLC2200.g:1280:3: (lv_la_0_0= RULE_LA )
            {
            // InternalLC2200.g:1280:3: (lv_la_0_0= RULE_LA )
            // InternalLC2200.g:1281:4: lv_la_0_0= RULE_LA
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
    // InternalLC2200.g:1300:1: entryRuleCommentTrans returns [EObject current=null] : iv_ruleCommentTrans= ruleCommentTrans EOF ;
    public final EObject entryRuleCommentTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentTrans = null;


        try {
            // InternalLC2200.g:1300:53: (iv_ruleCommentTrans= ruleCommentTrans EOF )
            // InternalLC2200.g:1301:2: iv_ruleCommentTrans= ruleCommentTrans EOF
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
    // InternalLC2200.g:1307:1: ruleCommentTrans returns [EObject current=null] : ( (lv_comment_0_0= RULE_COMMENT ) ) ;
    public final EObject ruleCommentTrans() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1313:2: ( ( (lv_comment_0_0= RULE_COMMENT ) ) )
            // InternalLC2200.g:1314:2: ( (lv_comment_0_0= RULE_COMMENT ) )
            {
            // InternalLC2200.g:1314:2: ( (lv_comment_0_0= RULE_COMMENT ) )
            // InternalLC2200.g:1315:3: (lv_comment_0_0= RULE_COMMENT )
            {
            // InternalLC2200.g:1315:3: (lv_comment_0_0= RULE_COMMENT )
            // InternalLC2200.g:1316:4: lv_comment_0_0= RULE_COMMENT
            {
            lv_comment_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_2); 

            				newLeafNode(lv_comment_0_0, grammarAccess.getCommentTransAccess().getCommentCOMMENTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCommentTransRule());
            				}
            				setWithLastConsumed(
            					current,
            					"comment",
            					lv_comment_0_0,
            					"org.team38.assembly.LC2200.COMMENT");
            			

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
    // $ANTLR end "ruleCommentTrans"


    // $ANTLR start "entryRuleRegTrans"
    // InternalLC2200.g:1335:1: entryRuleRegTrans returns [EObject current=null] : iv_ruleRegTrans= ruleRegTrans EOF ;
    public final EObject entryRuleRegTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegTrans = null;


        try {
            // InternalLC2200.g:1335:49: (iv_ruleRegTrans= ruleRegTrans EOF )
            // InternalLC2200.g:1336:2: iv_ruleRegTrans= ruleRegTrans EOF
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
    // InternalLC2200.g:1342:1: ruleRegTrans returns [EObject current=null] : ( (lv_reg_0_0= RULE_REG ) ) ;
    public final EObject ruleRegTrans() throws RecognitionException {
        EObject current = null;

        Token lv_reg_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1348:2: ( ( (lv_reg_0_0= RULE_REG ) ) )
            // InternalLC2200.g:1349:2: ( (lv_reg_0_0= RULE_REG ) )
            {
            // InternalLC2200.g:1349:2: ( (lv_reg_0_0= RULE_REG ) )
            // InternalLC2200.g:1350:3: (lv_reg_0_0= RULE_REG )
            {
            // InternalLC2200.g:1350:3: (lv_reg_0_0= RULE_REG )
            // InternalLC2200.g:1351:4: lv_reg_0_0= RULE_REG
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
    // InternalLC2200.g:1370:1: entryRuleLabelBeg returns [EObject current=null] : iv_ruleLabelBeg= ruleLabelBeg EOF ;
    public final EObject entryRuleLabelBeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelBeg = null;


        try {
            // InternalLC2200.g:1370:49: (iv_ruleLabelBeg= ruleLabelBeg EOF )
            // InternalLC2200.g:1371:2: iv_ruleLabelBeg= ruleLabelBeg EOF
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
    // InternalLC2200.g:1377:1: ruleLabelBeg returns [EObject current=null] : ( (lv_label_0_0= RULE_LABEL ) ) ;
    public final EObject ruleLabelBeg() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1383:2: ( ( (lv_label_0_0= RULE_LABEL ) ) )
            // InternalLC2200.g:1384:2: ( (lv_label_0_0= RULE_LABEL ) )
            {
            // InternalLC2200.g:1384:2: ( (lv_label_0_0= RULE_LABEL ) )
            // InternalLC2200.g:1385:3: (lv_label_0_0= RULE_LABEL )
            {
            // InternalLC2200.g:1385:3: (lv_label_0_0= RULE_LABEL )
            // InternalLC2200.g:1386:4: lv_label_0_0= RULE_LABEL
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
    // InternalLC2200.g:1405:1: entryRuleLabelEnd returns [EObject current=null] : iv_ruleLabelEnd= ruleLabelEnd EOF ;
    public final EObject entryRuleLabelEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelEnd = null;


        try {
            // InternalLC2200.g:1405:49: (iv_ruleLabelEnd= ruleLabelEnd EOF )
            // InternalLC2200.g:1406:2: iv_ruleLabelEnd= ruleLabelEnd EOF
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
    // InternalLC2200.g:1412:1: ruleLabelEnd returns [EObject current=null] : ( (lv_label_0_0= RULE_LABEL_IMM ) ) ;
    public final EObject ruleLabelEnd() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1418:2: ( ( (lv_label_0_0= RULE_LABEL_IMM ) ) )
            // InternalLC2200.g:1419:2: ( (lv_label_0_0= RULE_LABEL_IMM ) )
            {
            // InternalLC2200.g:1419:2: ( (lv_label_0_0= RULE_LABEL_IMM ) )
            // InternalLC2200.g:1420:3: (lv_label_0_0= RULE_LABEL_IMM )
            {
            // InternalLC2200.g:1420:3: (lv_label_0_0= RULE_LABEL_IMM )
            // InternalLC2200.g:1421:4: lv_label_0_0= RULE_LABEL_IMM
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000027FC02L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000021F400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000002FFC30L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});

}