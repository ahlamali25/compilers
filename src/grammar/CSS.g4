
grammar CSS;

// Parser Rules

stylesheet
    : rule* EOF
    ;

rule
    : selectorList LBRACE declaration* RBRACE
    ;

selectorList
    : selector (COMMA selector)*
    ;

selector
    : selectorPart+
    ;

selectorPart
    : IDENT
    | HASH
    | DOT IDENT
    | COLON IDENT
    | STAR
    ;

declaration
    : IDENT COLON value SEMI?
    ;

value
    : valueAtom+
    ;

valueAtom
    : IDENT
    | HASH
    | NUMBER
    | DIMENSION
    | STRING
    | COMMA
    | SLASH
    | LPAREN
    | RPAREN
    | IMPORTANT
    ;

// Lexer Rules

COMMENT
    : '/*' .*? '*/' -> skip
    ;

IMPORTANT
    : '!important'
    ;

LBRACE : '{';
RBRACE : '}';
COLON  : ':';
SEMI   : ';';
COMMA  : ',';
DOT    : '.';
STAR   : '*';
SLASH  : '/';
LPAREN : '(';
RPAREN : ')';

HASH
    : '#' [a-zA-Z0-9_-]+
    ;

DIMENSION
    : [0-9]+ ('.' [0-9]+)? [a-zA-Z]+
    ;

NUMBER
    : [0-9]+ ('.' [0-9]+)? '%'?
    ;

STRING
    : '"' ~["\r\n]* '"'
    | '\'' ~['\r\n]* '\''
    ;

IDENT
    : [a-zA-Z_-] [a-zA-Z0-9_-]*
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
