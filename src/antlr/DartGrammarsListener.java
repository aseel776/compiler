package antlr;// Generated from D:/Users/ASUS/Desktop/IntelliJ Projects/DartCompiler/src\DartGrammars.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DartGrammarsParser}.
 */
public interface DartGrammarsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DartGrammarsParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DartGrammarsParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link DartGrammarsParser#number}.
	 * @param ctx the parse tree
	 */
	void enterInteger(DartGrammarsParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link DartGrammarsParser#number}.
	 * @param ctx the parse tree
	 */
	void exitInteger(DartGrammarsParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link DartGrammarsParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDouble(DartGrammarsParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link DartGrammarsParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDouble(DartGrammarsParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DartGrammarsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DartGrammarsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DartGrammarsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DartGrammarsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DartGrammarsParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DartGrammarsParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DartGrammarsParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DartGrammarsParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(DartGrammarsParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(DartGrammarsParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(DartGrammarsParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(DartGrammarsParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(DartGrammarsParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(DartGrammarsParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(DartGrammarsParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(DartGrammarsParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBody(DartGrammarsParser.SwitchBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBody(DartGrammarsParser.SwitchBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberCase}
	 * labeled alternative in {@link DartGrammarsParser#case}.
	 * @param ctx the parse tree
	 */
	void enterNumberCase(DartGrammarsParser.NumberCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberCase}
	 * labeled alternative in {@link DartGrammarsParser#case}.
	 * @param ctx the parse tree
	 */
	void exitNumberCase(DartGrammarsParser.NumberCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharCase}
	 * labeled alternative in {@link DartGrammarsParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCharCase(DartGrammarsParser.CharCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharCase}
	 * labeled alternative in {@link DartGrammarsParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCharCase(DartGrammarsParser.CharCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(DartGrammarsParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(DartGrammarsParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void enterCaseBody(DartGrammarsParser.CaseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#caseBody}.
	 * @param ctx the parse tree
	 */
	void exitCaseBody(DartGrammarsParser.CaseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(DartGrammarsParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(DartGrammarsParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(DartGrammarsParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(DartGrammarsParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(DartGrammarsParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(DartGrammarsParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitialConditionDeclaration}
	 * labeled alternative in {@link DartGrammarsParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void enterInitialConditionDeclaration(DartGrammarsParser.InitialConditionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitialConditionDeclaration}
	 * labeled alternative in {@link DartGrammarsParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void exitInitialConditionDeclaration(DartGrammarsParser.InitialConditionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitialConditionAssignment}
	 * labeled alternative in {@link DartGrammarsParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void enterInitialConditionAssignment(DartGrammarsParser.InitialConditionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitialConditionAssignment}
	 * labeled alternative in {@link DartGrammarsParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void exitInitialConditionAssignment(DartGrammarsParser.InitialConditionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitialConditionVariable}
	 * labeled alternative in {@link DartGrammarsParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void enterInitialConditionVariable(DartGrammarsParser.InitialConditionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitialConditionVariable}
	 * labeled alternative in {@link DartGrammarsParser#initialCondition}.
	 * @param ctx the parse tree
	 */
	void exitInitialConditionVariable(DartGrammarsParser.InitialConditionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(DartGrammarsParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(DartGrammarsParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(DartGrammarsParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(DartGrammarsParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DartGrammarsParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DartGrammarsParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#varOrType}.
	 * @param ctx the parse tree
	 */
	void enterVarOrType(DartGrammarsParser.VarOrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#varOrType}.
	 * @param ctx the parse tree
	 */
	void exitVarOrType(DartGrammarsParser.VarOrTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FinalDeclarartion}
	 * labeled alternative in {@link DartGrammarsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFinalDeclarartion(DartGrammarsParser.FinalDeclarartionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FinalDeclarartion}
	 * labeled alternative in {@link DartGrammarsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFinalDeclarartion(DartGrammarsParser.FinalDeclarartionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstDeclarartion}
	 * labeled alternative in {@link DartGrammarsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclarartion(DartGrammarsParser.ConstDeclarartionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstDeclarartion}
	 * labeled alternative in {@link DartGrammarsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclarartion(DartGrammarsParser.ConstDeclarartionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalDeclarartion}
	 * labeled alternative in {@link DartGrammarsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalDeclarartion(DartGrammarsParser.NormalDeclarartionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalDeclarartion}
	 * labeled alternative in {@link DartGrammarsParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalDeclarartion(DartGrammarsParser.NormalDeclarartionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(DartGrammarsParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(DartGrammarsParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link DartGrammarsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DartGrammarsParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link DartGrammarsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DartGrammarsParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectAssign}
	 * labeled alternative in {@link DartGrammarsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterObjectAssign(DartGrammarsParser.ObjectAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectAssign}
	 * labeled alternative in {@link DartGrammarsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitObjectAssign(DartGrammarsParser.ObjectAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisAssign}
	 * labeled alternative in {@link DartGrammarsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterThisAssign(DartGrammarsParser.ThisAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisAssign}
	 * labeled alternative in {@link DartGrammarsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitThisAssign(DartGrammarsParser.ThisAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(DartGrammarsParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(DartGrammarsParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#listItem}.
	 * @param ctx the parse tree
	 */
	void enterListItem(DartGrammarsParser.ListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#listItem}.
	 * @param ctx the parse tree
	 */
	void exitListItem(DartGrammarsParser.ListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(DartGrammarsParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(DartGrammarsParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#mapItem}.
	 * @param ctx the parse tree
	 */
	void enterMapItem(DartGrammarsParser.MapItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#mapItem}.
	 * @param ctx the parse tree
	 */
	void exitMapItem(DartGrammarsParser.MapItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#voidOrType}.
	 * @param ctx the parse tree
	 */
	void enterVoidOrType(DartGrammarsParser.VoidOrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#voidOrType}.
	 * @param ctx the parse tree
	 */
	void exitVoidOrType(DartGrammarsParser.VoidOrTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(DartGrammarsParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(DartGrammarsParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DartGrammarsParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DartGrammarsParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#unnamedFunction}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedFunction(DartGrammarsParser.UnnamedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#unnamedFunction}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedFunction(DartGrammarsParser.UnnamedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(DartGrammarsParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(DartGrammarsParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#positionalNamedArguments}.
	 * @param ctx the parse tree
	 */
	void enterPositionalNamedArguments(DartGrammarsParser.PositionalNamedArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#positionalNamedArguments}.
	 * @param ctx the parse tree
	 */
	void exitPositionalNamedArguments(DartGrammarsParser.PositionalNamedArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#positionalArguments}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArguments(DartGrammarsParser.PositionalArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#positionalArguments}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArguments(DartGrammarsParser.PositionalArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#namedArguments}.
	 * @param ctx the parse tree
	 */
	void enterNamedArguments(DartGrammarsParser.NamedArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#namedArguments}.
	 * @param ctx the parse tree
	 */
	void exitNamedArguments(DartGrammarsParser.NamedArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#zeroArguments}.
	 * @param ctx the parse tree
	 */
	void enterZeroArguments(DartGrammarsParser.ZeroArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#zeroArguments}.
	 * @param ctx the parse tree
	 */
	void exitZeroArguments(DartGrammarsParser.ZeroArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(DartGrammarsParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(DartGrammarsParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(DartGrammarsParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(DartGrammarsParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(DartGrammarsParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(DartGrammarsParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(DartGrammarsParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(DartGrammarsParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(DartGrammarsParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(DartGrammarsParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(DartGrammarsParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(DartGrammarsParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalClassMethod}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassMethod(DartGrammarsParser.NormalClassMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalClassMethod}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassMethod(DartGrammarsParser.NormalClassMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaticClassMethod}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 */
	void enterStaticClassMethod(DartGrammarsParser.StaticClassMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaticClassMethod}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 */
	void exitStaticClassMethod(DartGrammarsParser.StaticClassMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbstractClassMethod}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 */
	void enterAbstractClassMethod(DartGrammarsParser.AbstractClassMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbstractClassMethod}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 */
	void exitAbstractClassMethod(DartGrammarsParser.AbstractClassMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedConstructor}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 */
	void enterNamedConstructor(DartGrammarsParser.NamedConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedConstructor}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 */
	void exitNamedConstructor(DartGrammarsParser.NamedConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#defaultConstructer}.
	 * @param ctx the parse tree
	 */
	void enterDefaultConstructer(DartGrammarsParser.DefaultConstructerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#defaultConstructer}.
	 * @param ctx the parse tree
	 */
	void exitDefaultConstructer(DartGrammarsParser.DefaultConstructerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#consArguments}.
	 * @param ctx the parse tree
	 */
	void enterConsArguments(DartGrammarsParser.ConsArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#consArguments}.
	 * @param ctx the parse tree
	 */
	void exitConsArguments(DartGrammarsParser.ConsArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#consPositionalNamedArguments}.
	 * @param ctx the parse tree
	 */
	void enterConsPositionalNamedArguments(DartGrammarsParser.ConsPositionalNamedArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#consPositionalNamedArguments}.
	 * @param ctx the parse tree
	 */
	void exitConsPositionalNamedArguments(DartGrammarsParser.ConsPositionalNamedArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#consPositionalArguments}.
	 * @param ctx the parse tree
	 */
	void enterConsPositionalArguments(DartGrammarsParser.ConsPositionalArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#consPositionalArguments}.
	 * @param ctx the parse tree
	 */
	void exitConsPositionalArguments(DartGrammarsParser.ConsPositionalArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#consNamedArguments}.
	 * @param ctx the parse tree
	 */
	void enterConsNamedArguments(DartGrammarsParser.ConsNamedArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#consNamedArguments}.
	 * @param ctx the parse tree
	 */
	void exitConsNamedArguments(DartGrammarsParser.ConsNamedArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#conZeroArgs}.
	 * @param ctx the parse tree
	 */
	void enterConZeroArgs(DartGrammarsParser.ConZeroArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#conZeroArgs}.
	 * @param ctx the parse tree
	 */
	void exitConZeroArgs(DartGrammarsParser.ConZeroArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#consArg}.
	 * @param ctx the parse tree
	 */
	void enterConsArg(DartGrammarsParser.ConsArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#consArg}.
	 * @param ctx the parse tree
	 */
	void exitConsArg(DartGrammarsParser.ConsArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(DartGrammarsParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(DartGrammarsParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(DartGrammarsParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(DartGrammarsParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(DartGrammarsParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(DartGrammarsParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#positionalNamedParameters}.
	 * @param ctx the parse tree
	 */
	void enterPositionalNamedParameters(DartGrammarsParser.PositionalNamedParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#positionalNamedParameters}.
	 * @param ctx the parse tree
	 */
	void exitPositionalNamedParameters(DartGrammarsParser.PositionalNamedParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#positionalParameters}.
	 * @param ctx the parse tree
	 */
	void enterPositionalParameters(DartGrammarsParser.PositionalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#positionalParameters}.
	 * @param ctx the parse tree
	 */
	void exitPositionalParameters(DartGrammarsParser.PositionalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#namedParameters}.
	 * @param ctx the parse tree
	 */
	void enterNamedParameters(DartGrammarsParser.NamedParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#namedParameters}.
	 * @param ctx the parse tree
	 */
	void exitNamedParameters(DartGrammarsParser.NamedParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#zeroParameters}.
	 * @param ctx the parse tree
	 */
	void enterZeroParameters(DartGrammarsParser.ZeroParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#zeroParameters}.
	 * @param ctx the parse tree
	 */
	void exitZeroParameters(DartGrammarsParser.ZeroParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(DartGrammarsParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(DartGrammarsParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtractExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpression(DartGrammarsParser.SubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpression(DartGrammarsParser.SubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddtitionExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddtitionExpression(DartGrammarsParser.AddtitionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddtitionExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddtitionExpression(DartGrammarsParser.AddtitionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(DartGrammarsParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(DartGrammarsParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(DartGrammarsParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(DartGrammarsParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpression(DartGrammarsParser.DivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpression(DartGrammarsParser.DivisionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(DartGrammarsParser.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(DartGrammarsParser.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(DartGrammarsParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(DartGrammarsParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#materialApp}.
	 * @param ctx the parse tree
	 */
	void enterMaterialApp(DartGrammarsParser.MaterialAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#materialApp}.
	 * @param ctx the parse tree
	 */
	void exitMaterialApp(DartGrammarsParser.MaterialAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#materialAppAtts}.
	 * @param ctx the parse tree
	 */
	void enterMaterialAppAtts(DartGrammarsParser.MaterialAppAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#materialAppAtts}.
	 * @param ctx the parse tree
	 */
	void exitMaterialAppAtts(DartGrammarsParser.MaterialAppAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#materialTitle}.
	 * @param ctx the parse tree
	 */
	void enterMaterialTitle(DartGrammarsParser.MaterialTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#materialTitle}.
	 * @param ctx the parse tree
	 */
	void exitMaterialTitle(DartGrammarsParser.MaterialTitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#materialHome}.
	 * @param ctx the parse tree
	 */
	void enterMaterialHome(DartGrammarsParser.MaterialHomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#materialHome}.
	 * @param ctx the parse tree
	 */
	void exitMaterialHome(DartGrammarsParser.MaterialHomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(DartGrammarsParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(DartGrammarsParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#scaffoldAtts}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldAtts(DartGrammarsParser.ScaffoldAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#scaffoldAtts}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldAtts(DartGrammarsParser.ScaffoldAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#scaffoldBackground}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldBackground(DartGrammarsParser.ScaffoldBackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#scaffoldBackground}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldBackground(DartGrammarsParser.ScaffoldBackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#scaffoldBody}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldBody(DartGrammarsParser.ScaffoldBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#scaffoldBody}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldBody(DartGrammarsParser.ScaffoldBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(DartGrammarsParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(DartGrammarsParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(DartGrammarsParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(DartGrammarsParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#column_rowAtts}.
	 * @param ctx the parse tree
	 */
	void enterColumn_rowAtts(DartGrammarsParser.Column_rowAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#column_rowAtts}.
	 * @param ctx the parse tree
	 */
	void exitColumn_rowAtts(DartGrammarsParser.Column_rowAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#mainAxis}.
	 * @param ctx the parse tree
	 */
	void enterMainAxis(DartGrammarsParser.MainAxisContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#mainAxis}.
	 * @param ctx the parse tree
	 */
	void exitMainAxis(DartGrammarsParser.MainAxisContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#crossAxis}.
	 * @param ctx the parse tree
	 */
	void enterCrossAxis(DartGrammarsParser.CrossAxisContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#crossAxis}.
	 * @param ctx the parse tree
	 */
	void exitCrossAxis(DartGrammarsParser.CrossAxisContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#children}.
	 * @param ctx the parse tree
	 */
	void enterChildren(DartGrammarsParser.ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#children}.
	 * @param ctx the parse tree
	 */
	void exitChildren(DartGrammarsParser.ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#stack}.
	 * @param ctx the parse tree
	 */
	void enterStack(DartGrammarsParser.StackContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#stack}.
	 * @param ctx the parse tree
	 */
	void exitStack(DartGrammarsParser.StackContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#stackAtts}.
	 * @param ctx the parse tree
	 */
	void enterStackAtts(DartGrammarsParser.StackAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#stackAtts}.
	 * @param ctx the parse tree
	 */
	void exitStackAtts(DartGrammarsParser.StackAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#stackFit}.
	 * @param ctx the parse tree
	 */
	void enterStackFit(DartGrammarsParser.StackFitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#stackFit}.
	 * @param ctx the parse tree
	 */
	void exitStackFit(DartGrammarsParser.StackFitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#stackChildren}.
	 * @param ctx the parse tree
	 */
	void enterStackChildren(DartGrammarsParser.StackChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#stackChildren}.
	 * @param ctx the parse tree
	 */
	void exitStackChildren(DartGrammarsParser.StackChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(DartGrammarsParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(DartGrammarsParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#textAtts}.
	 * @param ctx the parse tree
	 */
	void enterTextAtts(DartGrammarsParser.TextAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#textAtts}.
	 * @param ctx the parse tree
	 */
	void exitTextAtts(DartGrammarsParser.TextAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#textColor}.
	 * @param ctx the parse tree
	 */
	void enterTextColor(DartGrammarsParser.TextColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#textColor}.
	 * @param ctx the parse tree
	 */
	void exitTextColor(DartGrammarsParser.TextColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#textSize}.
	 * @param ctx the parse tree
	 */
	void enterTextSize(DartGrammarsParser.TextSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#textSize}.
	 * @param ctx the parse tree
	 */
	void exitTextSize(DartGrammarsParser.TextSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#textStyle}.
	 * @param ctx the parse tree
	 */
	void enterTextStyle(DartGrammarsParser.TextStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#textStyle}.
	 * @param ctx the parse tree
	 */
	void exitTextStyle(DartGrammarsParser.TextStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(DartGrammarsParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(DartGrammarsParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#containerAtts}.
	 * @param ctx the parse tree
	 */
	void enterContainerAtts(DartGrammarsParser.ContainerAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#containerAtts}.
	 * @param ctx the parse tree
	 */
	void exitContainerAtts(DartGrammarsParser.ContainerAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#containerWidth}.
	 * @param ctx the parse tree
	 */
	void enterContainerWidth(DartGrammarsParser.ContainerWidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#containerWidth}.
	 * @param ctx the parse tree
	 */
	void exitContainerWidth(DartGrammarsParser.ContainerWidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#containerHeight}.
	 * @param ctx the parse tree
	 */
	void enterContainerHeight(DartGrammarsParser.ContainerHeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#containerHeight}.
	 * @param ctx the parse tree
	 */
	void exitContainerHeight(DartGrammarsParser.ContainerHeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#containerChild}.
	 * @param ctx the parse tree
	 */
	void enterContainerChild(DartGrammarsParser.ContainerChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#containerChild}.
	 * @param ctx the parse tree
	 */
	void exitContainerChild(DartGrammarsParser.ContainerChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#containerColor}.
	 * @param ctx the parse tree
	 */
	void enterContainerColor(DartGrammarsParser.ContainerColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#containerColor}.
	 * @param ctx the parse tree
	 */
	void exitContainerColor(DartGrammarsParser.ContainerColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void enterSizedBox(DartGrammarsParser.SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void exitSizedBox(DartGrammarsParser.SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#sizedBoxAtts}.
	 * @param ctx the parse tree
	 */
	void enterSizedBoxAtts(DartGrammarsParser.SizedBoxAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#sizedBoxAtts}.
	 * @param ctx the parse tree
	 */
	void exitSizedBoxAtts(DartGrammarsParser.SizedBoxAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#sizedBoxWidth}.
	 * @param ctx the parse tree
	 */
	void enterSizedBoxWidth(DartGrammarsParser.SizedBoxWidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#sizedBoxWidth}.
	 * @param ctx the parse tree
	 */
	void exitSizedBoxWidth(DartGrammarsParser.SizedBoxWidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#sizedBoxHeight}.
	 * @param ctx the parse tree
	 */
	void enterSizedBoxHeight(DartGrammarsParser.SizedBoxHeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#sizedBoxHeight}.
	 * @param ctx the parse tree
	 */
	void exitSizedBoxHeight(DartGrammarsParser.SizedBoxHeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#sizedBoxChild}.
	 * @param ctx the parse tree
	 */
	void enterSizedBoxChild(DartGrammarsParser.SizedBoxChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#sizedBoxChild}.
	 * @param ctx the parse tree
	 */
	void exitSizedBoxChild(DartGrammarsParser.SizedBoxChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#padding}.
	 * @param ctx the parse tree
	 */
	void enterPadding(DartGrammarsParser.PaddingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#padding}.
	 * @param ctx the parse tree
	 */
	void exitPadding(DartGrammarsParser.PaddingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#paddingAtts}.
	 * @param ctx the parse tree
	 */
	void enterPaddingAtts(DartGrammarsParser.PaddingAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#paddingAtts}.
	 * @param ctx the parse tree
	 */
	void exitPaddingAtts(DartGrammarsParser.PaddingAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#paddingChild}.
	 * @param ctx the parse tree
	 */
	void enterPaddingChild(DartGrammarsParser.PaddingChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#paddingChild}.
	 * @param ctx the parse tree
	 */
	void exitPaddingChild(DartGrammarsParser.PaddingChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link DartGrammarsParser#numbernumbercasecaseinitialConditioninitialConditioninitialConditiondeclarationdeclarationdeclarationassignmentassignmentassignmentmethodmethodmethodmethodexpressionexpressionexpressionexpressionexpressionexpressionnavigationnavigationrouteroute}.
	 * @param ctx the parse tree
	 */
	void enterValues(DartGrammarsParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link DartGrammarsParser#numbernumbercasecaseinitialConditioninitialConditioninitialConditiondeclarationdeclarationdeclarationassignmentassignmentassignmentmethodmethodmethodmethodexpressionexpressionexpressionexpressionexpressionexpressionnavigationnavigationrouteroute}.
	 * @param ctx the parse tree
	 */
	void exitValues(DartGrammarsParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#horizontalOrVertical}.
	 * @param ctx the parse tree
	 */
	void enterHorizontalOrVertical(DartGrammarsParser.HorizontalOrVerticalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#horizontalOrVertical}.
	 * @param ctx the parse tree
	 */
	void exitHorizontalOrVertical(DartGrammarsParser.HorizontalOrVerticalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#costumeValues}.
	 * @param ctx the parse tree
	 */
	void enterCostumeValues(DartGrammarsParser.CostumeValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#costumeValues}.
	 * @param ctx the parse tree
	 */
	void exitCostumeValues(DartGrammarsParser.CostumeValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#inkWell}.
	 * @param ctx the parse tree
	 */
	void enterInkWell(DartGrammarsParser.InkWellContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#inkWell}.
	 * @param ctx the parse tree
	 */
	void exitInkWell(DartGrammarsParser.InkWellContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#inkWellAtts}.
	 * @param ctx the parse tree
	 */
	void enterInkWellAtts(DartGrammarsParser.InkWellAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#inkWellAtts}.
	 * @param ctx the parse tree
	 */
	void exitInkWellAtts(DartGrammarsParser.InkWellAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#inkWellOnTap}.
	 * @param ctx the parse tree
	 */
	void enterInkWellOnTap(DartGrammarsParser.InkWellOnTapContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#inkWellOnTap}.
	 * @param ctx the parse tree
	 */
	void exitInkWellOnTap(DartGrammarsParser.InkWellOnTapContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#inkWellChild}.
	 * @param ctx the parse tree
	 */
	void enterInkWellChild(DartGrammarsParser.InkWellChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#inkWellChild}.
	 * @param ctx the parse tree
	 */
	void exitInkWellChild(DartGrammarsParser.InkWellChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(DartGrammarsParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(DartGrammarsParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#imageAtts}.
	 * @param ctx the parse tree
	 */
	void enterImageAtts(DartGrammarsParser.ImageAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#imageAtts}.
	 * @param ctx the parse tree
	 */
	void exitImageAtts(DartGrammarsParser.ImageAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#imageFit}.
	 * @param ctx the parse tree
	 */
	void enterImageFit(DartGrammarsParser.ImageFitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#imageFit}.
	 * @param ctx the parse tree
	 */
	void exitImageFit(DartGrammarsParser.ImageFitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#imageWidth}.
	 * @param ctx the parse tree
	 */
	void enterImageWidth(DartGrammarsParser.ImageWidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#imageWidth}.
	 * @param ctx the parse tree
	 */
	void exitImageWidth(DartGrammarsParser.ImageWidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#imageHeight}.
	 * @param ctx the parse tree
	 */
	void enterImageHeight(DartGrammarsParser.ImageHeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#imageHeight}.
	 * @param ctx the parse tree
	 */
	void exitImageHeight(DartGrammarsParser.ImageHeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(DartGrammarsParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(DartGrammarsParser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#buttonAtts}.
	 * @param ctx the parse tree
	 */
	void enterButtonAtts(DartGrammarsParser.ButtonAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#buttonAtts}.
	 * @param ctx the parse tree
	 */
	void exitButtonAtts(DartGrammarsParser.ButtonAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#buttonOnTap}.
	 * @param ctx the parse tree
	 */
	void enterButtonOnTap(DartGrammarsParser.ButtonOnTapContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#buttonOnTap}.
	 * @param ctx the parse tree
	 */
	void exitButtonOnTap(DartGrammarsParser.ButtonOnTapContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#buttonChild}.
	 * @param ctx the parse tree
	 */
	void enterButtonChild(DartGrammarsParser.ButtonChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#buttonChild}.
	 * @param ctx the parse tree
	 */
	void exitButtonChild(DartGrammarsParser.ButtonChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#buttonColor}.
	 * @param ctx the parse tree
	 */
	void enterButtonColor(DartGrammarsParser.ButtonColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#buttonColor}.
	 * @param ctx the parse tree
	 */
	void exitButtonColor(DartGrammarsParser.ButtonColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#scrollView}.
	 * @param ctx the parse tree
	 */
	void enterScrollView(DartGrammarsParser.ScrollViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#scrollView}.
	 * @param ctx the parse tree
	 */
	void exitScrollView(DartGrammarsParser.ScrollViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#scrollViewAtts}.
	 * @param ctx the parse tree
	 */
	void enterScrollViewAtts(DartGrammarsParser.ScrollViewAttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#scrollViewAtts}.
	 * @param ctx the parse tree
	 */
	void exitScrollViewAtts(DartGrammarsParser.ScrollViewAttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#scrollDirection}.
	 * @param ctx the parse tree
	 */
	void enterScrollDirection(DartGrammarsParser.ScrollDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#scrollDirection}.
	 * @param ctx the parse tree
	 */
	void exitScrollDirection(DartGrammarsParser.ScrollDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#scrollChild}.
	 * @param ctx the parse tree
	 */
	void enterScrollChild(DartGrammarsParser.ScrollChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#scrollChild}.
	 * @param ctx the parse tree
	 */
	void exitScrollChild(DartGrammarsParser.ScrollChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NavigationPushing}
	 * labeled alternative in {@link DartGrammarsParser#navigation}.
	 * @param ctx the parse tree
	 */
	void enterNavigationPushing(DartGrammarsParser.NavigationPushingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NavigationPushing}
	 * labeled alternative in {@link DartGrammarsParser#navigation}.
	 * @param ctx the parse tree
	 */
	void exitNavigationPushing(DartGrammarsParser.NavigationPushingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NavigationPopping}
	 * labeled alternative in {@link DartGrammarsParser#navigation}.
	 * @param ctx the parse tree
	 */
	void enterNavigationPopping(DartGrammarsParser.NavigationPoppingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NavigationPopping}
	 * labeled alternative in {@link DartGrammarsParser#navigation}.
	 * @param ctx the parse tree
	 */
	void exitNavigationPopping(DartGrammarsParser.NavigationPoppingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(DartGrammarsParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(DartGrammarsParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringRoute}
	 * labeled alternative in {@link DartGrammarsParser#route}.
	 * @param ctx the parse tree
	 */
	void enterStringRoute(DartGrammarsParser.StringRouteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringRoute}
	 * labeled alternative in {@link DartGrammarsParser#route}.
	 * @param ctx the parse tree
	 */
	void exitStringRoute(DartGrammarsParser.StringRouteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectRoute}
	 * labeled alternative in {@link DartGrammarsParser#route}.
	 * @param ctx the parse tree
	 */
	void enterObjectRoute(DartGrammarsParser.ObjectRouteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectRoute}
	 * labeled alternative in {@link DartGrammarsParser#route}.
	 * @param ctx the parse tree
	 */
	void exitObjectRoute(DartGrammarsParser.ObjectRouteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#pageArgsExtracting}.
	 * @param ctx the parse tree
	 */
	void enterPageArgsExtracting(DartGrammarsParser.PageArgsExtractingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#pageArgsExtracting}.
	 * @param ctx the parse tree
	 */
	void exitPageArgsExtracting(DartGrammarsParser.PageArgsExtractingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartGrammarsParser#setState}.
	 * @param ctx the parse tree
	 */
	void enterSetState(DartGrammarsParser.SetStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartGrammarsParser#setState}.
	 * @param ctx the parse tree
	 */
	void exitSetState(DartGrammarsParser.SetStateContext ctx);
}