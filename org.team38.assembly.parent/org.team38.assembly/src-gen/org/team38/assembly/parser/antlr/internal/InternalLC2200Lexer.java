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

    public InternalLC2200Lexer() {;} 
    public InternalLC2200Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLC2200Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLC2200.g"; }

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1481:9: ( ( ' ' | '\\t' )+ )
            // InternalLC2200.g:1481:11: ( ' ' | '\\t' )+
            {
            // InternalLC2200.g:1481:11: ( ' ' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLC2200.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_LA"
    public final void mRULE_LA() throws RecognitionException {
        try {
            int _type = RULE_LA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1483:9: ( 'la' )
            // InternalLC2200.g:1483:11: 'la'
            {
            match("la"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LA"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1485:11: ( '.word' )
            // InternalLC2200.g:1485:13: '.word'
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
            // InternalLC2200.g:1487:10: ( ( 'halt' | 'ei' | 'di' | 'reti' | 'bono' ) )
            // InternalLC2200.g:1487:12: ( 'halt' | 'ei' | 'di' | 'reti' | 'bono' )
            {
            // InternalLC2200.g:1487:12: ( 'halt' | 'ei' | 'di' | 'reti' | 'bono' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 'h':
                {
                alt2=1;
                }
                break;
            case 'e':
                {
                alt2=2;
                }
                break;
            case 'd':
                {
                alt2=3;
                }
                break;
            case 'r':
                {
                alt2=4;
                }
                break;
            case 'b':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLC2200.g:1487:13: 'halt'
                    {
                    match("halt"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1487:20: 'ei'
                    {
                    match("ei"); 


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:1487:25: 'di'
                    {
                    match("di"); 


                    }
                    break;
                case 4 :
                    // InternalLC2200.g:1487:30: 'reti'
                    {
                    match("reti"); 


                    }
                    break;
                case 5 :
                    // InternalLC2200.g:1487:37: 'bono'
                    {
                    match("bono"); 


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

    // $ANTLR start "RULE_NOOP"
    public final void mRULE_NOOP() throws RecognitionException {
        try {
            int _type = RULE_NOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1489:11: ( 'noop' )
            // InternalLC2200.g:1489:13: 'noop'
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

    // $ANTLR start "RULE_JOP"
    public final void mRULE_JOP() throws RecognitionException {
        try {
            int _type = RULE_JOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1491:10: ( ( 'jalr' | 'bonj' ) )
            // InternalLC2200.g:1491:12: ( 'jalr' | 'bonj' )
            {
            // InternalLC2200.g:1491:12: ( 'jalr' | 'bonj' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='j') ) {
                alt3=1;
            }
            else if ( (LA3_0=='b') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLC2200.g:1491:13: 'jalr'
                    {
                    match("jalr"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1491:20: 'bonj'
                    {
                    match("bonj"); 


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
    // $ANTLR end "RULE_JOP"

    // $ANTLR start "RULE_ROP"
    public final void mRULE_ROP() throws RecognitionException {
        try {
            int _type = RULE_ROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1493:10: ( ( 'add' | 'nand' | 'bonr' ) )
            // InternalLC2200.g:1493:12: ( 'add' | 'nand' | 'bonr' )
            {
            // InternalLC2200.g:1493:12: ( 'add' | 'nand' | 'bonr' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt4=1;
                }
                break;
            case 'n':
                {
                alt4=2;
                }
                break;
            case 'b':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLC2200.g:1493:13: 'add'
                    {
                    match("add"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1493:19: 'nand'
                    {
                    match("nand"); 


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:1493:26: 'bonr'
                    {
                    match("bonr"); 


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

    // $ANTLR start "RULE_IOP_IMM"
    public final void mRULE_IOP_IMM() throws RecognitionException {
        try {
            int _type = RULE_IOP_IMM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1495:14: ( 'addi' )
            // InternalLC2200.g:1495:16: 'addi'
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
            // InternalLC2200.g:1497:17: ( ( 'lw' | 'sw' | 'boni' ) )
            // InternalLC2200.g:1497:19: ( 'lw' | 'sw' | 'boni' )
            {
            // InternalLC2200.g:1497:19: ( 'lw' | 'sw' | 'boni' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 'l':
                {
                alt5=1;
                }
                break;
            case 's':
                {
                alt5=2;
                }
                break;
            case 'b':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLC2200.g:1497:20: 'lw'
                    {
                    match("lw"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1497:25: 'sw'
                    {
                    match("sw"); 


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:1497:30: 'boni'
                    {
                    match("boni"); 


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
            // InternalLC2200.g:1499:16: ( 'beq' )
            // InternalLC2200.g:1499:18: 'beq'
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
            // InternalLC2200.g:1501:13: ( '(' )
            // InternalLC2200.g:1501:15: '('
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
            // InternalLC2200.g:1503:13: ( ')' )
            // InternalLC2200.g:1503:15: ')'
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
            // InternalLC2200.g:1505:12: ( ',' )
            // InternalLC2200.g:1505:14: ','
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
            // InternalLC2200.g:1507:14: ( ';' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalLC2200.g:1507:16: ';' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match(';'); 
            // InternalLC2200.g:1507:20: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLC2200.g:1507:20: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop6;
                }
            } while (true);


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
            // InternalLC2200.g:1509:14: ( ( ' ' )* ( '\\r' )? '\\n' )
            // InternalLC2200.g:1509:16: ( ' ' )* ( '\\r' )? '\\n'
            {
            // InternalLC2200.g:1509:16: ( ' ' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLC2200.g:1509:16: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalLC2200.g:1509:21: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLC2200.g:1509:21: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_REG"
    public final void mRULE_REG() throws RecognitionException {
        try {
            int _type = RULE_REG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1511:10: ( ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' ) )
            // InternalLC2200.g:1511:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' )
            {
            // InternalLC2200.g:1511:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' )
            int alt9=16;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalLC2200.g:1511:13: '$zero'
                    {
                    match("$zero"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1511:21: '$at'
                    {
                    match("$at"); 


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:1511:27: '$v0'
                    {
                    match("$v0"); 


                    }
                    break;
                case 4 :
                    // InternalLC2200.g:1511:33: '$a0'
                    {
                    match("$a0"); 


                    }
                    break;
                case 5 :
                    // InternalLC2200.g:1511:39: '$a1'
                    {
                    match("$a1"); 


                    }
                    break;
                case 6 :
                    // InternalLC2200.g:1511:45: '$a2'
                    {
                    match("$a2"); 


                    }
                    break;
                case 7 :
                    // InternalLC2200.g:1511:51: '$t0'
                    {
                    match("$t0"); 


                    }
                    break;
                case 8 :
                    // InternalLC2200.g:1511:57: '$t1'
                    {
                    match("$t1"); 


                    }
                    break;
                case 9 :
                    // InternalLC2200.g:1511:63: '$t2'
                    {
                    match("$t2"); 


                    }
                    break;
                case 10 :
                    // InternalLC2200.g:1511:69: '$s0'
                    {
                    match("$s0"); 


                    }
                    break;
                case 11 :
                    // InternalLC2200.g:1511:75: '$s1'
                    {
                    match("$s1"); 


                    }
                    break;
                case 12 :
                    // InternalLC2200.g:1511:81: '$s2'
                    {
                    match("$s2"); 


                    }
                    break;
                case 13 :
                    // InternalLC2200.g:1511:87: '$k0'
                    {
                    match("$k0"); 


                    }
                    break;
                case 14 :
                    // InternalLC2200.g:1511:93: '$sp'
                    {
                    match("$sp"); 


                    }
                    break;
                case 15 :
                    // InternalLC2200.g:1511:99: '$fp'
                    {
                    match("$fp"); 


                    }
                    break;
                case 16 :
                    // InternalLC2200.g:1511:105: '$ra'
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
            // InternalLC2200.g:1513:16: ( ( '0x' ( '0' .. '9' | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )+ | ( '-' )? RULE_INT ) )
            // InternalLC2200.g:1513:18: ( '0x' ( '0' .. '9' | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )+ | ( '-' )? RULE_INT )
            {
            // InternalLC2200.g:1513:18: ( '0x' ( '0' .. '9' | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )+ | ( '-' )? RULE_INT )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='0') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='x') ) {
                    alt12=1;
                }
                else {
                    alt12=2;}
            }
            else if ( (LA12_0=='-'||(LA12_0>='1' && LA12_0<='9')) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLC2200.g:1513:19: '0x' ( '0' .. '9' | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )+
                    {
                    match("0x"); 

                    // InternalLC2200.g:1513:24: ( '0' .. '9' | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='a' && LA10_0<='f')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalLC2200.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1513:62: ( '-' )? RULE_INT
                    {
                    // InternalLC2200.g:1513:62: ( '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='-') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalLC2200.g:1513:62: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    mRULE_INT(); 

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
    // $ANTLR end "RULE_IMMEDIATE"

    // $ANTLR start "RULE_LABEL_IMM"
    public final void mRULE_LABEL_IMM() throws RecognitionException {
        try {
            int _type = RULE_LABEL_IMM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1515:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLC2200.g:1515:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLC2200.g:1515:42: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    break loop13;
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
            // InternalLC2200.g:1517:12: ( RULE_LABEL_IMM ':' )
            // InternalLC2200.g:1517:14: RULE_LABEL_IMM ':'
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
            // InternalLC2200.g:1519:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLC2200.g:1519:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLC2200.g:1519:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLC2200.g:1519:11: '^'
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

            // InternalLC2200.g:1519:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    break loop15;
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
            // InternalLC2200.g:1521:19: ( ( '0' .. '9' )+ )
            // InternalLC2200.g:1521:21: ( '0' .. '9' )+
            {
            // InternalLC2200.g:1521:21: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLC2200.g:1521:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalLC2200.g:1523:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLC2200.g:1523:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLC2200.g:1523:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalLC2200.g:1523:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLC2200.g:1523:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalLC2200.g:1523:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLC2200.g:1523:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1523:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLC2200.g:1523:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalLC2200.g:1523:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLC2200.g:1523:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop18;
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
            // InternalLC2200.g:1525:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLC2200.g:1525:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLC2200.g:1525:24: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLC2200.g:1525:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
            // InternalLC2200.g:1527:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLC2200.g:1527:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLC2200.g:1527:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLC2200.g:1527:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
                }
            } while (true);

            // InternalLC2200.g:1527:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLC2200.g:1527:41: ( '\\r' )? '\\n'
                    {
                    // InternalLC2200.g:1527:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalLC2200.g:1527:41: '\\r'
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

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1529:16: ( . )
            // InternalLC2200.g:1529:18: .
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
        // InternalLC2200.g:1:8: ( RULE_WS | RULE_LA | RULE_WORD | RULE_OOP | RULE_NOOP | RULE_JOP | RULE_ROP | RULE_IOP_IMM | RULE_IOP_OFFSET | RULE_IOP_LABEL | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_COMMENT | RULE_NEWLINE | RULE_REG | RULE_IMMEDIATE | RULE_LABEL_IMM | RULE_LABEL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt24=24;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalLC2200.g:1:10: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 2 :
                // InternalLC2200.g:1:18: RULE_LA
                {
                mRULE_LA(); 

                }
                break;
            case 3 :
                // InternalLC2200.g:1:26: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 4 :
                // InternalLC2200.g:1:36: RULE_OOP
                {
                mRULE_OOP(); 

                }
                break;
            case 5 :
                // InternalLC2200.g:1:45: RULE_NOOP
                {
                mRULE_NOOP(); 

                }
                break;
            case 6 :
                // InternalLC2200.g:1:55: RULE_JOP
                {
                mRULE_JOP(); 

                }
                break;
            case 7 :
                // InternalLC2200.g:1:64: RULE_ROP
                {
                mRULE_ROP(); 

                }
                break;
            case 8 :
                // InternalLC2200.g:1:73: RULE_IOP_IMM
                {
                mRULE_IOP_IMM(); 

                }
                break;
            case 9 :
                // InternalLC2200.g:1:86: RULE_IOP_OFFSET
                {
                mRULE_IOP_OFFSET(); 

                }
                break;
            case 10 :
                // InternalLC2200.g:1:102: RULE_IOP_LABEL
                {
                mRULE_IOP_LABEL(); 

                }
                break;
            case 11 :
                // InternalLC2200.g:1:117: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 12 :
                // InternalLC2200.g:1:129: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 13 :
                // InternalLC2200.g:1:141: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 14 :
                // InternalLC2200.g:1:152: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 15 :
                // InternalLC2200.g:1:165: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 16 :
                // InternalLC2200.g:1:178: RULE_REG
                {
                mRULE_REG(); 

                }
                break;
            case 17 :
                // InternalLC2200.g:1:187: RULE_IMMEDIATE
                {
                mRULE_IMMEDIATE(); 

                }
                break;
            case 18 :
                // InternalLC2200.g:1:202: RULE_LABEL_IMM
                {
                mRULE_LABEL_IMM(); 

                }
                break;
            case 19 :
                // InternalLC2200.g:1:217: RULE_LABEL
                {
                mRULE_LABEL(); 

                }
                break;
            case 20 :
                // InternalLC2200.g:1:228: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // InternalLC2200.g:1:236: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalLC2200.g:1:248: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalLC2200.g:1:264: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalLC2200.g:1:280: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA9_eotS =
        "\25\uffff";
    static final String DFA9_eofS =
        "\25\uffff";
    static final String DFA9_minS =
        "\1\44\1\141\1\uffff\1\60\1\uffff\2\60\16\uffff";
    static final String DFA9_maxS =
        "\1\44\1\172\1\uffff\1\164\1\uffff\1\62\1\160\16\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\1\1\uffff\1\3\2\uffff\1\15\1\17\1\20\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16";
    static final String DFA9_specialS =
        "\25\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\3\4\uffff\1\10\4\uffff\1\7\6\uffff\1\11\1\6\1\5\1\uffff\1\4\3\uffff\1\2",
            "",
            "\1\13\1\14\1\15\101\uffff\1\12",
            "",
            "\1\16\1\17\1\20",
            "\1\21\1\22\1\23\75\uffff\1\24",
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1511:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\1\36\1\43\1\35\11\43\5\uffff\1\35\1\uffff\1\35\1\uffff\1\35\1\uffff\1\43\4\35\3\uffff\1\36\1\74\1\75\1\uffff\1\43\2\uffff\1\43\2\77\7\43\1\75\14\uffff\1\43\1\uffff\2\43\1\115\3\43\1\122\3\77\1\123\1\122\1\75\1\uffff\1\124\1\122\1\123\1\125\4\uffff";
    static final String DFA24_eofS =
        "\126\uffff";
    static final String DFA24_minS =
        "\1\0\1\12\1\60\1\167\11\60\5\uffff\1\12\1\uffff\1\141\1\uffff\1\60\1\uffff\1\60\1\101\2\0\1\52\3\uffff\1\12\2\60\1\uffff\1\60\2\uffff\13\60\14\uffff\1\60\1\uffff\15\60\1\uffff\4\60\4\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\40\1\172\1\167\11\172\5\uffff\1\12\1\uffff\1\172\1\uffff\1\71\1\uffff\2\172\2\uffff\1\57\3\uffff\1\40\2\172\1\uffff\1\172\2\uffff\13\172\14\uffff\1\172\1\uffff\15\172\1\uffff\4\172\4\uffff";
    static final String DFA24_acceptS =
        "\15\uffff\1\13\1\14\1\15\1\16\1\1\1\uffff\1\17\1\uffff\1\21\1\uffff\1\21\5\uffff\1\30\1\1\1\17\3\uffff\1\22\1\uffff\1\23\1\3\13\uffff\1\13\1\14\1\15\1\16\1\20\1\21\1\24\1\25\1\26\1\27\1\2\1\11\1\uffff\1\4\15\uffff\1\12\4\uffff\1\7\1\6\1\5\1\10";
    static final String DFA24_specialS =
        "\1\1\31\uffff\1\0\1\2\72\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\35\1\21\1\23\2\35\1\22\22\35\1\1\1\35\1\32\1\35\1\24\2\35\1\33\1\15\1\16\2\35\1\17\1\26\1\3\1\34\1\25\11\27\1\35\1\20\5\35\32\30\3\35\1\31\1\30\1\35\1\13\1\10\1\30\1\6\1\5\2\30\1\4\1\30\1\12\1\30\1\2\1\30\1\11\3\30\1\7\1\14\7\30\uff85\35",
            "\1\37\2\uffff\1\37\22\uffff\1\40",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\1\41\25\44\1\42\3\44",
            "\1\46",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\1\47\31\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\50\21\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\51\21\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\52\25\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\54\11\44\1\53\13\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\1\56\15\44\1\55\13\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\1\57\31\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\60\26\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\26\44\1\61\3\44",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "",
            "\1\66\4\uffff\1\66\4\uffff\1\66\6\uffff\3\66\1\uffff\1\66\3\uffff\1\66",
            "",
            "\12\67",
            "",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\32\70\4\uffff\1\70\1\uffff\32\70",
            "\0\71",
            "\0\71",
            "\1\72\4\uffff\1\73",
            "",
            "",
            "",
            "\1\37\2\uffff\1\37\22\uffff\1\40",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\76\16\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\100\6\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\101\14\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\20\44\1\102\11\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\103\13\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\104\14\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\105\16\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\106\26\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\107\6\44",
            "",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\110\21\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\114\1\112\4\44\1\111\2\44\1\113\10\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\17\44\1\116\12\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\117\26\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\120\10\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\121\21\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\1\45\6\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_WS | RULE_LA | RULE_WORD | RULE_OOP | RULE_NOOP | RULE_JOP | RULE_ROP | RULE_IOP_IMM | RULE_IOP_OFFSET | RULE_IOP_LABEL | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_COMMENT | RULE_NEWLINE | RULE_REG | RULE_IMMEDIATE | RULE_LABEL_IMM | RULE_LABEL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_26 = input.LA(1);

                        s = -1;
                        if ( ((LA24_26>='\u0000' && LA24_26<='\uFFFF')) ) {s = 57;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0==' ') ) {s = 1;}

                        else if ( (LA24_0=='l') ) {s = 2;}

                        else if ( (LA24_0=='.') ) {s = 3;}

                        else if ( (LA24_0=='h') ) {s = 4;}

                        else if ( (LA24_0=='e') ) {s = 5;}

                        else if ( (LA24_0=='d') ) {s = 6;}

                        else if ( (LA24_0=='r') ) {s = 7;}

                        else if ( (LA24_0=='b') ) {s = 8;}

                        else if ( (LA24_0=='n') ) {s = 9;}

                        else if ( (LA24_0=='j') ) {s = 10;}

                        else if ( (LA24_0=='a') ) {s = 11;}

                        else if ( (LA24_0=='s') ) {s = 12;}

                        else if ( (LA24_0=='(') ) {s = 13;}

                        else if ( (LA24_0==')') ) {s = 14;}

                        else if ( (LA24_0==',') ) {s = 15;}

                        else if ( (LA24_0==';') ) {s = 16;}

                        else if ( (LA24_0=='\t') ) {s = 17;}

                        else if ( (LA24_0=='\r') ) {s = 18;}

                        else if ( (LA24_0=='\n') ) {s = 19;}

                        else if ( (LA24_0=='$') ) {s = 20;}

                        else if ( (LA24_0=='0') ) {s = 21;}

                        else if ( (LA24_0=='-') ) {s = 22;}

                        else if ( ((LA24_0>='1' && LA24_0<='9')) ) {s = 23;}

                        else if ( ((LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='c'||(LA24_0>='f' && LA24_0<='g')||LA24_0=='i'||LA24_0=='k'||LA24_0=='m'||(LA24_0>='o' && LA24_0<='q')||(LA24_0>='t' && LA24_0<='z')) ) {s = 24;}

                        else if ( (LA24_0=='^') ) {s = 25;}

                        else if ( (LA24_0=='\"') ) {s = 26;}

                        else if ( (LA24_0=='\'') ) {s = 27;}

                        else if ( (LA24_0=='/') ) {s = 28;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='!'||LA24_0=='#'||(LA24_0>='%' && LA24_0<='&')||(LA24_0>='*' && LA24_0<='+')||LA24_0==':'||(LA24_0>='<' && LA24_0<='@')||(LA24_0>='[' && LA24_0<=']')||LA24_0=='`'||(LA24_0>='{' && LA24_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_27 = input.LA(1);

                        s = -1;
                        if ( ((LA24_27>='\u0000' && LA24_27<='\uFFFF')) ) {s = 57;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}