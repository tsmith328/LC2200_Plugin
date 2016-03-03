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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_NEWLINE", "RULE_COMMA", "RULE_IMMEDIATE", "RULE_LPAREN", "RULE_RPAREN", "RULE_OOP", "RULE_NOOP", "RULE_ROP", "RULE_IOP_IMM", "RULE_IOP_OFFSET", "RULE_IOP_LABEL", "RULE_JOP", "RULE_WORD", "RULE_COMMENT", "RULE_REG", "RULE_LABEL", "RULE_LABEL_IMM", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_LABEL=20;
    public static final int RULE_IMMEDIATE=7;
    public static final int RULE_NEWLINE=5;
    public static final int RULE_WORD=17;
    public static final int RULE_REG=19;
    public static final int RULE_STRING=24;
    public static final int RULE_ROP=12;
    public static final int RULE_LPAREN=8;
    public static final int RULE_SL_COMMENT=25;
    public static final int RULE_IOP_OFFSET=14;
    public static final int RULE_JOP=16;
    public static final int RULE_OOP=10;
    public static final int RULE_LABEL_IMM=21;
    public static final int EOF=-1;
    public static final int RULE_NOOP=11;
    public static final int RULE_ID=23;
    public static final int RULE_COMMA=6;
    public static final int RULE_WS=26;
    public static final int RULE_COMMENT=18;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_RPAREN=9;
    public static final int RULE_IOP_LABEL=15;
    public static final int RULE_INT=22;
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

                if ( ((LA2_0>=RULE_OOP && LA2_0<=RULE_WORD)||LA2_0==RULE_LABEL) ) {
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
            	        else if ( (LA1_1==RULE_NOOP||LA1_1==RULE_WORD) ) {
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
    // InternalLC2200.g:271:1: ruleDirective returns [EObject current=null] : ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        Token this_ML_COMMENT_3=null;
        Token this_NEWLINE_4=null;
        EObject lv_label_0_0 = null;

        EObject lv_directive_1_1 = null;

        EObject lv_directive_1_2 = null;

        EObject lv_comment_2_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:277:2: ( ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? ) )
            // InternalLC2200.g:278:2: ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? )
            {
            // InternalLC2200.g:278:2: ( ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )? )
            // InternalLC2200.g:279:3: ( (lv_label_0_0= ruleLabelBeg ) )? ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) ) ( (lv_comment_2_0= ruleCommentTrans ) )? (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )?
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

            // InternalLC2200.g:298:3: ( ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) ) )
            // InternalLC2200.g:299:4: ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) )
            {
            // InternalLC2200.g:299:4: ( (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective ) )
            // InternalLC2200.g:300:5: (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective )
            {
            // InternalLC2200.g:300:5: (lv_directive_1_1= ruleNOOPDirective | lv_directive_1_2= ruleWordDirective )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NOOP) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_WORD) ) {
                alt8=2;
            }
            else {
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

            }


            }


            }

            // InternalLC2200.g:335:3: ( (lv_comment_2_0= ruleCommentTrans ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_COMMENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLC2200.g:336:4: (lv_comment_2_0= ruleCommentTrans )
                    {
                    // InternalLC2200.g:336:4: (lv_comment_2_0= ruleCommentTrans )
                    // InternalLC2200.g:337:5: lv_comment_2_0= ruleCommentTrans
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

            // InternalLC2200.g:354:3: (this_ML_COMMENT_3= RULE_ML_COMMENT | this_NEWLINE_4= RULE_NEWLINE )?
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
                    // InternalLC2200.g:355:4: this_ML_COMMENT_3= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_3=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    				newLeafNode(this_ML_COMMENT_3, grammarAccess.getDirectiveAccess().getML_COMMENTTerminalRuleCall_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLC2200.g:360:4: this_NEWLINE_4= RULE_NEWLINE
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
    // InternalLC2200.g:369:1: entryRuleRInstruction returns [EObject current=null] : iv_ruleRInstruction= ruleRInstruction EOF ;
    public final EObject entryRuleRInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRInstruction = null;


        try {
            // InternalLC2200.g:369:53: (iv_ruleRInstruction= ruleRInstruction EOF )
            // InternalLC2200.g:370:2: iv_ruleRInstruction= ruleRInstruction EOF
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
    // InternalLC2200.g:376:1: ruleRInstruction returns [EObject current=null] : ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) ) ;
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
            // InternalLC2200.g:382:2: ( ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) ) )
            // InternalLC2200.g:383:2: ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) )
            {
            // InternalLC2200.g:383:2: ( ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) ) )
            // InternalLC2200.g:384:3: ( (lv_r_opcode_0_0= ruleRInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_reg3_5_0= ruleRegTrans ) )
            {
            // InternalLC2200.g:384:3: ( (lv_r_opcode_0_0= ruleRInstructionTrans ) )
            // InternalLC2200.g:385:4: (lv_r_opcode_0_0= ruleRInstructionTrans )
            {
            // InternalLC2200.g:385:4: (lv_r_opcode_0_0= ruleRInstructionTrans )
            // InternalLC2200.g:386:5: lv_r_opcode_0_0= ruleRInstructionTrans
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

            // InternalLC2200.g:403:3: ( (lv_reg1_1_0= ruleRegTrans ) )
            // InternalLC2200.g:404:4: (lv_reg1_1_0= ruleRegTrans )
            {
            // InternalLC2200.g:404:4: (lv_reg1_1_0= ruleRegTrans )
            // InternalLC2200.g:405:5: lv_reg1_1_0= ruleRegTrans
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
            		
            // InternalLC2200.g:426:3: ( (lv_reg2_3_0= ruleRegTrans ) )
            // InternalLC2200.g:427:4: (lv_reg2_3_0= ruleRegTrans )
            {
            // InternalLC2200.g:427:4: (lv_reg2_3_0= ruleRegTrans )
            // InternalLC2200.g:428:5: lv_reg2_3_0= ruleRegTrans
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
            		
            // InternalLC2200.g:449:3: ( (lv_reg3_5_0= ruleRegTrans ) )
            // InternalLC2200.g:450:4: (lv_reg3_5_0= ruleRegTrans )
            {
            // InternalLC2200.g:450:4: (lv_reg3_5_0= ruleRegTrans )
            // InternalLC2200.g:451:5: lv_reg3_5_0= ruleRegTrans
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
    // InternalLC2200.g:472:1: entryRuleIInstruction returns [EObject current=null] : iv_ruleIInstruction= ruleIInstruction EOF ;
    public final EObject entryRuleIInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstruction = null;


        try {
            // InternalLC2200.g:472:53: (iv_ruleIInstruction= ruleIInstruction EOF )
            // InternalLC2200.g:473:2: iv_ruleIInstruction= ruleIInstruction EOF
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
    // InternalLC2200.g:479:1: ruleIInstruction returns [EObject current=null] : ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) ) ;
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
            // InternalLC2200.g:485:2: ( ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) ) )
            // InternalLC2200.g:486:2: ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) )
            {
            // InternalLC2200.g:486:2: ( ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) ) | ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN ) | ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) ) )
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
                    // InternalLC2200.g:487:3: ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) )
                    {
                    // InternalLC2200.g:487:3: ( ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) ) )
                    // InternalLC2200.g:488:4: ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) this_COMMA_4= RULE_COMMA ( (lv_imm_5_0= RULE_IMMEDIATE ) )
                    {
                    // InternalLC2200.g:488:4: ( (lv_i_opcode_0_0= ruleIInstructionImmTrans ) )
                    // InternalLC2200.g:489:5: (lv_i_opcode_0_0= ruleIInstructionImmTrans )
                    {
                    // InternalLC2200.g:489:5: (lv_i_opcode_0_0= ruleIInstructionImmTrans )
                    // InternalLC2200.g:490:6: lv_i_opcode_0_0= ruleIInstructionImmTrans
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

                    // InternalLC2200.g:507:4: ( (lv_reg1_1_0= ruleRegTrans ) )
                    // InternalLC2200.g:508:5: (lv_reg1_1_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:508:5: (lv_reg1_1_0= ruleRegTrans )
                    // InternalLC2200.g:509:6: lv_reg1_1_0= ruleRegTrans
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
                    			
                    // InternalLC2200.g:530:4: ( (lv_reg2_3_0= ruleRegTrans ) )
                    // InternalLC2200.g:531:5: (lv_reg2_3_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:531:5: (lv_reg2_3_0= ruleRegTrans )
                    // InternalLC2200.g:532:6: lv_reg2_3_0= ruleRegTrans
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
                    			
                    // InternalLC2200.g:553:4: ( (lv_imm_5_0= RULE_IMMEDIATE ) )
                    // InternalLC2200.g:554:5: (lv_imm_5_0= RULE_IMMEDIATE )
                    {
                    // InternalLC2200.g:554:5: (lv_imm_5_0= RULE_IMMEDIATE )
                    // InternalLC2200.g:555:6: lv_imm_5_0= RULE_IMMEDIATE
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
                    // InternalLC2200.g:573:3: ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN )
                    {
                    // InternalLC2200.g:573:3: ( ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN )
                    // InternalLC2200.g:574:4: ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) ) ( (lv_reg1_7_0= ruleRegTrans ) ) this_COMMA_8= RULE_COMMA ( (lv_imm_9_0= RULE_IMMEDIATE ) ) this_LPAREN_10= RULE_LPAREN ( (lv_reg2_11_0= ruleRegTrans ) ) this_RPAREN_12= RULE_RPAREN
                    {
                    // InternalLC2200.g:574:4: ( (lv_i_opcode_6_0= ruleIInstructionOffsetTrans ) )
                    // InternalLC2200.g:575:5: (lv_i_opcode_6_0= ruleIInstructionOffsetTrans )
                    {
                    // InternalLC2200.g:575:5: (lv_i_opcode_6_0= ruleIInstructionOffsetTrans )
                    // InternalLC2200.g:576:6: lv_i_opcode_6_0= ruleIInstructionOffsetTrans
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

                    // InternalLC2200.g:593:4: ( (lv_reg1_7_0= ruleRegTrans ) )
                    // InternalLC2200.g:594:5: (lv_reg1_7_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:594:5: (lv_reg1_7_0= ruleRegTrans )
                    // InternalLC2200.g:595:6: lv_reg1_7_0= ruleRegTrans
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
                    			
                    // InternalLC2200.g:616:4: ( (lv_imm_9_0= RULE_IMMEDIATE ) )
                    // InternalLC2200.g:617:5: (lv_imm_9_0= RULE_IMMEDIATE )
                    {
                    // InternalLC2200.g:617:5: (lv_imm_9_0= RULE_IMMEDIATE )
                    // InternalLC2200.g:618:6: lv_imm_9_0= RULE_IMMEDIATE
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
                    			
                    // InternalLC2200.g:638:4: ( (lv_reg2_11_0= ruleRegTrans ) )
                    // InternalLC2200.g:639:5: (lv_reg2_11_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:639:5: (lv_reg2_11_0= ruleRegTrans )
                    // InternalLC2200.g:640:6: lv_reg2_11_0= ruleRegTrans
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
                    // InternalLC2200.g:663:3: ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) )
                    {
                    // InternalLC2200.g:663:3: ( ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) ) )
                    // InternalLC2200.g:664:4: ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) ) ( (lv_reg1_14_0= ruleRegTrans ) ) this_COMMA_15= RULE_COMMA ( (lv_reg2_16_0= ruleRegTrans ) ) this_COMMA_17= RULE_COMMA ( (lv_label_18_0= ruleLabelEnd ) )
                    {
                    // InternalLC2200.g:664:4: ( (lv_i_opcode_13_0= ruleIInstructionLabelTrans ) )
                    // InternalLC2200.g:665:5: (lv_i_opcode_13_0= ruleIInstructionLabelTrans )
                    {
                    // InternalLC2200.g:665:5: (lv_i_opcode_13_0= ruleIInstructionLabelTrans )
                    // InternalLC2200.g:666:6: lv_i_opcode_13_0= ruleIInstructionLabelTrans
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

                    // InternalLC2200.g:683:4: ( (lv_reg1_14_0= ruleRegTrans ) )
                    // InternalLC2200.g:684:5: (lv_reg1_14_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:684:5: (lv_reg1_14_0= ruleRegTrans )
                    // InternalLC2200.g:685:6: lv_reg1_14_0= ruleRegTrans
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
                    			
                    // InternalLC2200.g:706:4: ( (lv_reg2_16_0= ruleRegTrans ) )
                    // InternalLC2200.g:707:5: (lv_reg2_16_0= ruleRegTrans )
                    {
                    // InternalLC2200.g:707:5: (lv_reg2_16_0= ruleRegTrans )
                    // InternalLC2200.g:708:6: lv_reg2_16_0= ruleRegTrans
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
                    			
                    // InternalLC2200.g:729:4: ( (lv_label_18_0= ruleLabelEnd ) )
                    // InternalLC2200.g:730:5: (lv_label_18_0= ruleLabelEnd )
                    {
                    // InternalLC2200.g:730:5: (lv_label_18_0= ruleLabelEnd )
                    // InternalLC2200.g:731:6: lv_label_18_0= ruleLabelEnd
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
    // InternalLC2200.g:753:1: entryRuleJInstruction returns [EObject current=null] : iv_ruleJInstruction= ruleJInstruction EOF ;
    public final EObject entryRuleJInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJInstruction = null;


        try {
            // InternalLC2200.g:753:53: (iv_ruleJInstruction= ruleJInstruction EOF )
            // InternalLC2200.g:754:2: iv_ruleJInstruction= ruleJInstruction EOF
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
    // InternalLC2200.g:760:1: ruleJInstruction returns [EObject current=null] : ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) ) ;
    public final EObject ruleJInstruction() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_2=null;
        EObject lv_j_opcode_0_0 = null;

        EObject lv_reg1_1_0 = null;

        EObject lv_reg2_3_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:766:2: ( ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) ) )
            // InternalLC2200.g:767:2: ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) )
            {
            // InternalLC2200.g:767:2: ( ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) ) )
            // InternalLC2200.g:768:3: ( (lv_j_opcode_0_0= ruleJInstructionTrans ) ) ( (lv_reg1_1_0= ruleRegTrans ) ) this_COMMA_2= RULE_COMMA ( (lv_reg2_3_0= ruleRegTrans ) )
            {
            // InternalLC2200.g:768:3: ( (lv_j_opcode_0_0= ruleJInstructionTrans ) )
            // InternalLC2200.g:769:4: (lv_j_opcode_0_0= ruleJInstructionTrans )
            {
            // InternalLC2200.g:769:4: (lv_j_opcode_0_0= ruleJInstructionTrans )
            // InternalLC2200.g:770:5: lv_j_opcode_0_0= ruleJInstructionTrans
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

            // InternalLC2200.g:787:3: ( (lv_reg1_1_0= ruleRegTrans ) )
            // InternalLC2200.g:788:4: (lv_reg1_1_0= ruleRegTrans )
            {
            // InternalLC2200.g:788:4: (lv_reg1_1_0= ruleRegTrans )
            // InternalLC2200.g:789:5: lv_reg1_1_0= ruleRegTrans
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
            		
            // InternalLC2200.g:810:3: ( (lv_reg2_3_0= ruleRegTrans ) )
            // InternalLC2200.g:811:4: (lv_reg2_3_0= ruleRegTrans )
            {
            // InternalLC2200.g:811:4: (lv_reg2_3_0= ruleRegTrans )
            // InternalLC2200.g:812:5: lv_reg2_3_0= ruleRegTrans
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
    // InternalLC2200.g:833:1: entryRuleOInstruction returns [EObject current=null] : iv_ruleOInstruction= ruleOInstruction EOF ;
    public final EObject entryRuleOInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOInstruction = null;


        try {
            // InternalLC2200.g:833:53: (iv_ruleOInstruction= ruleOInstruction EOF )
            // InternalLC2200.g:834:2: iv_ruleOInstruction= ruleOInstruction EOF
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
    // InternalLC2200.g:840:1: ruleOInstruction returns [EObject current=null] : ( (lv_o_opcode_0_0= RULE_OOP ) ) ;
    public final EObject ruleOInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_o_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:846:2: ( ( (lv_o_opcode_0_0= RULE_OOP ) ) )
            // InternalLC2200.g:847:2: ( (lv_o_opcode_0_0= RULE_OOP ) )
            {
            // InternalLC2200.g:847:2: ( (lv_o_opcode_0_0= RULE_OOP ) )
            // InternalLC2200.g:848:3: (lv_o_opcode_0_0= RULE_OOP )
            {
            // InternalLC2200.g:848:3: (lv_o_opcode_0_0= RULE_OOP )
            // InternalLC2200.g:849:4: lv_o_opcode_0_0= RULE_OOP
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
    // InternalLC2200.g:868:1: entryRuleNOOPDirective returns [EObject current=null] : iv_ruleNOOPDirective= ruleNOOPDirective EOF ;
    public final EObject entryRuleNOOPDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOOPDirective = null;


        try {
            // InternalLC2200.g:868:54: (iv_ruleNOOPDirective= ruleNOOPDirective EOF )
            // InternalLC2200.g:869:2: iv_ruleNOOPDirective= ruleNOOPDirective EOF
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
    // InternalLC2200.g:875:1: ruleNOOPDirective returns [EObject current=null] : ( (lv_n_dir_0_0= RULE_NOOP ) ) ;
    public final EObject ruleNOOPDirective() throws RecognitionException {
        EObject current = null;

        Token lv_n_dir_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:881:2: ( ( (lv_n_dir_0_0= RULE_NOOP ) ) )
            // InternalLC2200.g:882:2: ( (lv_n_dir_0_0= RULE_NOOP ) )
            {
            // InternalLC2200.g:882:2: ( (lv_n_dir_0_0= RULE_NOOP ) )
            // InternalLC2200.g:883:3: (lv_n_dir_0_0= RULE_NOOP )
            {
            // InternalLC2200.g:883:3: (lv_n_dir_0_0= RULE_NOOP )
            // InternalLC2200.g:884:4: lv_n_dir_0_0= RULE_NOOP
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
    // InternalLC2200.g:903:1: entryRuleWordDirective returns [EObject current=null] : iv_ruleWordDirective= ruleWordDirective EOF ;
    public final EObject entryRuleWordDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordDirective = null;


        try {
            // InternalLC2200.g:903:54: (iv_ruleWordDirective= ruleWordDirective EOF )
            // InternalLC2200.g:904:2: iv_ruleWordDirective= ruleWordDirective EOF
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
    // InternalLC2200.g:910:1: ruleWordDirective returns [EObject current=null] : ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) ) ;
    public final EObject ruleWordDirective() throws RecognitionException {
        EObject current = null;

        Token lv_imm_1_0=null;
        EObject lv_w_dir_0_0 = null;



        	enterRule();

        try {
            // InternalLC2200.g:916:2: ( ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) ) )
            // InternalLC2200.g:917:2: ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) )
            {
            // InternalLC2200.g:917:2: ( ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) ) )
            // InternalLC2200.g:918:3: ( (lv_w_dir_0_0= ruleWordTrans ) ) ( (lv_imm_1_0= RULE_IMMEDIATE ) )
            {
            // InternalLC2200.g:918:3: ( (lv_w_dir_0_0= ruleWordTrans ) )
            // InternalLC2200.g:919:4: (lv_w_dir_0_0= ruleWordTrans )
            {
            // InternalLC2200.g:919:4: (lv_w_dir_0_0= ruleWordTrans )
            // InternalLC2200.g:920:5: lv_w_dir_0_0= ruleWordTrans
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

            // InternalLC2200.g:937:3: ( (lv_imm_1_0= RULE_IMMEDIATE ) )
            // InternalLC2200.g:938:4: (lv_imm_1_0= RULE_IMMEDIATE )
            {
            // InternalLC2200.g:938:4: (lv_imm_1_0= RULE_IMMEDIATE )
            // InternalLC2200.g:939:5: lv_imm_1_0= RULE_IMMEDIATE
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


    // $ANTLR start "entryRuleRInstructionTrans"
    // InternalLC2200.g:959:1: entryRuleRInstructionTrans returns [EObject current=null] : iv_ruleRInstructionTrans= ruleRInstructionTrans EOF ;
    public final EObject entryRuleRInstructionTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRInstructionTrans = null;


        try {
            // InternalLC2200.g:959:58: (iv_ruleRInstructionTrans= ruleRInstructionTrans EOF )
            // InternalLC2200.g:960:2: iv_ruleRInstructionTrans= ruleRInstructionTrans EOF
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
    // InternalLC2200.g:966:1: ruleRInstructionTrans returns [EObject current=null] : ( (lv_r_opcode_0_0= RULE_ROP ) ) ;
    public final EObject ruleRInstructionTrans() throws RecognitionException {
        EObject current = null;

        Token lv_r_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:972:2: ( ( (lv_r_opcode_0_0= RULE_ROP ) ) )
            // InternalLC2200.g:973:2: ( (lv_r_opcode_0_0= RULE_ROP ) )
            {
            // InternalLC2200.g:973:2: ( (lv_r_opcode_0_0= RULE_ROP ) )
            // InternalLC2200.g:974:3: (lv_r_opcode_0_0= RULE_ROP )
            {
            // InternalLC2200.g:974:3: (lv_r_opcode_0_0= RULE_ROP )
            // InternalLC2200.g:975:4: lv_r_opcode_0_0= RULE_ROP
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
    // InternalLC2200.g:994:1: entryRuleIInstructionImmTrans returns [EObject current=null] : iv_ruleIInstructionImmTrans= ruleIInstructionImmTrans EOF ;
    public final EObject entryRuleIInstructionImmTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstructionImmTrans = null;


        try {
            // InternalLC2200.g:994:61: (iv_ruleIInstructionImmTrans= ruleIInstructionImmTrans EOF )
            // InternalLC2200.g:995:2: iv_ruleIInstructionImmTrans= ruleIInstructionImmTrans EOF
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
    // InternalLC2200.g:1001:1: ruleIInstructionImmTrans returns [EObject current=null] : ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) ;
    public final EObject ruleIInstructionImmTrans() throws RecognitionException {
        EObject current = null;

        Token lv_i_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1007:2: ( ( (lv_i_opcode_0_0= RULE_IOP_IMM ) ) )
            // InternalLC2200.g:1008:2: ( (lv_i_opcode_0_0= RULE_IOP_IMM ) )
            {
            // InternalLC2200.g:1008:2: ( (lv_i_opcode_0_0= RULE_IOP_IMM ) )
            // InternalLC2200.g:1009:3: (lv_i_opcode_0_0= RULE_IOP_IMM )
            {
            // InternalLC2200.g:1009:3: (lv_i_opcode_0_0= RULE_IOP_IMM )
            // InternalLC2200.g:1010:4: lv_i_opcode_0_0= RULE_IOP_IMM
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
    // InternalLC2200.g:1029:1: entryRuleIInstructionOffsetTrans returns [EObject current=null] : iv_ruleIInstructionOffsetTrans= ruleIInstructionOffsetTrans EOF ;
    public final EObject entryRuleIInstructionOffsetTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstructionOffsetTrans = null;


        try {
            // InternalLC2200.g:1029:64: (iv_ruleIInstructionOffsetTrans= ruleIInstructionOffsetTrans EOF )
            // InternalLC2200.g:1030:2: iv_ruleIInstructionOffsetTrans= ruleIInstructionOffsetTrans EOF
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
    // InternalLC2200.g:1036:1: ruleIInstructionOffsetTrans returns [EObject current=null] : ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) ) ;
    public final EObject ruleIInstructionOffsetTrans() throws RecognitionException {
        EObject current = null;

        Token lv_i_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1042:2: ( ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) ) )
            // InternalLC2200.g:1043:2: ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) )
            {
            // InternalLC2200.g:1043:2: ( (lv_i_opcode_0_0= RULE_IOP_OFFSET ) )
            // InternalLC2200.g:1044:3: (lv_i_opcode_0_0= RULE_IOP_OFFSET )
            {
            // InternalLC2200.g:1044:3: (lv_i_opcode_0_0= RULE_IOP_OFFSET )
            // InternalLC2200.g:1045:4: lv_i_opcode_0_0= RULE_IOP_OFFSET
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
    // InternalLC2200.g:1064:1: entryRuleIInstructionLabelTrans returns [EObject current=null] : iv_ruleIInstructionLabelTrans= ruleIInstructionLabelTrans EOF ;
    public final EObject entryRuleIInstructionLabelTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIInstructionLabelTrans = null;


        try {
            // InternalLC2200.g:1064:63: (iv_ruleIInstructionLabelTrans= ruleIInstructionLabelTrans EOF )
            // InternalLC2200.g:1065:2: iv_ruleIInstructionLabelTrans= ruleIInstructionLabelTrans EOF
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
    // InternalLC2200.g:1071:1: ruleIInstructionLabelTrans returns [EObject current=null] : ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) ) ;
    public final EObject ruleIInstructionLabelTrans() throws RecognitionException {
        EObject current = null;

        Token lv_i_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1077:2: ( ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) ) )
            // InternalLC2200.g:1078:2: ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) )
            {
            // InternalLC2200.g:1078:2: ( (lv_i_opcode_0_0= RULE_IOP_LABEL ) )
            // InternalLC2200.g:1079:3: (lv_i_opcode_0_0= RULE_IOP_LABEL )
            {
            // InternalLC2200.g:1079:3: (lv_i_opcode_0_0= RULE_IOP_LABEL )
            // InternalLC2200.g:1080:4: lv_i_opcode_0_0= RULE_IOP_LABEL
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
    // InternalLC2200.g:1099:1: entryRuleJInstructionTrans returns [EObject current=null] : iv_ruleJInstructionTrans= ruleJInstructionTrans EOF ;
    public final EObject entryRuleJInstructionTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJInstructionTrans = null;


        try {
            // InternalLC2200.g:1099:58: (iv_ruleJInstructionTrans= ruleJInstructionTrans EOF )
            // InternalLC2200.g:1100:2: iv_ruleJInstructionTrans= ruleJInstructionTrans EOF
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
    // InternalLC2200.g:1106:1: ruleJInstructionTrans returns [EObject current=null] : ( (lv_j_opcode_0_0= RULE_JOP ) ) ;
    public final EObject ruleJInstructionTrans() throws RecognitionException {
        EObject current = null;

        Token lv_j_opcode_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1112:2: ( ( (lv_j_opcode_0_0= RULE_JOP ) ) )
            // InternalLC2200.g:1113:2: ( (lv_j_opcode_0_0= RULE_JOP ) )
            {
            // InternalLC2200.g:1113:2: ( (lv_j_opcode_0_0= RULE_JOP ) )
            // InternalLC2200.g:1114:3: (lv_j_opcode_0_0= RULE_JOP )
            {
            // InternalLC2200.g:1114:3: (lv_j_opcode_0_0= RULE_JOP )
            // InternalLC2200.g:1115:4: lv_j_opcode_0_0= RULE_JOP
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
    // InternalLC2200.g:1134:1: entryRuleWordTrans returns [EObject current=null] : iv_ruleWordTrans= ruleWordTrans EOF ;
    public final EObject entryRuleWordTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordTrans = null;


        try {
            // InternalLC2200.g:1134:50: (iv_ruleWordTrans= ruleWordTrans EOF )
            // InternalLC2200.g:1135:2: iv_ruleWordTrans= ruleWordTrans EOF
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
    // InternalLC2200.g:1141:1: ruleWordTrans returns [EObject current=null] : ( (lv_word_0_0= RULE_WORD ) ) ;
    public final EObject ruleWordTrans() throws RecognitionException {
        EObject current = null;

        Token lv_word_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1147:2: ( ( (lv_word_0_0= RULE_WORD ) ) )
            // InternalLC2200.g:1148:2: ( (lv_word_0_0= RULE_WORD ) )
            {
            // InternalLC2200.g:1148:2: ( (lv_word_0_0= RULE_WORD ) )
            // InternalLC2200.g:1149:3: (lv_word_0_0= RULE_WORD )
            {
            // InternalLC2200.g:1149:3: (lv_word_0_0= RULE_WORD )
            // InternalLC2200.g:1150:4: lv_word_0_0= RULE_WORD
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


    // $ANTLR start "entryRuleCommentTrans"
    // InternalLC2200.g:1169:1: entryRuleCommentTrans returns [EObject current=null] : iv_ruleCommentTrans= ruleCommentTrans EOF ;
    public final EObject entryRuleCommentTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentTrans = null;


        try {
            // InternalLC2200.g:1169:53: (iv_ruleCommentTrans= ruleCommentTrans EOF )
            // InternalLC2200.g:1170:2: iv_ruleCommentTrans= ruleCommentTrans EOF
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
    // InternalLC2200.g:1176:1: ruleCommentTrans returns [EObject current=null] : ( (lv_comment_0_0= RULE_COMMENT ) ) ;
    public final EObject ruleCommentTrans() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1182:2: ( ( (lv_comment_0_0= RULE_COMMENT ) ) )
            // InternalLC2200.g:1183:2: ( (lv_comment_0_0= RULE_COMMENT ) )
            {
            // InternalLC2200.g:1183:2: ( (lv_comment_0_0= RULE_COMMENT ) )
            // InternalLC2200.g:1184:3: (lv_comment_0_0= RULE_COMMENT )
            {
            // InternalLC2200.g:1184:3: (lv_comment_0_0= RULE_COMMENT )
            // InternalLC2200.g:1185:4: lv_comment_0_0= RULE_COMMENT
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
    // InternalLC2200.g:1204:1: entryRuleRegTrans returns [EObject current=null] : iv_ruleRegTrans= ruleRegTrans EOF ;
    public final EObject entryRuleRegTrans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegTrans = null;


        try {
            // InternalLC2200.g:1204:49: (iv_ruleRegTrans= ruleRegTrans EOF )
            // InternalLC2200.g:1205:2: iv_ruleRegTrans= ruleRegTrans EOF
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
    // InternalLC2200.g:1211:1: ruleRegTrans returns [EObject current=null] : ( (lv_reg_0_0= RULE_REG ) ) ;
    public final EObject ruleRegTrans() throws RecognitionException {
        EObject current = null;

        Token lv_reg_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1217:2: ( ( (lv_reg_0_0= RULE_REG ) ) )
            // InternalLC2200.g:1218:2: ( (lv_reg_0_0= RULE_REG ) )
            {
            // InternalLC2200.g:1218:2: ( (lv_reg_0_0= RULE_REG ) )
            // InternalLC2200.g:1219:3: (lv_reg_0_0= RULE_REG )
            {
            // InternalLC2200.g:1219:3: (lv_reg_0_0= RULE_REG )
            // InternalLC2200.g:1220:4: lv_reg_0_0= RULE_REG
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
    // InternalLC2200.g:1239:1: entryRuleLabelBeg returns [EObject current=null] : iv_ruleLabelBeg= ruleLabelBeg EOF ;
    public final EObject entryRuleLabelBeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelBeg = null;


        try {
            // InternalLC2200.g:1239:49: (iv_ruleLabelBeg= ruleLabelBeg EOF )
            // InternalLC2200.g:1240:2: iv_ruleLabelBeg= ruleLabelBeg EOF
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
    // InternalLC2200.g:1246:1: ruleLabelBeg returns [EObject current=null] : ( (lv_label_0_0= RULE_LABEL ) ) ;
    public final EObject ruleLabelBeg() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1252:2: ( ( (lv_label_0_0= RULE_LABEL ) ) )
            // InternalLC2200.g:1253:2: ( (lv_label_0_0= RULE_LABEL ) )
            {
            // InternalLC2200.g:1253:2: ( (lv_label_0_0= RULE_LABEL ) )
            // InternalLC2200.g:1254:3: (lv_label_0_0= RULE_LABEL )
            {
            // InternalLC2200.g:1254:3: (lv_label_0_0= RULE_LABEL )
            // InternalLC2200.g:1255:4: lv_label_0_0= RULE_LABEL
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
    // InternalLC2200.g:1274:1: entryRuleLabelEnd returns [EObject current=null] : iv_ruleLabelEnd= ruleLabelEnd EOF ;
    public final EObject entryRuleLabelEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelEnd = null;


        try {
            // InternalLC2200.g:1274:49: (iv_ruleLabelEnd= ruleLabelEnd EOF )
            // InternalLC2200.g:1275:2: iv_ruleLabelEnd= ruleLabelEnd EOF
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
    // InternalLC2200.g:1281:1: ruleLabelEnd returns [EObject current=null] : ( (lv_label_0_0= RULE_LABEL_IMM ) ) ;
    public final EObject ruleLabelEnd() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;


        	enterRule();

        try {
            // InternalLC2200.g:1287:2: ( ( (lv_label_0_0= RULE_LABEL_IMM ) ) )
            // InternalLC2200.g:1288:2: ( (lv_label_0_0= RULE_LABEL_IMM ) )
            {
            // InternalLC2200.g:1288:2: ( (lv_label_0_0= RULE_LABEL_IMM ) )
            // InternalLC2200.g:1289:3: (lv_label_0_0= RULE_LABEL_IMM )
            {
            // InternalLC2200.g:1289:3: (lv_label_0_0= RULE_LABEL_IMM )
            // InternalLC2200.g:1290:4: lv_label_0_0= RULE_LABEL_IMM
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000013FC02L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000011F400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000017FC30L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}