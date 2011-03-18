lexer grammar InternalWebIDL;
@header {
package org.waml.w3c.webidl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import' ;
T12 : ';' ;
T13 : 'typedef' ;
T14 : '[]' ;
T15 : 'unsigned' ;
T16 : 'void' ;
T17 : 'boolean' ;
T18 : 'byte' ;
T19 : 'double' ;
T20 : 'float' ;
T21 : 'short' ;
T22 : 'long' ;
T23 : 'Object' ;
T24 : 'object' ;
T25 : 'any' ;
T26 : 'octet' ;
T27 : 'DOMString' ;
T28 : '?' ;
T29 : 'sequence<' ;
T30 : '>' ;
T31 : '::' ;
T32 : 'Constructor' ;
T33 : '(' ;
T34 : ',' ;
T35 : ')' ;
T36 : 'NamedConstructor' ;
T37 : '=' ;
T38 : 'Callback' ;
T39 : 'FunctionOnly' ;
T40 : 'PropertyOnly' ;
T41 : 'NoInterfaceObject' ;
T42 : 'OverrideBuiltins' ;
T43 : 'PrototypeRoot' ;
T44 : 'PutForwards' ;
T45 : 'TreatNullAs' ;
T46 : 'EmptyString' ;
T47 : 'TreatUndefinedAs' ;
T48 : 'null' ;
T49 : 'AllowAny' ;
T50 : 'Replaceable' ;
T51 : 'Supplemental' ;
T52 : 'ReplaceableNamedProperties' ;
T53 : 'implements' ;
T54 : '[' ;
T55 : ']' ;
T56 : 'module' ;
T57 : '{' ;
T58 : '}' ;
T59 : 'Prefix' ;
T60 : 'NamespaceObject' ;
T61 : 'interface' ;
T62 : ':' ;
T63 : 'stringifier' ;
T64 : 'omittable' ;
T65 : 'raises' ;
T66 : 'getter' ;
T67 : 'setter' ;
T68 : 'creator' ;
T69 : 'deleter' ;
T70 : 'caller' ;
T71 : 'readonly' ;
T72 : 'attribute' ;
T73 : 'getraises' ;
T74 : 'setraises' ;
T75 : 'exception' ;
T76 : 'in' ;
T77 : 'optional' ;
T78 : '...' ;
T79 : 'const' ;
T80 : '0x' ;

// $ANTLR src "../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g" 4129
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g" 4131
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g" 4133
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g" 4135
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g" 4137
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g" 4139
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g" 4141
RULE_ANY_OTHER : .;


