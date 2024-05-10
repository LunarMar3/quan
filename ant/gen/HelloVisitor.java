// Generated from D:/compile/ant/src/main/resources/Hello.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HelloParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(HelloParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#declaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorList(HelloParser.DeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#comparementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparementStatement(HelloParser.ComparementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(HelloParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(HelloParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(HelloParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(HelloParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(HelloParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(HelloParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(HelloParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(HelloParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compareOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOperator(HelloParser.CompareOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(HelloParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(HelloParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(HelloParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(HelloParser.ArgumentExpressionListContext ctx);
}