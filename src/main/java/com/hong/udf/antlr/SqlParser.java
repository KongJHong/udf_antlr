// Generated from F:/Self Project/UDF_Antlr/src/main/resources\SqlParser.g4 by ANTLR 4.9.2
package com.hong.udf.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_LINE_COMMENT=1, MULTILINE_COMMENT=2, SPACES=3, ALL=4, AND=5, AS=6, 
		BETWEEN=7, BIT=8, BY=9, CASE=10, CAST=11, CHAR=12, CHARACTER=13, CROSS=14, 
		DEC=15, DECIMAL=16, DISTINCT=17, DOUBLE=18, ELSE=19, END=20, EXISTS=21, 
		EXPLAIN=22, FROM=23, FULL=24, FLOAT=25, HAVING=26, JOIN=27, IN=28, INNER=29, 
		INT=30, INTEGER=31, IS=32, LIMIT=33, NATURAL=34, NULL=35, NOT=36, NUMERIC=37, 
		GROUP=38, ON=39, OR=40, ORDER=41, OUTER=42, PRECISION=43, REAL=44, SELECT=45, 
		SMALLINT=46, THEN=47, USING=48, VARCHAR=49, VARYING=50, WHEN=51, WHERE=52, 
		WITH=53, ZONE=54, STAR=55, DIVIDE=56, MODULE=57, PLUS=58, MINUSMINUS=59, 
		MINUS=60, DIV=61, GT=62, LT=63, GE=64, LE=65, EQUAL=66, NOT_EQUAL=67, 
		ASSIGN=68, BIT_OR=69, ASCII=70, CHAR_LENGTH=71, CHARACTER_LENGTH=72, CONCAT=73, 
		CONCAT_WS=74, FIELD=75, FIND_IN_SET=76, FORMAT=77, INSERT=78, LOCATE=79, 
		LCASE=80, LEFT=81, LOWER=82, LPAD=83, LTRIM=84, MID=85, POSITION=86, REPEAT=87, 
		REPLACE=88, REVERSE=89, RIGHT=90, RPAD=91, RTRIM=92, SPACE=93, STRCMP=94, 
		SUBSTR=95, SUBSTRING=96, SUBSTRING_INDEX=97, TRIM=98, UCASE=99, UPPER=100, 
		ABS=101, ACOS=102, ASIN=103, ATAN=104, ATAN2=105, AVG=106, CEIL=107, CEILING=108, 
		COS=109, COT=110, COUNT=111, DEGREES=112, EXP=113, FLOOR=114, GREATEST=115, 
		LEAST=116, LN=117, LOG=118, LOG10=119, LOG2=120, MAX=121, MIN=122, MOD=123, 
		PI=124, POW=125, POWER=126, RADIANS=127, RAND=128, ROUND=129, SIGN=130, 
		SIN=131, SQRT=132, SUM=133, TAN=134, TRUNCATE=135, ADDDATE=136, ADDTIME=137, 
		CURDATE=138, CURRENT_DATE=139, CURRENT_TIME=140, CURRENT_TIMESTAMP=141, 
		CURTIME=142, DATE=143, DATEDIFF=144, DATE_ADD=145, DATE_FORMAT=146, DATE_SUB=147, 
		DAY=148, DAYNAME=149, DAYOFMONTH=150, DAYOFWEEK=151, DAYOFYEAR=152, EXTRACT=153, 
		FROM_DAYS=154, HOUR=155, LAST_DAY=156, LOCALTIME=157, LOCALTIMESTAMP=158, 
		MAKEDATE=159, MAKETIME=160, MICROSECOND=161, MINUTE=162, MONTHNAME=163, 
		MONTH=164, NOW=165, PERIOD_ADD=166, PERIOD_DIFF=167, QUARTER=168, SECOND=169, 
		SEC_TO_TIME=170, STR_TO_DATE=171, SUBDATE=172, SUBTIME=173, SYSDATE=174, 
		TIME=175, TIME_FORMAT=176, TIME_TO_SEC=177, TIMEDIFF=178, TIMESTAMP=179, 
		TIMESTAMPDIFF=180, TO_DAYS=181, WEEK=182, WEEKDAY=183, WEEKOFYEAR=184, 
		YEAR=185, YEARWEEK=186, IDENTIFIER=187, STRING_LITERAL=188, NUMERIC_LITERAL=189, 
		DOT=190, LR_BRACKET=191, RR_BRACKET=192, COMMA=193, SEMI=194, AT_SIGN=195, 
		ZERO_DECIMAL=196, ONE_DECIMAL=197, TWO_DECIMAL=198, TEN_DECIMAL=199, SINGLE_QUOTE_SYMB=200, 
		DOUBLE_QUOTE_SYMB=201, REVERSE_QUOTE_SYMB=202, COLON_SYMB=203;
	public static final int
		RULE_parse = 0, RULE_select_stmt_list = 1, RULE_error = 2, RULE_select_stmt = 3, 
		RULE_set_qualifier = 4, RULE_element_clause = 5, RULE_element = 6, RULE_expr = 7, 
		RULE_from_clause = 8, RULE_table_reference = 9, RULE_table_alias_specification = 10, 
		RULE_joined_clause = 11, RULE_join_operator = 12, RULE_join_constraint = 13, 
		RULE_where_clause = 14, RULE_where_link_semi = 15, RULE_group_by_clause = 16, 
		RULE_order_by_clause = 17, RULE_limit_clause = 18, RULE_unary_operator = 19, 
		RULE_column_alias = 20, RULE_domain_name = 21, RULE_table_name = 22, RULE_column_name = 23, 
		RULE_database_name = 24, RULE_table_alias = 25, RULE_any_name = 26, RULE_literal_value = 27, 
		RULE_type_name = 28, RULE_type_classify = 29, RULE_character_string_type = 30, 
		RULE_bit_string_type = 31, RULE_numeric_type = 32, RULE_exact_numeric_type = 33, 
		RULE_approximate_numeric_type = 34, RULE_datetime_type = 35, RULE_length = 36, 
		RULE_precision = 37, RULE_scala = 38, RULE_time_precision = 39, RULE_timestamp_precision = 40, 
		RULE_time_fractional_seconds_precision = 41, RULE_origin_function_name = 42, 
		RULE_udf_function_name = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "select_stmt_list", "error", "select_stmt", "set_qualifier", 
			"element_clause", "element", "expr", "from_clause", "table_reference", 
			"table_alias_specification", "joined_clause", "join_operator", "join_constraint", 
			"where_clause", "where_link_semi", "group_by_clause", "order_by_clause", 
			"limit_clause", "unary_operator", "column_alias", "domain_name", "table_name", 
			"column_name", "database_name", "table_alias", "any_name", "literal_value", 
			"type_name", "type_classify", "character_string_type", "bit_string_type", 
			"numeric_type", "exact_numeric_type", "approximate_numeric_type", "datetime_type", 
			"length", "precision", "scala", "time_precision", "timestamp_precision", 
			"time_fractional_seconds_precision", "origin_function_name", "udf_function_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'*'", "'/'", "'%'", "'+'", 
			"'--'", "'-'", "'DIV'", "'>'", "'<'", "'>='", "'<='", "'=='", null, "'='", 
			"'||'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'.'", "'('", "')'", "','", "';'", "'@'", "'0'", "'1'", "'2'", 
			"'10'", "'''", "'\"'", "'`'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "ALL", "AND", 
			"AS", "BETWEEN", "BIT", "BY", "CASE", "CAST", "CHAR", "CHARACTER", "CROSS", 
			"DEC", "DECIMAL", "DISTINCT", "DOUBLE", "ELSE", "END", "EXISTS", "EXPLAIN", 
			"FROM", "FULL", "FLOAT", "HAVING", "JOIN", "IN", "INNER", "INT", "INTEGER", 
			"IS", "LIMIT", "NATURAL", "NULL", "NOT", "NUMERIC", "GROUP", "ON", "OR", 
			"ORDER", "OUTER", "PRECISION", "REAL", "SELECT", "SMALLINT", "THEN", 
			"USING", "VARCHAR", "VARYING", "WHEN", "WHERE", "WITH", "ZONE", "STAR", 
			"DIVIDE", "MODULE", "PLUS", "MINUSMINUS", "MINUS", "DIV", "GT", "LT", 
			"GE", "LE", "EQUAL", "NOT_EQUAL", "ASSIGN", "BIT_OR", "ASCII", "CHAR_LENGTH", 
			"CHARACTER_LENGTH", "CONCAT", "CONCAT_WS", "FIELD", "FIND_IN_SET", "FORMAT", 
			"INSERT", "LOCATE", "LCASE", "LEFT", "LOWER", "LPAD", "LTRIM", "MID", 
			"POSITION", "REPEAT", "REPLACE", "REVERSE", "RIGHT", "RPAD", "RTRIM", 
			"SPACE", "STRCMP", "SUBSTR", "SUBSTRING", "SUBSTRING_INDEX", "TRIM", 
			"UCASE", "UPPER", "ABS", "ACOS", "ASIN", "ATAN", "ATAN2", "AVG", "CEIL", 
			"CEILING", "COS", "COT", "COUNT", "DEGREES", "EXP", "FLOOR", "GREATEST", 
			"LEAST", "LN", "LOG", "LOG10", "LOG2", "MAX", "MIN", "MOD", "PI", "POW", 
			"POWER", "RADIANS", "RAND", "ROUND", "SIGN", "SIN", "SQRT", "SUM", "TAN", 
			"TRUNCATE", "ADDDATE", "ADDTIME", "CURDATE", "CURRENT_DATE", "CURRENT_TIME", 
			"CURRENT_TIMESTAMP", "CURTIME", "DATE", "DATEDIFF", "DATE_ADD", "DATE_FORMAT", 
			"DATE_SUB", "DAY", "DAYNAME", "DAYOFMONTH", "DAYOFWEEK", "DAYOFYEAR", 
			"EXTRACT", "FROM_DAYS", "HOUR", "LAST_DAY", "LOCALTIME", "LOCALTIMESTAMP", 
			"MAKEDATE", "MAKETIME", "MICROSECOND", "MINUTE", "MONTHNAME", "MONTH", 
			"NOW", "PERIOD_ADD", "PERIOD_DIFF", "QUARTER", "SECOND", "SEC_TO_TIME", 
			"STR_TO_DATE", "SUBDATE", "SUBTIME", "SYSDATE", "TIME", "TIME_FORMAT", 
			"TIME_TO_SEC", "TIMEDIFF", "TIMESTAMP", "TIMESTAMPDIFF", "TO_DAYS", "WEEK", 
			"WEEKDAY", "WEEKOFYEAR", "YEAR", "YEARWEEK", "IDENTIFIER", "STRING_LITERAL", 
			"NUMERIC_LITERAL", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", 
			"AT_SIGN", "ZERO_DECIMAL", "ONE_DECIMAL", "TWO_DECIMAL", "TEN_DECIMAL", 
			"SINGLE_QUOTE_SYMB", "DOUBLE_QUOTE_SYMB", "REVERSE_QUOTE_SYMB", "COLON_SYMB"
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
	public String getGrammarFileName() { return "SqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public Select_stmt_listContext select_stmt_list() {
			return getRuleContext(Select_stmt_listContext.class,0);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				select_stmt_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				error();
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

	public static class Select_stmt_listContext extends ParserRuleContext {
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SqlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SqlParser.SEMI, i);
		}
		public Select_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelect_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelect_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelect_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmt_listContext select_stmt_list() throws RecognitionException {
		Select_stmt_listContext _localctx = new Select_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(92);
				match(SEMI);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			select_stmt();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(99);
						match(SEMI);
						}
						}
						setState(102); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEMI );
					setState(104);
					select_stmt();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(110);
				match(SEMI);
				}
				}
				setState(115);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token input;
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlParser.EXPLAIN, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((ErrorContext)_localctx).input = _input.LT(1);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==EXPLAIN || _la==SELECT) ) {
				((ErrorContext)_localctx).input = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			  throw new RuntimeException(((ErrorContext)_localctx).input.getText());

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

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public Element_clauseContext element_clause() {
			return getRuleContext(Element_clauseContext.class,0);
		}
		public TerminalNode EXPLAIN() { return getToken(SqlParser.EXPLAIN, 0); }
		public Set_qualifierContext set_qualifier() {
			return getRuleContext(Set_qualifierContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPLAIN) {
				{
				setState(119);
				match(EXPLAIN);
				}
			}

			setState(122);
			match(SELECT);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(123);
				set_qualifier();
				}
			}

			setState(126);
			element_clause();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(127);
				from_clause();
				}
			}

			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(130);
				where_clause();
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(133);
				group_by_clause();
				}
			}

			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(136);
				order_by_clause();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(139);
				limit_clause();
				}
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

	public static class Set_qualifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlParser.ALL, 0); }
		public Set_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterSet_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitSet_qualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitSet_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_qualifierContext set_qualifier() throws RecognitionException {
		Set_qualifierContext _localctx = new Set_qualifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_set_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class Element_clauseContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Element_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterElement_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitElement_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitElement_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_clauseContext element_clause() throws RecognitionException {
		Element_clauseContext _localctx = new Element_clauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_element_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			element();
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(COMMA);
					setState(146);
					element();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_element);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				table_name();
				setState(154);
				match(DOT);
				setState(155);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				expr(0);
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(158);
						match(AS);
						}
					}

					setState(161);
					column_alias();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CastExprContext extends ExprContext {
		public TerminalNode CAST() { return getToken(SqlParser.CAST, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public CastExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OriginFunctionExprContext extends ExprContext {
		public Origin_function_nameContext origin_function_name() {
			return getRuleContext(Origin_function_nameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlParser.DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public OriginFunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterOriginFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitOriginFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitOriginFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralValueExprContext extends ExprContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public LiteralValueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterLiteralValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitLiteralValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitLiteralValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UdfFunctionExprContext extends ExprContext {
		public Udf_function_nameContext udf_function_name() {
			return getRuleContext(Udf_function_nameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlParser.DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public UdfFunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterUdfFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitUdfFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitUdfFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExprContext {
		public ExprContext left;
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode DIVIDE() { return getToken(SqlParser.DIVIDE, 0); }
		public TerminalNode MODULE() { return getToken(SqlParser.MODULE, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public BinaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerExprContext extends ExprContext {
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public InnerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterInnerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitInnerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitInnerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOperationContext extends ExprContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryOperationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsExprContext extends ExprContext {
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public TerminalNode EXISTS() { return getToken(SqlParser.EXISTS, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public ExistsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterExistsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitExistsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitExistsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InMethodExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public InMethodExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterInMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitInMethodExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitInMethodExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(SqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public BetweenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterBetweenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitBetweenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitBetweenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicateExprContext extends ExprContext {
		public TerminalNode CASE() { return getToken(SqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlParser.END, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(SqlParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(SqlParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(SqlParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(SqlParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(SqlParser.ELSE, 0); }
		public PredicateExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterPredicateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitPredicateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitPredicateExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNotExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IS() { return getToken(SqlParser.IS, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public IsNotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterIsNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitIsNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitIsNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnNameExprContext extends ExprContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public ColumnNameExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterColumnNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitColumnNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitColumnNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryEqualOrAssignExprContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GE() { return getToken(SqlParser.GE, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LE() { return getToken(SqlParser.LE, 0); }
		public TerminalNode EQUAL() { return getToken(SqlParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SqlParser.NOT_EQUAL, 0); }
		public BinaryEqualOrAssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterBinaryEqualOrAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitBinaryEqualOrAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitBinaryEqualOrAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(167);
				literal_value();
				}
				break;
			case 2:
				{
				_localctx = new ColumnNameExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(168);
						database_name();
						setState(169);
						match(DOT);
						}
						break;
					}
					setState(173);
					table_name();
					setState(174);
					match(DOT);
					}
					break;
				}
				setState(178);
				column_name();
				}
				break;
			case 3:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				unary_operator();
				setState(180);
				expr(12);
				}
				break;
			case 4:
				{
				_localctx = new OriginFunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				origin_function_name();
				setState(183);
				match(LR_BRACKET);
				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case CAST:
				case DISTINCT:
				case EXISTS:
				case NULL:
				case NOT:
				case PLUS:
				case MINUS:
				case ASCII:
				case CHAR_LENGTH:
				case CHARACTER_LENGTH:
				case CONCAT:
				case CONCAT_WS:
				case FIELD:
				case FIND_IN_SET:
				case FORMAT:
				case INSERT:
				case LOCATE:
				case LCASE:
				case LEFT:
				case LOWER:
				case LPAD:
				case LTRIM:
				case MID:
				case POSITION:
				case REPEAT:
				case REPLACE:
				case REVERSE:
				case RIGHT:
				case RPAD:
				case RTRIM:
				case SPACE:
				case STRCMP:
				case SUBSTR:
				case SUBSTRING:
				case SUBSTRING_INDEX:
				case TRIM:
				case UCASE:
				case UPPER:
				case ABS:
				case ACOS:
				case ASIN:
				case ATAN:
				case ATAN2:
				case AVG:
				case CEIL:
				case CEILING:
				case COS:
				case COT:
				case COUNT:
				case DEGREES:
				case EXP:
				case FLOOR:
				case GREATEST:
				case LEAST:
				case LN:
				case LOG:
				case LOG10:
				case LOG2:
				case MAX:
				case MIN:
				case MOD:
				case PI:
				case POW:
				case POWER:
				case RADIANS:
				case RAND:
				case ROUND:
				case SIGN:
				case SIN:
				case SQRT:
				case SUM:
				case TAN:
				case TRUNCATE:
				case ADDDATE:
				case ADDTIME:
				case CURDATE:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURTIME:
				case DATE:
				case DATEDIFF:
				case DATE_ADD:
				case DATE_FORMAT:
				case DATE_SUB:
				case DAY:
				case DAYNAME:
				case DAYOFMONTH:
				case DAYOFWEEK:
				case DAYOFYEAR:
				case EXTRACT:
				case FROM_DAYS:
				case HOUR:
				case LAST_DAY:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case MAKEDATE:
				case MAKETIME:
				case MICROSECOND:
				case MINUTE:
				case MONTHNAME:
				case MONTH:
				case NOW:
				case PERIOD_ADD:
				case PERIOD_DIFF:
				case QUARTER:
				case SECOND:
				case SEC_TO_TIME:
				case STR_TO_DATE:
				case SUBDATE:
				case SUBTIME:
				case SYSDATE:
				case TIME:
				case TIME_FORMAT:
				case TIME_TO_SEC:
				case TIMEDIFF:
				case TIMESTAMP:
				case TIMESTAMPDIFF:
				case TO_DAYS:
				case WEEK:
				case WEEKDAY:
				case WEEKOFYEAR:
				case YEAR:
				case YEARWEEK:
				case IDENTIFIER:
				case STRING_LITERAL:
				case NUMERIC_LITERAL:
				case LR_BRACKET:
					{
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTINCT) {
						{
						setState(184);
						match(DISTINCT);
						}
					}

					setState(187);
					expr(0);
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(188);
						match(COMMA);
						setState(189);
						expr(0);
						}
						}
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(195);
					match(STAR);
					}
					break;
				case RR_BRACKET:
					break;
				default:
					break;
				}
				setState(198);
				match(RR_BRACKET);
				}
				break;
			case 5:
				{
				_localctx = new UdfFunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				udf_function_name();
				setState(201);
				match(LR_BRACKET);
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case CAST:
				case DISTINCT:
				case EXISTS:
				case NULL:
				case NOT:
				case PLUS:
				case MINUS:
				case ASCII:
				case CHAR_LENGTH:
				case CHARACTER_LENGTH:
				case CONCAT:
				case CONCAT_WS:
				case FIELD:
				case FIND_IN_SET:
				case FORMAT:
				case INSERT:
				case LOCATE:
				case LCASE:
				case LEFT:
				case LOWER:
				case LPAD:
				case LTRIM:
				case MID:
				case POSITION:
				case REPEAT:
				case REPLACE:
				case REVERSE:
				case RIGHT:
				case RPAD:
				case RTRIM:
				case SPACE:
				case STRCMP:
				case SUBSTR:
				case SUBSTRING:
				case SUBSTRING_INDEX:
				case TRIM:
				case UCASE:
				case UPPER:
				case ABS:
				case ACOS:
				case ASIN:
				case ATAN:
				case ATAN2:
				case AVG:
				case CEIL:
				case CEILING:
				case COS:
				case COT:
				case COUNT:
				case DEGREES:
				case EXP:
				case FLOOR:
				case GREATEST:
				case LEAST:
				case LN:
				case LOG:
				case LOG10:
				case LOG2:
				case MAX:
				case MIN:
				case MOD:
				case PI:
				case POW:
				case POWER:
				case RADIANS:
				case RAND:
				case ROUND:
				case SIGN:
				case SIN:
				case SQRT:
				case SUM:
				case TAN:
				case TRUNCATE:
				case ADDDATE:
				case ADDTIME:
				case CURDATE:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case CURRENT_TIMESTAMP:
				case CURTIME:
				case DATE:
				case DATEDIFF:
				case DATE_ADD:
				case DATE_FORMAT:
				case DATE_SUB:
				case DAY:
				case DAYNAME:
				case DAYOFMONTH:
				case DAYOFWEEK:
				case DAYOFYEAR:
				case EXTRACT:
				case FROM_DAYS:
				case HOUR:
				case LAST_DAY:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case MAKEDATE:
				case MAKETIME:
				case MICROSECOND:
				case MINUTE:
				case MONTHNAME:
				case MONTH:
				case NOW:
				case PERIOD_ADD:
				case PERIOD_DIFF:
				case QUARTER:
				case SECOND:
				case SEC_TO_TIME:
				case STR_TO_DATE:
				case SUBDATE:
				case SUBTIME:
				case SYSDATE:
				case TIME:
				case TIME_FORMAT:
				case TIME_TO_SEC:
				case TIMEDIFF:
				case TIMESTAMP:
				case TIMESTAMPDIFF:
				case TO_DAYS:
				case WEEK:
				case WEEKDAY:
				case WEEKOFYEAR:
				case YEAR:
				case YEARWEEK:
				case IDENTIFIER:
				case STRING_LITERAL:
				case NUMERIC_LITERAL:
				case LR_BRACKET:
					{
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTINCT) {
						{
						setState(202);
						match(DISTINCT);
						}
					}

					setState(205);
					expr(0);
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(206);
						match(COMMA);
						setState(207);
						expr(0);
						}
						}
						setState(212);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(213);
					match(STAR);
					}
					break;
				case RR_BRACKET:
					break;
				default:
					break;
				}
				setState(216);
				match(RR_BRACKET);
				}
				break;
			case 6:
				{
				_localctx = new InnerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(LR_BRACKET);
				setState(219);
				expr(0);
				setState(220);
				match(RR_BRACKET);
				}
				break;
			case 7:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(CAST);
				setState(223);
				match(LR_BRACKET);
				setState(224);
				expr(0);
				setState(225);
				match(AS);
				setState(226);
				type_name();
				setState(227);
				match(RR_BRACKET);
				}
				break;
			case 8:
				{
				_localctx = new ExistsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS || _la==NOT) {
					{
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(229);
						match(NOT);
						}
					}

					setState(232);
					match(EXISTS);
					}
				}

				setState(235);
				match(LR_BRACKET);
				setState(236);
				select_stmt();
				setState(237);
				match(RR_BRACKET);
				}
				break;
			case 9:
				{
				_localctx = new PredicateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(CASE);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << CAST) | (1L << EXISTS) | (1L << NULL) | (1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ASCII - 70)) | (1L << (CHAR_LENGTH - 70)) | (1L << (CHARACTER_LENGTH - 70)) | (1L << (CONCAT - 70)) | (1L << (CONCAT_WS - 70)) | (1L << (FIELD - 70)) | (1L << (FIND_IN_SET - 70)) | (1L << (FORMAT - 70)) | (1L << (INSERT - 70)) | (1L << (LOCATE - 70)) | (1L << (LCASE - 70)) | (1L << (LEFT - 70)) | (1L << (LOWER - 70)) | (1L << (LPAD - 70)) | (1L << (LTRIM - 70)) | (1L << (MID - 70)) | (1L << (POSITION - 70)) | (1L << (REPEAT - 70)) | (1L << (REPLACE - 70)) | (1L << (REVERSE - 70)) | (1L << (RIGHT - 70)) | (1L << (RPAD - 70)) | (1L << (RTRIM - 70)) | (1L << (SPACE - 70)) | (1L << (STRCMP - 70)) | (1L << (SUBSTR - 70)) | (1L << (SUBSTRING - 70)) | (1L << (SUBSTRING_INDEX - 70)) | (1L << (TRIM - 70)) | (1L << (UCASE - 70)) | (1L << (UPPER - 70)) | (1L << (ABS - 70)) | (1L << (ACOS - 70)) | (1L << (ASIN - 70)) | (1L << (ATAN - 70)) | (1L << (ATAN2 - 70)) | (1L << (AVG - 70)) | (1L << (CEIL - 70)) | (1L << (CEILING - 70)) | (1L << (COS - 70)) | (1L << (COT - 70)) | (1L << (COUNT - 70)) | (1L << (DEGREES - 70)) | (1L << (EXP - 70)) | (1L << (FLOOR - 70)) | (1L << (GREATEST - 70)) | (1L << (LEAST - 70)) | (1L << (LN - 70)) | (1L << (LOG - 70)) | (1L << (LOG10 - 70)) | (1L << (LOG2 - 70)) | (1L << (MAX - 70)) | (1L << (MIN - 70)) | (1L << (MOD - 70)) | (1L << (PI - 70)) | (1L << (POW - 70)) | (1L << (POWER - 70)) | (1L << (RADIANS - 70)) | (1L << (RAND - 70)) | (1L << (ROUND - 70)) | (1L << (SIGN - 70)) | (1L << (SIN - 70)) | (1L << (SQRT - 70)) | (1L << (SUM - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (TAN - 134)) | (1L << (TRUNCATE - 134)) | (1L << (ADDDATE - 134)) | (1L << (ADDTIME - 134)) | (1L << (CURDATE - 134)) | (1L << (CURRENT_DATE - 134)) | (1L << (CURRENT_TIME - 134)) | (1L << (CURRENT_TIMESTAMP - 134)) | (1L << (CURTIME - 134)) | (1L << (DATE - 134)) | (1L << (DATEDIFF - 134)) | (1L << (DATE_ADD - 134)) | (1L << (DATE_FORMAT - 134)) | (1L << (DATE_SUB - 134)) | (1L << (DAY - 134)) | (1L << (DAYNAME - 134)) | (1L << (DAYOFMONTH - 134)) | (1L << (DAYOFWEEK - 134)) | (1L << (DAYOFYEAR - 134)) | (1L << (EXTRACT - 134)) | (1L << (FROM_DAYS - 134)) | (1L << (HOUR - 134)) | (1L << (LAST_DAY - 134)) | (1L << (LOCALTIME - 134)) | (1L << (LOCALTIMESTAMP - 134)) | (1L << (MAKEDATE - 134)) | (1L << (MAKETIME - 134)) | (1L << (MICROSECOND - 134)) | (1L << (MINUTE - 134)) | (1L << (MONTHNAME - 134)) | (1L << (MONTH - 134)) | (1L << (NOW - 134)) | (1L << (PERIOD_ADD - 134)) | (1L << (PERIOD_DIFF - 134)) | (1L << (QUARTER - 134)) | (1L << (SECOND - 134)) | (1L << (SEC_TO_TIME - 134)) | (1L << (STR_TO_DATE - 134)) | (1L << (SUBDATE - 134)) | (1L << (SUBTIME - 134)) | (1L << (SYSDATE - 134)) | (1L << (TIME - 134)) | (1L << (TIME_FORMAT - 134)) | (1L << (TIME_TO_SEC - 134)) | (1L << (TIMEDIFF - 134)) | (1L << (TIMESTAMP - 134)) | (1L << (TIMESTAMPDIFF - 134)) | (1L << (TO_DAYS - 134)) | (1L << (WEEK - 134)) | (1L << (WEEKDAY - 134)) | (1L << (WEEKOFYEAR - 134)) | (1L << (YEAR - 134)) | (1L << (YEARWEEK - 134)) | (1L << (IDENTIFIER - 134)) | (1L << (STRING_LITERAL - 134)) | (1L << (NUMERIC_LITERAL - 134)) | (1L << (LR_BRACKET - 134)))) != 0)) {
					{
					setState(240);
					expr(0);
					}
				}

				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(243);
					match(WHEN);
					setState(244);
					expr(0);
					setState(245);
					match(THEN);
					setState(246);
					expr(0);
					}
					}
					setState(250); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(252);
					match(ELSE);
					setState(253);
					expr(0);
					}
				}

				setState(256);
				match(END);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(305);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryEqualOrAssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(261);
						((BinaryEqualOrAssignExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (GT - 62)) | (1L << (LT - 62)) | (1L << (GE - 62)) | (1L << (LE - 62)) | (1L << (EQUAL - 62)) | (1L << (NOT_EQUAL - 62)) | (1L << (ASSIGN - 62)))) != 0)) ) {
							((BinaryEqualOrAssignExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(264);
						((BinaryExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << DIV))) != 0)) ) {
							((BinaryExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(265);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new IsNotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(267);
						match(IS);
						setState(268);
						match(NOT);
						setState(269);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new BetweenExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(272);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(271);
							match(NOT);
							}
						}

						setState(274);
						match(BETWEEN);
						setState(275);
						expr(0);
						setState(276);
						match(AND);
						setState(277);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new InMethodExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(281);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(280);
							match(NOT);
							}
						}

						setState(283);
						match(IN);
						setState(303);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(284);
							match(LR_BRACKET);
							setState(294);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case EXPLAIN:
							case SELECT:
								{
								setState(285);
								select_stmt();
								}
								break;
							case CASE:
							case CAST:
							case EXISTS:
							case NULL:
							case NOT:
							case PLUS:
							case MINUS:
							case ASCII:
							case CHAR_LENGTH:
							case CHARACTER_LENGTH:
							case CONCAT:
							case CONCAT_WS:
							case FIELD:
							case FIND_IN_SET:
							case FORMAT:
							case INSERT:
							case LOCATE:
							case LCASE:
							case LEFT:
							case LOWER:
							case LPAD:
							case LTRIM:
							case MID:
							case POSITION:
							case REPEAT:
							case REPLACE:
							case REVERSE:
							case RIGHT:
							case RPAD:
							case RTRIM:
							case SPACE:
							case STRCMP:
							case SUBSTR:
							case SUBSTRING:
							case SUBSTRING_INDEX:
							case TRIM:
							case UCASE:
							case UPPER:
							case ABS:
							case ACOS:
							case ASIN:
							case ATAN:
							case ATAN2:
							case AVG:
							case CEIL:
							case CEILING:
							case COS:
							case COT:
							case COUNT:
							case DEGREES:
							case EXP:
							case FLOOR:
							case GREATEST:
							case LEAST:
							case LN:
							case LOG:
							case LOG10:
							case LOG2:
							case MAX:
							case MIN:
							case MOD:
							case PI:
							case POW:
							case POWER:
							case RADIANS:
							case RAND:
							case ROUND:
							case SIGN:
							case SIN:
							case SQRT:
							case SUM:
							case TAN:
							case TRUNCATE:
							case ADDDATE:
							case ADDTIME:
							case CURDATE:
							case CURRENT_DATE:
							case CURRENT_TIME:
							case CURRENT_TIMESTAMP:
							case CURTIME:
							case DATE:
							case DATEDIFF:
							case DATE_ADD:
							case DATE_FORMAT:
							case DATE_SUB:
							case DAY:
							case DAYNAME:
							case DAYOFMONTH:
							case DAYOFWEEK:
							case DAYOFYEAR:
							case EXTRACT:
							case FROM_DAYS:
							case HOUR:
							case LAST_DAY:
							case LOCALTIME:
							case LOCALTIMESTAMP:
							case MAKEDATE:
							case MAKETIME:
							case MICROSECOND:
							case MINUTE:
							case MONTHNAME:
							case MONTH:
							case NOW:
							case PERIOD_ADD:
							case PERIOD_DIFF:
							case QUARTER:
							case SECOND:
							case SEC_TO_TIME:
							case STR_TO_DATE:
							case SUBDATE:
							case SUBTIME:
							case SYSDATE:
							case TIME:
							case TIME_FORMAT:
							case TIME_TO_SEC:
							case TIMEDIFF:
							case TIMESTAMP:
							case TIMESTAMPDIFF:
							case TO_DAYS:
							case WEEK:
							case WEEKDAY:
							case WEEKOFYEAR:
							case YEAR:
							case YEARWEEK:
							case IDENTIFIER:
							case STRING_LITERAL:
							case NUMERIC_LITERAL:
							case LR_BRACKET:
								{
								setState(286);
								expr(0);
								setState(291);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(287);
									match(COMMA);
									setState(288);
									expr(0);
									}
									}
									setState(293);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							case RR_BRACKET:
								break;
							default:
								break;
							}
							setState(296);
							match(RR_BRACKET);
							}
							break;
						case 2:
							{
							setState(300);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
							case 1:
								{
								setState(297);
								database_name();
								setState(298);
								match(DOT);
								}
								break;
							}
							setState(302);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(FROM);
			setState(311);
			table_reference();
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(COMMA);
					setState(313);
					table_reference();
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class Table_referenceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_alias_specificationContext table_alias_specification() {
			return getRuleContext(Table_alias_specificationContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public List<Joined_clauseContext> joined_clause() {
			return getRuleContexts(Joined_clauseContext.class);
		}
		public Joined_clauseContext joined_clause(int i) {
			return getRuleContext(Joined_clauseContext.class,i);
		}
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_table_reference);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				table_name();
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(320);
					table_alias_specification();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(LR_BRACKET);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXPLAIN || _la==SELECT || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (IDENTIFIER - 187)) | (1L << (STRING_LITERAL - 187)) | (1L << (LR_BRACKET - 187)))) != 0)) {
					{
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(326);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
						case STRING_LITERAL:
						case LR_BRACKET:
							{
							setState(324);
							table_reference();
							}
							break;
						case EXPLAIN:
						case SELECT:
							{
							setState(325);
							select_stmt();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(332);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(328);
							match(COMMA);
							setState(329);
							table_reference();
							}
							}
							setState(334);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(335);
						joined_clause();
						}
						break;
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341);
				match(RR_BRACKET);
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(342);
					table_alias_specification();
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

	public static class Table_alias_specificationContext extends ParserRuleContext {
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_alias_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTable_alias_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTable_alias_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTable_alias_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_alias_specificationContext table_alias_specification() throws RecognitionException {
		Table_alias_specificationContext _localctx = new Table_alias_specificationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_table_alias_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(347);
				match(AS);
				}
			}

			setState(350);
			table_alias();
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(351);
				match(LR_BRACKET);
				setState(352);
				column_name();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(353);
					match(COMMA);
					setState(354);
					column_name();
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(360);
				match(RR_BRACKET);
				}
				break;
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

	public static class Joined_clauseContext extends ParserRuleContext {
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Joined_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joined_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterJoined_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitJoined_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitJoined_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Joined_clauseContext joined_clause() throws RecognitionException {
		Joined_clauseContext _localctx = new Joined_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_joined_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			table_reference();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << JOIN) | (1L << NATURAL))) != 0) || _la==LEFT || _la==RIGHT || _la==COMMA) {
				{
				{
				setState(365);
				join_operator();
				setState(366);
				table_reference();
				setState(367);
				join_constraint();
				}
				}
				setState(373);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TerminalNode JOIN() { return getToken(SqlParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(SqlParser.NATURAL, 0); }
		public TerminalNode LEFT() { return getToken(SqlParser.LEFT, 0); }
		public TerminalNode FULL() { return getToken(SqlParser.FULL, 0); }
		public TerminalNode RIGHT() { return getToken(SqlParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(SqlParser.OUTER, 0); }
		public TerminalNode INNER() { return getToken(SqlParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlParser.CROSS, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_join_operator);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(COMMA);
				}
				break;
			case FULL:
			case JOIN:
			case NATURAL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(375);
					match(NATURAL);
					}
				}

				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FULL || _la==LEFT || _la==RIGHT) {
					{
					setState(378);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CROSS) | (1L << INNER) | (1L << OUTER))) != 0)) {
						{
						setState(379);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CROSS) | (1L << INNER) | (1L << OUTER))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
				}

				setState(384);
				match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlParser.USING, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(387);
				match(ON);
				setState(388);
				expr(0);
				}
				break;
			case USING:
				{
				setState(389);
				match(USING);
				setState(390);
				match(LR_BRACKET);
				setState(391);
				column_name();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(392);
					match(COMMA);
					setState(393);
					column_name();
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Where_link_semiContext> where_link_semi() {
			return getRuleContexts(Where_link_semiContext.class);
		}
		public Where_link_semiContext where_link_semi(int i) {
			return getRuleContext(Where_link_semiContext.class,i);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_where_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(WHERE);
			setState(404);
			expr(0);
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405);
					where_link_semi();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class Where_link_semiContext extends ParserRuleContext {
		public Token operation;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlParser.OR, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public Where_link_semiContext where_link_semi() {
			return getRuleContext(Where_link_semiContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public Where_link_semiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_link_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterWhere_link_semi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitWhere_link_semi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitWhere_link_semi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_link_semiContext where_link_semi() throws RecognitionException {
		Where_link_semiContext _localctx = new Where_link_semiContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_where_link_semi);
		int _la;
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				((Where_link_semiContext)_localctx).operation = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR || _la==COMMA) ) {
					((Where_link_semiContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(412);
				expr(0);
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(LR_BRACKET);
				setState(414);
				where_link_semi();
				setState(415);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode HAVING() { return getToken(SqlParser.HAVING, 0); }
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitGroup_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_group_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(GROUP);
			setState(420);
			match(BY);
			setState(421);
			expr(0);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(422);
					match(COMMA);
					setState(423);
					expr(0);
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(429);
				match(HAVING);
				setState(430);
				expr(0);
				}
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

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlParser.BY, 0); }
		public Domain_nameContext domain_name() {
			return getRuleContext(Domain_nameContext.class,0);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_order_by_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(ORDER);
			setState(434);
			match(BY);
			setState(435);
			domain_name();
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

	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SqlParser.LIMIT, 0); }
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SqlParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SqlParser.NUMERIC_LITERAL, i);
		}
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterLimit_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitLimit_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitLimit_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(LIMIT);
			setState(438);
			match(NUMERIC_LITERAL);
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(439);
				match(COMMA);
				setState(440);
				match(NUMERIC_LITERAL);
				}
				break;
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class Domain_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Domain_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterDomain_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitDomain_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitDomain_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Domain_nameContext domain_name() throws RecognitionException {
		Domain_nameContext _localctx = new Domain_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_domain_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(447);
					database_name();
					setState(448);
					match(DOT);
					}
					break;
				}
				setState(452);
				table_name();
				setState(453);
				match(DOT);
				}
				break;
			}
			setState(457);
			column_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(459);
				database_name();
				setState(460);
				match(DOT);
				}
				break;
			}
			setState(464);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_any_name);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(STRING_LITERAL);
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(LR_BRACKET);
				setState(475);
				any_name();
				setState(476);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlParser.CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if ( !(_la==NULL || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (CURRENT_DATE - 139)) | (1L << (CURRENT_TIME - 139)) | (1L << (CURRENT_TIMESTAMP - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUMERIC_LITERAL - 139)))) != 0)) ) {
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

	public static class Type_nameContext extends ParserRuleContext {
		public Domain_nameContext domain_name() {
			return getRuleContext(Domain_nameContext.class,0);
		}
		public Type_classifyContext type_classify() {
			return getRuleContext(Type_classifyContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type_name);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case STRING_LITERAL:
			case LR_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				domain_name();
				}
				break;
			case BIT:
			case CHAR:
			case CHARACTER:
			case DEC:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case INTEGER:
			case NUMERIC:
			case REAL:
			case SMALLINT:
			case VARCHAR:
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				type_classify();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Type_classifyContext extends ParserRuleContext {
		public Character_string_typeContext character_string_type() {
			return getRuleContext(Character_string_typeContext.class,0);
		}
		public Bit_string_typeContext bit_string_type() {
			return getRuleContext(Bit_string_typeContext.class,0);
		}
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public Datetime_typeContext datetime_type() {
			return getRuleContext(Datetime_typeContext.class,0);
		}
		public Type_classifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_classify; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterType_classify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitType_classify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitType_classify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_classifyContext type_classify() throws RecognitionException {
		Type_classifyContext _localctx = new Type_classifyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type_classify);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case CHARACTER:
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				character_string_type();
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				bit_string_type();
				}
				break;
			case DEC:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case INTEGER:
			case NUMERIC:
			case REAL:
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				numeric_type();
				}
				break;
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				datetime_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Character_string_typeContext extends ParserRuleContext {
		public TerminalNode VARCHAR() { return getToken(SqlParser.VARCHAR, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public TerminalNode CHAR() { return getToken(SqlParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(SqlParser.CHARACTER, 0); }
		public TerminalNode VARYING() { return getToken(SqlParser.VARYING, 0); }
		public Character_string_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterCharacter_string_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitCharacter_string_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitCharacter_string_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_string_typeContext character_string_type() throws RecognitionException {
		Character_string_typeContext _localctx = new Character_string_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_character_string_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case CHARACTER:
				{
				setState(492);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(493);
					match(VARYING);
					}
				}

				}
				break;
			case VARCHAR:
				{
				setState(496);
				match(VARCHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(499);
			match(LR_BRACKET);
			setState(500);
			length();
			setState(501);
			match(RR_BRACKET);
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

	public static class Bit_string_typeContext extends ParserRuleContext {
		public TerminalNode BIT() { return getToken(SqlParser.BIT, 0); }
		public TerminalNode VARYING() { return getToken(SqlParser.VARYING, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public Bit_string_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterBit_string_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitBit_string_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitBit_string_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_string_typeContext bit_string_type() throws RecognitionException {
		Bit_string_typeContext _localctx = new Bit_string_typeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bit_string_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(BIT);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARYING) {
				{
				setState(504);
				match(VARYING);
				}
			}

			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(507);
				match(LR_BRACKET);
				setState(508);
				length();
				setState(509);
				match(RR_BRACKET);
				}
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

	public static class Numeric_typeContext extends ParserRuleContext {
		public Exact_numeric_typeContext exact_numeric_type() {
			return getRuleContext(Exact_numeric_typeContext.class,0);
		}
		public Approximate_numeric_typeContext approximate_numeric_type() {
			return getRuleContext(Approximate_numeric_typeContext.class,0);
		}
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterNumeric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitNumeric_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitNumeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numeric_type);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC:
			case DECIMAL:
			case INT:
			case INTEGER:
			case NUMERIC:
			case SMALLINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				exact_numeric_type();
				}
				break;
			case DOUBLE:
			case FLOAT:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				approximate_numeric_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Exact_numeric_typeContext extends ParserRuleContext {
		public TerminalNode NUMERIC() { return getToken(SqlParser.NUMERIC, 0); }
		public TerminalNode DECIMAL() { return getToken(SqlParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(SqlParser.DEC, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public ScalaContext scala() {
			return getRuleContext(ScalaContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(SqlParser.INTEGER, 0); }
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public TerminalNode SMALLINT() { return getToken(SqlParser.SMALLINT, 0); }
		public Exact_numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exact_numeric_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterExact_numeric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitExact_numeric_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitExact_numeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exact_numeric_typeContext exact_numeric_type() throws RecognitionException {
		Exact_numeric_typeContext _localctx = new Exact_numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exact_numeric_type);
		int _la;
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC:
			case DECIMAL:
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(517);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEC) | (1L << DECIMAL) | (1L << NUMERIC))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(518);
					match(LR_BRACKET);
					setState(519);
					precision();
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(520);
						match(COMMA);
						setState(521);
						scala();
						}
					}

					setState(524);
					match(RR_BRACKET);
					}
				}

				}
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(INTEGER);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				match(INT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				match(SMALLINT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Approximate_numeric_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SqlParser.FLOAT, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public TerminalNode REAL() { return getToken(SqlParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(SqlParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(SqlParser.PRECISION, 0); }
		public Approximate_numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_approximate_numeric_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterApproximate_numeric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitApproximate_numeric_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitApproximate_numeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Approximate_numeric_typeContext approximate_numeric_type() throws RecognitionException {
		Approximate_numeric_typeContext _localctx = new Approximate_numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_approximate_numeric_type);
		int _la;
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(FLOAT);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(534);
					match(LR_BRACKET);
					setState(535);
					precision();
					setState(536);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(REAL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				match(DOUBLE);
				setState(542);
				match(PRECISION);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Datetime_typeContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(SqlParser.DATE, 0); }
		public List<TerminalNode> TIME() { return getTokens(SqlParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(SqlParser.TIME, i);
		}
		public TerminalNode TIMESTAMP() { return getToken(SqlParser.TIMESTAMP, 0); }
		public TerminalNode WITH() { return getToken(SqlParser.WITH, 0); }
		public TerminalNode ZONE() { return getToken(SqlParser.ZONE, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SqlParser.LR_BRACKET, 0); }
		public Time_precisionContext time_precision() {
			return getRuleContext(Time_precisionContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public Timestamp_precisionContext timestamp_precision() {
			return getRuleContext(Timestamp_precisionContext.class,0);
		}
		public Datetime_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterDatetime_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitDatetime_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitDatetime_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_typeContext datetime_type() throws RecognitionException {
		Datetime_typeContext _localctx = new Datetime_typeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_datetime_type);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(DATE);
				}
				break;
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIME:
					{
					setState(546);
					match(TIME);
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LR_BRACKET) {
						{
						setState(547);
						match(LR_BRACKET);
						setState(548);
						time_precision();
						setState(549);
						match(RR_BRACKET);
						}
					}

					}
					break;
				case TIMESTAMP:
					{
					setState(553);
					match(TIMESTAMP);
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LR_BRACKET) {
						{
						setState(554);
						match(LR_BRACKET);
						setState(555);
						timestamp_precision();
						setState(556);
						match(RR_BRACKET);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(562);
					match(WITH);
					setState(563);
					match(TIME);
					setState(564);
					match(ZONE);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(NUMERIC_LITERAL);
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

	public static class PrecisionContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitPrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitPrecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(NUMERIC_LITERAL);
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

	public static class ScalaContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public ScalaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scala; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterScala(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitScala(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitScala(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalaContext scala() throws RecognitionException {
		ScalaContext _localctx = new ScalaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_scala);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(NUMERIC_LITERAL);
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

	public static class Time_precisionContext extends ParserRuleContext {
		public Time_fractional_seconds_precisionContext time_fractional_seconds_precision() {
			return getRuleContext(Time_fractional_seconds_precisionContext.class,0);
		}
		public Time_precisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTime_precision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTime_precision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTime_precision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_precisionContext time_precision() throws RecognitionException {
		Time_precisionContext _localctx = new Time_precisionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_time_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			time_fractional_seconds_precision();
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

	public static class Timestamp_precisionContext extends ParserRuleContext {
		public Time_fractional_seconds_precisionContext time_fractional_seconds_precision() {
			return getRuleContext(Time_fractional_seconds_precisionContext.class,0);
		}
		public Timestamp_precisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTimestamp_precision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTimestamp_precision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTimestamp_precision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_precisionContext timestamp_precision() throws RecognitionException {
		Timestamp_precisionContext _localctx = new Timestamp_precisionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_timestamp_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			time_fractional_seconds_precision();
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

	public static class Time_fractional_seconds_precisionContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public Time_fractional_seconds_precisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_fractional_seconds_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTime_fractional_seconds_precision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTime_fractional_seconds_precision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTime_fractional_seconds_precision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_fractional_seconds_precisionContext time_fractional_seconds_precision() throws RecognitionException {
		Time_fractional_seconds_precisionContext _localctx = new Time_fractional_seconds_precisionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_time_fractional_seconds_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(NUMERIC_LITERAL);
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

	public static class Origin_function_nameContext extends ParserRuleContext {
		public TerminalNode ASCII() { return getToken(SqlParser.ASCII, 0); }
		public TerminalNode CHAR_LENGTH() { return getToken(SqlParser.CHAR_LENGTH, 0); }
		public TerminalNode CHARACTER_LENGTH() { return getToken(SqlParser.CHARACTER_LENGTH, 0); }
		public TerminalNode CONCAT() { return getToken(SqlParser.CONCAT, 0); }
		public TerminalNode CONCAT_WS() { return getToken(SqlParser.CONCAT_WS, 0); }
		public TerminalNode FIELD() { return getToken(SqlParser.FIELD, 0); }
		public TerminalNode FIND_IN_SET() { return getToken(SqlParser.FIND_IN_SET, 0); }
		public TerminalNode FORMAT() { return getToken(SqlParser.FORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlParser.INSERT, 0); }
		public TerminalNode LOCATE() { return getToken(SqlParser.LOCATE, 0); }
		public TerminalNode LCASE() { return getToken(SqlParser.LCASE, 0); }
		public TerminalNode LEFT() { return getToken(SqlParser.LEFT, 0); }
		public TerminalNode LOWER() { return getToken(SqlParser.LOWER, 0); }
		public TerminalNode LPAD() { return getToken(SqlParser.LPAD, 0); }
		public TerminalNode LTRIM() { return getToken(SqlParser.LTRIM, 0); }
		public TerminalNode MID() { return getToken(SqlParser.MID, 0); }
		public TerminalNode POSITION() { return getToken(SqlParser.POSITION, 0); }
		public TerminalNode REPEAT() { return getToken(SqlParser.REPEAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlParser.REPLACE, 0); }
		public TerminalNode REVERSE() { return getToken(SqlParser.REVERSE, 0); }
		public TerminalNode RIGHT() { return getToken(SqlParser.RIGHT, 0); }
		public TerminalNode RPAD() { return getToken(SqlParser.RPAD, 0); }
		public TerminalNode RTRIM() { return getToken(SqlParser.RTRIM, 0); }
		public TerminalNode SPACE() { return getToken(SqlParser.SPACE, 0); }
		public TerminalNode STRCMP() { return getToken(SqlParser.STRCMP, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlParser.SUBSTRING, 0); }
		public TerminalNode SUBSTRING_INDEX() { return getToken(SqlParser.SUBSTRING_INDEX, 0); }
		public TerminalNode TRIM() { return getToken(SqlParser.TRIM, 0); }
		public TerminalNode UCASE() { return getToken(SqlParser.UCASE, 0); }
		public TerminalNode UPPER() { return getToken(SqlParser.UPPER, 0); }
		public TerminalNode ABS() { return getToken(SqlParser.ABS, 0); }
		public TerminalNode ACOS() { return getToken(SqlParser.ACOS, 0); }
		public TerminalNode ASIN() { return getToken(SqlParser.ASIN, 0); }
		public TerminalNode ATAN() { return getToken(SqlParser.ATAN, 0); }
		public TerminalNode ATAN2() { return getToken(SqlParser.ATAN2, 0); }
		public TerminalNode AVG() { return getToken(SqlParser.AVG, 0); }
		public TerminalNode CEIL() { return getToken(SqlParser.CEIL, 0); }
		public TerminalNode CEILING() { return getToken(SqlParser.CEILING, 0); }
		public TerminalNode COS() { return getToken(SqlParser.COS, 0); }
		public TerminalNode COT() { return getToken(SqlParser.COT, 0); }
		public TerminalNode COUNT() { return getToken(SqlParser.COUNT, 0); }
		public TerminalNode DEGREES() { return getToken(SqlParser.DEGREES, 0); }
		public TerminalNode EXP() { return getToken(SqlParser.EXP, 0); }
		public TerminalNode FLOOR() { return getToken(SqlParser.FLOOR, 0); }
		public TerminalNode GREATEST() { return getToken(SqlParser.GREATEST, 0); }
		public TerminalNode LEAST() { return getToken(SqlParser.LEAST, 0); }
		public TerminalNode LN() { return getToken(SqlParser.LN, 0); }
		public TerminalNode LOG() { return getToken(SqlParser.LOG, 0); }
		public TerminalNode LOG10() { return getToken(SqlParser.LOG10, 0); }
		public TerminalNode LOG2() { return getToken(SqlParser.LOG2, 0); }
		public TerminalNode MAX() { return getToken(SqlParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SqlParser.MIN, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode PI() { return getToken(SqlParser.PI, 0); }
		public TerminalNode POW() { return getToken(SqlParser.POW, 0); }
		public TerminalNode POWER() { return getToken(SqlParser.POWER, 0); }
		public TerminalNode RADIANS() { return getToken(SqlParser.RADIANS, 0); }
		public TerminalNode RAND() { return getToken(SqlParser.RAND, 0); }
		public TerminalNode ROUND() { return getToken(SqlParser.ROUND, 0); }
		public TerminalNode SIGN() { return getToken(SqlParser.SIGN, 0); }
		public TerminalNode SIN() { return getToken(SqlParser.SIN, 0); }
		public TerminalNode SQRT() { return getToken(SqlParser.SQRT, 0); }
		public TerminalNode SUM() { return getToken(SqlParser.SUM, 0); }
		public TerminalNode TAN() { return getToken(SqlParser.TAN, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlParser.TRUNCATE, 0); }
		public TerminalNode ADDDATE() { return getToken(SqlParser.ADDDATE, 0); }
		public TerminalNode ADDTIME() { return getToken(SqlParser.ADDTIME, 0); }
		public TerminalNode CURDATE() { return getToken(SqlParser.CURDATE, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURTIME() { return getToken(SqlParser.CURTIME, 0); }
		public TerminalNode DATE() { return getToken(SqlParser.DATE, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlParser.DATEDIFF, 0); }
		public TerminalNode DATE_ADD() { return getToken(SqlParser.DATE_ADD, 0); }
		public TerminalNode DATE_FORMAT() { return getToken(SqlParser.DATE_FORMAT, 0); }
		public TerminalNode DATE_SUB() { return getToken(SqlParser.DATE_SUB, 0); }
		public TerminalNode DAY() { return getToken(SqlParser.DAY, 0); }
		public TerminalNode DAYNAME() { return getToken(SqlParser.DAYNAME, 0); }
		public TerminalNode DAYOFMONTH() { return getToken(SqlParser.DAYOFMONTH, 0); }
		public TerminalNode DAYOFWEEK() { return getToken(SqlParser.DAYOFWEEK, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlParser.DAYOFYEAR, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlParser.EXTRACT, 0); }
		public TerminalNode FROM_DAYS() { return getToken(SqlParser.FROM_DAYS, 0); }
		public TerminalNode HOUR() { return getToken(SqlParser.HOUR, 0); }
		public TerminalNode LAST_DAY() { return getToken(SqlParser.LAST_DAY, 0); }
		public TerminalNode LOCALTIME() { return getToken(SqlParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SqlParser.LOCALTIMESTAMP, 0); }
		public TerminalNode MAKEDATE() { return getToken(SqlParser.MAKEDATE, 0); }
		public TerminalNode MAKETIME() { return getToken(SqlParser.MAKETIME, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlParser.MICROSECOND, 0); }
		public TerminalNode MINUTE() { return getToken(SqlParser.MINUTE, 0); }
		public TerminalNode MONTHNAME() { return getToken(SqlParser.MONTHNAME, 0); }
		public TerminalNode MONTH() { return getToken(SqlParser.MONTH, 0); }
		public TerminalNode NOW() { return getToken(SqlParser.NOW, 0); }
		public TerminalNode PERIOD_ADD() { return getToken(SqlParser.PERIOD_ADD, 0); }
		public TerminalNode PERIOD_DIFF() { return getToken(SqlParser.PERIOD_DIFF, 0); }
		public TerminalNode QUARTER() { return getToken(SqlParser.QUARTER, 0); }
		public TerminalNode SECOND() { return getToken(SqlParser.SECOND, 0); }
		public TerminalNode SEC_TO_TIME() { return getToken(SqlParser.SEC_TO_TIME, 0); }
		public TerminalNode STR_TO_DATE() { return getToken(SqlParser.STR_TO_DATE, 0); }
		public TerminalNode SUBDATE() { return getToken(SqlParser.SUBDATE, 0); }
		public TerminalNode SUBTIME() { return getToken(SqlParser.SUBTIME, 0); }
		public TerminalNode SYSDATE() { return getToken(SqlParser.SYSDATE, 0); }
		public TerminalNode TIME() { return getToken(SqlParser.TIME, 0); }
		public TerminalNode TIME_FORMAT() { return getToken(SqlParser.TIME_FORMAT, 0); }
		public TerminalNode TIME_TO_SEC() { return getToken(SqlParser.TIME_TO_SEC, 0); }
		public TerminalNode TIMEDIFF() { return getToken(SqlParser.TIMEDIFF, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TO_DAYS() { return getToken(SqlParser.TO_DAYS, 0); }
		public TerminalNode WEEK() { return getToken(SqlParser.WEEK, 0); }
		public TerminalNode WEEKDAY() { return getToken(SqlParser.WEEKDAY, 0); }
		public TerminalNode WEEKOFYEAR() { return getToken(SqlParser.WEEKOFYEAR, 0); }
		public TerminalNode YEAR() { return getToken(SqlParser.YEAR, 0); }
		public TerminalNode YEARWEEK() { return getToken(SqlParser.YEARWEEK, 0); }
		public Origin_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterOrigin_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitOrigin_function_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitOrigin_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Origin_function_nameContext origin_function_name() throws RecognitionException {
		Origin_function_nameContext _localctx = new Origin_function_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_origin_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ASCII - 70)) | (1L << (CHAR_LENGTH - 70)) | (1L << (CHARACTER_LENGTH - 70)) | (1L << (CONCAT - 70)) | (1L << (CONCAT_WS - 70)) | (1L << (FIELD - 70)) | (1L << (FIND_IN_SET - 70)) | (1L << (FORMAT - 70)) | (1L << (INSERT - 70)) | (1L << (LOCATE - 70)) | (1L << (LCASE - 70)) | (1L << (LEFT - 70)) | (1L << (LOWER - 70)) | (1L << (LPAD - 70)) | (1L << (LTRIM - 70)) | (1L << (MID - 70)) | (1L << (POSITION - 70)) | (1L << (REPEAT - 70)) | (1L << (REPLACE - 70)) | (1L << (REVERSE - 70)) | (1L << (RIGHT - 70)) | (1L << (RPAD - 70)) | (1L << (RTRIM - 70)) | (1L << (SPACE - 70)) | (1L << (STRCMP - 70)) | (1L << (SUBSTR - 70)) | (1L << (SUBSTRING - 70)) | (1L << (SUBSTRING_INDEX - 70)) | (1L << (TRIM - 70)) | (1L << (UCASE - 70)) | (1L << (UPPER - 70)) | (1L << (ABS - 70)) | (1L << (ACOS - 70)) | (1L << (ASIN - 70)) | (1L << (ATAN - 70)) | (1L << (ATAN2 - 70)) | (1L << (AVG - 70)) | (1L << (CEIL - 70)) | (1L << (CEILING - 70)) | (1L << (COS - 70)) | (1L << (COT - 70)) | (1L << (COUNT - 70)) | (1L << (DEGREES - 70)) | (1L << (EXP - 70)) | (1L << (FLOOR - 70)) | (1L << (GREATEST - 70)) | (1L << (LEAST - 70)) | (1L << (LN - 70)) | (1L << (LOG - 70)) | (1L << (LOG10 - 70)) | (1L << (LOG2 - 70)) | (1L << (MAX - 70)) | (1L << (MIN - 70)) | (1L << (MOD - 70)) | (1L << (PI - 70)) | (1L << (POW - 70)) | (1L << (POWER - 70)) | (1L << (RADIANS - 70)) | (1L << (RAND - 70)) | (1L << (ROUND - 70)) | (1L << (SIGN - 70)) | (1L << (SIN - 70)) | (1L << (SQRT - 70)) | (1L << (SUM - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (TAN - 134)) | (1L << (TRUNCATE - 134)) | (1L << (ADDDATE - 134)) | (1L << (ADDTIME - 134)) | (1L << (CURDATE - 134)) | (1L << (CURRENT_DATE - 134)) | (1L << (CURRENT_TIME - 134)) | (1L << (CURRENT_TIMESTAMP - 134)) | (1L << (CURTIME - 134)) | (1L << (DATE - 134)) | (1L << (DATEDIFF - 134)) | (1L << (DATE_ADD - 134)) | (1L << (DATE_FORMAT - 134)) | (1L << (DATE_SUB - 134)) | (1L << (DAY - 134)) | (1L << (DAYNAME - 134)) | (1L << (DAYOFMONTH - 134)) | (1L << (DAYOFWEEK - 134)) | (1L << (DAYOFYEAR - 134)) | (1L << (EXTRACT - 134)) | (1L << (FROM_DAYS - 134)) | (1L << (HOUR - 134)) | (1L << (LAST_DAY - 134)) | (1L << (LOCALTIME - 134)) | (1L << (LOCALTIMESTAMP - 134)) | (1L << (MAKEDATE - 134)) | (1L << (MAKETIME - 134)) | (1L << (MICROSECOND - 134)) | (1L << (MINUTE - 134)) | (1L << (MONTHNAME - 134)) | (1L << (MONTH - 134)) | (1L << (NOW - 134)) | (1L << (PERIOD_ADD - 134)) | (1L << (PERIOD_DIFF - 134)) | (1L << (QUARTER - 134)) | (1L << (SECOND - 134)) | (1L << (SEC_TO_TIME - 134)) | (1L << (STR_TO_DATE - 134)) | (1L << (SUBDATE - 134)) | (1L << (SUBTIME - 134)) | (1L << (SYSDATE - 134)) | (1L << (TIME - 134)) | (1L << (TIME_FORMAT - 134)) | (1L << (TIME_TO_SEC - 134)) | (1L << (TIMEDIFF - 134)) | (1L << (TIMESTAMP - 134)) | (1L << (TIMESTAMPDIFF - 134)) | (1L << (TO_DAYS - 134)) | (1L << (WEEK - 134)) | (1L << (WEEKDAY - 134)) | (1L << (WEEKOFYEAR - 134)) | (1L << (YEAR - 134)) | (1L << (YEARWEEK - 134)))) != 0)) ) {
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

	public static class Udf_function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Udf_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_udf_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterUdf_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitUdf_function_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitUdf_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Udf_function_nameContext udf_function_name() throws RecognitionException {
		Udf_function_nameContext _localctx = new Udf_function_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_udf_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			any_name();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00cd\u024c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\5\2]\n\2\3\3\7\3`\n\3\f\3\16\3c\13\3\3\3\3\3\6\3g\n"+
		"\3\r\3\16\3h\3\3\7\3l\n\3\f\3\16\3o\13\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3"+
		"\4\3\4\3\4\3\5\5\5{\n\5\3\5\3\5\5\5\177\n\5\3\5\3\5\5\5\u0083\n\5\3\5"+
		"\5\5\u0086\n\5\3\5\5\5\u0089\n\5\3\5\5\5\u008c\n\5\3\5\5\5\u008f\n\5\3"+
		"\6\3\6\3\7\3\7\3\7\7\7\u0096\n\7\f\7\16\7\u0099\13\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00a2\n\b\3\b\5\b\u00a5\n\b\5\b\u00a7\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u00ae\n\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00bc\n\t\3\t\3\t\3\t\7\t\u00c1\n\t\f\t\16\t\u00c4\13\t\3\t\5"+
		"\t\u00c7\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ce\n\t\3\t\3\t\3\t\7\t\u00d3\n"+
		"\t\f\t\16\t\u00d6\13\t\3\t\5\t\u00d9\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e9\n\t\3\t\5\t\u00ec\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00f4\n\t\3\t\3\t\3\t\3\t\3\t\6\t\u00fb\n\t\r\t\16\t"+
		"\u00fc\3\t\3\t\5\t\u0101\n\t\3\t\3\t\5\t\u0105\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0113\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u011c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0124\n\t\f\t\16\t\u0127\13"+
		"\t\5\t\u0129\n\t\3\t\3\t\3\t\3\t\5\t\u012f\n\t\3\t\5\t\u0132\n\t\7\t\u0134"+
		"\n\t\f\t\16\t\u0137\13\t\3\n\3\n\3\n\3\n\7\n\u013d\n\n\f\n\16\n\u0140"+
		"\13\n\3\13\3\13\5\13\u0144\n\13\3\13\3\13\3\13\5\13\u0149\n\13\3\13\3"+
		"\13\7\13\u014d\n\13\f\13\16\13\u0150\13\13\3\13\7\13\u0153\n\13\f\13\16"+
		"\13\u0156\13\13\3\13\3\13\5\13\u015a\n\13\5\13\u015c\n\13\3\f\5\f\u015f"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\7\f\u0166\n\f\f\f\16\f\u0169\13\f\3\f\3\f\5\f"+
		"\u016d\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u0174\n\r\f\r\16\r\u0177\13\r\3\16"+
		"\3\16\5\16\u017b\n\16\3\16\3\16\5\16\u017f\n\16\5\16\u0181\n\16\3\16\5"+
		"\16\u0184\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u018d\n\17\f\17"+
		"\16\17\u0190\13\17\3\17\3\17\5\17\u0194\n\17\3\20\3\20\3\20\7\20\u0199"+
		"\n\20\f\20\16\20\u019c\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01a4"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u01ab\n\22\f\22\16\22\u01ae\13\22"+
		"\3\22\3\22\5\22\u01b2\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24"+
		"\u01bc\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u01c5\n\27\3\27\3"+
		"\27\3\27\5\27\u01ca\n\27\3\27\3\27\3\30\3\30\3\30\5\30\u01d1\n\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01e1\n\34\3\35\3\35\3\36\3\36\5\36\u01e7\n\36\3\37\3\37\3\37\3\37\5"+
		"\37\u01ed\n\37\3 \3 \5 \u01f1\n \3 \5 \u01f4\n \3 \3 \3 \3 \3!\3!\5!\u01fc"+
		"\n!\3!\3!\3!\3!\5!\u0202\n!\3\"\3\"\5\"\u0206\n\"\3#\3#\3#\3#\3#\5#\u020d"+
		"\n#\3#\3#\5#\u0211\n#\3#\3#\3#\5#\u0216\n#\3$\3$\3$\3$\3$\5$\u021d\n$"+
		"\3$\3$\3$\5$\u0222\n$\3%\3%\3%\3%\3%\3%\5%\u022a\n%\3%\3%\3%\3%\3%\5%"+
		"\u0231\n%\5%\u0233\n%\3%\3%\3%\5%\u0238\n%\5%\u023a\n%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\2\3\20.\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\17\4\2\30\30/"+
		"/\4\2\6\6\23\23\3\2@F\4\29<>?\5\2\32\32SS\\\\\5\2\20\20\37\37,,\5\2\7"+
		"\7**\u00c3\u00c3\5\2&&<<>>\3\2\u00bd\u00be\5\2%%\u008d\u008f\u00be\u00bf"+
		"\3\2\16\17\4\2\21\22\'\'\3\2H\u00bc\2\u0285\2\\\3\2\2\2\4a\3\2\2\2\6v"+
		"\3\2\2\2\bz\3\2\2\2\n\u0090\3\2\2\2\f\u0092\3\2\2\2\16\u00a6\3\2\2\2\20"+
		"\u0104\3\2\2\2\22\u0138\3\2\2\2\24\u015b\3\2\2\2\26\u015e\3\2\2\2\30\u016e"+
		"\3\2\2\2\32\u0183\3\2\2\2\34\u0193\3\2\2\2\36\u0195\3\2\2\2 \u01a3\3\2"+
		"\2\2\"\u01a5\3\2\2\2$\u01b3\3\2\2\2&\u01b7\3\2\2\2(\u01bd\3\2\2\2*\u01bf"+
		"\3\2\2\2,\u01c9\3\2\2\2.\u01d0\3\2\2\2\60\u01d4\3\2\2\2\62\u01d6\3\2\2"+
		"\2\64\u01d8\3\2\2\2\66\u01e0\3\2\2\28\u01e2\3\2\2\2:\u01e6\3\2\2\2<\u01ec"+
		"\3\2\2\2>\u01f3\3\2\2\2@\u01f9\3\2\2\2B\u0205\3\2\2\2D\u0215\3\2\2\2F"+
		"\u0221\3\2\2\2H\u0239\3\2\2\2J\u023b\3\2\2\2L\u023d\3\2\2\2N\u023f\3\2"+
		"\2\2P\u0241\3\2\2\2R\u0243\3\2\2\2T\u0245\3\2\2\2V\u0247\3\2\2\2X\u0249"+
		"\3\2\2\2Z]\5\4\3\2[]\5\6\4\2\\Z\3\2\2\2\\[\3\2\2\2]\3\3\2\2\2^`\7\u00c4"+
		"\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2dm\5\b"+
		"\5\2eg\7\u00c4\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2j"+
		"l\5\b\5\2kf\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2ns\3\2\2\2om\3\2\2\2"+
		"pr\7\u00c4\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\5\3\2\2\2us\3"+
		"\2\2\2vw\n\2\2\2wx\b\4\1\2x\7\3\2\2\2y{\7\30\2\2zy\3\2\2\2z{\3\2\2\2{"+
		"|\3\2\2\2|~\7/\2\2}\177\5\n\6\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0082\5\f\7\2\u0081\u0083\5\22\n\2\u0082\u0081\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\36\20\2\u0085\u0084\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\5\"\22\2\u0088"+
		"\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u008c\5$"+
		"\23\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008f\5&\24\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\t\3\2\2\2"+
		"\u0090\u0091\t\3\2\2\u0091\13\3\2\2\2\u0092\u0097\5\16\b\2\u0093\u0094"+
		"\7\u00c3\2\2\u0094\u0096\5\16\b\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\r\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u00a7\79\2\2\u009b\u009c\5.\30\2\u009c\u009d\7\u00c0\2"+
		"\2\u009d\u009e\79\2\2\u009e\u00a7\3\2\2\2\u009f\u00a4\5\20\t\2\u00a0\u00a2"+
		"\7\b\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\5*\26\2\u00a4\u00a1\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u009a\3\2\2\2\u00a6\u009b\3\2\2\2\u00a6\u009f\3\2\2\2\u00a7"+
		"\17\3\2\2\2\u00a8\u00a9\b\t\1\2\u00a9\u0105\58\35\2\u00aa\u00ab\5\62\32"+
		"\2\u00ab\u00ac\7\u00c0\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5.\30\2\u00b0\u00b1\7\u00c0"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u0105\5\60\31\2\u00b5\u00b6\5(\25\2\u00b6\u00b7\5"+
		"\20\t\16\u00b7\u0105\3\2\2\2\u00b8\u00b9\5V,\2\u00b9\u00c6\7\u00c1\2\2"+
		"\u00ba\u00bc\7\23\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00c2\5\20\t\2\u00be\u00bf\7\u00c3\2\2\u00bf\u00c1\5\20"+
		"\t\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c7\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\79"+
		"\2\2\u00c6\u00bb\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\7\u00c2\2\2\u00c9\u0105\3\2\2\2\u00ca\u00cb"+
		"\5X-\2\u00cb\u00d8\7\u00c1\2\2\u00cc\u00ce\7\23\2\2\u00cd\u00cc\3\2\2"+
		"\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d4\5\20\t\2\u00d0"+
		"\u00d1\7\u00c3\2\2\u00d1\u00d3\5\20\t\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d9\79\2\2\u00d8\u00cd\3\2\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\u00c2\2\2\u00db"+
		"\u0105\3\2\2\2\u00dc\u00dd\7\u00c1\2\2\u00dd\u00de\5\20\t\2\u00de\u00df"+
		"\7\u00c2\2\2\u00df\u0105\3\2\2\2\u00e0\u00e1\7\r\2\2\u00e1\u00e2\7\u00c1"+
		"\2\2\u00e2\u00e3\5\20\t\2\u00e3\u00e4\7\b\2\2\u00e4\u00e5\5:\36\2\u00e5"+
		"\u00e6\7\u00c2\2\2\u00e6\u0105\3\2\2\2\u00e7\u00e9\7&\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\7\27\2\2"+
		"\u00eb\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee"+
		"\7\u00c1\2\2\u00ee\u00ef\5\b\5\2\u00ef\u00f0\7\u00c2\2\2\u00f0\u0105\3"+
		"\2\2\2\u00f1\u00f3\7\f\2\2\u00f2\u00f4\5\20\t\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00fa\3\2\2\2\u00f5\u00f6\7\65\2\2\u00f6\u00f7\5"+
		"\20\t\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9\5\20\t\2\u00f9\u00fb\3\2\2\2"+
		"\u00fa\u00f5\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00ff\7\25\2\2\u00ff\u0101\5\20\t\2"+
		"\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103"+
		"\7\26\2\2\u0103\u0105\3\2\2\2\u0104\u00a8\3\2\2\2\u0104\u00b2\3\2\2\2"+
		"\u0104\u00b5\3\2\2\2\u0104\u00b8\3\2\2\2\u0104\u00ca\3\2\2\2\u0104\u00dc"+
		"\3\2\2\2\u0104\u00e0\3\2\2\2\u0104\u00eb\3\2\2\2\u0104\u00f1\3\2\2\2\u0105"+
		"\u0135\3\2\2\2\u0106\u0107\f\r\2\2\u0107\u0108\t\4\2\2\u0108\u0134\5\20"+
		"\t\16\u0109\u010a\f\f\2\2\u010a\u010b\t\5\2\2\u010b\u0134\5\20\t\r\u010c"+
		"\u010d\f\7\2\2\u010d\u010e\7\"\2\2\u010e\u010f\7&\2\2\u010f\u0134\5\20"+
		"\t\b\u0110\u0112\f\6\2\2\u0111\u0113\7&\2\2\u0112\u0111\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\t\2\2\u0115\u0116\5\20"+
		"\t\2\u0116\u0117\7\7\2\2\u0117\u0118\5\20\t\7\u0118\u0134\3\2\2\2\u0119"+
		"\u011b\f\5\2\2\u011a\u011c\7&\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u0131\7\36\2\2\u011e\u0128\7\u00c1\2\2"+
		"\u011f\u0129\5\b\5\2\u0120\u0125\5\20\t\2\u0121\u0122\7\u00c3\2\2\u0122"+
		"\u0124\5\20\t\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u011f\3\2\2\2\u0128\u0120\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u0132\7\u00c2\2\2\u012b\u012c\5\62\32\2\u012c\u012d\7\u00c0"+
		"\2\2\u012d\u012f\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0132\5.\30\2\u0131\u011e\3\2\2\2\u0131\u012e\3\2"+
		"\2\2\u0132\u0134\3\2\2\2\u0133\u0106\3\2\2\2\u0133\u0109\3\2\2\2\u0133"+
		"\u010c\3\2\2\2\u0133\u0110\3\2\2\2\u0133\u0119\3\2\2\2\u0134\u0137\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\21\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u0139\7\31\2\2\u0139\u013e\5\24\13\2\u013a\u013b\7\u00c3"+
		"\2\2\u013b\u013d\5\24\13\2\u013c\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\23\3\2\2\2\u0140\u013e\3\2\2"+
		"\2\u0141\u0143\5.\30\2\u0142\u0144\5\26\f\2\u0143\u0142\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u015c\3\2\2\2\u0145\u0154\7\u00c1\2\2\u0146\u0149"+
		"\5\24\13\2\u0147\u0149\5\b\5\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2"+
		"\u0149\u014e\3\2\2\2\u014a\u014b\7\u00c3\2\2\u014b\u014d\5\24\13\2\u014c"+
		"\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0153\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\5\30\r\2\u0152"+
		"\u0148\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0159\7\u00c2\2\2\u0158\u015a\5\26\f\2\u0159\u0158\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0141\3\2\2\2\u015b\u0145\3\2\2\2\u015c"+
		"\25\3\2\2\2\u015d\u015f\7\b\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2"+
		"\2\u015f\u0160\3\2\2\2\u0160\u016c\5\64\33\2\u0161\u0162\7\u00c1\2\2\u0162"+
		"\u0167\5\60\31\2\u0163\u0164\7\u00c3\2\2\u0164\u0166\5\60\31\2\u0165\u0163"+
		"\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7\u00c2\2\2\u016b\u016d"+
		"\3\2\2\2\u016c\u0161\3\2\2\2\u016c\u016d\3\2\2\2\u016d\27\3\2\2\2\u016e"+
		"\u0175\5\24\13\2\u016f\u0170\5\32\16\2\u0170\u0171\5\24\13\2\u0171\u0172"+
		"\5\34\17\2\u0172\u0174\3\2\2\2\u0173\u016f\3\2\2\2\u0174\u0177\3\2\2\2"+
		"\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\31\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u0184\7\u00c3\2\2\u0179\u017b\7$\2\2\u017a\u0179\3\2\2"+
		"\2\u017a\u017b\3\2\2\2\u017b\u0180\3\2\2\2\u017c\u017e\t\6\2\2\u017d\u017f"+
		"\t\7\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180"+
		"\u017c\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\7\35"+
		"\2\2\u0183\u0178\3\2\2\2\u0183\u017a\3\2\2\2\u0184\33\3\2\2\2\u0185\u0186"+
		"\7)\2\2\u0186\u0194\5\20\t\2\u0187\u0188\7\62\2\2\u0188\u0189\7\u00c1"+
		"\2\2\u0189\u018e\5\60\31\2\u018a\u018b\7\u00c3\2\2\u018b\u018d\5\60\31"+
		"\2\u018c\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7\u00c2\2"+
		"\2\u0192\u0194\3\2\2\2\u0193\u0185\3\2\2\2\u0193\u0187\3\2\2\2\u0194\35"+
		"\3\2\2\2\u0195\u0196\7\66\2\2\u0196\u019a\5\20\t\2\u0197\u0199\5 \21\2"+
		"\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\37\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\t\b\2\2\u019e"+
		"\u01a4\5\20\t\2\u019f\u01a0\7\u00c1\2\2\u01a0\u01a1\5 \21\2\u01a1\u01a2"+
		"\7\u00c2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u019f\3\2\2"+
		"\2\u01a4!\3\2\2\2\u01a5\u01a6\7(\2\2\u01a6\u01a7\7\13\2\2\u01a7\u01ac"+
		"\5\20\t\2\u01a8\u01a9\7\u00c3\2\2\u01a9\u01ab\5\20\t\2\u01aa\u01a8\3\2"+
		"\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01b1\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7\34\2\2\u01b0\u01b2\5"+
		"\20\t\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2#\3\2\2\2\u01b3\u01b4"+
		"\7+\2\2\u01b4\u01b5\7\13\2\2\u01b5\u01b6\5,\27\2\u01b6%\3\2\2\2\u01b7"+
		"\u01b8\7#\2\2\u01b8\u01bb\7\u00bf\2\2\u01b9\u01ba\7\u00c3\2\2\u01ba\u01bc"+
		"\7\u00bf\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\'\3\2\2\2\u01bd"+
		"\u01be\t\t\2\2\u01be)\3\2\2\2\u01bf\u01c0\t\n\2\2\u01c0+\3\2\2\2\u01c1"+
		"\u01c2\5\62\32\2\u01c2\u01c3\7\u00c0\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c1"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\5.\30\2\u01c7"+
		"\u01c8\7\u00c0\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c4\3\2\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\5\60\31\2\u01cc-\3\2\2\2\u01cd"+
		"\u01ce\5\62\32\2\u01ce\u01cf\7\u00c0\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01cd"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\5\66\34\2"+
		"\u01d3/\3\2\2\2\u01d4\u01d5\5\66\34\2\u01d5\61\3\2\2\2\u01d6\u01d7\5\66"+
		"\34\2\u01d7\63\3\2\2\2\u01d8\u01d9\5\66\34\2\u01d9\65\3\2\2\2\u01da\u01e1"+
		"\7\u00bd\2\2\u01db\u01e1\7\u00be\2\2\u01dc\u01dd\7\u00c1\2\2\u01dd\u01de"+
		"\5\66\34\2\u01de\u01df\7\u00c2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01da\3\2"+
		"\2\2\u01e0\u01db\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e1\67\3\2\2\2\u01e2\u01e3"+
		"\t\13\2\2\u01e39\3\2\2\2\u01e4\u01e7\5,\27\2\u01e5\u01e7\5<\37\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7;\3\2\2\2\u01e8\u01ed\5> \2\u01e9"+
		"\u01ed\5@!\2\u01ea\u01ed\5B\"\2\u01eb\u01ed\5H%\2\u01ec\u01e8\3\2\2\2"+
		"\u01ec\u01e9\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed=\3"+
		"\2\2\2\u01ee\u01f0\t\f\2\2\u01ef\u01f1\7\64\2\2\u01f0\u01ef\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f4\7\63\2\2\u01f3\u01ee\3"+
		"\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7\u00c1\2\2"+
		"\u01f6\u01f7\5J&\2\u01f7\u01f8\7\u00c2\2\2\u01f8?\3\2\2\2\u01f9\u01fb"+
		"\7\n\2\2\u01fa\u01fc\7\64\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2"+
		"\u01fc\u0201\3\2\2\2\u01fd\u01fe\7\u00c1\2\2\u01fe\u01ff\5J&\2\u01ff\u0200"+
		"\7\u00c2\2\2\u0200\u0202\3\2\2\2\u0201\u01fd\3\2\2\2\u0201\u0202\3\2\2"+
		"\2\u0202A\3\2\2\2\u0203\u0206\5D#\2\u0204\u0206\5F$\2\u0205\u0203\3\2"+
		"\2\2\u0205\u0204\3\2\2\2\u0206C\3\2\2\2\u0207\u0210\t\r\2\2\u0208\u0209"+
		"\7\u00c1\2\2\u0209\u020c\5L\'\2\u020a\u020b\7\u00c3\2\2\u020b\u020d\5"+
		"N(\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\7\u00c2\2\2\u020f\u0211\3\2\2\2\u0210\u0208\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u0216\3\2\2\2\u0212\u0216\7!\2\2\u0213\u0216\7 \2\2\u0214"+
		"\u0216\7\60\2\2\u0215\u0207\3\2\2\2\u0215\u0212\3\2\2\2\u0215\u0213\3"+
		"\2\2\2\u0215\u0214\3\2\2\2\u0216E\3\2\2\2\u0217\u021c\7\33\2\2\u0218\u0219"+
		"\7\u00c1\2\2\u0219\u021a\5L\'\2\u021a\u021b\7\u00c2\2\2\u021b\u021d\3"+
		"\2\2\2\u021c\u0218\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0222\3\2\2\2\u021e"+
		"\u0222\7.\2\2\u021f\u0220\7\24\2\2\u0220\u0222\7-\2\2\u0221\u0217\3\2"+
		"\2\2\u0221\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0222G\3\2\2\2\u0223\u023a"+
		"\7\u0091\2\2\u0224\u0229\7\u00b1\2\2\u0225\u0226\7\u00c1\2\2\u0226\u0227"+
		"\5P)\2\u0227\u0228\7\u00c2\2\2\u0228\u022a\3\2\2\2\u0229\u0225\3\2\2\2"+
		"\u0229\u022a\3\2\2\2\u022a\u0233\3\2\2\2\u022b\u0230\7\u00b5\2\2\u022c"+
		"\u022d\7\u00c1\2\2\u022d\u022e\5R*\2\u022e\u022f\7\u00c2\2\2\u022f\u0231"+
		"\3\2\2\2\u0230\u022c\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232"+
		"\u0224\3\2\2\2\u0232\u022b\3\2\2\2\u0233\u0237\3\2\2\2\u0234\u0235\7\67"+
		"\2\2\u0235\u0236\7\u00b1\2\2\u0236\u0238\78\2\2\u0237\u0234\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0223\3\2\2\2\u0239\u0232\3\2"+
		"\2\2\u023aI\3\2\2\2\u023b\u023c\7\u00bf\2\2\u023cK\3\2\2\2\u023d\u023e"+
		"\7\u00bf\2\2\u023eM\3\2\2\2\u023f\u0240\7\u00bf\2\2\u0240O\3\2\2\2\u0241"+
		"\u0242\5T+\2\u0242Q\3\2\2\2\u0243\u0244\5T+\2\u0244S\3\2\2\2\u0245\u0246"+
		"\7\u00bf\2\2\u0246U\3\2\2\2\u0247\u0248\t\16\2\2\u0248W\3\2\2\2\u0249"+
		"\u024a\5\66\34\2\u024aY\3\2\2\2T\\ahmsz~\u0082\u0085\u0088\u008b\u008e"+
		"\u0097\u00a1\u00a4\u00a6\u00ad\u00b2\u00bb\u00c2\u00c6\u00cd\u00d4\u00d8"+
		"\u00e8\u00eb\u00f3\u00fc\u0100\u0104\u0112\u011b\u0125\u0128\u012e\u0131"+
		"\u0133\u0135\u013e\u0143\u0148\u014e\u0152\u0154\u0159\u015b\u015e\u0167"+
		"\u016c\u0175\u017a\u017e\u0180\u0183\u018e\u0193\u019a\u01a3\u01ac\u01b1"+
		"\u01bb\u01c4\u01c9\u01d0\u01e0\u01e6\u01ec\u01f0\u01f3\u01fb\u0201\u0205"+
		"\u020c\u0210\u0215\u021c\u0221\u0229\u0230\u0232\u0237\u0239";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}