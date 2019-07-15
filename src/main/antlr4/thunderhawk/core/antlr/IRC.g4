grammar IRC;

options {
    language=Java;
}

// IRC PARSER RULES


// IRC LEXER RULES
DLIMIT
    : ':'
    ;

WORD
    : CHAR+
    ;

WHITESPACE
    : ' '
    ;

CHAR
    : 'a'..'z'
    | 'A'..'Z'
    ;