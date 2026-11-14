
grammar JavaSpring;

// =====================
// Parser Rules
// =====================

controllerFile
    : controllerAnnotation classDeclaration EOF
    ;

controllerAnnotation
    : AT CONTROLLER
    ;

classDeclaration
    : PUBLIC? CLASS ID
      LBRACE
      (fieldDeclaration | methodDeclaration)*
      RBRACE
    ;

fieldDeclaration
    : accessModifier? variableType ID SEMI
    ;

accessModifier
    : PUBLIC
    | PRIVATE
    | PROTECTED
    ;

methodDeclaration
    : mappingAnnotation? PUBLIC? returnType ID
      LPAREN parameterList? RPAREN
      LBRACE
      statement*
      RBRACE
    ;

mappingAnnotation
    : AT (GET_MAPPING | POST_MAPPING)
      LPAREN STRING_LITERAL RPAREN
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : parameterAnnotation? parameterType ID
    ;

parameterAnnotation
    : AT (REQUEST_PARAM | PATH_VARIABLE)
    ;

parameterType
    : MODEL
    | STRING_TYPE
    | INT
    | ID
    ;

returnType
    : STRING_TYPE
    | VOID
    ;

statement
    : variableDeclaration
    | assignmentStatement
    | addAttributeStatement
    | methodCallStatement
    | returnStatement
    | ifStatement
    ;

variableDeclaration
    : variableType ID ASSIGN expression SEMI
    ;

assignmentStatement
    : ID ASSIGN expression SEMI
    ;

methodCallStatement
    : ID DOT ID LPAREN argumentList? RPAREN SEMI
    ;

variableType
    : STRING_TYPE
    | INT
    | ID
    ;

expression
    : STRING_LITERAL
    | NUMBER
    | ID
    | objectCreation
    ;

objectCreation
    : NEW ID LPAREN argumentList? RPAREN
    ;

argumentList
    : expression (COMMA expression)*
    ;

addAttributeStatement
    : ID DOT ADD_ATTRIBUTE
      LPAREN STRING_LITERAL COMMA ID RPAREN
      SEMI
    ;

// Return accepts expressions instead of string literals only
returnStatement
    : RETURN expression SEMI
    ;

// If and Else
ifStatement
    : IF LPAREN condition RPAREN block
      (ELSE block)?
    ;

block
    : LBRACE statement* RBRACE
    ;

// Comparison and logical conditions
condition
    : logicalOrExpression
    ;

logicalOrExpression
    : logicalAndExpression (OR logicalAndExpression)*
    ;

logicalAndExpression
    : equalityExpression (AND equalityExpression)*
    ;

equalityExpression
    : relationalExpression ((EQUAL | NOT_EQUAL) relationalExpression)*
    ;

relationalExpression
    : unaryExpression
      ((GREATER | LESS | GREATER_EQUAL | LESS_EQUAL) unaryExpression)*
    ;

unaryExpression
    : NOT unaryExpression
    | TRUE
    | FALSE
    | expression
    ;

// =====================
// Lexer Rules
// =====================

GET_MAPPING   : 'GetMapping';
POST_MAPPING  : 'PostMapping';
CONTROLLER    : 'Controller';
REQUEST_PARAM : 'RequestParam';
PATH_VARIABLE : 'PathVariable';

PUBLIC        : 'public';
PRIVATE       : 'private';
PROTECTED     : 'protected';
CLASS         : 'class';

NEW           : 'new';
STRING_TYPE   : 'String';
VOID          : 'void';
MODEL         : 'Model';
ADD_ATTRIBUTE : 'addAttribute';
RETURN        : 'return';
IF            : 'if';
ELSE          : 'else';

TRUE          : 'true';
FALSE         : 'false';

INT           : 'int';

EQUAL         : '==';
NOT_EQUAL     : '!=';
GREATER_EQUAL : '>=';
LESS_EQUAL    : '<=';
GREATER       : '>';
LESS          : '<';

AND           : '&&';
OR            : '||';
NOT           : '!';

ASSIGN        : '=';

NUMBER        : [0-9]+;

AT       : '@';
LBRACE   : '{';
RBRACE   : '}';
LPAREN   : '(';
RPAREN   : ')';
COMMA    : ',';
DOT      : '.';
SEMI     : ';';

STRING_LITERAL
    : '"' (~["\r\n])* '"'
    ;

ID
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

// Java comments
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

// Ignore whitespace
WS
    : [ \t\r\n]+ -> skip
    ;
