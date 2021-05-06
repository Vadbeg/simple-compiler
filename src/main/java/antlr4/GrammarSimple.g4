grammar GrammarSimple;

program             : moduleName function* main;
moduleName          :'package' PackageName EndOfLine;

function            : type ID attributs bodyFunc;
type                : Integer | Float;
attributs           : OpenBracket (type ID (Comma type ID)*)? CloseBracket;
callAttributs       : OpenBracket ((ID | Number | Digit | callFunction) (Comma (ID | Number | Digit | callFunction))*)? CloseBracket;

main                : 'main' bodyProc;

callFunction        : ID callAttributs;
ifFunc              : 'if' OpenBracket condition CloseBracket thenFunc elseFunc?;
bodyFunc            : 'start' ((math EndOfLine) | ifFunc | forFunc)* functionReturn?'finish';
thenFunc            : 'then' bodyFunc;
elseFunc            : 'else' bodyFunc;
forFunc             : 'for' conditionFor bodyFunc;
functionReturn      : Return (ID | Number | Digit | operation | callFunction) EndOfLine;


callProcedure       : ID callAttributs;
bodyProc            : 'start' ((math EndOfLine) | ifProc | forProc)* 'finish';
ifProc              : 'if' OpenBracket condition CloseBracket thenProc elseProc?;
thenProc            : 'then' bodyProc;
elseProc            : 'else' bodyProc;
forProc             : 'for' conditionFor bodyProc;

condition           : (ID | Number | Digit) CompareOperator (ID | Number | Digit) ((And | Or)condition)?;
conditionFor        : OpenBracket type ID Assign (Number | Digit | ID) EndOfLine condition EndOfLine (math | operation) CloseBracket;


math                : (summOperation | diffOperation | multOperation | divOperation | diffOperation | inPowOperation | ass | callProcedure);
operation           : summ | diff | mult | div | inPow | inSqrt | callFunction;

ass                 : type? ID Assign (OpenBracket type CloseBracket)?(ID | Number | Digit | operation);

summOperation       : (type? ID Assign (OpenBracket type CloseBracket)? (ID | Number | Digit | operation) Plus (ID | Number | Digit | operation) | type? ID PlusAss (OpenBracket type CloseBracket)? (ID | Number | Digit | operation));
diffOperation       : type? ID Assign (OpenBracket type CloseBracket)? (ID | Number | Digit | operation) Minus (ID | Number | Digit | operation) | type? ID MinusAss (OpenBracket type CloseBracket)? (ID | Number | Digit | operation);
multOperation       : type? ID Assign (OpenBracket type CloseBracket)? (ID | Number | Digit | operation) Star (ID | Number | Digit | operation) | type? ID StarAss (OpenBracket type CloseBracket)? (ID | Number | Digit | operation);
divOperation        : type? ID Assign (OpenBracket type CloseBracket)? (ID | Number | Digit | operation) Devide (ID | Number | Digit | operation) | type? ID DevideAss (OpenBracket type CloseBracket)? (ID | Number | Digit | operation);
inPowOperation      : type? ID Assign (OpenBracket type CloseBracket)? (ID | Number | Digit | operation) Pow (ID | Number | Digit | operation) ;


summ                : OpenBracket (ID | Number | Digit | operation) Plus (ID | Number | Digit | operation) CloseBracket;
diff                : OpenBracket (ID | Number | Digit | operation) Minus (ID | Number | Digit | operation) CloseBracket;
mult                : OpenBracket (ID | Number | Digit | operation) Star (ID | Number | Digit | operation) CloseBracket;
div                 : OpenBracket (ID | Number | Digit | operation) Devide (ID | Number | Digit | operation) CloseBracket;
inPow               : OpenBracket (ID | Number | Digit | operation) Pow (ID | Number | Digit | operation) CloseBracket;
inSqrt              : type? ID Assign (OpenBracket type CloseBracket)? Sqrt (ID | Number | Digit | operation);




CompareOperator     : LessThan | LessOrEqual | GreaterThan | GreaterOrEqual | Equal | NotEqual;
LessThan            : '<';
LessOrEqual         : '<=';
GreaterThan         :  '>';
GreaterOrEqual      : '>=';
Equal               : '==';
NotEqual            : '!=';

And                 : 'and';
Or                  : 'or';

PackageName         : [A-Z]([a-z]+ | [A-Z]+ | [0-9]+)+;
EndOfLine           : ';';
Integer             : 'int';
Float               : 'float';
Return              : 'return';
ID                  : [a-z]([a-z] | [A-Z] | [0-9])*;
OpenBracket         : '(';
CloseBracket        : ')';

Plus                : '+';
PlusAss             : '+=';
Minus               : '-';
MinusAss            : '-=';
Star                : '*';
StarAss             : '*=';
Devide              : '/';
DevideAss           : '/=';
Comma               : ',';
Pow                 : '^';
Sqrt                : '~';
Assign              : '=';


Number              : Minus?[0-9]+;
Digit               : Number '.' Number;

WS                  :[ \t\n\r] -> skip;