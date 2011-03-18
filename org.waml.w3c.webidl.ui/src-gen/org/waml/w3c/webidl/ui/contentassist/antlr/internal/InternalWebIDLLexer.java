package org.waml.w3c.webidl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebIDLLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int RULE_ID=4;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T21=21;
    public static final int T71=71;
    public static final int T20=20;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=81;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T80=80;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalWebIDLLexer() {;} 
    public InternalWebIDLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10:5: ( 'OverrideBuiltins' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10:7: 'OverrideBuiltins'
            {
            match("OverrideBuiltins"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:11:5: ( 'void' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:11:7: 'void'
            {
            match("void"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:12:5: ( 'boolean' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:12:7: 'boolean'
            {
            match("boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:13:5: ( 'byte' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:13:7: 'byte'
            {
            match("byte"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:14:5: ( 'double' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:14:7: 'double'
            {
            match("double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:15:5: ( 'float' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:15:7: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:16:5: ( 'short' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:16:7: 'short'
            {
            match("short"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:17:5: ( 'long' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:17:7: 'long'
            {
            match("long"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:18:5: ( 'Object' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:18:7: 'Object'
            {
            match("Object"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:19:5: ( 'object' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:19:7: 'object'
            {
            match("object"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:20:5: ( 'any' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:20:7: 'any'
            {
            match("any"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:21:5: ( 'octet' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:21:7: 'octet'
            {
            match("octet"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:22:5: ( 'DOMString' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:22:7: 'DOMString'
            {
            match("DOMString"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:23:5: ( 'import' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:23:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:24:5: ( ';' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:24:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:25:5: ( 'typedef' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:25:7: 'typedef'
            {
            match("typedef"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:26:5: ( 'sequence<' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:26:7: 'sequence<'
            {
            match("sequence<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:27:5: ( '>' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:27:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:28:5: ( '::' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:28:7: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:29:5: ( 'Constructor' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:29:7: 'Constructor'
            {
            match("Constructor"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:30:5: ( '(' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:30:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:31:5: ( ')' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:31:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:32:5: ( ',' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:32:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:33:5: ( 'NamedConstructor' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:33:7: 'NamedConstructor'
            {
            match("NamedConstructor"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:34:5: ( '=' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:34:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:35:5: ( 'Callback' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:35:7: 'Callback'
            {
            match("Callback"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:36:5: ( 'NoInterfaceObject' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:36:7: 'NoInterfaceObject'
            {
            match("NoInterfaceObject"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:37:5: ( 'PrototypeRoot' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:37:7: 'PrototypeRoot'
            {
            match("PrototypeRoot"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:38:5: ( 'PutForwards' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:38:7: 'PutForwards'
            {
            match("PutForwards"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:39:5: ( 'TreatNullAs' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:39:7: 'TreatNullAs'
            {
            match("TreatNullAs"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:40:5: ( 'EmptyString' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:40:7: 'EmptyString'
            {
            match("EmptyString"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:41:5: ( 'TreatUndefinedAs' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:41:7: 'TreatUndefinedAs'
            {
            match("TreatUndefinedAs"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:42:5: ( 'AllowAny' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:42:7: 'AllowAny'
            {
            match("AllowAny"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:43:5: ( 'Replaceable' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:43:7: 'Replaceable'
            {
            match("Replaceable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:44:5: ( 'Supplemental' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:44:7: 'Supplemental'
            {
            match("Supplemental"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:45:5: ( 'ReplaceableNamedProperties' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:45:7: 'ReplaceableNamedProperties'
            {
            match("ReplaceableNamedProperties"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:46:5: ( 'implements' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:46:7: 'implements'
            {
            match("implements"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:47:5: ( 'module' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:47:7: 'module'
            {
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:48:5: ( '{' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:48:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:49:5: ( '}' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:49:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:50:5: ( '[' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:50:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:51:5: ( ']' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:51:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:52:5: ( 'Prefix' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:52:7: 'Prefix'
            {
            match("Prefix"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:53:5: ( 'NamespaceObject' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:53:7: 'NamespaceObject'
            {
            match("NamespaceObject"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:54:5: ( 'interface' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:54:7: 'interface'
            {
            match("interface"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:55:5: ( ':' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:55:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:56:5: ( 'raises' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:56:7: 'raises'
            {
            match("raises"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:57:5: ( 'getter' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:57:7: 'getter'
            {
            match("getter"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:58:5: ( 'setter' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:58:7: 'setter'
            {
            match("setter"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:59:5: ( 'creator' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:59:7: 'creator'
            {
            match("creator"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:60:5: ( 'deleter' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:60:7: 'deleter'
            {
            match("deleter"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:61:5: ( 'caller' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:61:7: 'caller'
            {
            match("caller"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:62:5: ( 'readonly' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:62:7: 'readonly'
            {
            match("readonly"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:63:5: ( 'attribute' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:63:7: 'attribute'
            {
            match("attribute"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:64:5: ( 'getraises' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:64:7: 'getraises'
            {
            match("getraises"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:65:5: ( 'setraises' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:65:7: 'setraises'
            {
            match("setraises"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:66:5: ( 'exception' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:66:7: 'exception'
            {
            match("exception"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:67:5: ( 'const' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:67:7: 'const'
            {
            match("const"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:68:5: ( '0x' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:68:7: '0x'
            {
            match("0x"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:69:5: ( '[]' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:69:7: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:70:5: ( 'unsigned' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:70:7: 'unsigned'
            {
            match("unsigned"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:71:5: ( '?' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:71:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:72:5: ( 'FunctionOnly' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:72:7: 'FunctionOnly'
            {
            match("FunctionOnly"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:73:5: ( 'PropertyOnly' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:73:7: 'PropertyOnly'
            {
            match("PropertyOnly"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:74:5: ( 'null' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:74:7: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:75:5: ( 'stringifier' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:75:7: 'stringifier'
            {
            match("stringifier"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:76:5: ( 'omittable' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:76:7: 'omittable'
            {
            match("omittable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:77:5: ( 'in' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:77:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:78:5: ( 'optional' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:78:7: 'optional'
            {
            match("optional"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:79:5: ( '...' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:79:7: '...'
            {
            match("..."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10516:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10516:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10516:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10516:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10516:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10518:10: ( ( '0' .. '9' )+ )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10518:12: ( '0' .. '9' )+
            {
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10518:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10518:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10520:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10520:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10520:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("10520:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10520:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10520:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10520:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10520:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10520:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10520:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10520:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10520:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10522:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10522:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10522:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10522:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10524:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10524:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10524:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10524:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10524:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10524:41: ( '\\r' )? '\\n'
                    {
                    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10524:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10524:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10526:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10526:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10526:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10528:16: ( . )
            // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:10528:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=77;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='O') ) {
            switch ( input.LA(2) ) {
            case 'b':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='j') ) {
                    int LA12_117 = input.LA(4);

                    if ( (LA12_117=='e') ) {
                        int LA12_164 = input.LA(5);

                        if ( (LA12_164=='c') ) {
                            int LA12_214 = input.LA(6);

                            if ( (LA12_214=='t') ) {
                                int LA12_264 = input.LA(7);

                                if ( ((LA12_264>='0' && LA12_264<='9')||(LA12_264>='A' && LA12_264<='Z')||LA12_264=='_'||(LA12_264>='a' && LA12_264<='z')) ) {
                                    alt12=71;
                                }
                                else {
                                    alt12=9;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'v':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='e') ) {
                    int LA12_118 = input.LA(4);

                    if ( (LA12_118=='r') ) {
                        int LA12_165 = input.LA(5);

                        if ( (LA12_165=='r') ) {
                            int LA12_215 = input.LA(6);

                            if ( (LA12_215=='i') ) {
                                int LA12_265 = input.LA(7);

                                if ( (LA12_265=='d') ) {
                                    int LA12_312 = input.LA(8);

                                    if ( (LA12_312=='e') ) {
                                        int LA12_354 = input.LA(9);

                                        if ( (LA12_354=='B') ) {
                                            int LA12_387 = input.LA(10);

                                            if ( (LA12_387=='u') ) {
                                                int LA12_416 = input.LA(11);

                                                if ( (LA12_416=='i') ) {
                                                    int LA12_439 = input.LA(12);

                                                    if ( (LA12_439=='l') ) {
                                                        int LA12_455 = input.LA(13);

                                                        if ( (LA12_455=='t') ) {
                                                            int LA12_471 = input.LA(14);

                                                            if ( (LA12_471=='i') ) {
                                                                int LA12_481 = input.LA(15);

                                                                if ( (LA12_481=='n') ) {
                                                                    int LA12_488 = input.LA(16);

                                                                    if ( (LA12_488=='s') ) {
                                                                        int LA12_494 = input.LA(17);

                                                                        if ( ((LA12_494>='0' && LA12_494<='9')||(LA12_494>='A' && LA12_494<='Z')||LA12_494=='_'||(LA12_494>='a' && LA12_494<='z')) ) {
                                                                            alt12=71;
                                                                        }
                                                                        else {
                                                                            alt12=1;}
                                                                    }
                                                                    else {
                                                                        alt12=71;}
                                                                }
                                                                else {
                                                                    alt12=71;}
                                                            }
                                                            else {
                                                                alt12=71;}
                                                        }
                                                        else {
                                                            alt12=71;}
                                                    }
                                                    else {
                                                        alt12=71;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0=='v') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='o') ) {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='i') ) {
                    int LA12_119 = input.LA(4);

                    if ( (LA12_119=='d') ) {
                        int LA12_166 = input.LA(5);

                        if ( ((LA12_166>='0' && LA12_166<='9')||(LA12_166>='A' && LA12_166<='Z')||LA12_166=='_'||(LA12_166>='a' && LA12_166<='z')) ) {
                            alt12=71;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='b') ) {
            switch ( input.LA(2) ) {
            case 'y':
                {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='t') ) {
                    int LA12_120 = input.LA(4);

                    if ( (LA12_120=='e') ) {
                        int LA12_167 = input.LA(5);

                        if ( ((LA12_167>='0' && LA12_167<='9')||(LA12_167>='A' && LA12_167<='Z')||LA12_167=='_'||(LA12_167>='a' && LA12_167<='z')) ) {
                            alt12=71;
                        }
                        else {
                            alt12=4;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'o':
                {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='o') ) {
                    int LA12_121 = input.LA(4);

                    if ( (LA12_121=='l') ) {
                        int LA12_168 = input.LA(5);

                        if ( (LA12_168=='e') ) {
                            int LA12_218 = input.LA(6);

                            if ( (LA12_218=='a') ) {
                                int LA12_266 = input.LA(7);

                                if ( (LA12_266=='n') ) {
                                    int LA12_313 = input.LA(8);

                                    if ( ((LA12_313>='0' && LA12_313<='9')||(LA12_313>='A' && LA12_313<='Z')||LA12_313=='_'||(LA12_313>='a' && LA12_313<='z')) ) {
                                        alt12=71;
                                    }
                                    else {
                                        alt12=3;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='l') ) {
                    int LA12_122 = input.LA(4);

                    if ( (LA12_122=='e') ) {
                        int LA12_169 = input.LA(5);

                        if ( (LA12_169=='t') ) {
                            int LA12_219 = input.LA(6);

                            if ( (LA12_219=='e') ) {
                                int LA12_267 = input.LA(7);

                                if ( (LA12_267=='r') ) {
                                    int LA12_314 = input.LA(8);

                                    if ( ((LA12_314>='0' && LA12_314<='9')||(LA12_314>='A' && LA12_314<='Z')||LA12_314=='_'||(LA12_314>='a' && LA12_314<='z')) ) {
                                        alt12=71;
                                    }
                                    else {
                                        alt12=51;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'o':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='u') ) {
                    int LA12_123 = input.LA(4);

                    if ( (LA12_123=='b') ) {
                        int LA12_170 = input.LA(5);

                        if ( (LA12_170=='l') ) {
                            int LA12_220 = input.LA(6);

                            if ( (LA12_220=='e') ) {
                                int LA12_268 = input.LA(7);

                                if ( ((LA12_268>='0' && LA12_268<='9')||(LA12_268>='A' && LA12_268<='Z')||LA12_268=='_'||(LA12_268>='a' && LA12_268<='z')) ) {
                                    alt12=71;
                                }
                                else {
                                    alt12=5;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0=='f') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='l') ) {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='o') ) {
                    int LA12_124 = input.LA(4);

                    if ( (LA12_124=='a') ) {
                        int LA12_171 = input.LA(5);

                        if ( (LA12_171=='t') ) {
                            int LA12_221 = input.LA(6);

                            if ( ((LA12_221>='0' && LA12_221<='9')||(LA12_221>='A' && LA12_221<='Z')||LA12_221=='_'||(LA12_221>='a' && LA12_221<='z')) ) {
                                alt12=71;
                            }
                            else {
                                alt12=6;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    switch ( input.LA(4) ) {
                    case 't':
                        {
                        int LA12_172 = input.LA(5);

                        if ( (LA12_172=='e') ) {
                            int LA12_222 = input.LA(6);

                            if ( (LA12_222=='r') ) {
                                int LA12_270 = input.LA(7);

                                if ( ((LA12_270>='0' && LA12_270<='9')||(LA12_270>='A' && LA12_270<='Z')||LA12_270=='_'||(LA12_270>='a' && LA12_270<='z')) ) {
                                    alt12=71;
                                }
                                else {
                                    alt12=49;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                        }
                        break;
                    case 'r':
                        {
                        int LA12_173 = input.LA(5);

                        if ( (LA12_173=='a') ) {
                            int LA12_223 = input.LA(6);

                            if ( (LA12_223=='i') ) {
                                int LA12_271 = input.LA(7);

                                if ( (LA12_271=='s') ) {
                                    int LA12_317 = input.LA(8);

                                    if ( (LA12_317=='e') ) {
                                        int LA12_357 = input.LA(9);

                                        if ( (LA12_357=='s') ) {
                                            int LA12_388 = input.LA(10);

                                            if ( ((LA12_388>='0' && LA12_388<='9')||(LA12_388>='A' && LA12_388<='Z')||LA12_388=='_'||(LA12_388>='a' && LA12_388<='z')) ) {
                                                alt12=71;
                                            }
                                            else {
                                                alt12=56;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                        }
                        break;
                    default:
                        alt12=71;}

                    }
                    break;
                case 'q':
                    {
                    int LA12_126 = input.LA(4);

                    if ( (LA12_126=='u') ) {
                        int LA12_174 = input.LA(5);

                        if ( (LA12_174=='e') ) {
                            int LA12_224 = input.LA(6);

                            if ( (LA12_224=='n') ) {
                                int LA12_272 = input.LA(7);

                                if ( (LA12_272=='c') ) {
                                    int LA12_318 = input.LA(8);

                                    if ( (LA12_318=='e') ) {
                                        int LA12_358 = input.LA(9);

                                        if ( (LA12_358=='<') ) {
                                            alt12=17;
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                    }
                    break;
                default:
                    alt12=71;}

                }
                break;
            case 'h':
                {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='o') ) {
                    int LA12_127 = input.LA(4);

                    if ( (LA12_127=='r') ) {
                        int LA12_175 = input.LA(5);

                        if ( (LA12_175=='t') ) {
                            int LA12_225 = input.LA(6);

                            if ( ((LA12_225>='0' && LA12_225<='9')||(LA12_225>='A' && LA12_225<='Z')||LA12_225=='_'||(LA12_225>='a' && LA12_225<='z')) ) {
                                alt12=71;
                            }
                            else {
                                alt12=7;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 't':
                {
                int LA12_62 = input.LA(3);

                if ( (LA12_62=='r') ) {
                    int LA12_128 = input.LA(4);

                    if ( (LA12_128=='i') ) {
                        int LA12_176 = input.LA(5);

                        if ( (LA12_176=='n') ) {
                            int LA12_226 = input.LA(6);

                            if ( (LA12_226=='g') ) {
                                int LA12_274 = input.LA(7);

                                if ( (LA12_274=='i') ) {
                                    int LA12_319 = input.LA(8);

                                    if ( (LA12_319=='f') ) {
                                        int LA12_359 = input.LA(9);

                                        if ( (LA12_359=='i') ) {
                                            int LA12_390 = input.LA(10);

                                            if ( (LA12_390=='e') ) {
                                                int LA12_418 = input.LA(11);

                                                if ( (LA12_418=='r') ) {
                                                    int LA12_440 = input.LA(12);

                                                    if ( ((LA12_440>='0' && LA12_440<='9')||(LA12_440>='A' && LA12_440<='Z')||LA12_440=='_'||(LA12_440>='a' && LA12_440<='z')) ) {
                                                        alt12=71;
                                                    }
                                                    else {
                                                        alt12=66;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0=='l') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='o') ) {
                int LA12_63 = input.LA(3);

                if ( (LA12_63=='n') ) {
                    int LA12_129 = input.LA(4);

                    if ( (LA12_129=='g') ) {
                        int LA12_177 = input.LA(5);

                        if ( ((LA12_177>='0' && LA12_177<='9')||(LA12_177>='A' && LA12_177<='Z')||LA12_177=='_'||(LA12_177>='a' && LA12_177<='z')) ) {
                            alt12=71;
                        }
                        else {
                            alt12=8;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='o') ) {
            switch ( input.LA(2) ) {
            case 'b':
                {
                int LA12_64 = input.LA(3);

                if ( (LA12_64=='j') ) {
                    int LA12_130 = input.LA(4);

                    if ( (LA12_130=='e') ) {
                        int LA12_178 = input.LA(5);

                        if ( (LA12_178=='c') ) {
                            int LA12_228 = input.LA(6);

                            if ( (LA12_228=='t') ) {
                                int LA12_275 = input.LA(7);

                                if ( ((LA12_275>='0' && LA12_275<='9')||(LA12_275>='A' && LA12_275<='Z')||LA12_275=='_'||(LA12_275>='a' && LA12_275<='z')) ) {
                                    alt12=71;
                                }
                                else {
                                    alt12=10;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'c':
                {
                int LA12_65 = input.LA(3);

                if ( (LA12_65=='t') ) {
                    int LA12_131 = input.LA(4);

                    if ( (LA12_131=='e') ) {
                        int LA12_179 = input.LA(5);

                        if ( (LA12_179=='t') ) {
                            int LA12_229 = input.LA(6);

                            if ( ((LA12_229>='0' && LA12_229<='9')||(LA12_229>='A' && LA12_229<='Z')||LA12_229=='_'||(LA12_229>='a' && LA12_229<='z')) ) {
                                alt12=71;
                            }
                            else {
                                alt12=12;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'p':
                {
                int LA12_66 = input.LA(3);

                if ( (LA12_66=='t') ) {
                    int LA12_132 = input.LA(4);

                    if ( (LA12_132=='i') ) {
                        int LA12_180 = input.LA(5);

                        if ( (LA12_180=='o') ) {
                            int LA12_230 = input.LA(6);

                            if ( (LA12_230=='n') ) {
                                int LA12_277 = input.LA(7);

                                if ( (LA12_277=='a') ) {
                                    int LA12_321 = input.LA(8);

                                    if ( (LA12_321=='l') ) {
                                        int LA12_360 = input.LA(9);

                                        if ( ((LA12_360>='0' && LA12_360<='9')||(LA12_360>='A' && LA12_360<='Z')||LA12_360=='_'||(LA12_360>='a' && LA12_360<='z')) ) {
                                            alt12=71;
                                        }
                                        else {
                                            alt12=69;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'm':
                {
                int LA12_67 = input.LA(3);

                if ( (LA12_67=='i') ) {
                    int LA12_133 = input.LA(4);

                    if ( (LA12_133=='t') ) {
                        int LA12_181 = input.LA(5);

                        if ( (LA12_181=='t') ) {
                            int LA12_231 = input.LA(6);

                            if ( (LA12_231=='a') ) {
                                int LA12_278 = input.LA(7);

                                if ( (LA12_278=='b') ) {
                                    int LA12_322 = input.LA(8);

                                    if ( (LA12_322=='l') ) {
                                        int LA12_361 = input.LA(9);

                                        if ( (LA12_361=='e') ) {
                                            int LA12_392 = input.LA(10);

                                            if ( ((LA12_392>='0' && LA12_392<='9')||(LA12_392>='A' && LA12_392<='Z')||LA12_392=='_'||(LA12_392>='a' && LA12_392<='z')) ) {
                                                alt12=71;
                                            }
                                            else {
                                                alt12=67;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA12_68 = input.LA(3);

                if ( (LA12_68=='t') ) {
                    int LA12_134 = input.LA(4);

                    if ( (LA12_134=='r') ) {
                        int LA12_182 = input.LA(5);

                        if ( (LA12_182=='i') ) {
                            int LA12_232 = input.LA(6);

                            if ( (LA12_232=='b') ) {
                                int LA12_279 = input.LA(7);

                                if ( (LA12_279=='u') ) {
                                    int LA12_323 = input.LA(8);

                                    if ( (LA12_323=='t') ) {
                                        int LA12_362 = input.LA(9);

                                        if ( (LA12_362=='e') ) {
                                            int LA12_393 = input.LA(10);

                                            if ( ((LA12_393>='0' && LA12_393<='9')||(LA12_393>='A' && LA12_393<='Z')||LA12_393=='_'||(LA12_393>='a' && LA12_393<='z')) ) {
                                                alt12=71;
                                            }
                                            else {
                                                alt12=54;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'n':
                {
                int LA12_69 = input.LA(3);

                if ( (LA12_69=='y') ) {
                    int LA12_135 = input.LA(4);

                    if ( ((LA12_135>='0' && LA12_135<='9')||(LA12_135>='A' && LA12_135<='Z')||LA12_135=='_'||(LA12_135>='a' && LA12_135<='z')) ) {
                        alt12=71;
                    }
                    else {
                        alt12=11;}
                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0=='D') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='O') ) {
                int LA12_70 = input.LA(3);

                if ( (LA12_70=='M') ) {
                    int LA12_136 = input.LA(4);

                    if ( (LA12_136=='S') ) {
                        int LA12_184 = input.LA(5);

                        if ( (LA12_184=='t') ) {
                            int LA12_233 = input.LA(6);

                            if ( (LA12_233=='r') ) {
                                int LA12_280 = input.LA(7);

                                if ( (LA12_280=='i') ) {
                                    int LA12_324 = input.LA(8);

                                    if ( (LA12_324=='n') ) {
                                        int LA12_363 = input.LA(9);

                                        if ( (LA12_363=='g') ) {
                                            int LA12_394 = input.LA(10);

                                            if ( ((LA12_394>='0' && LA12_394<='9')||(LA12_394>='A' && LA12_394<='Z')||LA12_394=='_'||(LA12_394>='a' && LA12_394<='z')) ) {
                                                alt12=71;
                                            }
                                            else {
                                                alt12=13;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_137 = input.LA(4);

                    if ( (LA12_137=='e') ) {
                        int LA12_185 = input.LA(5);

                        if ( (LA12_185=='r') ) {
                            int LA12_234 = input.LA(6);

                            if ( (LA12_234=='f') ) {
                                int LA12_281 = input.LA(7);

                                if ( (LA12_281=='a') ) {
                                    int LA12_325 = input.LA(8);

                                    if ( (LA12_325=='c') ) {
                                        int LA12_364 = input.LA(9);

                                        if ( (LA12_364=='e') ) {
                                            int LA12_395 = input.LA(10);

                                            if ( ((LA12_395>='0' && LA12_395<='9')||(LA12_395>='A' && LA12_395<='Z')||LA12_395=='_'||(LA12_395>='a' && LA12_395<='z')) ) {
                                                alt12=71;
                                            }
                                            else {
                                                alt12=45;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt12=71;
                    }
                    break;
                default:
                    alt12=68;}

                }
                break;
            case 'm':
                {
                int LA12_72 = input.LA(3);

                if ( (LA12_72=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA12_186 = input.LA(5);

                        if ( (LA12_186=='r') ) {
                            int LA12_235 = input.LA(6);

                            if ( (LA12_235=='t') ) {
                                int LA12_282 = input.LA(7);

                                if ( ((LA12_282>='0' && LA12_282<='9')||(LA12_282>='A' && LA12_282<='Z')||LA12_282=='_'||(LA12_282>='a' && LA12_282<='z')) ) {
                                    alt12=71;
                                }
                                else {
                                    alt12=14;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                        }
                        break;
                    case 'l':
                        {
                        int LA12_187 = input.LA(5);

                        if ( (LA12_187=='e') ) {
                            int LA12_236 = input.LA(6);

                            if ( (LA12_236=='m') ) {
                                int LA12_283 = input.LA(7);

                                if ( (LA12_283=='e') ) {
                                    int LA12_327 = input.LA(8);

                                    if ( (LA12_327=='n') ) {
                                        int LA12_365 = input.LA(9);

                                        if ( (LA12_365=='t') ) {
                                            int LA12_396 = input.LA(10);

                                            if ( (LA12_396=='s') ) {
                                                int LA12_423 = input.LA(11);

                                                if ( ((LA12_423>='0' && LA12_423<='9')||(LA12_423>='A' && LA12_423<='Z')||LA12_423=='_'||(LA12_423>='a' && LA12_423<='z')) ) {
                                                    alt12=71;
                                                }
                                                else {
                                                    alt12=37;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                        }
                        break;
                    default:
                        alt12=71;}

                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0==';') ) {
            alt12=15;
        }
        else if ( (LA12_0=='t') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='y') ) {
                int LA12_74 = input.LA(3);

                if ( (LA12_74=='p') ) {
                    int LA12_140 = input.LA(4);

                    if ( (LA12_140=='e') ) {
                        int LA12_188 = input.LA(5);

                        if ( (LA12_188=='d') ) {
                            int LA12_237 = input.LA(6);

                            if ( (LA12_237=='e') ) {
                                int LA12_284 = input.LA(7);

                                if ( (LA12_284=='f') ) {
                                    int LA12_328 = input.LA(8);

                                    if ( ((LA12_328>='0' && LA12_328<='9')||(LA12_328>='A' && LA12_328<='Z')||LA12_328=='_'||(LA12_328>='a' && LA12_328<='z')) ) {
                                        alt12=71;
                                    }
                                    else {
                                        alt12=16;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='>') ) {
            alt12=18;
        }
        else if ( (LA12_0==':') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15==':') ) {
                alt12=19;
            }
            else {
                alt12=46;}
        }
        else if ( (LA12_0=='C') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_78 = input.LA(3);

                if ( (LA12_78=='n') ) {
                    int LA12_141 = input.LA(4);

                    if ( (LA12_141=='s') ) {
                        int LA12_189 = input.LA(5);

                        if ( (LA12_189=='t') ) {
                            int LA12_238 = input.LA(6);

                            if ( (LA12_238=='r') ) {
                                int LA12_285 = input.LA(7);

                                if ( (LA12_285=='u') ) {
                                    int LA12_329 = input.LA(8);

                                    if ( (LA12_329=='c') ) {
                                        int LA12_367 = input.LA(9);

                                        if ( (LA12_367=='t') ) {
                                            int LA12_397 = input.LA(10);

                                            if ( (LA12_397=='o') ) {
                                                int LA12_424 = input.LA(11);

                                                if ( (LA12_424=='r') ) {
                                                    int LA12_442 = input.LA(12);

                                                    if ( ((LA12_442>='0' && LA12_442<='9')||(LA12_442>='A' && LA12_442<='Z')||LA12_442=='_'||(LA12_442>='a' && LA12_442<='z')) ) {
                                                        alt12=71;
                                                    }
                                                    else {
                                                        alt12=20;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'a':
                {
                int LA12_79 = input.LA(3);

                if ( (LA12_79=='l') ) {
                    int LA12_142 = input.LA(4);

                    if ( (LA12_142=='l') ) {
                        int LA12_190 = input.LA(5);

                        if ( (LA12_190=='b') ) {
                            int LA12_239 = input.LA(6);

                            if ( (LA12_239=='a') ) {
                                int LA12_286 = input.LA(7);

                                if ( (LA12_286=='c') ) {
                                    int LA12_330 = input.LA(8);

                                    if ( (LA12_330=='k') ) {
                                        int LA12_368 = input.LA(9);

                                        if ( ((LA12_368>='0' && LA12_368<='9')||(LA12_368>='A' && LA12_368<='Z')||LA12_368=='_'||(LA12_368>='a' && LA12_368<='z')) ) {
                                            alt12=71;
                                        }
                                        else {
                                            alt12=26;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0=='(') ) {
            alt12=21;
        }
        else if ( (LA12_0==')') ) {
            alt12=22;
        }
        else if ( (LA12_0==',') ) {
            alt12=23;
        }
        else if ( (LA12_0=='N') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_83 = input.LA(3);

                if ( (LA12_83=='m') ) {
                    int LA12_143 = input.LA(4);

                    if ( (LA12_143=='e') ) {
                        switch ( input.LA(5) ) {
                        case 's':
                            {
                            int LA12_240 = input.LA(6);

                            if ( (LA12_240=='p') ) {
                                int LA12_287 = input.LA(7);

                                if ( (LA12_287=='a') ) {
                                    int LA12_331 = input.LA(8);

                                    if ( (LA12_331=='c') ) {
                                        int LA12_369 = input.LA(9);

                                        if ( (LA12_369=='e') ) {
                                            int LA12_399 = input.LA(10);

                                            if ( (LA12_399=='O') ) {
                                                int LA12_425 = input.LA(11);

                                                if ( (LA12_425=='b') ) {
                                                    int LA12_443 = input.LA(12);

                                                    if ( (LA12_443=='j') ) {
                                                        int LA12_458 = input.LA(13);

                                                        if ( (LA12_458=='e') ) {
                                                            int LA12_472 = input.LA(14);

                                                            if ( (LA12_472=='c') ) {
                                                                int LA12_482 = input.LA(15);

                                                                if ( (LA12_482=='t') ) {
                                                                    int LA12_489 = input.LA(16);

                                                                    if ( ((LA12_489>='0' && LA12_489<='9')||(LA12_489>='A' && LA12_489<='Z')||LA12_489=='_'||(LA12_489>='a' && LA12_489<='z')) ) {
                                                                        alt12=71;
                                                                    }
                                                                    else {
                                                                        alt12=44;}
                                                                }
                                                                else {
                                                                    alt12=71;}
                                                            }
                                                            else {
                                                                alt12=71;}
                                                        }
                                                        else {
                                                            alt12=71;}
                                                    }
                                                    else {
                                                        alt12=71;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                            }
                            break;
                        case 'd':
                            {
                            int LA12_241 = input.LA(6);

                            if ( (LA12_241=='C') ) {
                                int LA12_288 = input.LA(7);

                                if ( (LA12_288=='o') ) {
                                    int LA12_332 = input.LA(8);

                                    if ( (LA12_332=='n') ) {
                                        int LA12_370 = input.LA(9);

                                        if ( (LA12_370=='s') ) {
                                            int LA12_400 = input.LA(10);

                                            if ( (LA12_400=='t') ) {
                                                int LA12_426 = input.LA(11);

                                                if ( (LA12_426=='r') ) {
                                                    int LA12_444 = input.LA(12);

                                                    if ( (LA12_444=='u') ) {
                                                        int LA12_459 = input.LA(13);

                                                        if ( (LA12_459=='c') ) {
                                                            int LA12_473 = input.LA(14);

                                                            if ( (LA12_473=='t') ) {
                                                                int LA12_483 = input.LA(15);

                                                                if ( (LA12_483=='o') ) {
                                                                    int LA12_490 = input.LA(16);

                                                                    if ( (LA12_490=='r') ) {
                                                                        int LA12_496 = input.LA(17);

                                                                        if ( ((LA12_496>='0' && LA12_496<='9')||(LA12_496>='A' && LA12_496<='Z')||LA12_496=='_'||(LA12_496>='a' && LA12_496<='z')) ) {
                                                                            alt12=71;
                                                                        }
                                                                        else {
                                                                            alt12=24;}
                                                                    }
                                                                    else {
                                                                        alt12=71;}
                                                                }
                                                                else {
                                                                    alt12=71;}
                                                            }
                                                            else {
                                                                alt12=71;}
                                                        }
                                                        else {
                                                            alt12=71;}
                                                    }
                                                    else {
                                                        alt12=71;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                            }
                            break;
                        default:
                            alt12=71;}

                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'o':
                {
                int LA12_84 = input.LA(3);

                if ( (LA12_84=='I') ) {
                    int LA12_144 = input.LA(4);

                    if ( (LA12_144=='n') ) {
                        int LA12_192 = input.LA(5);

                        if ( (LA12_192=='t') ) {
                            int LA12_242 = input.LA(6);

                            if ( (LA12_242=='e') ) {
                                int LA12_289 = input.LA(7);

                                if ( (LA12_289=='r') ) {
                                    int LA12_333 = input.LA(8);

                                    if ( (LA12_333=='f') ) {
                                        int LA12_371 = input.LA(9);

                                        if ( (LA12_371=='a') ) {
                                            int LA12_401 = input.LA(10);

                                            if ( (LA12_401=='c') ) {
                                                int LA12_427 = input.LA(11);

                                                if ( (LA12_427=='e') ) {
                                                    int LA12_445 = input.LA(12);

                                                    if ( (LA12_445=='O') ) {
                                                        int LA12_460 = input.LA(13);

                                                        if ( (LA12_460=='b') ) {
                                                            int LA12_474 = input.LA(14);

                                                            if ( (LA12_474=='j') ) {
                                                                int LA12_484 = input.LA(15);

                                                                if ( (LA12_484=='e') ) {
                                                                    int LA12_491 = input.LA(16);

                                                                    if ( (LA12_491=='c') ) {
                                                                        int LA12_497 = input.LA(17);

                                                                        if ( (LA12_497=='t') ) {
                                                                            int LA12_502 = input.LA(18);

                                                                            if ( ((LA12_502>='0' && LA12_502<='9')||(LA12_502>='A' && LA12_502<='Z')||LA12_502=='_'||(LA12_502>='a' && LA12_502<='z')) ) {
                                                                                alt12=71;
                                                                            }
                                                                            else {
                                                                                alt12=27;}
                                                                        }
                                                                        else {
                                                                            alt12=71;}
                                                                    }
                                                                    else {
                                                                        alt12=71;}
                                                                }
                                                                else {
                                                                    alt12=71;}
                                                            }
                                                            else {
                                                                alt12=71;}
                                                        }
                                                        else {
                                                            alt12=71;}
                                                    }
                                                    else {
                                                        alt12=71;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0=='=') ) {
            alt12=25;
        }
        else if ( (LA12_0=='P') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'o':
                    {
                    switch ( input.LA(4) ) {
                    case 't':
                        {
                        int LA12_193 = input.LA(5);

                        if ( (LA12_193=='o') ) {
                            int LA12_243 = input.LA(6);

                            if ( (LA12_243=='t') ) {
                                int LA12_290 = input.LA(7);

                                if ( (LA12_290=='y') ) {
                                    int LA12_334 = input.LA(8);

                                    if ( (LA12_334=='p') ) {
                                        int LA12_372 = input.LA(9);

                                        if ( (LA12_372=='e') ) {
                                            int LA12_402 = input.LA(10);

                                            if ( (LA12_402=='R') ) {
                                                int LA12_428 = input.LA(11);

                                                if ( (LA12_428=='o') ) {
                                                    int LA12_446 = input.LA(12);

                                                    if ( (LA12_446=='o') ) {
                                                        int LA12_461 = input.LA(13);

                                                        if ( (LA12_461=='t') ) {
                                                            int LA12_475 = input.LA(14);

                                                            if ( ((LA12_475>='0' && LA12_475<='9')||(LA12_475>='A' && LA12_475<='Z')||LA12_475=='_'||(LA12_475>='a' && LA12_475<='z')) ) {
                                                                alt12=71;
                                                            }
                                                            else {
                                                                alt12=28;}
                                                        }
                                                        else {
                                                            alt12=71;}
                                                    }
                                                    else {
                                                        alt12=71;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                        }
                        break;
                    case 'p':
                        {
                        int LA12_194 = input.LA(5);

                        if ( (LA12_194=='e') ) {
                            int LA12_244 = input.LA(6);

                            if ( (LA12_244=='r') ) {
                                int LA12_291 = input.LA(7);

                                if ( (LA12_291=='t') ) {
                                    int LA12_335 = input.LA(8);

                                    if ( (LA12_335=='y') ) {
                                        int LA12_373 = input.LA(9);

                                        if ( (LA12_373=='O') ) {
                                            int LA12_403 = input.LA(10);

                                            if ( (LA12_403=='n') ) {
                                                int LA12_429 = input.LA(11);

                                                if ( (LA12_429=='l') ) {
                                                    int LA12_447 = input.LA(12);

                                                    if ( (LA12_447=='y') ) {
                                                        int LA12_462 = input.LA(13);

                                                        if ( ((LA12_462>='0' && LA12_462<='9')||(LA12_462>='A' && LA12_462<='Z')||LA12_462=='_'||(LA12_462>='a' && LA12_462<='z')) ) {
                                                            alt12=71;
                                                        }
                                                        else {
                                                            alt12=64;}
                                                    }
                                                    else {
                                                        alt12=71;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                        }
                        break;
                    default:
                        alt12=71;}

                    }
                    break;
                case 'e':
                    {
                    int LA12_146 = input.LA(4);

                    if ( (LA12_146=='f') ) {
                        int LA12_195 = input.LA(5);

                        if ( (LA12_195=='i') ) {
                            int LA12_245 = input.LA(6);

                            if ( (LA12_245=='x') ) {
                                int LA12_292 = input.LA(7);

                                if ( ((LA12_292>='0' && LA12_292<='9')||(LA12_292>='A' && LA12_292<='Z')||LA12_292=='_'||(LA12_292>='a' && LA12_292<='z')) ) {
                                    alt12=71;
                                }
                                else {
                                    alt12=43;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                    }
                    break;
                default:
                    alt12=71;}

                }
                break;
            case 'u':
                {
                int LA12_87 = input.LA(3);

                if ( (LA12_87=='t') ) {
                    int LA12_147 = input.LA(4);

                    if ( (LA12_147=='F') ) {
                        int LA12_196 = input.LA(5);

                        if ( (LA12_196=='o') ) {
                            int LA12_246 = input.LA(6);

                            if ( (LA12_246=='r') ) {
                                int LA12_293 = input.LA(7);

                                if ( (LA12_293=='w') ) {
                                    int LA12_337 = input.LA(8);

                                    if ( (LA12_337=='a') ) {
                                        int LA12_374 = input.LA(9);

                                        if ( (LA12_374=='r') ) {
                                            int LA12_404 = input.LA(10);

                                            if ( (LA12_404=='d') ) {
                                                int LA12_430 = input.LA(11);

                                                if ( (LA12_430=='s') ) {
                                                    int LA12_448 = input.LA(12);

                                                    if ( ((LA12_448>='0' && LA12_448<='9')||(LA12_448>='A' && LA12_448<='Z')||LA12_448=='_'||(LA12_448>='a' && LA12_448<='z')) ) {
                                                        alt12=71;
                                                    }
                                                    else {
                                                        alt12=29;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0=='T') ) {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='r') ) {
                int LA12_88 = input.LA(3);

                if ( (LA12_88=='e') ) {
                    int LA12_148 = input.LA(4);

                    if ( (LA12_148=='a') ) {
                        int LA12_197 = input.LA(5);

                        if ( (LA12_197=='t') ) {
                            switch ( input.LA(6) ) {
                            case 'N':
                                {
                                int LA12_294 = input.LA(7);

                                if ( (LA12_294=='u') ) {
                                    int LA12_338 = input.LA(8);

                                    if ( (LA12_338=='l') ) {
                                        int LA12_375 = input.LA(9);

                                        if ( (LA12_375=='l') ) {
                                            int LA12_405 = input.LA(10);

                                            if ( (LA12_405=='A') ) {
                                                int LA12_431 = input.LA(11);

                                                if ( (LA12_431=='s') ) {
                                                    int LA12_449 = input.LA(12);

                                                    if ( ((LA12_449>='0' && LA12_449<='9')||(LA12_449>='A' && LA12_449<='Z')||LA12_449=='_'||(LA12_449>='a' && LA12_449<='z')) ) {
                                                        alt12=71;
                                                    }
                                                    else {
                                                        alt12=30;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                                }
                                break;
                            case 'U':
                                {
                                int LA12_295 = input.LA(7);

                                if ( (LA12_295=='n') ) {
                                    int LA12_339 = input.LA(8);

                                    if ( (LA12_339=='d') ) {
                                        int LA12_376 = input.LA(9);

                                        if ( (LA12_376=='e') ) {
                                            int LA12_406 = input.LA(10);

                                            if ( (LA12_406=='f') ) {
                                                int LA12_432 = input.LA(11);

                                                if ( (LA12_432=='i') ) {
                                                    int LA12_450 = input.LA(12);

                                                    if ( (LA12_450=='n') ) {
                                                        int LA12_465 = input.LA(13);

                                                        if ( (LA12_465=='e') ) {
                                                            int LA12_477 = input.LA(14);

                                                            if ( (LA12_477=='d') ) {
                                                                int LA12_486 = input.LA(15);

                                                                if ( (LA12_486=='A') ) {
                                                                    int LA12_492 = input.LA(16);

                                                                    if ( (LA12_492=='s') ) {
                                                                        int LA12_498 = input.LA(17);

                                                                        if ( ((LA12_498>='0' && LA12_498<='9')||(LA12_498>='A' && LA12_498<='Z')||LA12_498=='_'||(LA12_498>='a' && LA12_498<='z')) ) {
                                                                            alt12=71;
                                                                        }
                                                                        else {
                                                                            alt12=32;}
                                                                    }
                                                                    else {
                                                                        alt12=71;}
                                                                }
                                                                else {
                                                                    alt12=71;}
                                                            }
                                                            else {
                                                                alt12=71;}
                                                        }
                                                        else {
                                                            alt12=71;}
                                                    }
                                                    else {
                                                        alt12=71;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                                }
                                break;
                            default:
                                alt12=71;}

                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='E') ) {
            int LA12_24 = input.LA(2);

            if ( (LA12_24=='m') ) {
                int LA12_89 = input.LA(3);

                if ( (LA12_89=='p') ) {
                    int LA12_149 = input.LA(4);

                    if ( (LA12_149=='t') ) {
                        int LA12_198 = input.LA(5);

                        if ( (LA12_198=='y') ) {
                            int LA12_248 = input.LA(6);

                            if ( (LA12_248=='S') ) {
                                int LA12_296 = input.LA(7);

                                if ( (LA12_296=='t') ) {
                                    int LA12_340 = input.LA(8);

                                    if ( (LA12_340=='r') ) {
                                        int LA12_377 = input.LA(9);

                                        if ( (LA12_377=='i') ) {
                                            int LA12_407 = input.LA(10);

                                            if ( (LA12_407=='n') ) {
                                                int LA12_433 = input.LA(11);

                                                if ( (LA12_433=='g') ) {
                                                    int LA12_451 = input.LA(12);

                                                    if ( ((LA12_451>='0' && LA12_451<='9')||(LA12_451>='A' && LA12_451<='Z')||LA12_451=='_'||(LA12_451>='a' && LA12_451<='z')) ) {
                                                        alt12=71;
                                                    }
                                                    else {
                                                        alt12=31;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='A') ) {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='l') ) {
                int LA12_90 = input.LA(3);

                if ( (LA12_90=='l') ) {
                    int LA12_150 = input.LA(4);

                    if ( (LA12_150=='o') ) {
                        int LA12_199 = input.LA(5);

                        if ( (LA12_199=='w') ) {
                            int LA12_249 = input.LA(6);

                            if ( (LA12_249=='A') ) {
                                int LA12_297 = input.LA(7);

                                if ( (LA12_297=='n') ) {
                                    int LA12_341 = input.LA(8);

                                    if ( (LA12_341=='y') ) {
                                        int LA12_378 = input.LA(9);

                                        if ( ((LA12_378>='0' && LA12_378<='9')||(LA12_378>='A' && LA12_378<='Z')||LA12_378=='_'||(LA12_378>='a' && LA12_378<='z')) ) {
                                            alt12=71;
                                        }
                                        else {
                                            alt12=33;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='R') ) {
            int LA12_26 = input.LA(2);

            if ( (LA12_26=='e') ) {
                int LA12_91 = input.LA(3);

                if ( (LA12_91=='p') ) {
                    int LA12_151 = input.LA(4);

                    if ( (LA12_151=='l') ) {
                        int LA12_200 = input.LA(5);

                        if ( (LA12_200=='a') ) {
                            int LA12_250 = input.LA(6);

                            if ( (LA12_250=='c') ) {
                                int LA12_298 = input.LA(7);

                                if ( (LA12_298=='e') ) {
                                    int LA12_342 = input.LA(8);

                                    if ( (LA12_342=='a') ) {
                                        int LA12_379 = input.LA(9);

                                        if ( (LA12_379=='b') ) {
                                            int LA12_409 = input.LA(10);

                                            if ( (LA12_409=='l') ) {
                                                int LA12_434 = input.LA(11);

                                                if ( (LA12_434=='e') ) {
                                                    switch ( input.LA(12) ) {
                                                    case 'N':
                                                        {
                                                        int LA12_467 = input.LA(13);

                                                        if ( (LA12_467=='a') ) {
                                                            int LA12_478 = input.LA(14);

                                                            if ( (LA12_478=='m') ) {
                                                                int LA12_487 = input.LA(15);

                                                                if ( (LA12_487=='e') ) {
                                                                    int LA12_493 = input.LA(16);

                                                                    if ( (LA12_493=='d') ) {
                                                                        int LA12_499 = input.LA(17);

                                                                        if ( (LA12_499=='P') ) {
                                                                            int LA12_504 = input.LA(18);

                                                                            if ( (LA12_504=='r') ) {
                                                                                int LA12_506 = input.LA(19);

                                                                                if ( (LA12_506=='o') ) {
                                                                                    int LA12_507 = input.LA(20);

                                                                                    if ( (LA12_507=='p') ) {
                                                                                        int LA12_508 = input.LA(21);

                                                                                        if ( (LA12_508=='e') ) {
                                                                                            int LA12_509 = input.LA(22);

                                                                                            if ( (LA12_509=='r') ) {
                                                                                                int LA12_510 = input.LA(23);

                                                                                                if ( (LA12_510=='t') ) {
                                                                                                    int LA12_511 = input.LA(24);

                                                                                                    if ( (LA12_511=='i') ) {
                                                                                                        int LA12_512 = input.LA(25);

                                                                                                        if ( (LA12_512=='e') ) {
                                                                                                            int LA12_513 = input.LA(26);

                                                                                                            if ( (LA12_513=='s') ) {
                                                                                                                int LA12_514 = input.LA(27);

                                                                                                                if ( ((LA12_514>='0' && LA12_514<='9')||(LA12_514>='A' && LA12_514<='Z')||LA12_514=='_'||(LA12_514>='a' && LA12_514<='z')) ) {
                                                                                                                    alt12=71;
                                                                                                                }
                                                                                                                else {
                                                                                                                    alt12=36;}
                                                                                                            }
                                                                                                            else {
                                                                                                                alt12=71;}
                                                                                                        }
                                                                                                        else {
                                                                                                            alt12=71;}
                                                                                                    }
                                                                                                    else {
                                                                                                        alt12=71;}
                                                                                                }
                                                                                                else {
                                                                                                    alt12=71;}
                                                                                            }
                                                                                            else {
                                                                                                alt12=71;}
                                                                                        }
                                                                                        else {
                                                                                            alt12=71;}
                                                                                    }
                                                                                    else {
                                                                                        alt12=71;}
                                                                                }
                                                                                else {
                                                                                    alt12=71;}
                                                                            }
                                                                            else {
                                                                                alt12=71;}
                                                                        }
                                                                        else {
                                                                            alt12=71;}
                                                                    }
                                                                    else {
                                                                        alt12=71;}
                                                                }
                                                                else {
                                                                    alt12=71;}
                                                            }
                                                            else {
                                                                alt12=71;}
                                                        }
                                                        else {
                                                            alt12=71;}
                                                        }
                                                        break;
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                    case 'A':
                                                    case 'B':
                                                    case 'C':
                                                    case 'D':
                                                    case 'E':
                                                    case 'F':
                                                    case 'G':
                                                    case 'H':
                                                    case 'I':
                                                    case 'J':
                                                    case 'K':
                                                    case 'L':
                                                    case 'M':
                                                    case 'O':
                                                    case 'P':
                                                    case 'Q':
                                                    case 'R':
                                                    case 'S':
                                                    case 'T':
                                                    case 'U':
                                                    case 'V':
                                                    case 'W':
                                                    case 'X':
                                                    case 'Y':
                                                    case 'Z':
                                                    case '_':
                                                    case 'a':
                                                    case 'b':
                                                    case 'c':
                                                    case 'd':
                                                    case 'e':
                                                    case 'f':
                                                    case 'g':
                                                    case 'h':
                                                    case 'i':
                                                    case 'j':
                                                    case 'k':
                                                    case 'l':
                                                    case 'm':
                                                    case 'n':
                                                    case 'o':
                                                    case 'p':
                                                    case 'q':
                                                    case 'r':
                                                    case 's':
                                                    case 't':
                                                    case 'u':
                                                    case 'v':
                                                    case 'w':
                                                    case 'x':
                                                    case 'y':
                                                    case 'z':
                                                        {
                                                        alt12=71;
                                                        }
                                                        break;
                                                    default:
                                                        alt12=34;}

                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='S') ) {
            int LA12_27 = input.LA(2);

            if ( (LA12_27=='u') ) {
                int LA12_92 = input.LA(3);

                if ( (LA12_92=='p') ) {
                    int LA12_152 = input.LA(4);

                    if ( (LA12_152=='p') ) {
                        int LA12_201 = input.LA(5);

                        if ( (LA12_201=='l') ) {
                            int LA12_251 = input.LA(6);

                            if ( (LA12_251=='e') ) {
                                int LA12_299 = input.LA(7);

                                if ( (LA12_299=='m') ) {
                                    int LA12_343 = input.LA(8);

                                    if ( (LA12_343=='e') ) {
                                        int LA12_380 = input.LA(9);

                                        if ( (LA12_380=='n') ) {
                                            int LA12_410 = input.LA(10);

                                            if ( (LA12_410=='t') ) {
                                                int LA12_435 = input.LA(11);

                                                if ( (LA12_435=='a') ) {
                                                    int LA12_453 = input.LA(12);

                                                    if ( (LA12_453=='l') ) {
                                                        int LA12_469 = input.LA(13);

                                                        if ( ((LA12_469>='0' && LA12_469<='9')||(LA12_469>='A' && LA12_469<='Z')||LA12_469=='_'||(LA12_469>='a' && LA12_469<='z')) ) {
                                                            alt12=71;
                                                        }
                                                        else {
                                                            alt12=35;}
                                                    }
                                                    else {
                                                        alt12=71;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='m') ) {
            int LA12_28 = input.LA(2);

            if ( (LA12_28=='o') ) {
                int LA12_93 = input.LA(3);

                if ( (LA12_93=='d') ) {
                    int LA12_153 = input.LA(4);

                    if ( (LA12_153=='u') ) {
                        int LA12_202 = input.LA(5);

                        if ( (LA12_202=='l') ) {
                            int LA12_252 = input.LA(6);

                            if ( (LA12_252=='e') ) {
                                int LA12_300 = input.LA(7);

                                if ( ((LA12_300>='0' && LA12_300<='9')||(LA12_300>='A' && LA12_300<='Z')||LA12_300=='_'||(LA12_300>='a' && LA12_300<='z')) ) {
                                    alt12=71;
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=39;
        }
        else if ( (LA12_0=='}') ) {
            alt12=40;
        }
        else if ( (LA12_0=='[') ) {
            int LA12_31 = input.LA(2);

            if ( (LA12_31==']') ) {
                alt12=60;
            }
            else {
                alt12=41;}
        }
        else if ( (LA12_0==']') ) {
            alt12=42;
        }
        else if ( (LA12_0=='r') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_99 = input.LA(3);

                if ( (LA12_99=='i') ) {
                    int LA12_154 = input.LA(4);

                    if ( (LA12_154=='s') ) {
                        int LA12_203 = input.LA(5);

                        if ( (LA12_203=='e') ) {
                            int LA12_253 = input.LA(6);

                            if ( (LA12_253=='s') ) {
                                int LA12_301 = input.LA(7);

                                if ( ((LA12_301>='0' && LA12_301<='9')||(LA12_301>='A' && LA12_301<='Z')||LA12_301=='_'||(LA12_301>='a' && LA12_301<='z')) ) {
                                    alt12=71;
                                }
                                else {
                                    alt12=47;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'e':
                {
                int LA12_100 = input.LA(3);

                if ( (LA12_100=='a') ) {
                    int LA12_155 = input.LA(4);

                    if ( (LA12_155=='d') ) {
                        int LA12_204 = input.LA(5);

                        if ( (LA12_204=='o') ) {
                            int LA12_254 = input.LA(6);

                            if ( (LA12_254=='n') ) {
                                int LA12_302 = input.LA(7);

                                if ( (LA12_302=='l') ) {
                                    int LA12_346 = input.LA(8);

                                    if ( (LA12_346=='y') ) {
                                        int LA12_381 = input.LA(9);

                                        if ( ((LA12_381>='0' && LA12_381<='9')||(LA12_381>='A' && LA12_381<='Z')||LA12_381=='_'||(LA12_381>='a' && LA12_381<='z')) ) {
                                            alt12=71;
                                        }
                                        else {
                                            alt12=53;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0=='g') ) {
            int LA12_34 = input.LA(2);

            if ( (LA12_34=='e') ) {
                int LA12_101 = input.LA(3);

                if ( (LA12_101=='t') ) {
                    switch ( input.LA(4) ) {
                    case 'r':
                        {
                        int LA12_205 = input.LA(5);

                        if ( (LA12_205=='a') ) {
                            int LA12_255 = input.LA(6);

                            if ( (LA12_255=='i') ) {
                                int LA12_303 = input.LA(7);

                                if ( (LA12_303=='s') ) {
                                    int LA12_347 = input.LA(8);

                                    if ( (LA12_347=='e') ) {
                                        int LA12_382 = input.LA(9);

                                        if ( (LA12_382=='s') ) {
                                            int LA12_412 = input.LA(10);

                                            if ( ((LA12_412>='0' && LA12_412<='9')||(LA12_412>='A' && LA12_412<='Z')||LA12_412=='_'||(LA12_412>='a' && LA12_412<='z')) ) {
                                                alt12=71;
                                            }
                                            else {
                                                alt12=55;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                        }
                        break;
                    case 't':
                        {
                        int LA12_206 = input.LA(5);

                        if ( (LA12_206=='e') ) {
                            int LA12_256 = input.LA(6);

                            if ( (LA12_256=='r') ) {
                                int LA12_304 = input.LA(7);

                                if ( ((LA12_304>='0' && LA12_304<='9')||(LA12_304>='A' && LA12_304<='Z')||LA12_304=='_'||(LA12_304>='a' && LA12_304<='z')) ) {
                                    alt12=71;
                                }
                                else {
                                    alt12=48;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                        }
                        break;
                    default:
                        alt12=71;}

                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_102 = input.LA(3);

                if ( (LA12_102=='e') ) {
                    int LA12_157 = input.LA(4);

                    if ( (LA12_157=='a') ) {
                        int LA12_207 = input.LA(5);

                        if ( (LA12_207=='t') ) {
                            int LA12_257 = input.LA(6);

                            if ( (LA12_257=='o') ) {
                                int LA12_305 = input.LA(7);

                                if ( (LA12_305=='r') ) {
                                    int LA12_349 = input.LA(8);

                                    if ( ((LA12_349>='0' && LA12_349<='9')||(LA12_349>='A' && LA12_349<='Z')||LA12_349=='_'||(LA12_349>='a' && LA12_349<='z')) ) {
                                        alt12=71;
                                    }
                                    else {
                                        alt12=50;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'o':
                {
                int LA12_103 = input.LA(3);

                if ( (LA12_103=='n') ) {
                    int LA12_158 = input.LA(4);

                    if ( (LA12_158=='s') ) {
                        int LA12_208 = input.LA(5);

                        if ( (LA12_208=='t') ) {
                            int LA12_258 = input.LA(6);

                            if ( ((LA12_258>='0' && LA12_258<='9')||(LA12_258>='A' && LA12_258<='Z')||LA12_258=='_'||(LA12_258>='a' && LA12_258<='z')) ) {
                                alt12=71;
                            }
                            else {
                                alt12=58;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            case 'a':
                {
                int LA12_104 = input.LA(3);

                if ( (LA12_104=='l') ) {
                    int LA12_159 = input.LA(4);

                    if ( (LA12_159=='l') ) {
                        int LA12_209 = input.LA(5);

                        if ( (LA12_209=='e') ) {
                            int LA12_259 = input.LA(6);

                            if ( (LA12_259=='r') ) {
                                int LA12_307 = input.LA(7);

                                if ( ((LA12_307>='0' && LA12_307<='9')||(LA12_307>='A' && LA12_307<='Z')||LA12_307=='_'||(LA12_307>='a' && LA12_307<='z')) ) {
                                    alt12=71;
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
                }
                break;
            default:
                alt12=71;}

        }
        else if ( (LA12_0=='e') ) {
            int LA12_36 = input.LA(2);

            if ( (LA12_36=='x') ) {
                int LA12_105 = input.LA(3);

                if ( (LA12_105=='c') ) {
                    int LA12_160 = input.LA(4);

                    if ( (LA12_160=='e') ) {
                        int LA12_210 = input.LA(5);

                        if ( (LA12_210=='p') ) {
                            int LA12_260 = input.LA(6);

                            if ( (LA12_260=='t') ) {
                                int LA12_308 = input.LA(7);

                                if ( (LA12_308=='i') ) {
                                    int LA12_351 = input.LA(8);

                                    if ( (LA12_351=='o') ) {
                                        int LA12_384 = input.LA(9);

                                        if ( (LA12_384=='n') ) {
                                            int LA12_413 = input.LA(10);

                                            if ( ((LA12_413>='0' && LA12_413<='9')||(LA12_413>='A' && LA12_413<='Z')||LA12_413=='_'||(LA12_413>='a' && LA12_413<='z')) ) {
                                                alt12=71;
                                            }
                                            else {
                                                alt12=57;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='0') ) {
            int LA12_37 = input.LA(2);

            if ( (LA12_37=='x') ) {
                alt12=59;
            }
            else {
                alt12=72;}
        }
        else if ( (LA12_0=='u') ) {
            int LA12_38 = input.LA(2);

            if ( (LA12_38=='n') ) {
                int LA12_108 = input.LA(3);

                if ( (LA12_108=='s') ) {
                    int LA12_161 = input.LA(4);

                    if ( (LA12_161=='i') ) {
                        int LA12_211 = input.LA(5);

                        if ( (LA12_211=='g') ) {
                            int LA12_261 = input.LA(6);

                            if ( (LA12_261=='n') ) {
                                int LA12_309 = input.LA(7);

                                if ( (LA12_309=='e') ) {
                                    int LA12_352 = input.LA(8);

                                    if ( (LA12_352=='d') ) {
                                        int LA12_385 = input.LA(9);

                                        if ( ((LA12_385>='0' && LA12_385<='9')||(LA12_385>='A' && LA12_385<='Z')||LA12_385=='_'||(LA12_385>='a' && LA12_385<='z')) ) {
                                            alt12=71;
                                        }
                                        else {
                                            alt12=61;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='?') ) {
            alt12=62;
        }
        else if ( (LA12_0=='F') ) {
            int LA12_40 = input.LA(2);

            if ( (LA12_40=='u') ) {
                int LA12_110 = input.LA(3);

                if ( (LA12_110=='n') ) {
                    int LA12_162 = input.LA(4);

                    if ( (LA12_162=='c') ) {
                        int LA12_212 = input.LA(5);

                        if ( (LA12_212=='t') ) {
                            int LA12_262 = input.LA(6);

                            if ( (LA12_262=='i') ) {
                                int LA12_310 = input.LA(7);

                                if ( (LA12_310=='o') ) {
                                    int LA12_353 = input.LA(8);

                                    if ( (LA12_353=='n') ) {
                                        int LA12_386 = input.LA(9);

                                        if ( (LA12_386=='O') ) {
                                            int LA12_415 = input.LA(10);

                                            if ( (LA12_415=='n') ) {
                                                int LA12_438 = input.LA(11);

                                                if ( (LA12_438=='l') ) {
                                                    int LA12_454 = input.LA(12);

                                                    if ( (LA12_454=='y') ) {
                                                        int LA12_470 = input.LA(13);

                                                        if ( ((LA12_470>='0' && LA12_470<='9')||(LA12_470>='A' && LA12_470<='Z')||LA12_470=='_'||(LA12_470>='a' && LA12_470<='z')) ) {
                                                            alt12=71;
                                                        }
                                                        else {
                                                            alt12=63;}
                                                    }
                                                    else {
                                                        alt12=71;}
                                                }
                                                else {
                                                    alt12=71;}
                                            }
                                            else {
                                                alt12=71;}
                                        }
                                        else {
                                            alt12=71;}
                                    }
                                    else {
                                        alt12=71;}
                                }
                                else {
                                    alt12=71;}
                            }
                            else {
                                alt12=71;}
                        }
                        else {
                            alt12=71;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='n') ) {
            int LA12_41 = input.LA(2);

            if ( (LA12_41=='u') ) {
                int LA12_111 = input.LA(3);

                if ( (LA12_111=='l') ) {
                    int LA12_163 = input.LA(4);

                    if ( (LA12_163=='l') ) {
                        int LA12_213 = input.LA(5);

                        if ( ((LA12_213>='0' && LA12_213<='9')||(LA12_213>='A' && LA12_213<='Z')||LA12_213=='_'||(LA12_213>='a' && LA12_213<='z')) ) {
                            alt12=71;
                        }
                        else {
                            alt12=65;}
                    }
                    else {
                        alt12=71;}
                }
                else {
                    alt12=71;}
            }
            else {
                alt12=71;}
        }
        else if ( (LA12_0=='.') ) {
            int LA12_42 = input.LA(2);

            if ( (LA12_42=='.') ) {
                alt12=70;
            }
            else {
                alt12=77;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_43 = input.LA(2);

            if ( ((LA12_43>='A' && LA12_43<='Z')||LA12_43=='_'||(LA12_43>='a' && LA12_43<='z')) ) {
                alt12=71;
            }
            else {
                alt12=77;}
        }
        else if ( (LA12_0=='B'||(LA12_0>='G' && LA12_0<='M')||LA12_0=='Q'||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='p' && LA12_0<='q')||(LA12_0>='w' && LA12_0<='z')) ) {
            alt12=71;
        }
        else if ( ((LA12_0>='1' && LA12_0<='9')) ) {
            alt12=72;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_46 = input.LA(2);

            if ( ((LA12_46>='\u0000' && LA12_46<='\uFFFE')) ) {
                alt12=73;
            }
            else {
                alt12=77;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_47 = input.LA(2);

            if ( ((LA12_47>='\u0000' && LA12_47<='\uFFFE')) ) {
                alt12=73;
            }
            else {
                alt12=77;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=75;
                }
                break;
            case '*':
                {
                alt12=74;
                }
                break;
            default:
                alt12=77;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=76;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='-'||LA12_0=='<'||LA12_0=='@'||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=77;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:218: T63
                {
                mT63(); 

                }
                break;
            case 54 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:222: T64
                {
                mT64(); 

                }
                break;
            case 55 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:226: T65
                {
                mT65(); 

                }
                break;
            case 56 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:230: T66
                {
                mT66(); 

                }
                break;
            case 57 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:234: T67
                {
                mT67(); 

                }
                break;
            case 58 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:238: T68
                {
                mT68(); 

                }
                break;
            case 59 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:242: T69
                {
                mT69(); 

                }
                break;
            case 60 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:246: T70
                {
                mT70(); 

                }
                break;
            case 61 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:250: T71
                {
                mT71(); 

                }
                break;
            case 62 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:254: T72
                {
                mT72(); 

                }
                break;
            case 63 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:258: T73
                {
                mT73(); 

                }
                break;
            case 64 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:262: T74
                {
                mT74(); 

                }
                break;
            case 65 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:266: T75
                {
                mT75(); 

                }
                break;
            case 66 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:270: T76
                {
                mT76(); 

                }
                break;
            case 67 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:274: T77
                {
                mT77(); 

                }
                break;
            case 68 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:278: T78
                {
                mT78(); 

                }
                break;
            case 69 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:282: T79
                {
                mT79(); 

                }
                break;
            case 70 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:286: T80
                {
                mT80(); 

                }
                break;
            case 71 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:290: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 72 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:298: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 73 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:307: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 74 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:319: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 75 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:335: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 76 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:351: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 77 :
                // ../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g:1:359: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}