grammar Geometry;

// Определение токенов операций
EQUAL: '=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
ARROW: '->';

// Определение токенов
POINT: 'Point';
LINE: 'Line';
SEGMENT: 'Segment';
TRIANGLE: 'Triangle';
HEIGHT: 'Height';
EQUILATERAL_TRIANGLE: 'EquilateralTriangle';
ISOSCELES_TRIANGLE: 'IsoscelesTriangle';
SQUARE: 'Square';
RECTANGLE: 'Rectangle';
PARALLELOGRAM: 'Parallelogram';
CIRCLE: 'Circle';
ELLIPSE: 'Ellipse';
RHOMBUS: 'Rhombus';
BISECTOR: 'bisector';
ANGLE: 'Angle';
VERTEX: 'Vertex';
NUM: [0-9]+('.'[0-9]+)?;
ID: [a-zA-Z][a-zA-Z0-9]*;
ALIAS: [a-zA-Z][a-zA-Z0-9]* ':';
WS: [ \t\r\n]+ -> skip;
SEMICOLON: ';';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
TRUE: 'true';
FALSE: 'false';
STRING: '"' ('\\' . | ~('\\' | '"'))* '"';
COMMENT: '//' ~[\r\n]*;
ML_COMMENT: '/*' .*? '*/' -> skip;

// Правила
program: (statement | commentStatement | functionCallStatement)+;

statement: figureDeclaration SEMICOLON
         | variableDeclaration SEMICOLON
         | comment;

functionCallStatement: functionCall SEMICOLON;
commentStatement: COMMENT;

functionCall: ID ARROW functionDeclaration;

functionDeclaration: areaCall
                    | perimeterCall
                    | diagonalCall;

figureDeclaration: pointDeclaration
                 | lineDeclaration
                 | segmentDeclaration
                 | triangleDeclaration
                 | squareDeclaration
                 | rectangleDeclaration
                 | parallelogramDeclaration
                 | circleDeclaration
                 | ellipseDeclaration;

areaCall: 'area' LPAREN RPAREN;
perimeterCall: 'perimeter' LPAREN RPAREN;
diagonalCall: 'diagonal' LPAREN RPAREN;
pointDeclaration: POINT ID LPAREN NUM COMMA NUM RPAREN;
lineDeclaration: LINE ID LPAREN point COMMA point RPAREN;
segmentDeclaration: SEGMENT ID LPAREN point COMMA point RPAREN;
triangleDeclaration
    : TRIANGLE ID LPAREN point COMMA point COMMA point RPAREN (ARROW triangleProperty)*
    | TRIANGLE ID LPAREN aliasVertex COMMA aliasVertex COMMA aliasVertex RPAREN (ARROW triangleProperty)*
    | TRIANGLE ID LPAREN NUM COMMA NUM COMMA NUM RPAREN (ARROW triangleProperty)*
    | EQUILATERAL_TRIANGLE ID LPAREN NUM RPAREN (ARROW triangleProperty)*
    | ISOSCELES_TRIANGLE ID LPAREN NUM COMMA NUM RPAREN (ARROW triangleProperty)*
    ;

aliasVertex
    : ID':'NUM;

 triangleProperty: bisectorDeclaration
                  | angleDeclaration
                  | heightDeclaration;

bisectorDeclaration: BISECTOR LPAREN ID RPAREN;
angleDeclaration: ANGLE LPAREN ID COMMA NUM RPAREN;
heightDeclaration: HEIGHT LPAREN ID RPAREN | HEIGHT LPAREN ID COMMA NUM RPAREN;

squareDeclaration: SQUARE ID LPAREN NUM RPAREN
                  | SQUARE ID 'side' EQUAL NUM SEMICOLON;
rectangleDeclaration: RECTANGLE ID LPAREN NUM COMMA NUM RPAREN
                     | RECTANGLE ID 'width' EQUAL NUM COMMA 'height' EQUAL NUM SEMICOLON;
parallelogramDeclaration: PARALLELOGRAM ID LPAREN NUM COMMA NUM COMMA NUM RPAREN;
circleDeclaration: CIRCLE ID LPAREN NUM RPAREN;
ellipseDeclaration: ELLIPSE ID LPAREN NUM COMMA NUM RPAREN;
rhombusDeclaration: 'Rhombus' ID LPAREN NUM RPAREN;


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
