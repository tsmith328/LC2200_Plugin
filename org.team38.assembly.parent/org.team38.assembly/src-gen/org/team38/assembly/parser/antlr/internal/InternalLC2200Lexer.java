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

    public InternalLC2200Lexer() {;} 
    public InternalLC2200Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLC2200Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLC2200.g"; }

    // $ANTLR start "RULE_LA"
    public final void mRULE_LA() throws RecognitionException {
        try {
            int _type = RULE_LA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1439:9: ( 'la' )
            // InternalLC2200.g:1439:11: 'la'
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
            // InternalLC2200.g:1441:11: ( '.word' )
            // InternalLC2200.g:1441:13: '.word'
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
            // InternalLC2200.g:1443:10: ( ( 'halt' | 'ei' | 'di' | 'reti' ) )
            // InternalLC2200.g:1443:12: ( 'halt' | 'ei' | 'di' | 'reti' )
            {
            // InternalLC2200.g:1443:12: ( 'halt' | 'ei' | 'di' | 'reti' )
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
                    // InternalLC2200.g:1443:13: 'halt'
                    {
                    match("halt"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1443:20: 'ei'
                    {
                    match("ei"); 


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:1443:25: 'di'
                    {
                    match("di"); 


                    }
                    break;
                case 4 :
                    // InternalLC2200.g:1443:30: 'reti'
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
            // InternalLC2200.g:1445:11: ( 'noop' )
            // InternalLC2200.g:1445:13: 'noop'
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
            // InternalLC2200.g:1447:10: ( 'jalr' )
            // InternalLC2200.g:1447:12: 'jalr'
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
            // InternalLC2200.g:1449:10: ( ( 'add' | 'nand' ) )
            // InternalLC2200.g:1449:12: ( 'add' | 'nand' )
            {
            // InternalLC2200.g:1449:12: ( 'add' | 'nand' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='a') ) {
                alt2=1;
            }
            else if ( (LA2_0=='n') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLC2200.g:1449:13: 'add'
                    {
                    match("add"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1449:19: 'nand'
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
            // InternalLC2200.g:1451:14: ( 'addi' )
            // InternalLC2200.g:1451:16: 'addi'
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
            // InternalLC2200.g:1453:17: ( ( 'lw' | 'sw' ) )
            // InternalLC2200.g:1453:19: ( 'lw' | 'sw' )
            {
            // InternalLC2200.g:1453:19: ( 'lw' | 'sw' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='l') ) {
                alt3=1;
            }
            else if ( (LA3_0=='s') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLC2200.g:1453:20: 'lw'
                    {
                    match("lw"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1453:25: 'sw'
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
            // InternalLC2200.g:1455:16: ( 'beq' )
            // InternalLC2200.g:1455:18: 'beq'
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
            // InternalLC2200.g:1457:13: ( '(' )
            // InternalLC2200.g:1457:15: '('
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
            // InternalLC2200.g:1459:13: ( ')' )
            // InternalLC2200.g:1459:15: ')'
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
            // InternalLC2200.g:1461:12: ( ',' )
            // InternalLC2200.g:1461:14: ','
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
            // InternalLC2200.g:1463:14: ( ';' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? ( '\\n' )? )
            // InternalLC2200.g:1463:16: ';' (~ ( ( '\\n' | '\\r' ) ) )* ( '\\r' )? ( '\\n' )?
            {
            match(';'); 
            // InternalLC2200.g:1463:20: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLC2200.g:1463:20: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);

            // InternalLC2200.g:1463:36: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLC2200.g:1463:36: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // InternalLC2200.g:1463:42: ( '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLC2200.g:1463:42: '\\n'
                    {
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1465:17: ( EOF )
            // InternalLC2200.g:1465:19: EOF
            {
            match(EOF); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1467:14: ( '\\n' )
            // InternalLC2200.g:1467:16: '\\n'
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

    // $ANTLR start "RULE_REG"
    public final void mRULE_REG() throws RecognitionException {
        try {
            int _type = RULE_REG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1469:10: ( ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' ) )
            // InternalLC2200.g:1469:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' )
            {
            // InternalLC2200.g:1469:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' )
            int alt7=16;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalLC2200.g:1469:13: '$zero'
                    {
                    match("$zero"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1469:21: '$at'
                    {
                    match("$at"); 


                    }
                    break;
                case 3 :
                    // InternalLC2200.g:1469:27: '$v0'
                    {
                    match("$v0"); 


                    }
                    break;
                case 4 :
                    // InternalLC2200.g:1469:33: '$a0'
                    {
                    match("$a0"); 


                    }
                    break;
                case 5 :
                    // InternalLC2200.g:1469:39: '$a1'
                    {
                    match("$a1"); 


                    }
                    break;
                case 6 :
                    // InternalLC2200.g:1469:45: '$a2'
                    {
                    match("$a2"); 


                    }
                    break;
                case 7 :
                    // InternalLC2200.g:1469:51: '$t0'
                    {
                    match("$t0"); 


                    }
                    break;
                case 8 :
                    // InternalLC2200.g:1469:57: '$t1'
                    {
                    match("$t1"); 


                    }
                    break;
                case 9 :
                    // InternalLC2200.g:1469:63: '$t2'
                    {
                    match("$t2"); 


                    }
                    break;
                case 10 :
                    // InternalLC2200.g:1469:69: '$s0'
                    {
                    match("$s0"); 


                    }
                    break;
                case 11 :
                    // InternalLC2200.g:1469:75: '$s1'
                    {
                    match("$s1"); 


                    }
                    break;
                case 12 :
                    // InternalLC2200.g:1469:81: '$s2'
                    {
                    match("$s2"); 


                    }
                    break;
                case 13 :
                    // InternalLC2200.g:1469:87: '$k0'
                    {
                    match("$k0"); 


                    }
                    break;
                case 14 :
                    // InternalLC2200.g:1469:93: '$sp'
                    {
                    match("$sp"); 


                    }
                    break;
                case 15 :
                    // InternalLC2200.g:1469:99: '$fp'
                    {
                    match("$fp"); 


                    }
                    break;
                case 16 :
                    // InternalLC2200.g:1469:105: '$ra'
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
            // InternalLC2200.g:1471:16: ( ( '0x' | '-' )? RULE_INT )
            // InternalLC2200.g:1471:18: ( '0x' | '-' )? RULE_INT
            {
            // InternalLC2200.g:1471:18: ( '0x' | '-' )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='0') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='x') ) {
                    alt8=1;
                }
            }
            else if ( (LA8_0=='-') ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // InternalLC2200.g:1471:19: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalLC2200.g:1471:24: '-'
                    {
                    match('-'); 

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
            // InternalLC2200.g:1473:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLC2200.g:1473:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLC2200.g:1473:42: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalLC2200.g:1475:12: ( RULE_LABEL_IMM ':' )
            // InternalLC2200.g:1475:14: RULE_LABEL_IMM ':'
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
            // InternalLC2200.g:1477:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLC2200.g:1477:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLC2200.g:1477:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLC2200.g:1477:11: '^'
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

            // InternalLC2200.g:1477:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalLC2200.g:1479:19: ( ( '0' .. '9' )+ )
            // InternalLC2200.g:1479:21: ( '0' .. '9' )+
            {
            // InternalLC2200.g:1479:21: ( '0' .. '9' )+
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
            	    // InternalLC2200.g:1479:22: '0' .. '9'
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
            // InternalLC2200.g:1481:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLC2200.g:1481:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLC2200.g:1481:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalLC2200.g:1481:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLC2200.g:1481:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalLC2200.g:1481:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLC2200.g:1481:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalLC2200.g:1481:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLC2200.g:1481:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalLC2200.g:1481:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLC2200.g:1481:61: ~ ( ( '\\\\' | '\\'' ) )
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLC2200.g:1483:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLC2200.g:1483:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLC2200.g:1483:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLC2200.g:1483:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // InternalLC2200.g:1483:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLC2200.g:1483:41: ( '\\r' )? '\\n'
                    {
                    // InternalLC2200.g:1483:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalLC2200.g:1483:41: '\\r'
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
            // InternalLC2200.g:1485:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLC2200.g:1485:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLC2200.g:1485:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // InternalLC2200.g:1487:16: ( . )
            // InternalLC2200.g:1487:18: .
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
        // InternalLC2200.g:1:8: ( RULE_LA | RULE_WORD | RULE_OOP | RULE_NOOP | RULE_JOP | RULE_ROP | RULE_IOP_IMM | RULE_IOP_OFFSET | RULE_IOP_LABEL | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_COMMENT | RULE_ML_COMMENT | RULE_NEWLINE | RULE_REG | RULE_IMMEDIATE | RULE_LABEL_IMM | RULE_LABEL | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=24;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalLC2200.g:1:10: RULE_LA
                {
                mRULE_LA(); 

                }
                break;
            case 2 :
                // InternalLC2200.g:1:18: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 3 :
                // InternalLC2200.g:1:28: RULE_OOP
                {
                mRULE_OOP(); 

                }
                break;
            case 4 :
                // InternalLC2200.g:1:37: RULE_NOOP
                {
                mRULE_NOOP(); 

                }
                break;
            case 5 :
                // InternalLC2200.g:1:47: RULE_JOP
                {
                mRULE_JOP(); 

                }
                break;
            case 6 :
                // InternalLC2200.g:1:56: RULE_ROP
                {
                mRULE_ROP(); 

                }
                break;
            case 7 :
                // InternalLC2200.g:1:65: RULE_IOP_IMM
                {
                mRULE_IOP_IMM(); 

                }
                break;
            case 8 :
                // InternalLC2200.g:1:78: RULE_IOP_OFFSET
                {
                mRULE_IOP_OFFSET(); 

                }
                break;
            case 9 :
                // InternalLC2200.g:1:94: RULE_IOP_LABEL
                {
                mRULE_IOP_LABEL(); 

                }
                break;
            case 10 :
                // InternalLC2200.g:1:109: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 11 :
                // InternalLC2200.g:1:121: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 12 :
                // InternalLC2200.g:1:133: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 13 :
                // InternalLC2200.g:1:144: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 14 :
                // InternalLC2200.g:1:157: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // InternalLC2200.g:1:173: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 16 :
                // InternalLC2200.g:1:186: RULE_REG
                {
                mRULE_REG(); 

                }
                break;
            case 17 :
                // InternalLC2200.g:1:195: RULE_IMMEDIATE
                {
                mRULE_IMMEDIATE(); 

                }
                break;
            case 18 :
                // InternalLC2200.g:1:210: RULE_LABEL_IMM
                {
                mRULE_LABEL_IMM(); 

                }
                break;
            case 19 :
                // InternalLC2200.g:1:225: RULE_LABEL
                {
                mRULE_LABEL(); 

                }
                break;
            case 20 :
                // InternalLC2200.g:1:236: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // InternalLC2200.g:1:244: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalLC2200.g:1:256: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // InternalLC2200.g:1:272: RULE_WS
                {
                mRULE_WS(); 

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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA7_eotS =
        "\25\uffff";
    static final String DFA7_eofS =
        "\25\uffff";
    static final String DFA7_minS =
        "\1\44\1\141\1\uffff\1\60\1\uffff\2\60\16\uffff";
    static final String DFA7_maxS =
        "\1\44\1\172\1\uffff\1\164\1\uffff\1\62\1\160\16\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\1\1\uffff\1\3\2\uffff\1\15\1\17\1\20\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16";
    static final String DFA7_specialS =
        "\25\uffff}>";
    static final String[] DFA7_transitionS = {
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
            return "1469:12: ( '$zero' | '$at' | '$v0' | '$a0' | '$a1' | '$a2' | '$t0' | '$t1' | '$t2' | '$s0' | '$s1' | '$s2' | '$k0' | '$sp' | '$fp' | '$ra' )";
        }
    }
    static final String DFA20_eotS =
        "\1\20\1\37\1\34\11\37\5\uffff\1\61\1\34\1\uffff\1\34\1\uffff\1\37\4\34\2\uffff\1\70\1\71\1\uffff\1\37\2\uffff\1\37\2\73\5\37\1\71\1\37\15\uffff\1\37\1\uffff\4\37\1\110\1\111\2\73\1\112\1\110\1\113\1\114\5\uffff";
    static final String DFA20_eofS =
        "\115\uffff";
    static final String DFA20_minS =
        "\1\0\1\60\1\167\11\60\5\uffff\1\11\1\141\1\uffff\1\60\1\uffff\1\60\1\101\2\0\1\57\2\uffff\2\60\1\uffff\1\60\2\uffff\12\60\15\uffff\1\60\1\uffff\14\60\5\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\172\1\167\11\172\5\uffff\1\40\1\172\1\uffff\1\71\1\uffff\2\172\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\2\uffff\12\172\15\uffff\1\172\1\uffff\14\172\5\uffff";
    static final String DFA20_acceptS =
        "\14\uffff\1\12\1\13\1\14\1\15\1\16\2\uffff\1\21\1\uffff\1\21\5\uffff\1\27\1\30\2\uffff\1\22\1\uffff\1\23\1\2\12\uffff\1\12\1\13\1\14\1\15\1\17\1\27\1\20\1\21\1\24\1\25\1\26\1\1\1\10\1\uffff\1\3\14\uffff\1\6\1\11\1\4\1\5\1\7";
    static final String DFA20_specialS =
        "\1\1\27\uffff\1\2\1\0\63\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\34\1\33\1\21\2\34\1\33\22\34\1\33\1\34\1\30\1\34\1\22\2\34\1\31\1\14\1\15\2\34\1\16\1\24\1\2\1\32\1\23\11\25\1\34\1\17\5\34\32\26\3\34\1\27\1\26\1\34\1\11\1\13\1\26\1\5\1\4\2\26\1\3\1\26\1\10\1\26\1\1\1\26\1\7\3\26\1\6\1\12\7\26\uff85\34",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\1\35\25\40\1\36\3\40",
            "\1\42",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\1\43\31\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\10\40\1\44\21\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\10\40\1\45\21\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\46\25\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\1\50\15\40\1\47\13\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\1\51\31\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\3\40\1\52\26\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\26\40\1\53\3\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\54\25\40",
            "",
            "",
            "",
            "",
            "",
            "\2\62\2\uffff\1\62\22\uffff\1\62",
            "\1\63\4\uffff\1\63\4\uffff\1\63\6\uffff\3\63\1\uffff\1\63\3\uffff\1\63",
            "",
            "\12\64",
            "",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\32\65\4\uffff\1\65\1\uffff\32\65",
            "\0\66",
            "\0\66",
            "\1\67",
            "",
            "",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\72\16\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\23\40\1\74\6\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\16\40\1\75\13\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\76\14\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\77\16\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\3\40\1\100\26\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\20\40\1\101\11\40",
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
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\23\40\1\102\6\40",
            "",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\10\40\1\103\21\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\17\40\1\104\12\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\3\40\1\105\26\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\21\40\1\106\10\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\10\40\1\107\21\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\1\41\6\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_LA | RULE_WORD | RULE_OOP | RULE_NOOP | RULE_JOP | RULE_ROP | RULE_IOP_IMM | RULE_IOP_OFFSET | RULE_IOP_LABEL | RULE_LPAREN | RULE_RPAREN | RULE_COMMA | RULE_COMMENT | RULE_ML_COMMENT | RULE_NEWLINE | RULE_REG | RULE_IMMEDIATE | RULE_LABEL_IMM | RULE_LABEL | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_25 = input.LA(1);

                        s = -1;
                        if ( ((LA20_25>='\u0000' && LA20_25<='\uFFFF')) ) {s = 54;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='l') ) {s = 1;}

                        else if ( (LA20_0=='.') ) {s = 2;}

                        else if ( (LA20_0=='h') ) {s = 3;}

                        else if ( (LA20_0=='e') ) {s = 4;}

                        else if ( (LA20_0=='d') ) {s = 5;}

                        else if ( (LA20_0=='r') ) {s = 6;}

                        else if ( (LA20_0=='n') ) {s = 7;}

                        else if ( (LA20_0=='j') ) {s = 8;}

                        else if ( (LA20_0=='a') ) {s = 9;}

                        else if ( (LA20_0=='s') ) {s = 10;}

                        else if ( (LA20_0=='b') ) {s = 11;}

                        else if ( (LA20_0=='(') ) {s = 12;}

                        else if ( (LA20_0==')') ) {s = 13;}

                        else if ( (LA20_0==',') ) {s = 14;}

                        else if ( (LA20_0==';') ) {s = 15;}

                        else if ( (LA20_0=='\n') ) {s = 17;}

                        else if ( (LA20_0=='$') ) {s = 18;}

                        else if ( (LA20_0=='0') ) {s = 19;}

                        else if ( (LA20_0=='-') ) {s = 20;}

                        else if ( ((LA20_0>='1' && LA20_0<='9')) ) {s = 21;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='c'||(LA20_0>='f' && LA20_0<='g')||LA20_0=='i'||LA20_0=='k'||LA20_0=='m'||(LA20_0>='o' && LA20_0<='q')||(LA20_0>='t' && LA20_0<='z')) ) {s = 22;}

                        else if ( (LA20_0=='^') ) {s = 23;}

                        else if ( (LA20_0=='\"') ) {s = 24;}

                        else if ( (LA20_0=='\'') ) {s = 25;}

                        else if ( (LA20_0=='/') ) {s = 26;}

                        else if ( (LA20_0=='\t'||LA20_0=='\r'||LA20_0==' ') ) {s = 27;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||LA20_0=='#'||(LA20_0>='%' && LA20_0<='&')||(LA20_0>='*' && LA20_0<='+')||LA20_0==':'||(LA20_0>='<' && LA20_0<='@')||(LA20_0>='[' && LA20_0<=']')||LA20_0=='`'||(LA20_0>='{' && LA20_0<='\uFFFF')) ) {s = 28;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_24 = input.LA(1);

                        s = -1;
                        if ( ((LA20_24>='\u0000' && LA20_24<='\uFFFF')) ) {s = 54;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}