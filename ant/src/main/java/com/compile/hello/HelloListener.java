// Generated from D:/compile/ant/src/main/resources/Hello.g4 by ANTLR 4.13.1

    package com.compile.hello;
    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(HelloParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(HelloParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declaratorList}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorList(HelloParser.DeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declaratorList}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorList(HelloParser.DeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#comparementStatement}.
	 * @param ctx the parse tree
	 */
	void enterComparementStatement(HelloParser.ComparementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#comparementStatement}.
	 * @param ctx the parse tree
	 */
	void exitComparementStatement(HelloParser.ComparementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(HelloParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(HelloParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(HelloParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(HelloParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(HelloParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(HelloParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HelloParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HelloParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(HelloParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(HelloParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(HelloParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(HelloParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(HelloParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(HelloParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(HelloParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(HelloParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compareOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompareOperator(HelloParser.CompareOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compareOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompareOperator(HelloParser.CompareOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(HelloParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(HelloParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(HelloParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(HelloParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(HelloParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(HelloParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(HelloParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(HelloParser.ArgumentExpressionListContext ctx);
}