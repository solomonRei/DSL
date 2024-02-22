grammar Geometry;

// Определение токенов
POINT: 'Point';
LINE: 'Line';
SEGMENT: 'Segment';
TRIANGLE: 'Triangle';
SQUARE: 'Square';
RECTANGLE: 'Rectangle';
PARALLELOGRAM: 'Parallelogram';
CIRCLE: 'Circle';
ELLIPSE: 'Ellipse';
NUM: [0-9]+('.'[0-9]+)?;
ID: [a-zA-Z][a-zA-Z0-9]*;
WS: [ \t\r\n]+ -> skip;
SEMICOLON: ';';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
TRUE: 'true';
FALSE: 'false';
STRING: '"' ('\\' . | ~('\\' | '"'))* '"';
COMMENT: '//' ~[\r\n]* -> skip;
ML_COMMENT: '/*' .*? '*/' -> skip;

// Правила
program: (statement)+;

statement: figureDeclaration SEMICOLON
         | variableDeclaration SEMICOLON
         | comment;

figureDeclaration: pointDeclaration
                 | lineDeclaration
                 | segmentDeclaration
                 | triangleDeclaration
                 | squareDeclaration
                 | rectangleDeclaration
                 | parallelogramDeclaration
                 | circleDeclaration
                 | ellipseDeclaration;

pointDeclaration: POINT ID LPAREN NUM COMMA NUM RPAREN;
lineDeclaration: LINE ID LPAREN point COMMA point RPAREN;
segmentDeclaration: SEGMENT ID LPAREN point COMMA point RPAREN;
triangleDeclaration: TRIANGLE ID LPAREN point COMMA point COMMA point RPAREN;
squareDeclaration: SQUARE ID LPAREN NUM RPAREN;
rectangleDeclaration: RECTANGLE ID LPAREN NUM COMMA NUM RPAREN;
parallelogramDeclaration: PARALLELOGRAM ID LPAREN NUM COMMA NUM RPAREN;
circleDeclaration: CIRCLE ID LPAREN NUM RPAREN;
ellipseDeclaration: ELLIPSE ID LPAREN NUM COMMA NUM RPAREN;

variableDeclaration: type ID (EQUAL expression)?;

type: 'num' | 'bool' | 'string';

expression: NUM
          | TRUE
          | FALSE
          | STRING
          | ID
          | expression (PLUS | MINUS | MUL | DIV) expression
          | LPAREN expression RPAREN;

point: ID;

comment: COMMENT
       | ML_COMMENT;
