package org.team38.assembly.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLC2200Lexer extends Lexer {
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

    public InternalLC2200Lexer() {;} 
    public InternalLC2200Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLC2200Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLC2200.g"; }

    // $ANTLR start "RULE_NOOP"
    public final void mRULE_NOOP() throws RecognitionException {
        try {
            int _type = RULE_NOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:681:11: ( 'noop' )
            // InternalLC2200.g:681:13: 'noop'
            {
            match("noop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOOP"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:683:11: ( '.word' )
            // InternalLC2200.g:683:13: '.word'
            {
            match(".word"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_OOP"
    public final void mRULE_OOP() throws RecognitionException {
        try {
            int _type = RULE_OOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:685:10: ( ( 'halt' | 'ei' | 'di' | 'reti' ) )
            // InternalLC2200.g:685:12: ( 'halt' | 'ei' | 'di' | 'reti' )
            {
            // InternalLC2200.g:685:12: ( 'halt' | 'ei' | 'di' | 'reti' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'h':
                {
                alt1=1;
                }
                break;
            case 'e':
                {
                alt1=2;
                }
                break;
            case 'd':
                {
                alt1=3;
                }
                break;
            case 'r':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLC2200.g:685:13: 'halt'
                    {
                    match("halt"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:685:20: 'ei'
                    {
                    match("ei"); 


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:685:25: 'di'
                    {
                    match("di"); 


                    }
                    break;
                case 4 :
                    // InternalLC2200.g:685:30: 'reti'
                    {
                    match("reti"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OOP"

    // $ANTLR start "RULE_JOP"
    public final void mRULE_JOP() throws RecognitionException {
        try {
            int _type = RULE_JOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:687:10: ( 'jalr' )
            // InternalLC2200.g:687:12: 'jalr'
            {
            match("jalr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JOP"

    // $ANTLR start "RULE_IOP_IMM"
    public final void mRULE_IOP_IMM() throws RecognitionException {
        try {
            int _type = RULE_IOP_IMM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:689:14: ( 'addi' )
            // InternalLC2200.g:689:16: 'addi'
            {
            match("addi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IOP_IMM"

    // $ANTLR start "RULE_IOP_OFFSET"
    public final void mRULE_IOP_OFFSET() throws RecognitionException {
        try {
            int _type = RULE_IOP_OFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:691:17: ( ( 'lw' | 'sw' ) )
            // InternalLC2200.g:691:19: ( 'lw' | 'sw' )
            {
            // InternalLC2200.g:691:19: ( 'lw' | 'sw' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='l') ) {
                alt2=1;
            }
            else if ( (LA2_0=='s') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLC2200.g:691:20: 'lw'
                    {
                    match("lw"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:691:25: 'sw'
                    {
                    match("sw"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IOP_OFFSET"

    // $ANTLR start "RULE_IOP_LABEL"
    public final void mRULE_IOP_LABEL() throws RecognitionException {
        try {
            int _type = RULE_IOP_LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:693:16: ( 'beq' )
            // InternalLC2200.g:693:18: 'beq'
            {
            match("beq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IOP_LABEL"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:695:13: ( '(' )
            // InternalLC2200.g:695:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:697:13: ( ')' )
            // InternalLC2200.g:697:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:699:12: ( ',' )
            // InternalLC2200.g:699:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:701:14: ( ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLC2200.g:701:16: ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match(';'); 
            // InternalLC2200.g:701:20: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLC2200.g:701:20: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalLC2200.g:701:36: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLC2200.g:701:37: ( '\\r' )? '\\n'
                    {
                    // InternalLC2200.g:701:37: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalLC2200.g:701:37: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:703:14: ( '\\n' )
            // InternalLC2200.g:703:16: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_ROP"
    public final void mRULE_ROP() throws RecognitionException {
        try {
            int _type = RULE_ROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:705:10: ( ( 'add' | 'nand' ) )
            // InternalLC2200.g:705:12: ( 'add' | 'nand' )
            {
            // InternalLC2200.g:705:12: ( 'add' | 'nand' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='a') ) {
                alt6=1;
            }
            else if ( (LA6_0=='n') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLC2200.g:705:13: 'add'
                    {
                    match("add"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:705:19: 'nand'
                    {
                    match("nand"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROP"

    // $ANTLR start "RULE_REG"
    public final void mRULE_REG() throws RecognitionException {
        try {
            int _type = RULE_REG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:707:10: ( ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$a3' | '$a4' | '$s0' | '$s1' | '$s2' | '$s3' | '$k0' | '$sp' | '$fp' | '$ra' ) )
            // InternalLC2200.g:707:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$a3' | '$a4' | '$s0' | '$s1' | '$s2' | '$s3' | '$k0' | '$sp' | '$fp' | '$ra' )
            {
            // InternalLC2200.g:707:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$a3' | '$a4' | '$s0' | '$s1' | '$s2' | '$s3' | '$k0' | '$sp' | '$fp' | '$ra' )
            int alt7=16;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalLC2200.g:707:13: '$zero'
                    {
                    match("$zero"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:707:21: '$at'
                    {
                    match("$at"); 


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:707:27: '$v0'
                    {
                    match("$v0"); 


                    }
                    break;
                case 4 :
                    // InternalLC2200.g:707:33: '$a0'
                    {
                    match("$a0"); 


                    }
                    break;
                case 5 :
                    // InternalLC2200.g:707:39: '$a1'
                    {
                    match("$a1"); 


                    }
                    break;
                case 6 :
                    // InternalLC2200.g:707:45: '$a2'
                    {
                    match("$a2"); 


                    }
                    break;
                case 7 :
                    // InternalLC2200.g:707:51: '$a3'
                    {
                    match("$a3"); 


                    }
                    break;
                case 8 :
                    // InternalLC2200.g:707:57: '$a4'
                    {
                    match("$a4"); 


                    }
                    break;
                case 9 :
                    // InternalLC2200.g:707:63: '$s0'
                    {
                    match("$s0"); 


                    }
                    break;
                case 10 :
                    // InternalLC2200.g:707:69: '$s1'
                    {
                    match("$s1"); 


                    }
                    break;
                case 11 :
                    // InternalLC2200.g:707:75: '$s2'
                    {
                    match("$s2"); 


                    }
                    break;
                case 12 :
                    // InternalLC2200.g:707:81: '$s3'
                    {
                    match("$s3"); 


                    }
                    break;
                case 13 :
                    // InternalLC2200.g:707:87: '$k0'
                    {
                    match("$k0"); 


                    }
                    break;
                case 14 :
                    // InternalLC2200.g:707:93: '$sp'
                    {
                    match("$sp"); 


                    }
                    break;
                case 15 :
                    // InternalLC2200.g:707:99: '$fp'
                    {
                    match("$fp"); 


                    }
                    break;
                case 16 :
                    // InternalLC2200.g:707:105: '$ra'
                    {
                    match("$ra"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REG"

    // $ANTLR start "RULE_IMMEDIATE"
    public final void mRULE_IMMEDIATE() throws RecognitionException {
        try {
            int _type = RULE_IMMEDIATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:709:16: ( ( '0x' )? RULE_INT )
            // InternalLC2200.g:709:18: ( '0x' )? RULE_INT
            {
            // InternalLC2200.g:709:18: ( '0x' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='0') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='x') ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalLC2200.g:709:18: '0x'
                    {
                    match("0x"); 


                    }
                    break;

            }

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMMEDIATE"

    // $ANTLR start "RULE_LABEL_IMM"
    public final void mRULE_LABEL_IMM() throws RecognitionException {
        try {
            int _type = RULE_LABEL_IMM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:711:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLC2200.g:711:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLC2200.g:711:42: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLC2200.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LABEL_IMM"

    // $ANTLR start "RULE_LABEL"
    public final void mRULE_LABEL() throws RecognitionException {
        try {
            int _type = RULE_LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:713:12: ( RULE_LABEL_IMM ':' )
            // InternalLC2200.g:713:14: RULE_LABEL_IMM ':'
            {
            mRULE_LABEL_IMM(); 
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LABEL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:715:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLC2200.g:715:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLC2200.g:715:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLC2200.g:715:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLC2200.g:715:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLC2200.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalLC2200.g:717:19: ( ( '0' .. '9' )+ )
            // InternalLC2200.g:717:21: ( '0' .. '9' )+
            {
            // InternalLC2200.g:717:21: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLC2200.g:717:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:719:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLC2200.g:719:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLC2200.g:719:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalLC2200.g:719:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLC2200.g:719:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalLC2200.g:719:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLC2200.g:719:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLC2200.g:719:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLC2200.g:719:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalLC2200.g:719:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLC2200.g:719:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:721:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLC2200.g:721:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLC2200.g:721:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLC2200.g:721:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:723:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLC2200.g:723:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLC2200.g:723:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLC2200.g:723:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalLC2200.g:723:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLC2200.g:723:41: ( '\\r' )? '\\n'
                    {
                    // InternalLC2200.g:723:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalLC2200.g:723:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:725:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLC2200.g:725:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLC2200.g:725:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLC2200.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:727:16: ( . )
            // InternalLC2200.g:727:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalLC2200.g:1:8: ( RULE_NOOP | RULE_WORD | RULE_OOP | RULE_JOP | RULE_IOP_IMM | RULE_IOP_OFFSET | RULE_IOP_LABEL | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_COMMENT | RULE_NEWLINE | RULE_ROP | RULE_REG | RULE_IMMEDIATE | RULE_LABEL_IMM | RULE_LABEL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=23;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalLC2200.g:1:10: RULE_NOOP
                {
                mRULE_NOOP(); 

                }
                break;
            case 2 :
                // InternalLC2200.g:1:20: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 3 :
                // InternalLC2200.g:1:30: RULE_OOP
                {
                mRULE_OOP(); 

                }
                break;
            case 4 :
                // InternalLC2200.g:1:39: RULE_JOP
                {
                mRULE_JOP(); 

                }
                break;
            case 5 :
                // InternalLC2200.g:1:48: RULE_IOP_IMM
                {
                mRULE_IOP_IMM(); 

                }
                break;
            case 6 :
                // InternalLC2200.g:1:61: RULE_IOP_OFFSET
                {
                mRULE_IOP_OFFSET(); 

                }
                break;
            case 7 :
                // InternalLC2200.g:1:77: RULE_IOP_LABEL
                {
                mRULE_IOP_LABEL(); 

                }
                break;
            case 8 :
                // InternalLC2200.g:1:92: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 9 :
                // InternalLC2200.g:1:104: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 10 :
                // InternalLC2200.g:1:116: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 11 :
                // InternalLC2200.g:1:127: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 12 :
                // InternalLC2200.g:1:140: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 13 :
                // InternalLC2200.g:1:153: RULE_ROP
                {
                mRULE_ROP(); 

                }
                break;
            case 14 :
                // InternalLC2200.g:1:162: RULE_REG
                {
                mRULE_REG(); 

                }
                break;
            case 15 :
                // InternalLC2200.g:1:171: RULE_IMMEDIATE
                {
                mRULE_IMMEDIATE(); 

                }
                break;
            case 16 :
                // InternalLC2200.g:1:186: RULE_LABEL_IMM
                {
                mRULE_LABEL_IMM(); 

                }
                break;
            case 17 :
                // InternalLC2200.g:1:201: RULE_LABEL
                {
                mRULE_LABEL(); 

                }
                break;
            case 18 :
                // InternalLC2200.g:1:212: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // InternalLC2200.g:1:220: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalLC2200.g:1:232: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalLC2200.g:1:248: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalLC2200.g:1:264: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalLC2200.g:1:272: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA7_eotS =
        "\24\uffff";
    static final String DFA7_eofS =
        "\24\uffff";
    static final String DFA7_minS =
        "\1\44\1\141\1\uffff\1\60\1\uffff\1\60\16\uffff";
    static final String DFA7_maxS =
        "\1\44\1\172\1\uffff\1\164\1\uffff\1\160\16\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\1\1\uffff\1\3\1\uffff\1\15\1\17\1\20\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16";
    static final String DFA7_specialS =
        "\24\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\3\4\uffff\1\7\4\uffff\1\6\6\uffff\1\10\1\5\2\uffff\1\4\3\uffff\1\2",
            "",
            "\1\12\1\13\1\14\1\15\1\16\77\uffff\1\11",
            "",
            "\1\17\1\20\1\21\1\22\74\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "707:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$a3' | '$a4' | '$s0' | '$s1' | '$s2' | '$s3' | '$k0' | '$sp' | '$fp' | '$ra' )";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\1\35\1\32\11\35\4\uffff\1\56\1\32\2\uffff\1\35\4\32\2\uffff\2\35\1\uffff\1\35\2\uffff\1\35\2\71\3\35\2\75\1\35\14\uffff\3\35\1\uffff\2\35\1\105\1\uffff\1\106\1\107\1\105\2\71\1\110\1\111\5\uffff";
    static final String DFA21_eofS =
        "\112\uffff";
    static final String DFA21_minS =
        "\1\0\1\60\1\167\11\60\4\uffff\1\11\1\141\2\uffff\1\60\1\101\2\0\1\52\2\uffff\2\60\1\uffff\1\60\2\uffff\11\60\14\uffff\3\60\1\uffff\3\60\1\uffff\7\60\5\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\172\1\167\11\172\4\uffff\1\40\1\172\2\uffff\2\172\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\2\uffff\11\172\14\uffff\3\172\1\uffff\3\172\1\uffff\7\172\5\uffff";
    static final String DFA21_acceptS =
        "\14\uffff\1\10\1\11\1\12\1\13\2\uffff\2\17\5\uffff\1\26\1\27\2\uffff\1\20\1\uffff\1\21\1\2\11\uffff\1\10\1\11\1\12\1\13\1\14\1\26\1\16\1\17\1\22\1\23\1\24\1\25\3\uffff\1\3\3\uffff\1\6\7\uffff\1\15\1\7\1\1\1\4\1\5";
    static final String DFA21_specialS =
        "\1\1\25\uffff\1\2\1\0\62\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\32\1\31\1\20\2\32\1\31\22\32\1\31\1\32\1\26\1\32\1\21\2\32\1\27\1\14\1\15\2\32\1\16\1\32\1\2\1\30\1\22\11\23\1\32\1\17\5\32\32\24\3\32\1\25\1\24\1\32\1\10\1\13\1\24\1\5\1\4\2\24\1\3\1\24\1\7\1\24\1\11\1\24\1\1\3\24\1\6\1\12\7\24\uff85\32",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\1\34\15\36\1\33\13\36",
            "\1\40",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\1\41\31\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\42\21\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\43\21\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\44\25\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\1\45\31\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\3\36\1\46\26\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\26\36\1\47\3\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\26\36\1\50\3\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\51\25\36",
            "",
            "",
            "",
            "",
            "\2\57\2\uffff\1\57\22\uffff\1\57",
            "\1\60\4\uffff\1\60\4\uffff\1\60\6\uffff\2\60\2\uffff\1\60\3\uffff\1\60",
            "",
            "",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\32\62\4\uffff\1\62\1\uffff\32\62",
            "\0\63",
            "\0\63",
            "\1\64\4\uffff\1\65",
            "",
            "",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\66\13\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\67\14\36",
            "",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\70\16\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\72\6\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\73\16\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\3\36\1\74\26\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\20\36\1\76\11\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\17\36\1\77\12\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\3\36\1\100\26\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\101\6\36",
            "",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\102\21\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\103\10\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\104\21\36",
            "",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\1\37\6\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_NOOP | RULE_WORD | RULE_OOP | RULE_JOP | RULE_IOP_IMM | RULE_IOP_OFFSET | RULE_IOP_LABEL | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_COMMENT | RULE_NEWLINE | RULE_ROP | RULE_REG | RULE_IMMEDIATE | RULE_LABEL_IMM | RULE_LABEL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_23 = input.LA(1);

                        s = -1;
                        if ( ((LA21_23>='\u0000' && LA21_23<='\uFFFF')) ) {s = 51;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='n') ) {s = 1;}

                        else if ( (LA21_0=='.') ) {s = 2;}

                        else if ( (LA21_0=='h') ) {s = 3;}

                        else if ( (LA21_0=='e') ) {s = 4;}

                        else if ( (LA21_0=='d') ) {s = 5;}

                        else if ( (LA21_0=='r') ) {s = 6;}

                        else if ( (LA21_0=='j') ) {s = 7;}

                        else if ( (LA21_0=='a') ) {s = 8;}

                        else if ( (LA21_0=='l') ) {s = 9;}

                        else if ( (LA21_0=='s') ) {s = 10;}

                        else if ( (LA21_0=='b') ) {s = 11;}

                        else if ( (LA21_0=='(') ) {s = 12;}

                        else if ( (LA21_0==')') ) {s = 13;}

                        else if ( (LA21_0==',') ) {s = 14;}

                        else if ( (LA21_0==';') ) {s = 15;}

                        else if ( (LA21_0=='\n') ) {s = 16;}

                        else if ( (LA21_0=='$') ) {s = 17;}

                        else if ( (LA21_0=='0') ) {s = 18;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 19;}

                        else if ( ((LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='c'||(LA21_0>='f' && LA21_0<='g')||LA21_0=='i'||LA21_0=='k'||LA21_0=='m'||(LA21_0>='o' && LA21_0<='q')||(LA21_0>='t' && LA21_0<='z')) ) {s = 20;}

                        else if ( (LA21_0=='^') ) {s = 21;}

                        else if ( (LA21_0=='\"') ) {s = 22;}

                        else if ( (LA21_0=='\'') ) {s = 23;}

                        else if ( (LA21_0=='/') ) {s = 24;}

                        else if ( (LA21_0=='\t'||LA21_0=='\r'||LA21_0==' ') ) {s = 25;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||LA21_0=='#'||(LA21_0>='%' && LA21_0<='&')||(LA21_0>='*' && LA21_0<='+')||LA21_0=='-'||LA21_0==':'||(LA21_0>='<' && LA21_0<='@')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||(LA21_0>='{' && LA21_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_22 = input.LA(1);

                        s = -1;
                        if ( ((LA21_22>='\u0000' && LA21_22<='\uFFFF')) ) {s = 51;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}