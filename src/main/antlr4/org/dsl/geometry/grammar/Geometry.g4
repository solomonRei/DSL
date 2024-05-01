grammar Geometry;

// Определение токенов операций
EQUAL: '=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
PERCENT: '%';
ARROW: '->';
FOR: 'for';
WHILE: 'while';
IF: 'if';
ELSE: 'else';

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
STRING: '"' ('\\' . | ~('\\' | '"'))* '"';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
TRUE: 'true';
FALSE: 'false';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';
EQ: '==';
NEQ: '!=';
INCREMENT: '++';
DECREMENT: '--';
NUM: [0-9]+('.'[0-9]+)?;
ID: [a-zA-Z][a-zA-Z0-9]*;
ALIAS: [a-zA-Z][a-zA-Z0-9]* ':';
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
ML_COMMENT: '/*' .*? '*/' -> skip;


// Правила
program: (statement | commentStatement | functionCallStatement | loopStatement | ifElseStatement)+;

statement: figureDeclaration SEMICOLON
         | variableDeclaration SEMICOLON
         | expression SEMICOLON
         | comment;

functionCallStatement: functionCall SEMICOLON;
commentStatement: COMMENT;

functionCall: ID ARROW functionDeclaration;

functionDeclaration
    : areaCall
    | perimeterCall
    | diagonalCall
    | areaTriangleCall
    | areaCircleCall
    | areaSquareCall
    | areaRectangleCall
    | perimeterTriangleCall
    | perimeterCircleCall
    | perimeterSquareCall
    | perimeterRectangleCall;

loopStatement: forLoop | whileLoop;

forLoop: FOR LPAREN forInit SEMICOLON forCondition SEMICOLON forUpdate RPAREN LBRACE program RBRACE;
whileLoop: WHILE LPAREN expression RPAREN LBRACE program RBRACE;

forInit: variableDeclaration | expression;
forCondition: expression;
forUpdate: ID (INCREMENT | DECREMENT) | expression;

ifElseStatement: IF LPAREN expression RPAREN LBRACE program RBRACE (ELSE LBRACE program RBRACE)?;

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
areaTriangleCall: 'areaTriangle' LPAREN expression COMMA expression COMMA expression RPAREN;
areaCircleCall: 'areaCircle' LPAREN expression RPAREN;
areaSquareCall: 'areaSquare' LPAREN expression RPAREN;
areaRectangleCall: 'areaRectangle' LPAREN expression COMMA expression RPAREN;
perimeterTriangleCall: 'perimeterTriangle' LPAREN expression COMMA expression COMMA expression RPAREN;
perimeterCircleCall: 'perimeterCircle' LPAREN expression RPAREN;
perimeterSquareCall: 'perimeterSquare' LPAREN expression RPAREN;
perimeterRectangleCall: 'perimeterRectangle' LPAREN expression COMMA expression RPAREN;

pointDeclaration: POINT ID LPAREN expression COMMA expression RPAREN;
lineDeclaration: LINE ID LPAREN point COMMA point RPAREN;
segmentDeclaration: SEGMENT ID LPAREN point COMMA point RPAREN;

triangleDeclaration
    : TRIANGLE ID LPAREN point COMMA point COMMA point RPAREN (ARROW triangleProperty)*
    | TRIANGLE ID LPAREN aliasVertex COMMA aliasVertex COMMA aliasVertex RPAREN (ARROW triangleProperty)*
    | TRIANGLE ID LPAREN expression COMMA expression COMMA expression RPAREN (ARROW triangleProperty)*
    | EQUILATERAL_TRIANGLE ID LPAREN expression RPAREN (ARROW triangleProperty)*
    | ISOSCELES_TRIANGLE ID LPAREN expression COMMA expression RPAREN (ARROW triangleProperty)*
    ;

aliasVertex
    : ID':'expression;

 triangleProperty: bisectorDeclaration
                  | angleDeclaration
                  | heightDeclaration;

bisectorDeclaration: BISECTOR LPAREN ID RPAREN;
angleDeclaration: ANGLE LPAREN ID COMMA expression RPAREN;
heightDeclaration: HEIGHT LPAREN ID RPAREN | HEIGHT LPAREN ID COMMA expression RPAREN;

squareDeclaration: SQUARE ID LPAREN expression RPAREN
                  | SQUARE ID 'side' EQUAL expression SEMICOLON;
rectangleDeclaration: RECTANGLE ID LPAREN expression COMMA expression RPAREN
                     | RECTANGLE ID 'width' EQUAL expression COMMA 'height' EQUAL expression SEMICOLON;
parallelogramDeclaration: PARALLELOGRAM ID LPAREN expression COMMA expression COMMA expression RPAREN;

circleDeclaration: CIRCLE ID LPAREN expression COMMA expression RPAREN
                 | CIRCLE ID 'radius' EQUAL expression SEMICOLON
                 | CIRCLE ID 'center' EQUAL point COMMA 'radius' EQUAL expression SEMICOLON
                 | CIRCLE ID 'center' EQUAL LPAREN expression COMMA expression;
ellipseDeclaration: ELLIPSE ID LPAREN expression COMMA expression RPAREN;


variableDeclaration: type? ID (EQUAL expression)?;

type: 'num' | 'bool' | 'string' | 'int';

expression
    : expression (PLUS | MINUS | MUL | DIV | PERCENT | LT | LE | GT | GE | EQ | NEQ) expression
    | ID INCREMENT
    | ID DECREMENT
    | LPAREN expression RPAREN
    | NUM
    | TRUE
    | FALSE
    | STRING
    | ID;


point: ID;

comment: COMMENT
       | ML_COMMENT;
