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
            // InternalLC2200.g:1500:9: ( ( ' ' | '\\t' )+ )
            // InternalLC2200.g:1500:11: ( ' ' | '\\t' )+
            {
            // InternalLC2200.g:1500:11: ( ' ' | '\\t' )+
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
            // InternalLC2200.g:1502:9: ( 'la' )
            // InternalLC2200.g:1502:11: 'la'
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
            // InternalLC2200.g:1504:11: ( '.word' )
            // InternalLC2200.g:1504:13: '.word'
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
            // InternalLC2200.g:1506:10: ( ( 'halt' | 'ei' | 'di' | 'reti' ) )
            // InternalLC2200.g:1506:12: ( 'halt' | 'ei' | 'di' | 'reti' )
            {
            // InternalLC2200.g:1506:12: ( 'halt' | 'ei' | 'di' | 'reti' )
            int alt2=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLC2200.g:1506:13: 'halt'
                    {
                    match("halt"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1506:20: 'ei'
                    {
                    match("ei"); 


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:1506:25: 'di'
                    {
                    match("di"); 


                    }
                    break;
                case 4 :
                    // InternalLC2200.g:1506:30: 'reti'
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

    // $ANTLR start "RULE_NOOP"
    public final void mRULE_NOOP() throws RecognitionException {
        try {
            int _type = RULE_NOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1508:11: ( 'noop' )
            // InternalLC2200.g:1508:13: 'noop'
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
            // InternalLC2200.g:1510:10: ( 'jalr' )
            // InternalLC2200.g:1510:12: 'jalr'
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

    // $ANTLR start "RULE_ROP"
    public final void mRULE_ROP() throws RecognitionException {
        try {
            int _type = RULE_ROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1512:10: ( ( 'add' | 'nand' ) )
            // InternalLC2200.g:1512:12: ( 'add' | 'nand' )
            {
            // InternalLC2200.g:1512:12: ( 'add' | 'nand' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='a') ) {
                alt3=1;
            }
            else if ( (LA3_0=='n') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLC2200.g:1512:13: 'add'
                    {
                    match("add"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1512:19: 'nand'
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

    // $ANTLR start "RULE_IOP_IMM"
    public final void mRULE_IOP_IMM() throws RecognitionException {
        try {
            int _type = RULE_IOP_IMM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1514:14: ( 'addi' )
            // InternalLC2200.g:1514:16: 'addi'
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
            // InternalLC2200.g:1516:17: ( ( 'lw' | 'sw' ) )
            // InternalLC2200.g:1516:19: ( 'lw' | 'sw' )
            {
            // InternalLC2200.g:1516:19: ( 'lw' | 'sw' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='l') ) {
                alt4=1;
            }
            else if ( (LA4_0=='s') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLC2200.g:1516:20: 'lw'
                    {
                    match("lw"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1516:25: 'sw'
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
            // InternalLC2200.g:1518:16: ( 'beq' )
            // InternalLC2200.g:1518:18: 'beq'
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
            // InternalLC2200.g:1520:13: ( '(' )
            // InternalLC2200.g:1520:15: '('
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
            // InternalLC2200.g:1522:13: ( ')' )
            // InternalLC2200.g:1522:15: ')'
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
            // InternalLC2200.g:1524:12: ( ',' )
            // InternalLC2200.g:1524:14: ','
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
            // InternalLC2200.g:1526:14: ( ';' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalLC2200.g:1526:16: ';' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match(';'); 
            // InternalLC2200.g:1526:20: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLC2200.g:1526:20: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop5;
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
            // InternalLC2200.g:1528:14: ( ( ' ' )* ( '\\r' )? '\\n' )
            // InternalLC2200.g:1528:16: ( ' ' )* ( '\\r' )? '\\n'
            {
            // InternalLC2200.g:1528:16: ( ' ' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLC2200.g:1528:16: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalLC2200.g:1528:21: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLC2200.g:1528:21: '\\r'
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
            // InternalLC2200.g:1530:10: ( ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' ) )
            // InternalLC2200.g:1530:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' )
            {
            // InternalLC2200.g:1530:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' )
            int alt8=16;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalLC2200.g:1530:13: '$zero'
                    {
                    match("$zero"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1530:21: '$at'
                    {
                    match("$at"); 


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:1530:27: '$v0'
                    {
                    match("$v0"); 


                    }
                    break;
                case 4 :
                    // InternalLC2200.g:1530:33: '$a0'
                    {
                    match("$a0"); 


                    }
                    break;
                case 5 :
                    // InternalLC2200.g:1530:39: '$a1'
                    {
                    match("$a1"); 


                    }
                    break;
                case 6 :
                    // InternalLC2200.g:1530:45: '$a2'
                    {
                    match("$a2"); 


                    }
                    break;
                case 7 :
                    // InternalLC2200.g:1530:51: '$t0'
                    {
                    match("$t0"); 


                    }
                    break;
                case 8 :
                    // InternalLC2200.g:1530:57: '$t1'
                    {
                    match("$t1"); 


                    }
                    break;
                case 9 :
                    // InternalLC2200.g:1530:63: '$t2'
                    {
                    match("$t2"); 


                    }
                    break;
                case 10 :
                    // InternalLC2200.g:1530:69: '$s0'
                    {
                    match("$s0"); 


                    }
                    break;
                case 11 :
                    // InternalLC2200.g:1530:75: '$s1'
                    {
                    match("$s1"); 


                    }
                    break;
                case 12 :
                    // InternalLC2200.g:1530:81: '$s2'
                    {
                    match("$s2"); 


                    }
                    break;
                case 13 :
                    // InternalLC2200.g:1530:87: '$k0'
                    {
                    match("$k0"); 


                    }
                    break;
                case 14 :
                    // InternalLC2200.g:1530:93: '$sp'
                    {
                    match("$sp"); 


                    }
                    break;
                case 15 :
                    // InternalLC2200.g:1530:99: '$fp'
                    {
                    match("$fp"); 


                    }
                    break;
                case 16 :
                    // InternalLC2200.g:1530:105: '$ra'
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
            // InternalLC2200.g:1532:16: ( ( '0x' ( '0' .. '9' | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )+ | ( '-' )? RULE_INT ) )
            // InternalLC2200.g:1532:18: ( '0x' ( '0' .. '9' | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )+ | ( '-' )? RULE_INT )
            {
            // InternalLC2200.g:1532:18: ( '0x' ( '0' .. '9' | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )+ | ( '-' )? RULE_INT )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='0') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='x') ) {
                    alt11=1;
                }
                else {
                    alt11=2;}
            }
            else if ( (LA11_0=='-'||(LA11_0>='1' && LA11_0<='9')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLC2200.g:1532:19: '0x' ( '0' .. '9' | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )+
                    {
                    match("0x"); 

                    // InternalLC2200.g:1532:24: ( '0' .. '9' | ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='a' && LA9_0<='f')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1532:62: ( '-' )? RULE_INT
                    {
                    // InternalLC2200.g:1532:62: ( '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalLC2200.g:1532:62: '-'
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
            // InternalLC2200.g:1534:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLC2200.g:1534:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLC2200.g:1534:42: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    break loop12;
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
            // InternalLC2200.g:1536:12: ( RULE_LABEL_IMM ':' )
            // InternalLC2200.g:1536:14: RULE_LABEL_IMM ':'
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
            // InternalLC2200.g:1538:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLC2200.g:1538:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLC2200.g:1538:11: ( '^' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='^') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLC2200.g:1538:11: '^'
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

            // InternalLC2200.g:1538:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    break loop14;
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
            // InternalLC2200.g:1540:19: ( ( '0' .. '9' )+ )
            // InternalLC2200.g:1540:21: ( '0' .. '9' )+
            {
            // InternalLC2200.g:1540:21: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLC2200.g:1540:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalLC2200.g:1542:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLC2200.g:1542:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLC2200.g:1542:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalLC2200.g:1542:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLC2200.g:1542:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalLC2200.g:1542:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLC2200.g:1542:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop16;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1542:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLC2200.g:1542:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalLC2200.g:1542:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLC2200.g:1542:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop17;
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
            // InternalLC2200.g:1544:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLC2200.g:1544:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLC2200.g:1544:24: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='*') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='/') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLC2200.g:1544:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // InternalLC2200.g:1546:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLC2200.g:1546:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLC2200.g:1546:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLC2200.g:1546:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop20;
                }
            } while (true);

            // InternalLC2200.g:1546:40: ( ( '\\r' )? '\\n' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n'||LA22_0=='\r') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLC2200.g:1546:41: ( '\\r' )? '\\n'
                    {
                    // InternalLC2200.g:1546:41: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalLC2200.g:1546:41: '\\r'
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
            // InternalLC2200.g:1548:16: ( . )
            // InternalLC2200.g:1548:18: .
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
        int alt23=24;
        alt23 = dfa23.predict(input);
        switch (alt23) {
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA8_eotS =
        "\25\uffff";
    static final String DFA8_eofS =
        "\25\uffff";
    static final String DFA8_minS =
        "\1\44\1\141\1\uffff\1\60\1\uffff\2\60\16\uffff";
    static final String DFA8_maxS =
        "\1\44\1\172\1\uffff\1\164\1\uffff\1\62\1\160\16\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\1\1\uffff\1\3\2\uffff\1\15\1\17\1\20\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16";
    static final String DFA8_specialS =
        "\25\uffff}>";
    static final String[] DFA8_transitionS = {
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1530:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' )";
        }
    }
    static final String DFA23_eotS =
        "\1\uffff\1\36\1\44\1\35\11\44\5\uffff\1\35\1\uffff\1\35\1\uffff\1\35\1\uffff\1\44\4\35\2\uffff\1\36\1\uffff\1\73\1\74\1\44\3\uffff\1\44\2\76\5\44\1\74\1\44\14\uffff\1\44\1\uffff\4\44\1\113\1\114\2\76\1\115\1\113\1\116\1\117\5\uffff";
    static final String DFA23_eofS =
        "\120\uffff";
    static final String DFA23_minS =
        "\1\0\1\12\1\60\1\167\11\60\5\uffff\1\12\1\uffff\1\141\1\uffff\1\60\1\uffff\1\60\1\101\2\0\1\52\2\uffff\1\12\1\uffff\3\60\3\uffff\12\60\14\uffff\1\60\1\uffff\14\60\5\uffff";
    static final String DFA23_maxS =
        "\1\uffff\1\40\1\172\1\167\11\172\5\uffff\1\12\1\uffff\1\172\1\uffff\1\71\1\uffff\2\172\2\uffff\1\57\2\uffff\1\40\1\uffff\3\172\3\uffff\12\172\14\uffff\1\172\1\uffff\14\172\5\uffff";
    static final String DFA23_acceptS =
        "\15\uffff\1\13\1\14\1\15\1\16\1\1\1\uffff\1\17\1\uffff\1\21\1\uffff\1\21\5\uffff\1\30\1\1\1\uffff\1\17\3\uffff\1\22\1\23\1\3\12\uffff\1\13\1\14\1\15\1\16\1\20\1\21\1\24\1\25\1\26\1\27\1\2\1\11\1\uffff\1\4\14\uffff\1\7\1\12\1\5\1\6\1\10";
    static final String DFA23_specialS =
        "\1\2\31\uffff\1\0\1\1\64\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\35\1\21\1\23\2\35\1\22\22\35\1\1\1\35\1\32\1\35\1\24\2\35\1\33\1\15\1\16\2\35\1\17\1\26\1\3\1\34\1\25\11\27\1\35\1\20\5\35\32\30\3\35\1\31\1\30\1\35\1\12\1\14\1\30\1\6\1\5\2\30\1\4\1\30\1\11\1\30\1\2\1\30\1\10\3\30\1\7\1\13\7\30\uff85\35",
            "\1\40\2\uffff\1\40\22\uffff\1\37",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\1\41\25\43\1\42\3\43",
            "\1\46",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\1\47\31\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\50\21\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\51\21\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\52\25\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\1\54\15\43\1\53\13\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\1\55\31\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\56\26\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\26\43\1\57\3\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\60\25\43",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "",
            "\1\65\4\uffff\1\65\4\uffff\1\65\6\uffff\3\65\1\uffff\1\65\3\uffff\1\65",
            "",
            "\12\66",
            "",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\0\70",
            "\0\70",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "\1\40\2\uffff\1\40\22\uffff\1\37",
            "",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\75\16\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\77\6\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\100\13\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\101\14\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\102\16\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\103\26\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\20\43\1\104\11\43",
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
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\105\6\43",
            "",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\106\21\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\107\12\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\110\26\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\111\10\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\112\21\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\1\45\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_WS | RULE_LA | RULE_WORD | RULE_OOP | RULE_NOOP | RULE_JOP | RULE_ROP | RULE_IOP_IMM | RULE_IOP_OFFSET | RULE_IOP_LABEL | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_COMMENT | RULE_NEWLINE | RULE_REG | RULE_IMMEDIATE | RULE_LABEL_IMM | RULE_LABEL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_26 = input.LA(1);

                        s = -1;
                        if ( ((LA23_26>='\u0000' && LA23_26<='\uFFFF')) ) {s = 56;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_27 = input.LA(1);

                        s = -1;
                        if ( ((LA23_27>='\u0000' && LA23_27<='\uFFFF')) ) {s = 56;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0==' ') ) {s = 1;}

                        else if ( (LA23_0=='l') ) {s = 2;}

                        else if ( (LA23_0=='.') ) {s = 3;}

                        else if ( (LA23_0=='h') ) {s = 4;}

                        else if ( (LA23_0=='e') ) {s = 5;}

                        else if ( (LA23_0=='d') ) {s = 6;}

                        else if ( (LA23_0=='r') ) {s = 7;}

                        else if ( (LA23_0=='n') ) {s = 8;}

                        else if ( (LA23_0=='j') ) {s = 9;}

                        else if ( (LA23_0=='a') ) {s = 10;}

                        else if ( (LA23_0=='s') ) {s = 11;}

                        else if ( (LA23_0=='b') ) {s = 12;}

                        else if ( (LA23_0=='(') ) {s = 13;}

                        else if ( (LA23_0==')') ) {s = 14;}

                        else if ( (LA23_0==',') ) {s = 15;}

                        else if ( (LA23_0==';') ) {s = 16;}

                        else if ( (LA23_0=='\t') ) {s = 17;}

                        else if ( (LA23_0=='\r') ) {s = 18;}

                        else if ( (LA23_0=='\n') ) {s = 19;}

                        else if ( (LA23_0=='$') ) {s = 20;}

                        else if ( (LA23_0=='0') ) {s = 21;}

                        else if ( (LA23_0=='-') ) {s = 22;}

                        else if ( ((LA23_0>='1' && LA23_0<='9')) ) {s = 23;}

                        else if ( ((LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||LA23_0=='c'||(LA23_0>='f' && LA23_0<='g')||LA23_0=='i'||LA23_0=='k'||LA23_0=='m'||(LA23_0>='o' && LA23_0<='q')||(LA23_0>='t' && LA23_0<='z')) ) {s = 24;}

                        else if ( (LA23_0=='^') ) {s = 25;}

                        else if ( (LA23_0=='\"') ) {s = 26;}

                        else if ( (LA23_0=='\'') ) {s = 27;}

                        else if ( (LA23_0=='/') ) {s = 28;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||LA23_0=='!'||LA23_0=='#'||(LA23_0>='%' && LA23_0<='&')||(LA23_0>='*' && LA23_0<='+')||LA23_0==':'||(LA23_0>='<' && LA23_0<='@')||(LA23_0>='[' && LA23_0<=']')||LA23_0=='`'||(LA23_0>='{' && LA23_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}