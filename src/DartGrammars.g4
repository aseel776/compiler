grammar DartGrammars;

start
    : (class | function)+ EOF
    ;


number
    : INT_NUM           # Integer
    | DOUBLE_NUM        # Double
    ;


//RULES
block
    : '{' statement* '}'
    ;
statement
    : ifStatement
    | switchStatement
    | whileStatement
    | doWhileStatement
    | forStatement
    | foreachStatement
    | declaration SEMICOLON
    | assignment SEMICOLON
    | functionCall SEMICOLON
    | navigation
    | pageArgsExtracting
    | setState
    ;

condition
    : comparison
    ;

comparison
    : ID ('<' | '<=' | '>' | '>=' | '==' | '!=') expression
    ;


//conditions process
ifStatement
    : IF '(' condition ')' block (elseIf* else)?
    ;
elseIf
    : ELSEIF '(' condition ')' block
    ;
else
    : ELSE block
    ;

switchStatement
    : SWITCH'('ID')' switchBody
    ;
switchBody
    : '{' case+ defaultCase '}'
    ;
case
    : CASE number ':' caseBody          # NumberCase
    | CASE CHARACTERS ':' caseBody      # CharCase
    ;
defaultCase
    : DEFAULT':' caseBody
    ;
caseBody
    : statement* (BREAK SEMICOLON)?
    ;


//loops
whileStatement
    : WHILE '(' condition ')' block
    ;

doWhileStatement
    : DO block WHILE '(' condition ')' SEMICOLON
    ;

forStatement
    : FOR '(' initialCondition SEMICOLON condition SEMICOLON increment')' block
    ;
initialCondition
    : (VAR | DOUBLE | INT) ID '=' expression    # InitialConditionDeclaration
    | ID '=' expression                         # InitialConditionAssignment
    | ID                                        # InitialConditionVariable
    ;
increment
    : ID ('+=' | '-=' | '*=' | '/=') expression
    ;

foreachStatement
    : FOREACH '(' varOrType ID 'in' ID ')' block
    ;



//variables
type
    : INT | DOUBLE | STRING | LIST | MAP | DYNAMIC | BOOL | OBJECT | FUNCTION
    ;
varOrType
    : VAR | type
    ;
declaration
    : LATE? FINAL type? ID initialization?          # FinalDeclarartion
    | CONST type? ID initialization                 # ConstDeclarartion
    | LATE? varOrType ID initialization?            # NormalDeclarartion
    ;
initialization
    : '=' (ID | CHARACTERS | unnamedFunction | functionCall | object | expression | list | map | listItem | mapItem)
    ;
assignment
    : ID '=' (ID | CHARACTERS | unnamedFunction | functionCall | object | expression | list | map | listItem | mapItem)            # Assign
    | ID'.'ID '=' (ID | CHARACTERS | unnamedFunction | functionCall | object | expression | list | map | listItem | mapItem)       # ObjectAssign
    | THIS'.'ID '=' (ID | CHARACTERS | unnamedFunction | functionCall | object | expression | list | map | listItem | mapItem)     # ThisAssign
    ;
list
    : '[' ( ((ID | CHARACTERS | expression | object | list | map | listItem | mapItem | functionCall | unnamedFunction) COMMA)*
            (ID | CHARACTERS | expression | object | list | map | listItem | mapItem | functionCall | unnamedFunction))?
      ']'
    ;
listItem
    : ID'['INT_NUM']'
    ;
map
    : '{' ( CHARACTERS ':' (ID | CHARACTERS | expression | object | list | map | listItem | mapItem | functionCall | unnamedFunction) COMMA)*
          ( CHARACTERS ':' (ID | CHARACTERS | expression | object | list | map | listItem | mapItem | functionCall | unnamedFunction))?
      '}'
    ;
mapItem
    : ID'['CHARACTERS']'
    ;


//functions
voidOrType
    : VOID | type
    ;
signature
    : voidOrType? ID '(' arguments ')'
    ;
function
    : signature ASYNC? functionBody
    ;
unnamedFunction
    : '(' arguments ')' ASYNC? functionBody
    ;
arguments
    : positionalNamedArguments
    | positionalArguments
    | namedArguments
    | zeroArguments
    ;
positionalNamedArguments
    : positionalArguments COMMA namedArguments
    ;
positionalArguments
    : (arg COMMA)* arg
    ;
namedArguments
    : '{' (REQUIRED? arg COMMA)* REQUIRED? arg '}'
    ;
zeroArguments
    :
    ;
arg
    : type? ID
    ;
functionBody
    : '{' statement* returnStatement? '}'
    ;
returnStatement
    : RETURN (ID | CHARACTERS | expression | object | list | map | listItem | mapItem | functionCall | unnamedFunction | condition)? SEMICOLON
    ;


//classes
class
    : ABSTRACT? CLASS ID (EXTENDS ID)? (IMPLEMENTS ID)? classBody
    ;
classBody
    : '{' (attribute | method)* defaultConstructer? (attribute | method)* '}'
    ;
attribute
    : (STATIC? declaration SEMICOLON)
    ;
method
    : OVERRIDE? signature ASYNC? functionBody                                   # NormalClassMethod
    | STATIC signature ASYNC? functionBody                                      # StaticClassMethod
    | ABSTRACT signature SEMICOLON                                              # AbstractClassMethod
    | ID'.'ID '(' consArguments ( (')' SEMICOLON) | (')' functionBody) )        # NamedConstructor
    ;
defaultConstructer
    : ID '(' consArguments ( (')' SEMICOLON) | (')' functionBody) )
    ;
consArguments
    : consPositionalNamedArguments
    | consPositionalArguments
    | consNamedArguments
    | conZeroArgs
    ;
consPositionalNamedArguments
    : consPositionalArguments COMMA consNamedArguments
    ;
consPositionalArguments
    : (consArg COMMA)* consArg
    ;
consNamedArguments
    : '{' (REQUIRED? consArg COMMA)* REQUIRED? consArg '}'
    ;
conZeroArgs
    :
    ;
consArg
    : (type? ID) | (THIS'.'ID)
    ;


//function calls and objects
functionCall
    : AWAIT? ID '(' parameters ')'
    | AWAIT? ID'.'ID '(' parameters ')'
    ;
object
    : NEW ID '(' parameters ')'
    | component
    ;

parameters
    : positionalNamedParameters
    | positionalParameters
    | namedParameters
    | zeroParameters
    ;

positionalNamedParameters
    : positionalParameters COMMA namedParameters
    ;
positionalParameters
    : (parameter COMMA)* parameter
    ;
namedParameters
    : (ID':'parameter COMMA)* ID':'parameter
    ;
zeroParameters
    :
    ;
parameter
    : ID | CHARACTERS | expression | object | list | map | listItem | mapItem | functionCall | unnamedFunction
    ;


//expressions
expression
    : expression '*' expression     # MultiplicationExpression
    | expression '/' expression     # DivisionExpression
    | expression '+' expression     # AddtitionExpression
    | expression '-' expression     # SubtractExpression
    | number                        # NumberExpression
    | ID                            # VariableExpression
    ;


///////////////////////////FLUTTER///////////////////////////
component
    : materialApp
    | scrollView
    | scaffold
    | column
    | row
    | stack
    | text
    | container
    | sizedBox
    | padding
    | inkWell
    | image
    | button
    ;


materialApp
    : NEW MATERIAL_APP '(' materialAppAtts* ')'
    ;
materialAppAtts
    : materialTitle
    | materialHome
    ;
materialTitle
    : TITLE':'CHARACTERS COMMA?
    ;
materialHome:
    HOME':'object COMMA?
    ;


scaffold
    : NEW SCAFFOLD '(' scaffoldAtts* ')'
    ;
scaffoldAtts
    : scaffoldBackground
    | scaffoldBody
    ;
scaffoldBackground
    : BACKGROUND_COLOR':'COLORS COMMA?
    ;
scaffoldBody
    : BODY':'object COMMA?
    ;


column:
    NEW COLUMN '(' column_rowAtts* ')'
    ;
row:
    NEW ROW '(' column_rowAtts* ')'
    ;
column_rowAtts
    : mainAxis
    | crossAxis
    | children
    ;
mainAxis
    : MAIN_AXIS_ALIGNMENT':'ALIGNMENT COMMA?
    ;
crossAxis
    : CROSS_AXIS_ALIGNMENT':'ALIGNMENT COMMA?
    ;
children
    : CHILDREN':'list COMMA?
    ;


stack
    : NEW STACK '(' stackAtts* ')'
    ;
stackAtts
    : stackFit
    | stackChildren
    ;
stackFit
    : FIT':'STACK_FIT COMMA?
    ;
stackChildren
    : STACK_CHILDREN ':' list COMMA?
    ;


text:
    NEW TEXT '(' CHARACTERS COMMA? textAtts* ')'
    ;
textAtts
    : textColor
    | textSize
    | textStyle
    ;
textColor
    : TEXT_COLOR':'COLORS COMMA?
    ;
textSize
    : TEXT_SIZE':'INT_NUM COMMA?
    ;
textStyle
    : TEXT_STYLE':'STYLES COMMA?
    ;


container
    : NEW CONTAINER '(' containerAtts* ')'
    ;
containerAtts
    : containerWidth
    | containerHeight
    | containerChild
    | containerColor
    ;
containerWidth
    : CONTAINER_WIDTH':'INT_NUM COMMA?
    ;
containerHeight
    : CONTAINER_HEIGHT':'INT_NUM COMMA?
    ;
containerChild
    : CONTAINER_CHILD':'object COMMA?
    ;
containerColor
    : CONTAINER_COLOR':'COLORS COMMA?
    ;


sizedBox
    : NEW SIZEDBOX '(' sizedBoxAtts* ')'
    ;
sizedBoxAtts
    : sizedBoxWidth
    | sizedBoxHeight
    | sizedBoxChild
    ;
sizedBoxWidth
    : SIZEDBOX_WIDTH':'INT_NUM COMMA?
    ;
sizedBoxHeight
    : SIZEDBOX_HEIGHT':'INT_NUM COMMA?
    ;
sizedBoxChild
    : SIZEDBOX_CHILD':'object COMMA?
    ;


padding
    : NEW PADDING '(' paddingAtts* ')'
    ;
paddingAtts
    : values
    | paddingChild
    ;
paddingChild
    : PADDING_CHILD':'object COMMA?
    ;
values
    : VALUES':'ZERO COMMA?
    | VALUES':'ALL '(' INT_NUM ')' COMMA?
    | VALUES':'SYMMETRIC '(' horizontalOrVertical+ ')' COMMA?
    | VALUES':'COSTUME '(' costumeValues+ ')' COMMA?
    ;
horizontalOrVertical
    : HORIZONTAL':'INT_NUM COMMA?
    | VERTICAL':' INT_NUM COMMA?
    ;
costumeValues
    : LEFT':'INT_NUM COMMA?
    | TOP':'INT_NUM COMMA?
    | RIGHT':'INT_NUM COMMA?
    | BOTTOM':'INT_NUM COMMA?
    ;


inkWell
    : NEW INK_WELL '(' inkWellAtts* ')'
    ;
inkWellAtts
    : inkWellOnTap
    | inkWellChild
    ;
inkWellOnTap
    : INK_WELL_ON_TAP':' functionCall COMMA?
    | INK_WELL_ON_TAP':' unnamedFunction COMMA?
    ;
inkWellChild
    : INK_WELL_CHILD':'object COMMA?
    ;


image
    : NEW IMAGE '(' CHARACTERS COMMA? imageAtts* ')'
    ;
imageAtts
    : imageFit
    | imageWidth
    | imageHeight
    ;
imageFit
    : FIT':'BOX_FIT COMMA?
    ;
imageWidth
    : IMAGE_WIDTH':'INT_NUM COMMA?
    ;
imageHeight
    : IMAGE_HEIGHT':'INT_NUM COMMA?
    ;


button
    : NEW BUTTON '(' buttonAtts* ')'
    ;
buttonAtts
    : buttonOnTap
    | buttonChild
    | buttonColor
    ;
buttonOnTap
    : BUTTON_ON_TAP':' functionCall COMMA?
    | BUTTON_ON_TAP':' unnamedFunction COMMA?
    ;
buttonChild
    : BUTTON_CHILD':'object COMMA?
    ;
buttonColor
    : BUTTON_COLOR':'COLORS COMMA?
    ;


scrollView
    : NEW SCROLL_VIEW '(' scrollViewAtts* ')'
    ;
scrollViewAtts
    : scrollDirection
    | scrollChild
    ;
scrollDirection
    : SCROLL_DIRECTION':' (HORIZONTAL | VERTICAL) COMMA?
    ;
scrollChild
    : SCROLL_CHILD':'object COMMA?
    ;
navigation
    : PUSH '(' page ')'   # NavigationPushing
    | POP                 # NavigationPopping
    ;
page
    : route (', args: ' map)?
    ;
route
    : ID'.'ID           # StringRoute
    | object            # ObjectRoute
    ;
pageArgsExtracting
    : varOrType ID '= Route.args'
    ;
setState
    : SETSTATE '(()' block ')'
    ;
//TOKENS

//CONDITIONS
IF: 'if';
ELSE: 'else';
ELSEIF: 'else if';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
BREAK: 'break';
CONTINUE: 'continue';

//LOOPS
WHILE: 'while';
DO: 'do';
FOR: 'for';
FOREACH: 'foreach';

//TYPES
FINAL: 'final';
CONST: 'const';
VAR: 'var';
DYNAMIC: 'dynamic';
VOID: 'void';
INT: 'int';
DOUBLE: 'double';
STRING: 'String';
LIST: 'List';
MAP: 'Map';
BOOL: 'bool';
TRUE: 'true';
FALSE: 'false';
OBJECT: 'Object';
FUNCTION: 'Function';
RETURN: 'return';
LATE: 'late';
REQUIRED: 'required';
ASYNC: 'async';
AWAIT: 'await';

//OOP
CLASS: 'class';
EXTENDS: 'extends';
INTERFACE: 'interface';
IMPLEMENTS: 'implements';
ABSTRACT: 'abstract';
OVERRIDE: '@override';
THIS: 'this';
STATIC: 'static';
NEW: 'new';

//COMMENTS AND WHITE SPACES
WS: ('\r'?'\n' | '\n' | ' ' | '\t')+ -> skip;
COMMENT: '//' ~[\r\n] -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

//COMPONENTS
MATERIAL_APP: 'MaterialApp';
TITLE: 'title';
HOME: 'home';
/////////////
SCAFFOLD: 'Scaffold';
BODY: 'body';
BACKGROUND_COLOR: 'backgroundColor';
/////////////
COLUMN: 'Column';
ROW: 'Row';
MAIN_AXIS_ALIGNMENT: 'mainAxisAlignment';
CROSS_AXIS_ALIGNMENT: 'crossAxisAlignment';
CHILDREN: 'children';
/////////////
TEXT: 'Text';
TEXT_COLOR: 'textColor';
TEXT_SIZE: 'textSize';
TEXT_STYLE: 'textStyle';
/////////////
CONTAINER: 'Container';
CONTAINER_WIDTH: 'containerWidth';
CONTAINER_HEIGHT: 'containerHeight';
CONTAINER_COLOR: 'containerColor';
CONTAINER_CHILD: 'containerChild';
/////////////
SIZEDBOX: 'SizedBox';
SIZEDBOX_WIDTH: 'sizedBoxWidth';
SIZEDBOX_HEIGHT: 'sizedBoxHeight';
SIZEDBOX_CHILD: 'sizedBoxChild';
/////////////
INK_WELL: 'InkWell';
INK_WELL_ON_TAP: 'inkWellOnTap';
INK_WELL_CHILD: 'inkWellChild';
/////////////
IMAGE: 'Image';
FIT: 'fit';
BOX_FIT: 'BoxFit.cover' | 'BoxFit.fill' | 'BoxFit.fitWidth' | 'BoxFit.fitHeight';
IMAGE_WIDTH: 'imageWidth';
IMAGE_HEIGHT: 'imageHeight';
/////////////
STACK: 'Stack';
STACK_FIT: 'StackFit.expanded' | 'StackFit.loose';
STACK_CHILDREN: 'stackChildren';
/////////////
BUTTON: 'Button';
BUTTON_ON_TAP: 'buttonOnTap';
BUTTON_CHILD: 'buttonChild';
BUTTON_COLOR: 'buttonColor';
/////////////
SCROLL_VIEW: 'ScrollView';
SCROLL_DIRECTION: 'scrollDirection';
SCROLL_CHILD: 'scrollChild';
/////////////
PADDING: 'Padding';
PADDING_CHILD: 'paddingChild';
VALUES: 'values';
ZERO: 'Values.zero';
ALL: 'Values.all';
SYMMETRIC: 'Values.symmetric';
COSTUME: 'Values.costume';
LEFT: 'left';
RIGHT: 'right';
TOP: 'top';
BOTTOM: 'bottom';
/////////////
COLORS: 'Purple' | 'Blue' | 'Yellow' | 'Black' | 'White' | 'Green' | 'Red';
STYLES: 'Italic' | 'Bold' | 'BoldItalic';
ALIGNMENT: 'start' | 'center' | 'end' | 'spaceBetween' | 'spaceEvenly' | 'spaceAround';
HORIZONTAL: 'horizontal';
VERTICAL: 'vertical';
/////////////
PUSH: 'Navigator.push';
POP: 'Navigator.pop';
EXTRACT: 'Route.args';
SETSTATE: 'setState';

//GENERAL

COMMA: ',';
SEMICOLON: ';';
INT_NUM: '-'? ( '0' | [1-9]+DIGIT* );
DOUBLE_NUM: '-'? ( '0.'DIGIT+ | [1-9]+DIGIT* ('.'DIGIT+) );
//اكتر فاصلتين برانيات للتوكن نفسو
//اكتر فاصلتين جوانيات للريغيولر اكسبريشن
//الفاصلتين يلي قبلهن سلاش لينحطو ضمن التوكن نفسو يعني تقريبا يصير سترينغ رسمي
CHARACTERS: '\''[a-zA-Z0-9!@#$%^&*+_:,.\-=]*'\'';
ID: '_'?[a-zA-Z]+[0-9]*;

fragment DIGIT: [0-9];