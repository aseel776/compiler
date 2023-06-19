package antlr;// Generated from D:/Users/ASUS/Desktop/IntelliJ Projects/DartCompiler/src\DartGrammars.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DartGrammarsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DartGrammarsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(DartGrammarsParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link DartGrammarsParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(DartGrammarsParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link DartGrammarsParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(DartGrammarsParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DartGrammarsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DartGrammarsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DartGrammarsParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(DartGrammarsParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DartGrammarsParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(DartGrammarsParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(DartGrammarsParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(DartGrammarsParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#switchBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBody(DartGrammarsParser.SwitchBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberCase}
	 * labeled alternative in {@link DartGrammarsParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberCase(DartGrammarsParser.NumberCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharCase}
	 * labeled alternative in {@link DartGrammarsParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharCase(DartGrammarsParser.CharCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#defaultCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(DartGrammarsParser.DefaultCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#caseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBody(DartGrammarsParser.CaseBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(DartGrammarsParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(DartGrammarsParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(DartGrammarsParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitialConditionDeclaration}
	 * labeled alternative in {@link DartGrammarsParser#initialCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialConditionDeclaration(DartGrammarsParser.InitialConditionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitialConditionAssignment}
	 * labeled alternative in {@link DartGrammarsParser#initialCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialConditionAssignment(DartGrammarsParser.InitialConditionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitialConditionVariable}
	 * labeled alternative in {@link DartGrammarsParser#initialCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialConditionVariable(DartGrammarsParser.InitialConditionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(DartGrammarsParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(DartGrammarsParser.ForeachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DartGrammarsParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#varOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrType(DartGrammarsParser.VarOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FinalDeclarartion}
	 * labeled alternative in {@link DartGrammarsParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalDeclarartion(DartGrammarsParser.FinalDeclarartionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstDeclarartion}
	 * labeled alternative in {@link DartGrammarsParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclarartion(DartGrammarsParser.ConstDeclarartionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalDeclarartion}
	 * labeled alternative in {@link DartGrammarsParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalDeclarartion(DartGrammarsParser.NormalDeclarartionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(DartGrammarsParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link DartGrammarsParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DartGrammarsParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectAssign}
	 * labeled alternative in {@link DartGrammarsParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectAssign(DartGrammarsParser.ObjectAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisAssign}
	 * labeled alternative in {@link DartGrammarsParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAssign(DartGrammarsParser.ThisAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(DartGrammarsParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#listItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListItem(DartGrammarsParser.ListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(DartGrammarsParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#mapItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapItem(DartGrammarsParser.MapItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#voidOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidOrType(DartGrammarsParser.VoidOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(DartGrammarsParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DartGrammarsParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#unnamedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedFunction(DartGrammarsParser.UnnamedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(DartGrammarsParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#positionalNamedArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalNamedArguments(DartGrammarsParser.PositionalNamedArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#positionalArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArguments(DartGrammarsParser.PositionalArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#namedArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArguments(DartGrammarsParser.NamedArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#zeroArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroArguments(DartGrammarsParser.ZeroArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(DartGrammarsParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(DartGrammarsParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(DartGrammarsParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(DartGrammarsParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DartGrammarsParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(DartGrammarsParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalClassMethod}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassMethod(DartGrammarsParser.NormalClassMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StaticClassMethod}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticClassMethod(DartGrammarsParser.StaticClassMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AbstractClassMethod}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractClassMethod(DartGrammarsParser.AbstractClassMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedConstructor}
	 * labeled alternative in {@link DartGrammarsParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedConstructor(DartGrammarsParser.NamedConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#defaultConstructer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultConstructer(DartGrammarsParser.DefaultConstructerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#consArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsArguments(DartGrammarsParser.ConsArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#consPositionalNamedArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsPositionalNamedArguments(DartGrammarsParser.ConsPositionalNamedArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#consPositionalArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsPositionalArguments(DartGrammarsParser.ConsPositionalArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#consNamedArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsNamedArguments(DartGrammarsParser.ConsNamedArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#conZeroArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConZeroArgs(DartGrammarsParser.ConZeroArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#consArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsArg(DartGrammarsParser.ConsArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DartGrammarsParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(DartGrammarsParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(DartGrammarsParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#positionalNamedParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalNamedParameters(DartGrammarsParser.PositionalNamedParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#positionalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalParameters(DartGrammarsParser.PositionalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#namedParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedParameters(DartGrammarsParser.NamedParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#zeroParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroParameters(DartGrammarsParser.ZeroParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(DartGrammarsParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractExpression(DartGrammarsParser.SubtractExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddtitionExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddtitionExpression(DartGrammarsParser.AddtitionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(DartGrammarsParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(DartGrammarsParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionExpression(DartGrammarsParser.DivisionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link DartGrammarsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(DartGrammarsParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(DartGrammarsParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#materialApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialApp(DartGrammarsParser.MaterialAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#materialAppAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialAppAtts(DartGrammarsParser.MaterialAppAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#materialTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialTitle(DartGrammarsParser.MaterialTitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#materialHome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialHome(DartGrammarsParser.MaterialHomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(DartGrammarsParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#scaffoldAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldAtts(DartGrammarsParser.ScaffoldAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#scaffoldBackground}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldBackground(DartGrammarsParser.ScaffoldBackgroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#scaffoldBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldBody(DartGrammarsParser.ScaffoldBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(DartGrammarsParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(DartGrammarsParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#column_rowAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_rowAtts(DartGrammarsParser.Column_rowAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#mainAxis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainAxis(DartGrammarsParser.MainAxisContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#crossAxis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossAxis(DartGrammarsParser.CrossAxisContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(DartGrammarsParser.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#stack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack(DartGrammarsParser.StackContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#stackAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackAtts(DartGrammarsParser.StackAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#stackFit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackFit(DartGrammarsParser.StackFitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#stackChildren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackChildren(DartGrammarsParser.StackChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(DartGrammarsParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#textAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextAtts(DartGrammarsParser.TextAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#textColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextColor(DartGrammarsParser.TextColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#textSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextSize(DartGrammarsParser.TextSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#textStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStyle(DartGrammarsParser.TextStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(DartGrammarsParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#containerAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerAtts(DartGrammarsParser.ContainerAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#containerWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerWidth(DartGrammarsParser.ContainerWidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#containerHeight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerHeight(DartGrammarsParser.ContainerHeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#containerChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerChild(DartGrammarsParser.ContainerChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#containerColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerColor(DartGrammarsParser.ContainerColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBox(DartGrammarsParser.SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#sizedBoxAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBoxAtts(DartGrammarsParser.SizedBoxAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#sizedBoxWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBoxWidth(DartGrammarsParser.SizedBoxWidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#sizedBoxHeight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBoxHeight(DartGrammarsParser.SizedBoxHeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#sizedBoxChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBoxChild(DartGrammarsParser.SizedBoxChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(DartGrammarsParser.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#paddingAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingAtts(DartGrammarsParser.PaddingAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#paddingChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingChild(DartGrammarsParser.PaddingChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code values}
	 * labeled alternative in {@link DartGrammarsParser#numbernumbercasecaseinitialConditioninitialConditioninitialConditiondeclarationdeclarationdeclarationassignmentassignmentassignmentmethodmethodmethodmethodexpressionexpressionexpressionexpressionexpressionexpressionnavigationnavigationrouteroute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(DartGrammarsParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#horizontalOrVertical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHorizontalOrVertical(DartGrammarsParser.HorizontalOrVerticalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#costumeValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCostumeValues(DartGrammarsParser.CostumeValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#inkWell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInkWell(DartGrammarsParser.InkWellContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#inkWellAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInkWellAtts(DartGrammarsParser.InkWellAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#inkWellOnTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInkWellOnTap(DartGrammarsParser.InkWellOnTapContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#inkWellChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInkWellChild(DartGrammarsParser.InkWellChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(DartGrammarsParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#imageAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageAtts(DartGrammarsParser.ImageAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#imageFit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageFit(DartGrammarsParser.ImageFitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#imageWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageWidth(DartGrammarsParser.ImageWidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#imageHeight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageHeight(DartGrammarsParser.ImageHeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(DartGrammarsParser.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#buttonAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonAtts(DartGrammarsParser.ButtonAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#buttonOnTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonOnTap(DartGrammarsParser.ButtonOnTapContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#buttonChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonChild(DartGrammarsParser.ButtonChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#buttonColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonColor(DartGrammarsParser.ButtonColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#scrollView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrollView(DartGrammarsParser.ScrollViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#scrollViewAtts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrollViewAtts(DartGrammarsParser.ScrollViewAttsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#scrollDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrollDirection(DartGrammarsParser.ScrollDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#scrollChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrollChild(DartGrammarsParser.ScrollChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NavigationPushing}
	 * labeled alternative in {@link DartGrammarsParser#navigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationPushing(DartGrammarsParser.NavigationPushingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NavigationPopping}
	 * labeled alternative in {@link DartGrammarsParser#navigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationPopping(DartGrammarsParser.NavigationPoppingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(DartGrammarsParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringRoute}
	 * labeled alternative in {@link DartGrammarsParser#route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringRoute(DartGrammarsParser.StringRouteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectRoute}
	 * labeled alternative in {@link DartGrammarsParser#route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectRoute(DartGrammarsParser.ObjectRouteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#pageArgsExtracting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageArgsExtracting(DartGrammarsParser.PageArgsExtractingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartGrammarsParser#setState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetState(DartGrammarsParser.SetStateContext ctx);
}