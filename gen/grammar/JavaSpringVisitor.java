// Generated from C:/Users/NOUR-ALSHAM/IdeaProjects/compilers/src/grammar/JavaSpring.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaSpringParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaSpringVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#controllerFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllerFile(JavaSpringParser.ControllerFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#controllerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllerAnnotation(JavaSpringParser.ControllerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaSpringParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaSpringParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(JavaSpringParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaSpringParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#mappingAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingAnnotation(JavaSpringParser.MappingAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JavaSpringParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(JavaSpringParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#parameterAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterAnnotation(JavaSpringParser.ParameterAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterType(JavaSpringParser.ParameterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(JavaSpringParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaSpringParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JavaSpringParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(JavaSpringParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#methodCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStatement(JavaSpringParser.MethodCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(JavaSpringParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaSpringParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#objectCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCreation(JavaSpringParser.ObjectCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(JavaSpringParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#addAttributeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddAttributeStatement(JavaSpringParser.AddAttributeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaSpringParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JavaSpringParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaSpringParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(JavaSpringParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(JavaSpringParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(JavaSpringParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JavaSpringParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JavaSpringParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSpringParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JavaSpringParser.UnaryExpressionContext ctx);
}