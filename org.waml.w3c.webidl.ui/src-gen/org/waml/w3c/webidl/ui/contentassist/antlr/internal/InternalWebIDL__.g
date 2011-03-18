lexer grammar InternalWebIDL;
@header {
package org.waml.w3c.webidl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'OverrideBuiltins' ;
T12 : 'void' ;
T13 : 'boolean' ;
T14 : 'byte' ;
T15 : 'double' ;
T16 : 'float' ;
T17 : 'short' ;
T18 : 'long' ;
T19 : 'Object' ;
T20 : 'object' ;
T21 : 'any' ;
T22 : 'octet' ;
T23 : 'DOMString' ;
T24 : 'import' ;
T25 : ';' ;
T26 : 'typedef' ;
T27 : 'sequence<' ;
T28 : '>' ;
T29 : '::' ;
T30 : 'Constructor' ;
T31 : '(' ;
T32 : ')' ;
T33 : ',' ;
T34 : 'NamedConstructor' ;
T35 : '=' ;
T36 : 'Callback' ;
T37 : 'NoInterfaceObject' ;
T38 : 'PrototypeRoot' ;
T39 : 'PutForwards' ;
T40 : 'TreatNullAs' ;
T41 : 'EmptyString' ;
T42 : 'TreatUndefinedAs' ;
T43 : 'AllowAny' ;
T44 : 'Replaceable' ;
T45 : 'Supplemental' ;
T46 : 'ReplaceableNamedProperties' ;
T47 : 'implements' ;
T48 : 'module' ;
T49 : '{' ;
T50 : '}' ;
T51 : '[' ;
T52 : ']' ;
T53 : 'Prefix' ;
T54 : 'NamespaceObject' ;
T55 : 'interface' ;
T56 : ':' ;
T57 : 'raises' ;
T58 : 'getter' ;
T59 : 'setter' ;
T60 : 'creator' ;
T61 : 'deleter' ;
T62 : 'caller' ;
T63 : 'readonly' ;
T64 : 'attribute' ;
T65 : 'getraises' ;
T66 : 'setraises' ;
T67 : 'exception' ;
T68 : 'const' ;
T69 : '0x' ;
T70 : '[]' ;
T71 : 'unsigned' ;
T72 : '?' ;
T73 : 'FunctionOnly' ;
T74 : 'PropertyOnly' ;
T75 : 'null' ;
T76 : 'stringifier' ;
T77 : 'omittable' ;
T78 : 'in' ;
T79 : 'optional' ;
T80 : '...' ;

// $ANTLR src "../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g" 10516
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g" 10518
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g" 10520
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g" 10522
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g" 10524
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g" 10526
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.waml.w3c.webidl.ui/src-gen/org/waml/w3c/webidl/ui/contentassist/antlr/internal/InternalWebIDL.g" 10528
RULE_ANY_OTHER : .;


