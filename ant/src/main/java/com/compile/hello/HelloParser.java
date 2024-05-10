// Generated from D:/compile/ant/src/main/resources/Hello.g4 by ANTLR 4.13.1

    package com.compile.hello;
    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, IFTK=9, 
		WHILETK=10, ELSETK=11, CONSTTK=12, CHARTK=13, VOIDTK=14, MAINTK=15, INTTK=16, 
		DOTK=17, FORTK=18, SCANFTK=19, PRINTFTK=20, RETURNTK=21, DecimalConst=22, 
		OctalConst=23, Hexadecimal=24, ASSIGN=25, LSS=26, LEQ=27, GRE=28, GEQ=29, 
		EQL=30, NEQ=31, MULT=32, DIV=33, PLUS=34, MINUS=35, SEMICN=36, COMMA=37, 
		LPARENT=38, RPARENT=39, RBRACK=40, LBRACK=41, LBRACE=42, RBRACE=43, IDENTR=44, 
		ILLEGALIDENTR=45, Whitespace=46, Newline=47, OneLineComment=48, MultiLineComment=49, 
		ErrMultiLineCommentMissingEnd=50;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declarationStatement = 2, RULE_declaratorList = 3, 
		RULE_comparementStatement = 4, RULE_whileStatement = 5, RULE_compoundStatement = 6, 
		RULE_ifStatement = 7, RULE_expression = 8, RULE_literal = 9, RULE_declarator = 10, 
		RULE_typeSpecifier = 11, RULE_assignmentExpression = 12, RULE_assignmentOperator = 13, 
		RULE_compareOperator = 14, RULE_additiveExpression = 15, RULE_multiplicativeExpression = 16, 
		RULE_primaryExpression = 17, RULE_argumentExpressionList = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declarationStatement", "declaratorList", "comparementStatement", 
			"whileStatement", "compoundStatement", "ifStatement", "expression", "literal", 
			"declarator", "typeSpecifier", "assignmentExpression", "assignmentOperator", 
			"compareOperator", "additiveExpression", "multiplicativeExpression", 
			"primaryExpression", "argumentExpressionList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'%'", 
			"'if'", "'while'", "'else'", "'const'", "'char'", "'void'", "'main'", 
			"'int'", "'do'", "'for'", "'scanf'", "'printf'", "'return'", null, null, 
			null, "'='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'*'", "'/'", 
			"'+'", "'-'", "';'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "IFTK", "WHILETK", 
			"ELSETK", "CONSTTK", "CHARTK", "VOIDTK", "MAINTK", "INTTK", "DOTK", "FORTK", 
			"SCANFTK", "PRINTFTK", "RETURNTK", "DecimalConst", "OctalConst", "Hexadecimal", 
			"ASSIGN", "LSS", "LEQ", "GRE", "GEQ", "EQL", "NEQ", "MULT", "DIV", "PLUS", 
			"MINUS", "SEMICN", "COMMA", "LPARENT", "RPARENT", "RBRACK", "LBRACK", 
			"LBRACE", "RBRACE", "IDENTR", "ILLEGALIDENTR", "Whitespace", "Newline", 
			"OneLineComment", "MultiLineComment", "ErrMultiLineCommentMissingEnd"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public class Quadruple {
	        public int address;
	        public String operator;
	        public String arg1;
	        public String arg2;
	        public String result;

	        Quadruple(int address, String operator, String arg1, String arg2, String result) {
	            this.address = address;
	            this.operator = operator;
	            this.arg1 = arg1;
	            this.arg2 = arg2;
	            this.result = result;
	        }
	    }

	    static List<Quadruple> quadruples = new ArrayList<>();
	    public static List<Quadruple> getquadruples(){
	        return quadruples;
	    }
	    static int tempCount = 0;
	    static int address = 100;


	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22265139897856L) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public int Ebegin;
		public int Etrue;
		public int Efalse;
		public ExpressionContext expression;
		public IfStatementContext ifStatement;
		public ComparementStatementContext comparementStatement;
		public CompoundStatementContext compoundStatement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICN() { return getToken(HelloParser.SEMICN, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public ComparementStatementContext comparementStatement() {
			return getRuleContext(ComparementStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				((StatementContext)_localctx).expression = expression(0);
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(45);
					match(SEMICN);
					}
					break;
				}

				        ((StatementContext)_localctx).Ebegin =  ((StatementContext)_localctx).expression.Ebegin;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((StatementContext)_localctx).ifStatement = ifStatement();
				setState(52);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(51);
					match(SEMICN);
					}
					break;
				}

				        ((StatementContext)_localctx).Ebegin =  ((StatementContext)_localctx).ifStatement.Ebegin;
				        ((StatementContext)_localctx).Etrue =  ((StatementContext)_localctx).ifStatement.Etrue;
				        ((StatementContext)_localctx).Efalse =  ((StatementContext)_localctx).ifStatement.Efalse;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				declarationStatement();
				setState(57);
				match(SEMICN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				((StatementContext)_localctx).comparementStatement = comparementStatement(0);
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(60);
					match(SEMICN);
					}
					break;
				}

				        ((StatementContext)_localctx).Ebegin =  ((StatementContext)_localctx).comparementStatement.Ebegin;
				        ((StatementContext)_localctx).Etrue =  ((StatementContext)_localctx).comparementStatement.Etrue;
				        ((StatementContext)_localctx).Efalse =  ((StatementContext)_localctx).comparementStatement.Efalse;
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				((StatementContext)_localctx).compoundStatement = compoundStatement();
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(66);
					match(SEMICN);
					}
					break;
				}

				        ((StatementContext)_localctx).Ebegin =  ((StatementContext)_localctx).compoundStatement.Ebegin;
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				whileStatement();
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(72);
					match(SEMICN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public DeclaratorListContext declaratorList() {
			return getRuleContext(DeclaratorListContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			typeSpecifier();
			setState(78);
			declaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorListContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HelloParser.COMMA, 0); }
		public DeclaratorListContext declaratorList() {
			return getRuleContext(DeclaratorListContext.class,0);
		}
		public DeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorListContext declaratorList() throws RecognitionException {
		DeclaratorListContext _localctx = new DeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaratorList);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				declarator();
				setState(82);
				match(COMMA);
				setState(83);
				declaratorList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparementStatementContext extends ParserRuleContext {
		public int Ebegin;
		public int Etrue;
		public int Efalse;
		public ComparementStatementContext left2;
		public ComparementStatementContext left3;
		public ExpressionContext left;
		public CompareOperatorContext compareOperator;
		public ExpressionContext right;
		public ComparementStatementContext right2;
		public ComparementStatementContext right3;
		public CompareOperatorContext compareOperator() {
			return getRuleContext(CompareOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ComparementStatementContext> comparementStatement() {
			return getRuleContexts(ComparementStatementContext.class);
		}
		public ComparementStatementContext comparementStatement(int i) {
			return getRuleContext(ComparementStatementContext.class,i);
		}
		public ComparementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterComparementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitComparementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitComparementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparementStatementContext comparementStatement() throws RecognitionException {
		return comparementStatement(0);
	}

	private ComparementStatementContext comparementStatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparementStatementContext _localctx = new ComparementStatementContext(_ctx, _parentState);
		ComparementStatementContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_comparementStatement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			((ComparementStatementContext)_localctx).left = expression(0);
			setState(89);
			((ComparementStatementContext)_localctx).compareOperator = compareOperator();
			setState(90);
			((ComparementStatementContext)_localctx).right = expression(0);

			        quadruples.add(new Quadruple(address,"j"+(((ComparementStatementContext)_localctx).compareOperator!=null?_input.getText(((ComparementStatementContext)_localctx).compareOperator.start,((ComparementStatementContext)_localctx).compareOperator.stop):null), ((ComparementStatementContext)_localctx).left.op, ((ComparementStatementContext)_localctx).right.op, null));
			        ((ComparementStatementContext)_localctx).Etrue =  address;
			        ((ComparementStatementContext)_localctx).Ebegin =  address;
			        address += 1;
			        quadruples.add(new Quadruple(address,"jump", null, null, null));
			        ((ComparementStatementContext)_localctx).Efalse =  address;
			        address += 1;

			    
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ComparementStatementContext(_parentctx, _parentState);
						_localctx.left2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_comparementStatement);
						setState(93);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(94);
						match(T__0);
						setState(95);
						((ComparementStatementContext)_localctx).right2 = comparementStatement(3);

						                  int temp1 = ((ComparementStatementContext)_localctx).right2.Etrue;
						                  ((ComparementStatementContext)_localctx).Etrue =  temp1;
						                  int temp2 = ((ComparementStatementContext)_localctx).left2.Efalse;
						                  ((ComparementStatementContext)_localctx).Efalse =  temp2;
						                  ((ComparementStatementContext)_localctx).Ebegin =  ((ComparementStatementContext)_localctx).left2.Ebegin;
						                  for (Quadruple quadruple : quadruples) {
						                      if(((ComparementStatementContext)_localctx).left2.Etrue == quadruple.address){
						                          quadruple.result = String.valueOf(((ComparementStatementContext)_localctx).right2.Ebegin);
						                      }
						                      if(((ComparementStatementContext)_localctx).right2.Efalse == quadruple.address){
						                          quadruple.result = String.valueOf(((ComparementStatementContext)_localctx).left2.Ebegin);
						                      }
						                  }
						              
						}
						break;
					case 2:
						{
						_localctx = new ComparementStatementContext(_parentctx, _parentState);
						_localctx.left3 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_comparementStatement);
						setState(98);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(99);
						match(T__1);
						setState(100);
						((ComparementStatementContext)_localctx).right3 = comparementStatement(2);

						                  int temp1 = ((ComparementStatementContext)_localctx).left3.Etrue;
						                  ((ComparementStatementContext)_localctx).Etrue =  temp1;
						                  int temp2 = ((ComparementStatementContext)_localctx).right3.Efalse;
						                  ((ComparementStatementContext)_localctx).Efalse =  temp2;
						                  ((ComparementStatementContext)_localctx).Ebegin =  ((ComparementStatementContext)_localctx).left3.Ebegin;
						                  for (Quadruple quadruple : quadruples) {
						                      if(((ComparementStatementContext)_localctx).right3.Etrue == quadruple.address){
						                          quadruple.result = String.valueOf(((ComparementStatementContext)_localctx).left3.Ebegin);
						                      }
						                      if(((ComparementStatementContext)_localctx).left3.Efalse == quadruple.address){
						                          quadruple.result = String.valueOf(((ComparementStatementContext)_localctx).right3.Ebegin);
						                      }
						                  }
						              
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public int Ebegin;
		public int Etrue;
		public int Efalse;
		public StatementContext left;
		public StatementContext right;
		public TerminalNode WHILETK() { return getToken(HelloParser.WHILETK, 0); }
		public TerminalNode LPARENT() { return getToken(HelloParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(HelloParser.RPARENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WHILETK);
			setState(109);
			match(LPARENT);
			setState(110);
			((WhileStatementContext)_localctx).left = statement();
			setState(111);
			match(RPARENT);
			setState(112);
			((WhileStatementContext)_localctx).right = statement();

			        quadruples.add(new Quadruple(address,"jump", null, null, String.valueOf(((WhileStatementContext)_localctx).left.Ebegin)));
			        address += 1;
			        for (Quadruple quadruple : quadruples) {
			            if (quadruple.address == ((WhileStatementContext)_localctx).left.Etrue){
			                quadruple.result = String.valueOf(((WhileStatementContext)_localctx).right.Ebegin);

			            }
			        }
			        ((WhileStatementContext)_localctx).Ebegin =  ((WhileStatementContext)_localctx).left.Ebegin;
			        ((WhileStatementContext)_localctx).Etrue =  ((WhileStatementContext)_localctx).left.Etrue;
			        ((WhileStatementContext)_localctx).Efalse =  ((WhileStatementContext)_localctx).left.Efalse;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public int Ebegin;
		public int Etrue;
		public int Efalse;
		public StatementContext statement;
		public TerminalNode LBRACE() { return getToken(HelloParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HelloParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(LBRACE);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22265139897856L) != 0)) {
				{
				{
				setState(116);
				((CompoundStatementContext)_localctx).statement = statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(RBRACE);

			        ((CompoundStatementContext)_localctx).Ebegin =  ((CompoundStatementContext)_localctx).statement.Ebegin;
			        ((CompoundStatementContext)_localctx).Etrue =  ((CompoundStatementContext)_localctx).statement.Etrue;
			        ((CompoundStatementContext)_localctx).Efalse =  ((CompoundStatementContext)_localctx).statement.Efalse;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public int Ebegin;
		public int Etrue;
		public int Efalse;
		public StatementContext left;
		public StatementContext right;
		public StatementContext left1;
		public StatementContext right1;
		public StatementContext end;
		public TerminalNode IFTK() { return getToken(HelloParser.IFTK, 0); }
		public TerminalNode LPARENT() { return getToken(HelloParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(HelloParser.RPARENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSETK() { return getToken(HelloParser.ELSETK, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(IFTK);
				setState(126);
				match(LPARENT);
				setState(127);
				((IfStatementContext)_localctx).left = statement();
				setState(128);
				match(RPARENT);
				setState(129);
				((IfStatementContext)_localctx).right = statement();

				        for (Quadruple quadruple : quadruples) {
				            if (quadruple.address == ((IfStatementContext)_localctx).left.Etrue){
				                quadruple.result = String.valueOf(((IfStatementContext)_localctx).right.Ebegin);
				            }
				        }
				        ((IfStatementContext)_localctx).Ebegin =  ((IfStatementContext)_localctx).left.Ebegin;
				        ((IfStatementContext)_localctx).Etrue =  ((IfStatementContext)_localctx).left.Etrue;
				        ((IfStatementContext)_localctx).Efalse =  ((IfStatementContext)_localctx).left.Efalse;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(IFTK);
				setState(133);
				match(LPARENT);
				setState(134);
				((IfStatementContext)_localctx).left1 = statement();
				setState(135);
				match(RPARENT);
				setState(136);
				((IfStatementContext)_localctx).right1 = statement();
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(137);
					match(ELSETK);
					setState(138);
					((IfStatementContext)_localctx).end = statement();
					}
					break;
				}

				        for (Quadruple quadruple : quadruples) {
				            if (quadruple.address == ((IfStatementContext)_localctx).left1.Etrue){
				                quadruple.result = String.valueOf(((IfStatementContext)_localctx).right1.Ebegin);
				            }
				            if (quadruple.address == ((IfStatementContext)_localctx).left1.Efalse){
				                quadruple.result = String.valueOf(((IfStatementContext)_localctx).end.Ebegin);
				            }
				        }
				        ((IfStatementContext)_localctx).Ebegin =  ((IfStatementContext)_localctx).left1.Ebegin;
				        ((IfStatementContext)_localctx).Etrue =  ((IfStatementContext)_localctx).left1.Etrue;
				        ((IfStatementContext)_localctx).Efalse =  ((IfStatementContext)_localctx).left1.Efalse;
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public String op;
		public int Ebegin;
		public AssignmentExpressionContext assignmentExpression;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HelloParser.COMMA, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			((ExpressionContext)_localctx).assignmentExpression = assignmentExpression();

			        ((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).assignmentExpression.op;
			        ((ExpressionContext)_localctx).Ebegin =  ((ExpressionContext)_localctx).assignmentExpression.Ebegin;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(149);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(150);
					match(COMMA);
					setState(151);
					((ExpressionContext)_localctx).assignmentExpression = assignmentExpression();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode DecimalConst() { return getToken(HelloParser.DecimalConst, 0); }
		public TerminalNode OctalConst() { return getToken(HelloParser.OctalConst, 0); }
		public TerminalNode Hexadecimal() { return getToken(HelloParser.Hexadecimal, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public Token IDENTR;
		public ExpressionContext expression;
		public TerminalNode IDENTR() { return getToken(HelloParser.IDENTR, 0); }
		public TerminalNode ASSIGN() { return getToken(HelloParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((DeclaratorContext)_localctx).IDENTR = match(IDENTR);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(160);
				match(ASSIGN);
				setState(161);
				((DeclaratorContext)_localctx).expression = expression(0);
				}
			}


			        quadruples.add(new Quadruple(address,"=", (((DeclaratorContext)_localctx).IDENTR!=null?((DeclaratorContext)_localctx).IDENTR.getText():null), null, ((DeclaratorContext)_localctx).expression.op));
			        address += 1;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode INTTK() { return getToken(HelloParser.INTTK, 0); }
		public TerminalNode CHARTK() { return getToken(HelloParser.CHARTK, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==CHARTK || _la==INTTK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public String op;
		public int Ebegin;
		public AdditiveExpressionContext additiveExpression;
		public Token IDENTR;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode IDENTR() { return getToken(HelloParser.IDENTR, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentExpression);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				((AssignmentExpressionContext)_localctx).additiveExpression = additiveExpression(0);
				((AssignmentExpressionContext)_localctx).op =  ((AssignmentExpressionContext)_localctx).additiveExpression.op;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				((AssignmentExpressionContext)_localctx).IDENTR = match(IDENTR);
				setState(172);
				assignmentOperator();
				setState(173);
				((AssignmentExpressionContext)_localctx).additiveExpression = additiveExpression(0);

				        ((AssignmentExpressionContext)_localctx).Ebegin =  ((AssignmentExpressionContext)_localctx).additiveExpression.Ebegin;
				        quadruples.add(new Quadruple(address,"=", ((AssignmentExpressionContext)_localctx).additiveExpression.op, null, (((AssignmentExpressionContext)_localctx).IDENTR!=null?((AssignmentExpressionContext)_localctx).IDENTR.getText():null)));
				        address += 1;
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(HelloParser.ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33554680L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareOperatorContext extends ParserRuleContext {
		public TerminalNode EQL() { return getToken(HelloParser.EQL, 0); }
		public TerminalNode NEQ() { return getToken(HelloParser.NEQ, 0); }
		public TerminalNode GEQ() { return getToken(HelloParser.GEQ, 0); }
		public TerminalNode GRE() { return getToken(HelloParser.GRE, 0); }
		public TerminalNode LSS() { return getToken(HelloParser.LSS, 0); }
		public TerminalNode LEQ() { return getToken(HelloParser.LEQ, 0); }
		public CompareOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompareOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompareOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCompareOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOperatorContext compareOperator() throws RecognitionException {
		CompareOperatorContext _localctx = new CompareOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compareOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4227858432L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public String op;
		public int Ebegin;
		public AdditiveExpressionContext left;
		public MultiplicativeExpressionContext multiplicativeExpression;
		public MultiplicativeExpressionContext right;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(HelloParser.PLUS, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(HelloParser.MINUS, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(183);
			((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression(0);
			((AdditiveExpressionContext)_localctx).op =  ((AdditiveExpressionContext)_localctx).multiplicativeExpression.op;((AdditiveExpressionContext)_localctx).Ebegin =  ((AdditiveExpressionContext)_localctx).multiplicativeExpression.Ebegin;
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(187);
						match(PLUS);
						setState(188);
						((AdditiveExpressionContext)_localctx).right = ((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression(0);

						                  quadruples.add(new Quadruple(address,"+", ((AdditiveExpressionContext)_localctx).left.op, ((AdditiveExpressionContext)_localctx).multiplicativeExpression.op, "t"+tempCount));
						                  ((AdditiveExpressionContext)_localctx).Ebegin =  address;
						                  address += 1;
						                  ((AdditiveExpressionContext)_localctx).op =  "t"+tempCount;
						                  tempCount += 1;
						              
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(191);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(192);
						match(MINUS);
						setState(193);
						((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression(0);

						                      quadruples.add(new Quadruple(address,"-", ((AdditiveExpressionContext)_localctx).left.op, ((AdditiveExpressionContext)_localctx).multiplicativeExpression.op, "t"+tempCount));
						                      ((AdditiveExpressionContext)_localctx).Ebegin =  address;
						                      address += 1;
						                      ((AdditiveExpressionContext)_localctx).op =  "t"+tempCount;
						                      tempCount += 1;
						                  
						}
						break;
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public String op;
		public int Ebegin;
		public MultiplicativeExpressionContext left;
		public MultiplicativeExpressionContext left2;
		public MultiplicativeExpressionContext left3;
		public PrimaryExpressionContext primaryExpression;
		public PrimaryExpressionContext right;
		public PrimaryExpressionContext right2;
		public PrimaryExpressionContext right3;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode MULT() { return getToken(HelloParser.MULT, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode DIV() { return getToken(HelloParser.DIV, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(202);
			((MultiplicativeExpressionContext)_localctx).primaryExpression = primaryExpression();

			        ((MultiplicativeExpressionContext)_localctx).op =  ((MultiplicativeExpressionContext)_localctx).primaryExpression.op;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(205);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(206);
						match(MULT);
						setState(207);
						((MultiplicativeExpressionContext)_localctx).right = ((MultiplicativeExpressionContext)_localctx).primaryExpression = primaryExpression();

						                  quadruples.add(new Quadruple(address,"*", ((MultiplicativeExpressionContext)_localctx).left.op, ((MultiplicativeExpressionContext)_localctx).right.op, "t"+tempCount));
						                  ((MultiplicativeExpressionContext)_localctx).Ebegin =  address;
						                  address += 1;
						                  ((MultiplicativeExpressionContext)_localctx).op =  "t"+tempCount;
						                  tempCount += 1;
						              
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.left2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						match(DIV);
						setState(212);
						((MultiplicativeExpressionContext)_localctx).right2 = ((MultiplicativeExpressionContext)_localctx).primaryExpression = primaryExpression();

						                  quadruples.add(new Quadruple(address,"/", ((MultiplicativeExpressionContext)_localctx).left2.op, ((MultiplicativeExpressionContext)_localctx).right2.op, "t"+tempCount));
						                  ((MultiplicativeExpressionContext)_localctx).Ebegin =  address;
						                  address += 1;
						                  ((MultiplicativeExpressionContext)_localctx).op =  "t"+tempCount;
						                  tempCount += 1;
						              
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.left3 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(215);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(216);
						match(T__7);
						setState(217);
						((MultiplicativeExpressionContext)_localctx).right3 = ((MultiplicativeExpressionContext)_localctx).primaryExpression = primaryExpression();

						                  quadruples.add(new Quadruple(address,"/", ((MultiplicativeExpressionContext)_localctx).left3.op, ((MultiplicativeExpressionContext)_localctx).right3.op, "t"+tempCount));
						                  ((MultiplicativeExpressionContext)_localctx).Ebegin =  address;
						                  address += 1;
						                  ((MultiplicativeExpressionContext)_localctx).op =  "t"+tempCount;
						                  tempCount += 1;
						              
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public String op;
		public Token IDENTR;
		public LiteralContext literal;
		public ExpressionContext expression;
		public TerminalNode IDENTR() { return getToken(HelloParser.IDENTR, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPARENT() { return getToken(HelloParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(HelloParser.RPARENT, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primaryExpression);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				((PrimaryExpressionContext)_localctx).IDENTR = match(IDENTR);
				((PrimaryExpressionContext)_localctx).op =  (((PrimaryExpressionContext)_localctx).IDENTR!=null?((PrimaryExpressionContext)_localctx).IDENTR.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((PrimaryExpressionContext)_localctx).literal = literal();
				((PrimaryExpressionContext)_localctx).op =  (((PrimaryExpressionContext)_localctx).literal!=null?_input.getText(((PrimaryExpressionContext)_localctx).literal.start,((PrimaryExpressionContext)_localctx).literal.stop):null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(IDENTR);
				setState(231);
				match(LPARENT);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17867093311488L) != 0)) {
					{
					setState(232);
					argumentExpressionList(0);
					}
				}

				setState(235);
				match(RPARENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(LPARENT);
				setState(237);
				((PrimaryExpressionContext)_localctx).expression = expression(0);
				setState(238);
				match(RPARENT);
				((PrimaryExpressionContext)_localctx).op =  ((PrimaryExpressionContext)_localctx).expression.op;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HelloParser.COMMA, 0); }
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(244);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(246);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(247);
					match(COMMA);
					setState(248);
					assignmentExpression();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return comparementStatement_sempred((ComparementStatementContext)_localctx, predIndex);
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 15:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 16:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 18:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean comparementStatement_sempred(ComparementStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u00ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001J\b\u0001"+
		"\u0003\u0001L\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004h\b\u0004"+
		"\n\u0004\f\u0004k\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006"+
		"v\b\u0006\n\u0006\f\u0006y\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u008c\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0090\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0099\b\b\n\b\f\b\u009c\t\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u00a3\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00b1\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00c5\b\u000f\n\u000f\f\u000f\u00c8\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00dd\b\u0010\n\u0010\f\u0010\u00e0\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00ea\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f2\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00fa"+
		"\b\u0012\n\u0012\f\u0012\u00fd\t\u0012\u0001\u0012\u0000\u0005\b\u0010"+
		"\u001e $\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$\u0000\u0004\u0001\u0000\u0016\u0018\u0002"+
		"\u0000\r\r\u0010\u0010\u0002\u0000\u0003\u0007\u0019\u0019\u0001\u0000"+
		"\u001a\u001f\u0109\u0000)\u0001\u0000\u0000\u0000\u0002K\u0001\u0000\u0000"+
		"\u0000\u0004M\u0001\u0000\u0000\u0000\u0006U\u0001\u0000\u0000\u0000\b"+
		"W\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\fs\u0001\u0000\u0000"+
		"\u0000\u000e\u008f\u0001\u0000\u0000\u0000\u0010\u0091\u0001\u0000\u0000"+
		"\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u009f\u0001\u0000\u0000"+
		"\u0000\u0016\u00a6\u0001\u0000\u0000\u0000\u0018\u00b0\u0001\u0000\u0000"+
		"\u0000\u001a\u00b2\u0001\u0000\u0000\u0000\u001c\u00b4\u0001\u0000\u0000"+
		"\u0000\u001e\u00b6\u0001\u0000\u0000\u0000 \u00c9\u0001\u0000\u0000\u0000"+
		"\"\u00f1\u0001\u0000\u0000\u0000$\u00f3\u0001\u0000\u0000\u0000&(\u0003"+
		"\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0001\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,.\u0003\u0010\b\u0000-/\u0005$"+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0006\u0001\uffff\uffff\u00001L\u0001\u0000\u0000"+
		"\u000024\u0003\u000e\u0007\u000035\u0005$\u0000\u000043\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0006\u0001"+
		"\uffff\uffff\u00007L\u0001\u0000\u0000\u000089\u0003\u0004\u0002\u0000"+
		"9:\u0005$\u0000\u0000:L\u0001\u0000\u0000\u0000;=\u0003\b\u0004\u0000"+
		"<>\u0005$\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?@\u0006\u0001\uffff\uffff\u0000@L\u0001\u0000"+
		"\u0000\u0000AC\u0003\f\u0006\u0000BD\u0005$\u0000\u0000CB\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0006"+
		"\u0001\uffff\uffff\u0000FL\u0001\u0000\u0000\u0000GI\u0003\n\u0005\u0000"+
		"HJ\u0005$\u0000\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JL\u0001\u0000\u0000\u0000K,\u0001\u0000\u0000\u0000K2\u0001\u0000\u0000"+
		"\u0000K8\u0001\u0000\u0000\u0000K;\u0001\u0000\u0000\u0000KA\u0001\u0000"+
		"\u0000\u0000KG\u0001\u0000\u0000\u0000L\u0003\u0001\u0000\u0000\u0000"+
		"MN\u0003\u0016\u000b\u0000NO\u0003\u0006\u0003\u0000O\u0005\u0001\u0000"+
		"\u0000\u0000PV\u0003\u0014\n\u0000QR\u0003\u0014\n\u0000RS\u0005%\u0000"+
		"\u0000ST\u0003\u0006\u0003\u0000TV\u0001\u0000\u0000\u0000UP\u0001\u0000"+
		"\u0000\u0000UQ\u0001\u0000\u0000\u0000V\u0007\u0001\u0000\u0000\u0000"+
		"WX\u0006\u0004\uffff\uffff\u0000XY\u0003\u0010\b\u0000YZ\u0003\u001c\u000e"+
		"\u0000Z[\u0003\u0010\b\u0000[\\\u0006\u0004\uffff\uffff\u0000\\i\u0001"+
		"\u0000\u0000\u0000]^\n\u0002\u0000\u0000^_\u0005\u0001\u0000\u0000_`\u0003"+
		"\b\u0004\u0003`a\u0006\u0004\uffff\uffff\u0000ah\u0001\u0000\u0000\u0000"+
		"bc\n\u0001\u0000\u0000cd\u0005\u0002\u0000\u0000de\u0003\b\u0004\u0002"+
		"ef\u0006\u0004\uffff\uffff\u0000fh\u0001\u0000\u0000\u0000g]\u0001\u0000"+
		"\u0000\u0000gb\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000lm\u0005\n\u0000\u0000mn\u0005&\u0000\u0000"+
		"no\u0003\u0002\u0001\u0000op\u0005\'\u0000\u0000pq\u0003\u0002\u0001\u0000"+
		"qr\u0006\u0005\uffff\uffff\u0000r\u000b\u0001\u0000\u0000\u0000sw\u0005"+
		"*\u0000\u0000tv\u0003\u0002\u0001\u0000ut\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005+\u0000\u0000"+
		"{|\u0006\u0006\uffff\uffff\u0000|\r\u0001\u0000\u0000\u0000}~\u0005\t"+
		"\u0000\u0000~\u007f\u0005&\u0000\u0000\u007f\u0080\u0003\u0002\u0001\u0000"+
		"\u0080\u0081\u0005\'\u0000\u0000\u0081\u0082\u0003\u0002\u0001\u0000\u0082"+
		"\u0083\u0006\u0007\uffff\uffff\u0000\u0083\u0090\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\t\u0000\u0000\u0085\u0086\u0005&\u0000\u0000\u0086"+
		"\u0087\u0003\u0002\u0001\u0000\u0087\u0088\u0005\'\u0000\u0000\u0088\u008b"+
		"\u0003\u0002\u0001\u0000\u0089\u008a\u0005\u000b\u0000\u0000\u008a\u008c"+
		"\u0003\u0002\u0001\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0006\u0007\uffff\uffff\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f"+
		"}\u0001\u0000\u0000\u0000\u008f\u0084\u0001\u0000\u0000\u0000\u0090\u000f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0006\b\uffff\uffff\u0000\u0092\u0093"+
		"\u0003\u0018\f\u0000\u0093\u0094\u0006\b\uffff\uffff\u0000\u0094\u009a"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\n\u0001\u0000\u0000\u0096\u0097\u0005"+
		"%\u0000\u0000\u0097\u0099\u0003\u0018\f\u0000\u0098\u0095\u0001\u0000"+
		"\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0011\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0000"+
		"\u0000\u0000\u009e\u0013\u0001\u0000\u0000\u0000\u009f\u00a2\u0005,\u0000"+
		"\u0000\u00a0\u00a1\u0005\u0019\u0000\u0000\u00a1\u00a3\u0003\u0010\b\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0006\n\uffff\uffff\u0000"+
		"\u00a5\u0015\u0001\u0000\u0000\u0000\u00a6\u00a7\u0007\u0001\u0000\u0000"+
		"\u00a7\u0017\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003\u001e\u000f\u0000"+
		"\u00a9\u00aa\u0006\f\uffff\uffff\u0000\u00aa\u00b1\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0005,\u0000\u0000\u00ac\u00ad\u0003\u001a\r\u0000\u00ad"+
		"\u00ae\u0003\u001e\u000f\u0000\u00ae\u00af\u0006\f\uffff\uffff\u0000\u00af"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00a8\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b1\u0019\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0007\u0002\u0000\u0000\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0007\u0003\u0000\u0000\u00b5\u001d\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0006\u000f\uffff\uffff\u0000\u00b7\u00b8\u0003 \u0010\u0000\u00b8"+
		"\u00b9\u0006\u000f\uffff\uffff\u0000\u00b9\u00c6\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\n\u0002\u0000\u0000\u00bb\u00bc\u0005\"\u0000\u0000\u00bc"+
		"\u00bd\u0003 \u0010\u0000\u00bd\u00be\u0006\u000f\uffff\uffff\u0000\u00be"+
		"\u00c5\u0001\u0000\u0000\u0000\u00bf\u00c0\n\u0001\u0000\u0000\u00c0\u00c1"+
		"\u0005#\u0000\u0000\u00c1\u00c2\u0003 \u0010\u0000\u00c2\u00c3\u0006\u000f"+
		"\uffff\uffff\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00ba\u0001"+
		"\u0000\u0000\u0000\u00c4\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u001f\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0006\u0010\uffff\uffff\u0000\u00ca\u00cb"+
		"\u0003\"\u0011\u0000\u00cb\u00cc\u0006\u0010\uffff\uffff\u0000\u00cc\u00de"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\n\u0003\u0000\u0000\u00ce\u00cf\u0005"+
		" \u0000\u0000\u00cf\u00d0\u0003\"\u0011\u0000\u00d0\u00d1\u0006\u0010"+
		"\uffff\uffff\u0000\u00d1\u00dd\u0001\u0000\u0000\u0000\u00d2\u00d3\n\u0002"+
		"\u0000\u0000\u00d3\u00d4\u0005!\u0000\u0000\u00d4\u00d5\u0003\"\u0011"+
		"\u0000\u00d5\u00d6\u0006\u0010\uffff\uffff\u0000\u00d6\u00dd\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\n\u0001\u0000\u0000\u00d8\u00d9\u0005\b\u0000"+
		"\u0000\u00d9\u00da\u0003\"\u0011\u0000\u00da\u00db\u0006\u0010\uffff\uffff"+
		"\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00dc\u00d2\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df!\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005,\u0000\u0000\u00e2"+
		"\u00f2\u0006\u0011\uffff\uffff\u0000\u00e3\u00e4\u0003\u0012\t\u0000\u00e4"+
		"\u00e5\u0006\u0011\uffff\uffff\u0000\u00e5\u00f2\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005,\u0000\u0000\u00e7\u00e9\u0005&\u0000\u0000\u00e8\u00ea"+
		"\u0003$\u0012\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f2\u0005"+
		"\'\u0000\u0000\u00ec\u00ed\u0005&\u0000\u0000\u00ed\u00ee\u0003\u0010"+
		"\b\u0000\u00ee\u00ef\u0005\'\u0000\u0000\u00ef\u00f0\u0006\u0011\uffff"+
		"\uffff\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00e1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00e3\u0001\u0000\u0000\u0000\u00f1\u00e6\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ec\u0001\u0000\u0000\u0000\u00f2#\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0006\u0012\uffff\uffff\u0000\u00f4\u00f5\u0003\u0018"+
		"\f\u0000\u00f5\u00fb\u0001\u0000\u0000\u0000\u00f6\u00f7\n\u0001\u0000"+
		"\u0000\u00f7\u00f8\u0005%\u0000\u0000\u00f8\u00fa\u0003\u0018\f\u0000"+
		"\u00f9\u00f6\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc%\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u0017"+
		").4=CIKUgiw\u008b\u008f\u009a\u00a2\u00b0\u00c4\u00c6\u00dc\u00de\u00e9"+
		"\u00f1\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}