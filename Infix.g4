
grammar Infix;

// ---- Parser grammar goes here ----
// (We're not writing one just yet)
stuff
    : (DIGIT | OP | PARENS | DECIMAL)*
    ;

// ---- Lexer grammar goes here ----

// Here we put lexer rules: names of tokens with expressions describing them
// (similar to regular expressions)

// Token names in ANTLR are all caps

// Token definition for digits
DIGIT
    : [1-9][0-9]* '.'? [0-9]* | [0]
    ;

OP
    : '+' | '-' | '*' | '/' | '^'
    ;

PARENS
    : '(' | ')'
    ;

// You'll have this rule in most lexers you create!
WHITESPACE
    : [ \t\r\n]+ -> skip
    ;
