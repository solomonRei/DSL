grammar Geometry;

// Определение токенов
POINT: 'Point';
LINE: 'Line';
ID: [a-zA-Z]+;
NUM: [0-9]+('.'[0-9]+)?;
WS: [ \t\r\n]+ -> skip;

// Правила
program: (figureDeclaration)*;
figureDeclaration: pointDeclaration | lineDeclaration;
pointDeclaration: POINT ID '(' NUM ',' NUM ')';
lineDeclaration: LINE ID '(' point ',' point ')';
point: ID;
