// Generated from C:/Users/NOUR-ALSHAM/IdeaProjects/compilers/src/grammar/JavaSpring.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaSpringParser}.
 */
public interface JavaSpringListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#controllerFile}.
	 * @param ctx the parse tree
	 */
	void enterControllerFile(JavaSpringParser.ControllerFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#controllerFile}.
	 * @param ctx the parse tree
	 */
	void exitControllerFile(JavaSpringParser.ControllerFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#controllerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterControllerAnnotation(JavaSpringParser.ControllerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#controllerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitControllerAnnotation(JavaSpringParser.ControllerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaSpringParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaSpringParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaSpringParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaSpringParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(JavaSpringParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(JavaSpringParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaSpringParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaSpringParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#mappingAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMappingAnnotation(JavaSpringParser.MappingAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#mappingAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMappingAnnotation(JavaSpringParser.MappingAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaSpringParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaSpringParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JavaSpringParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JavaSpringParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#parameterAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterParameterAnnotation(JavaSpringParser.ParameterAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#parameterAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitParameterAnnotation(JavaSpringParser.ParameterAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(JavaSpringParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(JavaSpringParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(JavaSpringParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(JavaSpringParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaSpringParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaSpringParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JavaSpringParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JavaSpringParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(JavaSpringParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(JavaSpringParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(JavaSpringParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(JavaSpringParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(JavaSpringParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(JavaSpringParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaSpringParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaSpringParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#objectCreation}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreation(JavaSpringParser.ObjectCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#objectCreation}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreation(JavaSpringParser.ObjectCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaSpringParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaSpringParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#addAttributeStatement}.
	 * @param ctx the parse tree
	 */
	void enterAddAttributeStatement(JavaSpringParser.AddAttributeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#addAttributeStatement}.
	 * @param ctx the parse tree
	 */
	void exitAddAttributeStatement(JavaSpringParser.AddAttributeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaSpringParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaSpringParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaSpringParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaSpringParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaSpringParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaSpringParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(JavaSpringParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(JavaSpringParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(JavaSpringParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(JavaSpringParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(JavaSpringParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(JavaSpringParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JavaSpringParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JavaSpringParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JavaSpringParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JavaSpringParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSpringParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JavaSpringParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSpringParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JavaSpringParser.UnaryExpressionContext ctx);
}