
grammar HTML;

// =========================
// Parser Rules
// =========================

htmlDocument
    : DOCTYPE? node* EOF
    ;

node
    : element
    | textNode
    ;

element
    : normalElement
    | selfClosingElement
    | voidElement
    ;

normalElement
    : LT tagName attribute* GT
      node*
      LT SLASH tagName GT
    ;

selfClosingElement
    : LT tagName attribute* SLASH GT
    ;

voidElement
    : LT VOID_TAG attribute* GT
    ;

tagName
    : ID
    | VOID_TAG
    ;

attribute
    : thymeleafAttribute
    | ID (EQUALS attributeValue)?
    ;

// Thymeleaf attributes

thymeleafAttribute
    : TH_TEXT EQUALS attributeValue
    | TH_EACH EQUALS attributeValue
    | TH_IF EQUALS attributeValue
    | TH_UNLESS EQUALS attributeValue
    | TH_HREF EQUALS attributeValue
    | TH_SRC EQUALS attributeValue
    | TH_ACTION EQUALS attributeValue
    | TH_OBJECT EQUALS attributeValue
    | TH_FIELD EQUALS attributeValue
    | TH_VALUE EQUALS attributeValue
    | TH_CLASSAPPEND EQUALS attributeValue
    ;

attributeValue
    : STRING
    | ID
    | NUMBER
    | THYMELEAF_EXPRESSION
    ;

textNode
    : ID
    | NUMBER
    | STRING
    | ENTITY
    | TEXT
    | VOID_TAG
    ;

// =========================
// Lexer Rules
// =========================

// HTML document

DOCTYPE
    : '<!DOCTYPE' [ \t]+ [hH][tT][mM][lL] [ \t]* '>'
    ;

HTML_COMMENT
    : '<!--' .*? '-->' -> skip
    ;

// Thymeleaf attributes


TH_TEXT       : 'th:text';
TH_EACH       : 'th:each';
TH_IF         : 'th:if';
TH_UNLESS     : 'th:unless';
TH_HREF       : 'th:href';
TH_SRC        : 'th:src';
TH_ACTION     : 'th:action';
TH_OBJECT     : 'th:object';
TH_FIELD      : 'th:field';
TH_VALUE      : 'th:value';
TH_CLASSAPPEND: 'th:classappend';

// Thymeleaf expressions without quotes

THYMELEAF_EXPRESSION
    : ('${' | '*{' | '@{') ~[}\r\n]* '}'
    ;

// HTML void elements

VOID_TAG
    : 'area'
    | 'base'
    | 'br'
    | 'col'
    | 'embed'
    | 'hr'
    | 'img'
    | 'input'
    | 'link'
    | 'meta'
    | 'param'
    | 'source'
    | 'track'
    | 'wbr'
    ;

// HTML symbols

LT      : '<';
GT      : '>';
SLASH   : '/';
EQUALS  : '=';

// Strings

STRING
    : '"' ~["\r\n]* '"'
    | '\'' ~['\r\n]* '\''
    ;

// HTML entities

ENTITY
    : '&' [a-zA-Z#0-9]+ ';'
    ;

// Numbers

NUMBER
    : [0-9]+
    ;

// Identifiers and tag/attribute names

ID
    : [a-zA-Z_] [a-zA-Z0-9_.-]*
    | 'xmlns:' [a-zA-Z_]+
    ;

// Text and other ordinary characters

TEXT
    : ~[<>=/"' \t\r\n&]+
    ;

// Ignore whitespace

WS
    : [ \t\r\n]+ -> skip
    ;
