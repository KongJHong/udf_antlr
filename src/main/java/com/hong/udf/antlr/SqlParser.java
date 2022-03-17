// Generated from F:/Self Project/UDF_Antlr/src/main/resources\SqlParser.g4 by ANTLR 4.9.2
package com.hong.udf.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		RULE_where_clause = 14, RULE_group_by_clause = 15, RULE_order_by_clause = 16, 
		RULE_limit_clause = 17, RULE_unary_operator = 18, RULE_column_alias = 19, 
		RULE_domain_name = 20, RULE_table_name = 21, RULE_column_name = 22, RULE_database_name = 23, 
		RULE_table_alias = 24, RULE_any_name = 25, RULE_literal_value = 26, RULE_type_name = 27, 
		RULE_type_classify = 28, RULE_character_string_type = 29, RULE_bit_string_type = 30, 
		RULE_numeric_type = 31, RULE_exact_numeric_type = 32, RULE_approximate_numeric_type = 33, 
		RULE_datetime_type = 34, RULE_length = 35, RULE_precision = 36, RULE_scala = 37, 
		RULE_time_precision = 38, RULE_timestamp_precision = 39, RULE_time_fractional_seconds_precision = 40, 
		RULE_origin_function_name = 41, RULE_udf_function_name = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "select_stmt_list", "error", "select_stmt", "set_qualifier", 
			"element_clause", "element", "expr", "from_clause", "table_reference", 
			"table_alias_specification", "joined_clause", "join_operator", "join_constraint", 
			"where_clause", "group_by_clause", "order_by_clause", "limit_clause", 
			"unary_operator", "column_alias", "domain_name", "table_name", "column_name", 
			"database_name", "table_alias", "any_name", "literal_value", "type_name", 
			"type_classify", "character_string_type", "bit_string_type", "numeric_type", 
			"exact_numeric_type", "approximate_numeric_type", "datetime_type", "length", 
			"precision", "scala", "time_precision", "timestamp_precision", "time_fractional_seconds_precision", 
			"origin_function_name", "udf_function_name"
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				select_stmt_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
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
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(90);
				match(SEMI);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			select_stmt();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(97);
						match(SEMI);
						}
						}
						setState(100); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEMI );
					setState(102);
					select_stmt();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(108);
				match(SEMI);
				}
				}
				setState(113);
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
			setState(114);
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
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPLAIN) {
				{
				setState(117);
				match(EXPLAIN);
				}
			}

			setState(120);
			match(SELECT);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(121);
				set_qualifier();
				}
			}

			setState(124);
			element_clause();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(125);
				from_clause();
				}
			}

			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(128);
				where_clause();
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(131);
				group_by_clause();
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(134);
				order_by_clause();
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(137);
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
			setState(140);
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
			setState(142);
			element();
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					match(COMMA);
					setState(144);
					element();
					}
					} 
				}
				setState(149);
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
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				table_name();
				setState(152);
				match(DOT);
				setState(153);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				expr(0);
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
		public List<TerminalNode> AS() { return getTokens(SqlParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(SqlParser.AS, i);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SqlParser.RR_BRACKET, 0); }
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SqlParser.DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SqlParser.DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				_localctx = new ColumnNameExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(159);
						database_name();
						setState(160);
						match(DOT);
						}
						break;
					}
					setState(164);
					table_name();
					setState(165);
					match(DOT);
					}
					break;
				}
				setState(169);
				column_name();
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(170);
						match(AS);
						}
					}

					setState(173);
					column_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				unary_operator();
				setState(177);
				expr(0);
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(178);
						match(AS);
						}
					}

					setState(181);
					column_alias();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new OriginFunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				origin_function_name();
				setState(185);
				match(LR_BRACKET);
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case CAST:
				case DISTINCT:
				case EXISTS:
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
				case LR_BRACKET:
					{
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTINCT) {
						{
						setState(186);
						match(DISTINCT);
						}
					}

					setState(189);
					expr(0);
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(190);
						match(COMMA);
						setState(191);
						expr(0);
						}
						}
						setState(196);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(197);
					match(STAR);
					}
					break;
				case RR_BRACKET:
					break;
				default:
					break;
				}
				setState(200);
				match(RR_BRACKET);
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(201);
						match(AS);
						}
					}

					setState(204);
					column_alias();
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new UdfFunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				udf_function_name();
				setState(208);
				match(LR_BRACKET);
				setState(221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case CAST:
				case DISTINCT:
				case EXISTS:
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
				case LR_BRACKET:
					{
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTINCT) {
						{
						setState(209);
						match(DISTINCT);
						}
					}

					setState(212);
					expr(0);
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(213);
						match(COMMA);
						setState(214);
						expr(0);
						}
						}
						setState(219);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(220);
					match(STAR);
					}
					break;
				case RR_BRACKET:
					break;
				default:
					break;
				}
				setState(223);
				match(RR_BRACKET);
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(224);
						match(AS);
						}
					}

					setState(227);
					column_alias();
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new InnerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(LR_BRACKET);
				setState(231);
				expr(0);
				setState(232);
				match(RR_BRACKET);
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(233);
						match(AS);
						}
					}

					setState(236);
					column_alias();
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(CAST);
				setState(240);
				match(LR_BRACKET);
				setState(241);
				expr(0);
				setState(242);
				match(AS);
				setState(243);
				type_name();
				setState(244);
				match(RR_BRACKET);
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(245);
						match(AS);
						}
					}

					setState(248);
					column_alias();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new ExistsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS || _la==NOT) {
					{
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(251);
						match(NOT);
						}
					}

					setState(254);
					match(EXISTS);
					}
				}

				setState(257);
				match(LR_BRACKET);
				setState(258);
				select_stmt();
				setState(259);
				match(RR_BRACKET);
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(260);
						match(AS);
						}
					}

					setState(263);
					column_alias();
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new PredicateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(CASE);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << CAST) | (1L << EXISTS) | (1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ASCII - 70)) | (1L << (CHAR_LENGTH - 70)) | (1L << (CHARACTER_LENGTH - 70)) | (1L << (CONCAT - 70)) | (1L << (CONCAT_WS - 70)) | (1L << (FIELD - 70)) | (1L << (FIND_IN_SET - 70)) | (1L << (FORMAT - 70)) | (1L << (INSERT - 70)) | (1L << (LOCATE - 70)) | (1L << (LCASE - 70)) | (1L << (LEFT - 70)) | (1L << (LOWER - 70)) | (1L << (LPAD - 70)) | (1L << (LTRIM - 70)) | (1L << (MID - 70)) | (1L << (POSITION - 70)) | (1L << (REPEAT - 70)) | (1L << (REPLACE - 70)) | (1L << (REVERSE - 70)) | (1L << (RIGHT - 70)) | (1L << (RPAD - 70)) | (1L << (RTRIM - 70)) | (1L << (SPACE - 70)) | (1L << (STRCMP - 70)) | (1L << (SUBSTR - 70)) | (1L << (SUBSTRING - 70)) | (1L << (SUBSTRING_INDEX - 70)) | (1L << (TRIM - 70)) | (1L << (UCASE - 70)) | (1L << (UPPER - 70)) | (1L << (ABS - 70)) | (1L << (ACOS - 70)) | (1L << (ASIN - 70)) | (1L << (ATAN - 70)) | (1L << (ATAN2 - 70)) | (1L << (AVG - 70)) | (1L << (CEIL - 70)) | (1L << (CEILING - 70)) | (1L << (COS - 70)) | (1L << (COT - 70)) | (1L << (COUNT - 70)) | (1L << (DEGREES - 70)) | (1L << (EXP - 70)) | (1L << (FLOOR - 70)) | (1L << (GREATEST - 70)) | (1L << (LEAST - 70)) | (1L << (LN - 70)) | (1L << (LOG - 70)) | (1L << (LOG10 - 70)) | (1L << (LOG2 - 70)) | (1L << (MAX - 70)) | (1L << (MIN - 70)) | (1L << (MOD - 70)) | (1L << (PI - 70)) | (1L << (POW - 70)) | (1L << (POWER - 70)) | (1L << (RADIANS - 70)) | (1L << (RAND - 70)) | (1L << (ROUND - 70)) | (1L << (SIGN - 70)) | (1L << (SIN - 70)) | (1L << (SQRT - 70)) | (1L << (SUM - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (TAN - 134)) | (1L << (TRUNCATE - 134)) | (1L << (ADDDATE - 134)) | (1L << (ADDTIME - 134)) | (1L << (CURDATE - 134)) | (1L << (CURRENT_DATE - 134)) | (1L << (CURRENT_TIME - 134)) | (1L << (CURRENT_TIMESTAMP - 134)) | (1L << (CURTIME - 134)) | (1L << (DATE - 134)) | (1L << (DATEDIFF - 134)) | (1L << (DATE_ADD - 134)) | (1L << (DATE_FORMAT - 134)) | (1L << (DATE_SUB - 134)) | (1L << (DAY - 134)) | (1L << (DAYNAME - 134)) | (1L << (DAYOFMONTH - 134)) | (1L << (DAYOFWEEK - 134)) | (1L << (DAYOFYEAR - 134)) | (1L << (EXTRACT - 134)) | (1L << (FROM_DAYS - 134)) | (1L << (HOUR - 134)) | (1L << (LAST_DAY - 134)) | (1L << (LOCALTIME - 134)) | (1L << (LOCALTIMESTAMP - 134)) | (1L << (MAKEDATE - 134)) | (1L << (MAKETIME - 134)) | (1L << (MICROSECOND - 134)) | (1L << (MINUTE - 134)) | (1L << (MONTHNAME - 134)) | (1L << (MONTH - 134)) | (1L << (NOW - 134)) | (1L << (PERIOD_ADD - 134)) | (1L << (PERIOD_DIFF - 134)) | (1L << (QUARTER - 134)) | (1L << (SECOND - 134)) | (1L << (SEC_TO_TIME - 134)) | (1L << (STR_TO_DATE - 134)) | (1L << (SUBDATE - 134)) | (1L << (SUBTIME - 134)) | (1L << (SYSDATE - 134)) | (1L << (TIME - 134)) | (1L << (TIME_FORMAT - 134)) | (1L << (TIME_TO_SEC - 134)) | (1L << (TIMEDIFF - 134)) | (1L << (TIMESTAMP - 134)) | (1L << (TIMESTAMPDIFF - 134)) | (1L << (TO_DAYS - 134)) | (1L << (WEEK - 134)) | (1L << (WEEKDAY - 134)) | (1L << (WEEKOFYEAR - 134)) | (1L << (YEAR - 134)) | (1L << (YEARWEEK - 134)) | (1L << (IDENTIFIER - 134)) | (1L << (STRING_LITERAL - 134)) | (1L << (LR_BRACKET - 134)))) != 0)) {
					{
					setState(267);
					expr(0);
					}
				}

				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(270);
					match(WHEN);
					setState(271);
					expr(0);
					setState(272);
					match(THEN);
					setState(273);
					expr(0);
					}
					}
					setState(277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(279);
					match(ELSE);
					setState(280);
					expr(0);
					}
				}

				setState(283);
				match(END);
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(284);
						match(AS);
						}
					}

					setState(287);
					column_alias();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryEqualOrAssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(293);
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
						setState(294);
						expr(0);
						setState(299);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(296);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==AS) {
								{
								setState(295);
								match(AS);
								}
							}

							setState(298);
							column_alias();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(302);
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
						setState(303);
						expr(0);
						setState(308);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
						case 1:
							{
							setState(305);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==AS) {
								{
								setState(304);
								match(AS);
								}
							}

							setState(307);
							column_alias();
							}
							break;
						}
						}
						break;
					case 3:
						{
						_localctx = new IsNotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(311);
						match(IS);
						setState(312);
						match(NOT);
						setState(313);
						expr(0);
						setState(318);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
						case 1:
							{
							setState(315);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==AS) {
								{
								setState(314);
								match(AS);
								}
							}

							setState(317);
							column_alias();
							}
							break;
						}
						}
						break;
					case 4:
						{
						_localctx = new BetweenExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(320);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(322);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(321);
							match(NOT);
							}
						}

						setState(324);
						match(BETWEEN);
						setState(325);
						expr(0);
						setState(326);
						match(AND);
						setState(327);
						expr(0);
						setState(332);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(329);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==AS) {
								{
								setState(328);
								match(AS);
								}
							}

							setState(331);
							column_alias();
							}
							break;
						}
						}
						break;
					case 5:
						{
						_localctx = new InMethodExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(336);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(335);
							match(NOT);
							}
						}

						setState(338);
						match(IN);
						setState(358);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(339);
							match(LR_BRACKET);
							setState(349);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case EXPLAIN:
							case SELECT:
								{
								setState(340);
								select_stmt();
								}
								break;
							case CASE:
							case CAST:
							case EXISTS:
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
							case LR_BRACKET:
								{
								setState(341);
								expr(0);
								setState(346);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(342);
									match(COMMA);
									setState(343);
									expr(0);
									}
									}
									setState(348);
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
							setState(351);
							match(RR_BRACKET);
							}
							break;
						case 2:
							{
							setState(355);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
							case 1:
								{
								setState(352);
								database_name();
								setState(353);
								match(DOT);
								}
								break;
							}
							setState(357);
							table_name();
							}
							break;
						}
						setState(364);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
						case 1:
							{
							setState(361);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==AS) {
								{
								setState(360);
								match(AS);
								}
							}

							setState(363);
							column_alias();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
			setState(371);
			match(FROM);
			setState(372);
			table_reference();
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					match(COMMA);
					setState(374);
					table_reference();
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				table_name();
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(381);
					table_alias_specification();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(LR_BRACKET);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXPLAIN || _la==SELECT || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (IDENTIFIER - 187)) | (1L << (STRING_LITERAL - 187)) | (1L << (LR_BRACKET - 187)))) != 0)) {
					{
					setState(397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(387);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
						case STRING_LITERAL:
						case LR_BRACKET:
							{
							setState(385);
							table_reference();
							}
							break;
						case EXPLAIN:
						case SELECT:
							{
							setState(386);
							select_stmt();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(393);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(389);
							match(COMMA);
							setState(390);
							table_reference();
							}
							}
							setState(395);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(396);
						joined_clause();
						}
						break;
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				match(RR_BRACKET);
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(403);
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
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(408);
				match(AS);
				}
			}

			setState(411);
			table_alias();
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(412);
				match(LR_BRACKET);
				setState(413);
				column_name();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(414);
					match(COMMA);
					setState(415);
					column_name();
					}
					}
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(421);
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
			setState(425);
			table_reference();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << JOIN) | (1L << NATURAL))) != 0) || _la==LEFT || _la==RIGHT || _la==COMMA) {
				{
				{
				setState(426);
				join_operator();
				setState(427);
				table_reference();
				setState(428);
				join_constraint();
				}
				}
				setState(434);
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
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
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
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(436);
					match(NATURAL);
					}
				}

				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FULL || _la==LEFT || _la==RIGHT) {
					{
					setState(439);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CROSS) | (1L << INNER) | (1L << OUTER))) != 0)) {
						{
						setState(440);
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

				setState(445);
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
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(448);
				match(ON);
				setState(449);
				expr(0);
				}
				break;
			case USING:
				{
				setState(450);
				match(USING);
				setState(451);
				match(LR_BRACKET);
				setState(452);
				column_name();
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(453);
					match(COMMA);
					setState(454);
					column_name();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(460);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(WHERE);
			setState(465);
			expr(0);
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
		enterRule(_localctx, 30, RULE_group_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(GROUP);
			setState(468);
			match(BY);
			setState(469);
			expr(0);
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(470);
					match(COMMA);
					setState(471);
					expr(0);
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(477);
				match(HAVING);
				setState(478);
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
		enterRule(_localctx, 32, RULE_order_by_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(ORDER);
			setState(482);
			match(BY);
			setState(483);
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
		enterRule(_localctx, 34, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(LIMIT);
			setState(486);
			match(NUMERIC_LITERAL);
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(487);
				match(COMMA);
				setState(488);
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
		enterRule(_localctx, 36, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
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
		enterRule(_localctx, 38, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
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
		enterRule(_localctx, 40, RULE_domain_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(495);
					database_name();
					setState(496);
					match(DOT);
					}
					break;
				}
				setState(500);
				table_name();
				setState(501);
				match(DOT);
				}
				break;
			}
			setState(505);
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
		enterRule(_localctx, 42, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(507);
				database_name();
				setState(508);
				match(DOT);
				}
				break;
			}
			setState(512);
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
		enterRule(_localctx, 44, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		enterRule(_localctx, 46, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		enterRule(_localctx, 48, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		enterRule(_localctx, 50, RULE_any_name);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(STRING_LITERAL);
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				match(LR_BRACKET);
				setState(523);
				any_name();
				setState(524);
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
		enterRule(_localctx, 52, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		enterRule(_localctx, 54, RULE_type_name);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case STRING_LITERAL:
			case LR_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
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
				setState(531);
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
		enterRule(_localctx, 56, RULE_type_classify);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case CHARACTER:
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				character_string_type();
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
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
				setState(536);
				numeric_type();
				}
				break;
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 4);
				{
				setState(537);
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
		enterRule(_localctx, 58, RULE_character_string_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case CHARACTER:
				{
				setState(540);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(541);
					match(VARYING);
					}
				}

				}
				break;
			case VARCHAR:
				{
				setState(544);
				match(VARCHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(547);
			match(LR_BRACKET);
			setState(548);
			length();
			setState(549);
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
		enterRule(_localctx, 60, RULE_bit_string_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(BIT);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARYING) {
				{
				setState(552);
				match(VARYING);
				}
			}

			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(555);
				match(LR_BRACKET);
				setState(556);
				length();
				setState(557);
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
		enterRule(_localctx, 62, RULE_numeric_type);
		try {
			setState(563);
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
				setState(561);
				exact_numeric_type();
				}
				break;
			case DOUBLE:
			case FLOAT:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
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
		enterRule(_localctx, 64, RULE_exact_numeric_type);
		int _la;
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC:
			case DECIMAL:
			case NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(565);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEC) | (1L << DECIMAL) | (1L << NUMERIC))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(566);
					match(LR_BRACKET);
					setState(567);
					precision();
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(568);
						match(COMMA);
						setState(569);
						scala();
						}
					}

					setState(572);
					match(RR_BRACKET);
					}
				}

				}
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(INTEGER);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				match(INT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
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
		enterRule(_localctx, 66, RULE_approximate_numeric_type);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(FLOAT);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(582);
					match(LR_BRACKET);
					setState(583);
					precision();
					setState(584);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(REAL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				match(DOUBLE);
				setState(590);
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
		enterRule(_localctx, 68, RULE_datetime_type);
		int _la;
		try {
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(DATE);
				}
				break;
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIME:
					{
					setState(594);
					match(TIME);
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LR_BRACKET) {
						{
						setState(595);
						match(LR_BRACKET);
						setState(596);
						time_precision();
						setState(597);
						match(RR_BRACKET);
						}
					}

					}
					break;
				case TIMESTAMP:
					{
					setState(601);
					match(TIMESTAMP);
					setState(606);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LR_BRACKET) {
						{
						setState(602);
						match(LR_BRACKET);
						setState(603);
						timestamp_precision();
						setState(604);
						match(RR_BRACKET);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(610);
					match(WITH);
					setState(611);
					match(TIME);
					setState(612);
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
		enterRule(_localctx, 70, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
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
		enterRule(_localctx, 72, RULE_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
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
		enterRule(_localctx, 74, RULE_scala);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
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
		enterRule(_localctx, 76, RULE_time_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
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
		enterRule(_localctx, 78, RULE_timestamp_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
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
		enterRule(_localctx, 80, RULE_time_fractional_seconds_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
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
		enterRule(_localctx, 82, RULE_origin_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
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
		enterRule(_localctx, 84, RULE_udf_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00cd\u027c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\5\2[\n\2\3\3\7\3^\n\3\f\3\16\3a\13\3\3\3\3\3\6\3e\n\3\r\3"+
		"\16\3f\3\3\7\3j\n\3\f\3\16\3m\13\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\4\3\4"+
		"\3\4\3\5\5\5y\n\5\3\5\3\5\5\5}\n\5\3\5\3\5\5\5\u0081\n\5\3\5\5\5\u0084"+
		"\n\5\3\5\5\5\u0087\n\5\3\5\5\5\u008a\n\5\3\5\5\5\u008d\n\5\3\6\3\6\3\7"+
		"\3\7\3\7\7\7\u0094\n\7\f\7\16\7\u0097\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u009f\n\b\3\t\3\t\3\t\3\t\5\t\u00a5\n\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\t"+
		"\3\t\5\t\u00ae\n\t\3\t\5\t\u00b1\n\t\3\t\3\t\3\t\5\t\u00b6\n\t\3\t\5\t"+
		"\u00b9\n\t\3\t\3\t\3\t\5\t\u00be\n\t\3\t\3\t\3\t\7\t\u00c3\n\t\f\t\16"+
		"\t\u00c6\13\t\3\t\5\t\u00c9\n\t\3\t\3\t\5\t\u00cd\n\t\3\t\5\t\u00d0\n"+
		"\t\3\t\3\t\3\t\5\t\u00d5\n\t\3\t\3\t\3\t\7\t\u00da\n\t\f\t\16\t\u00dd"+
		"\13\t\3\t\5\t\u00e0\n\t\3\t\3\t\5\t\u00e4\n\t\3\t\5\t\u00e7\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00ed\n\t\3\t\5\t\u00f0\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00f9\n\t\3\t\5\t\u00fc\n\t\3\t\5\t\u00ff\n\t\3\t\5\t\u0102\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0108\n\t\3\t\5\t\u010b\n\t\3\t\3\t\5\t\u010f\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\6\t\u0116\n\t\r\t\16\t\u0117\3\t\3\t\5\t\u011c\n\t"+
		"\3\t\3\t\5\t\u0120\n\t\3\t\5\t\u0123\n\t\5\t\u0125\n\t\3\t\3\t\3\t\3\t"+
		"\5\t\u012b\n\t\3\t\5\t\u012e\n\t\3\t\3\t\3\t\3\t\5\t\u0134\n\t\3\t\5\t"+
		"\u0137\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u013e\n\t\3\t\5\t\u0141\n\t\3\t\3\t"+
		"\5\t\u0145\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u014c\n\t\3\t\5\t\u014f\n\t\3\t"+
		"\3\t\5\t\u0153\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u015b\n\t\f\t\16\t\u015e"+
		"\13\t\5\t\u0160\n\t\3\t\3\t\3\t\3\t\5\t\u0166\n\t\3\t\5\t\u0169\n\t\3"+
		"\t\5\t\u016c\n\t\3\t\5\t\u016f\n\t\7\t\u0171\n\t\f\t\16\t\u0174\13\t\3"+
		"\n\3\n\3\n\3\n\7\n\u017a\n\n\f\n\16\n\u017d\13\n\3\13\3\13\5\13\u0181"+
		"\n\13\3\13\3\13\3\13\5\13\u0186\n\13\3\13\3\13\7\13\u018a\n\13\f\13\16"+
		"\13\u018d\13\13\3\13\7\13\u0190\n\13\f\13\16\13\u0193\13\13\3\13\3\13"+
		"\5\13\u0197\n\13\5\13\u0199\n\13\3\f\5\f\u019c\n\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u01a3\n\f\f\f\16\f\u01a6\13\f\3\f\3\f\5\f\u01aa\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u01b1\n\r\f\r\16\r\u01b4\13\r\3\16\3\16\5\16\u01b8\n\16\3\16"+
		"\3\16\5\16\u01bc\n\16\5\16\u01be\n\16\3\16\5\16\u01c1\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u01ca\n\17\f\17\16\17\u01cd\13\17\3\17\3"+
		"\17\5\17\u01d1\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u01db"+
		"\n\21\f\21\16\21\u01de\13\21\3\21\3\21\5\21\u01e2\n\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\5\23\u01ec\n\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u01f5\n\26\3\26\3\26\3\26\5\26\u01fa\n\26\3\26\3\26\3\27\3"+
		"\27\3\27\5\27\u0201\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0211\n\33\3\34\3\34\3\35\3\35\5\35\u0217"+
		"\n\35\3\36\3\36\3\36\3\36\5\36\u021d\n\36\3\37\3\37\5\37\u0221\n\37\3"+
		"\37\5\37\u0224\n\37\3\37\3\37\3\37\3\37\3 \3 \5 \u022c\n \3 \3 \3 \3 "+
		"\5 \u0232\n \3!\3!\5!\u0236\n!\3\"\3\"\3\"\3\"\3\"\5\"\u023d\n\"\3\"\3"+
		"\"\5\"\u0241\n\"\3\"\3\"\3\"\5\"\u0246\n\"\3#\3#\3#\3#\3#\5#\u024d\n#"+
		"\3#\3#\3#\5#\u0252\n#\3$\3$\3$\3$\3$\3$\5$\u025a\n$\3$\3$\3$\3$\3$\5$"+
		"\u0261\n$\5$\u0263\n$\3$\3$\3$\5$\u0268\n$\5$\u026a\n$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\2\3\20-\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\16\4\2\30\30//"+
		"\4\2\6\6\23\23\3\2@F\4\29<>?\5\2\32\32SS\\\\\5\2\20\20\37\37,,\5\2&&<"+
		"<>>\3\2\u00bd\u00be\5\2%%\u008d\u008f\u00be\u00bf\3\2\16\17\4\2\21\22"+
		"\'\'\3\2H\u00bc\2\u02cb\2Z\3\2\2\2\4_\3\2\2\2\6t\3\2\2\2\bx\3\2\2\2\n"+
		"\u008e\3\2\2\2\f\u0090\3\2\2\2\16\u009e\3\2\2\2\20\u0124\3\2\2\2\22\u0175"+
		"\3\2\2\2\24\u0198\3\2\2\2\26\u019b\3\2\2\2\30\u01ab\3\2\2\2\32\u01c0\3"+
		"\2\2\2\34\u01d0\3\2\2\2\36\u01d2\3\2\2\2 \u01d5\3\2\2\2\"\u01e3\3\2\2"+
		"\2$\u01e7\3\2\2\2&\u01ed\3\2\2\2(\u01ef\3\2\2\2*\u01f9\3\2\2\2,\u0200"+
		"\3\2\2\2.\u0204\3\2\2\2\60\u0206\3\2\2\2\62\u0208\3\2\2\2\64\u0210\3\2"+
		"\2\2\66\u0212\3\2\2\28\u0216\3\2\2\2:\u021c\3\2\2\2<\u0223\3\2\2\2>\u0229"+
		"\3\2\2\2@\u0235\3\2\2\2B\u0245\3\2\2\2D\u0251\3\2\2\2F\u0269\3\2\2\2H"+
		"\u026b\3\2\2\2J\u026d\3\2\2\2L\u026f\3\2\2\2N\u0271\3\2\2\2P\u0273\3\2"+
		"\2\2R\u0275\3\2\2\2T\u0277\3\2\2\2V\u0279\3\2\2\2X[\5\4\3\2Y[\5\6\4\2"+
		"ZX\3\2\2\2ZY\3\2\2\2[\3\3\2\2\2\\^\7\u00c4\2\2]\\\3\2\2\2^a\3\2\2\2_]"+
		"\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bk\5\b\5\2ce\7\u00c4\2\2dc\3\2\2"+
		"\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hj\5\b\5\2id\3\2\2\2jm\3\2\2"+
		"\2ki\3\2\2\2kl\3\2\2\2lq\3\2\2\2mk\3\2\2\2np\7\u00c4\2\2on\3\2\2\2ps\3"+
		"\2\2\2qo\3\2\2\2qr\3\2\2\2r\5\3\2\2\2sq\3\2\2\2tu\n\2\2\2uv\b\4\1\2v\7"+
		"\3\2\2\2wy\7\30\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7/\2\2{}\5\n\6\2|"+
		"{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\5\f\7\2\177\u0081\5\22\n\2\u0080"+
		"\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5\36"+
		"\20\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0087\5 \21\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u008a\5\"\22\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u008d\5$\23\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\t\3\2\2\2\u008e\u008f\t\3\2\2\u008f\13\3\2\2\2\u0090\u0095"+
		"\5\16\b\2\u0091\u0092\7\u00c3\2\2\u0092\u0094\5\16\b\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\r\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009f\79\2\2\u0099\u009a\5,\27\2"+
		"\u009a\u009b\7\u00c0\2\2\u009b\u009c\79\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009f\5\20\t\2\u009e\u0098\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009d\3"+
		"\2\2\2\u009f\17\3\2\2\2\u00a0\u00a9\b\t\1\2\u00a1\u00a2\5\60\31\2\u00a2"+
		"\u00a3\7\u00c0\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5,\27\2\u00a7\u00a8\7\u00c0\2"+
		"\2\u00a8\u00aa\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00b0\5.\30\2\u00ac\u00ae\7\b\2\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\5(\25\2\u00b0\u00ad\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u0125\3\2\2\2\u00b2\u00b3\5&\24\2\u00b3"+
		"\u00b8\5\20\t\2\u00b4\u00b6\7\b\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\5(\25\2\u00b8\u00b5\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u0125\3\2\2\2\u00ba\u00bb\5T+\2\u00bb\u00c8\7\u00c1"+
		"\2\2\u00bc\u00be\7\23\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c4\5\20\t\2\u00c0\u00c1\7\u00c3\2\2\u00c1\u00c3"+
		"\5\20\t\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9"+
		"\79\2\2\u00c8\u00bd\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cf\7\u00c2\2\2\u00cb\u00cd\7\b\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\5(\25\2\u00cf"+
		"\u00cc\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u0125\3\2\2\2\u00d1\u00d2\5V"+
		",\2\u00d2\u00df\7\u00c1\2\2\u00d3\u00d5\7\23\2\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00db\5\20\t\2\u00d7\u00d8\7"+
		"\u00c3\2\2\u00d8\u00da\5\20\t\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2"+
		"\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00e0\79\2\2\u00df\u00d4\3\2\2\2\u00df\u00de\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e6\7\u00c2\2\2\u00e2\u00e4"+
		"\7\b\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\5(\25\2\u00e6\u00e3\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u0125\3\2"+
		"\2\2\u00e8\u00e9\7\u00c1\2\2\u00e9\u00ea\5\20\t\2\u00ea\u00ef\7\u00c2"+
		"\2\2\u00eb\u00ed\7\b\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\5(\25\2\u00ef\u00ec\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u0125\3\2\2\2\u00f1\u00f2\7\r\2\2\u00f2\u00f3\7\u00c1\2\2\u00f3"+
		"\u00f4\5\20\t\2\u00f4\u00f5\7\b\2\2\u00f5\u00f6\58\35\2\u00f6\u00fb\7"+
		"\u00c2\2\2\u00f7\u00f9\7\b\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00fc\5(\25\2\u00fb\u00f8\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u0125\3\2\2\2\u00fd\u00ff\7&\2\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\7\27\2\2\u0101\u00fe\3"+
		"\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7\u00c1\2\2"+
		"\u0104\u0105\5\b\5\2\u0105\u010a\7\u00c2\2\2\u0106\u0108\7\b\2\2\u0107"+
		"\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\5("+
		"\25\2\u010a\u0107\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0125\3\2\2\2\u010c"+
		"\u010e\7\f\2\2\u010d\u010f\5\20\t\2\u010e\u010d\3\2\2\2\u010e\u010f\3"+
		"\2\2\2\u010f\u0115\3\2\2\2\u0110\u0111\7\65\2\2\u0111\u0112\5\20\t\2\u0112"+
		"\u0113\7\61\2\2\u0113\u0114\5\20\t\2\u0114\u0116\3\2\2\2\u0115\u0110\3"+
		"\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u011a\7\25\2\2\u011a\u011c\5\20\t\2\u011b\u0119\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0122\7\26\2\2\u011e"+
		"\u0120\7\b\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\5(\25\2\u0122\u011f\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0125\3\2\2\2\u0124\u00a0\3\2\2\2\u0124\u00b2\3\2\2\2\u0124\u00ba\3\2"+
		"\2\2\u0124\u00d1\3\2\2\2\u0124\u00e8\3\2\2\2\u0124\u00f1\3\2\2\2\u0124"+
		"\u0101\3\2\2\2\u0124\u010c\3\2\2\2\u0125\u0172\3\2\2\2\u0126\u0127\f\r"+
		"\2\2\u0127\u0128\t\4\2\2\u0128\u012d\5\20\t\2\u0129\u012b\7\b\2\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\5("+
		"\25\2\u012d\u012a\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0171\3\2\2\2\u012f"+
		"\u0130\f\f\2\2\u0130\u0131\t\5\2\2\u0131\u0136\5\20\t\2\u0132\u0134\7"+
		"\b\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0137\5(\25\2\u0136\u0133\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0171\3\2"+
		"\2\2\u0138\u0139\f\7\2\2\u0139\u013a\7\"\2\2\u013a\u013b\7&\2\2\u013b"+
		"\u0140\5\20\t\2\u013c\u013e\7\b\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\5(\25\2\u0140\u013d\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0171\3\2\2\2\u0142\u0144\f\6\2\2\u0143\u0145\7&"+
		"\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\7\t\2\2\u0147\u0148\5\20\t\2\u0148\u0149\7\7\2\2\u0149\u014e\5"+
		"\20\t\2\u014a\u014c\7\b\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014f\5(\25\2\u014e\u014b\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0171\3\2\2\2\u0150\u0152\f\5\2\2\u0151\u0153\7&\2\2\u0152"+
		"\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0168\7\36"+
		"\2\2\u0155\u015f\7\u00c1\2\2\u0156\u0160\5\b\5\2\u0157\u015c\5\20\t\2"+
		"\u0158\u0159\7\u00c3\2\2\u0159\u015b\5\20\t\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0160\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u0157\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0169\7\u00c2\2\2\u0162\u0163"+
		"\5\60\31\2\u0163\u0164\7\u00c0\2\2\u0164\u0166\3\2\2\2\u0165\u0162\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\5,\27\2\u0168"+
		"\u0155\3\2\2\2\u0168\u0165\3\2\2\2\u0169\u016e\3\2\2\2\u016a\u016c\7\b"+
		"\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016f\5(\25\2\u016e\u016b\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2"+
		"\2\2\u0170\u0126\3\2\2\2\u0170\u012f\3\2\2\2\u0170\u0138\3\2\2\2\u0170"+
		"\u0142\3\2\2\2\u0170\u0150\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\21\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176"+
		"\7\31\2\2\u0176\u017b\5\24\13\2\u0177\u0178\7\u00c3\2\2\u0178\u017a\5"+
		"\24\13\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\23\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\5,\27"+
		"\2\u017f\u0181\5\26\f\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0199\3\2\2\2\u0182\u0191\7\u00c1\2\2\u0183\u0186\5\24\13\2\u0184\u0186"+
		"\5\b\5\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u018b\3\2\2\2\u0187"+
		"\u0188\7\u00c3\2\2\u0188\u018a\5\24\13\2\u0189\u0187\3\2\2\2\u018a\u018d"+
		"\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0190\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018e\u0190\5\30\r\2\u018f\u0185\3\2\2\2\u018f\u018e\3"+
		"\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0196\7\u00c2\2\2\u0195\u0197"+
		"\5\26\f\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2"+
		"\u0198\u017e\3\2\2\2\u0198\u0182\3\2\2\2\u0199\25\3\2\2\2\u019a\u019c"+
		"\7\b\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u01a9\5\62\32\2\u019e\u019f\7\u00c1\2\2\u019f\u01a4\5.\30\2\u01a0\u01a1"+
		"\7\u00c3\2\2\u01a1\u01a3\5.\30\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3\2\2"+
		"\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a7\u01a8\7\u00c2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u019e\3\2\2"+
		"\2\u01a9\u01aa\3\2\2\2\u01aa\27\3\2\2\2\u01ab\u01b2\5\24\13\2\u01ac\u01ad"+
		"\5\32\16\2\u01ad\u01ae\5\24\13\2\u01ae\u01af\5\34\17\2\u01af\u01b1\3\2"+
		"\2\2\u01b0\u01ac\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\31\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01c1\7\u00c3"+
		"\2\2\u01b6\u01b8\7$\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01bd\3\2\2\2\u01b9\u01bb\t\6\2\2\u01ba\u01bc\t\7\2\2\u01bb\u01ba\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\7\35\2\2\u01c0\u01b5\3"+
		"\2\2\2\u01c0\u01b7\3\2\2\2\u01c1\33\3\2\2\2\u01c2\u01c3\7)\2\2\u01c3\u01d1"+
		"\5\20\t\2\u01c4\u01c5\7\62\2\2\u01c5\u01c6\7\u00c1\2\2\u01c6\u01cb\5."+
		"\30\2\u01c7\u01c8\7\u00c3\2\2\u01c8\u01ca\5.\30\2\u01c9\u01c7\3\2\2\2"+
		"\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce"+
		"\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\7\u00c2\2\2\u01cf\u01d1\3\2\2"+
		"\2\u01d0\u01c2\3\2\2\2\u01d0\u01c4\3\2\2\2\u01d1\35\3\2\2\2\u01d2\u01d3"+
		"\7\66\2\2\u01d3\u01d4\5\20\t\2\u01d4\37\3\2\2\2\u01d5\u01d6\7(\2\2\u01d6"+
		"\u01d7\7\13\2\2\u01d7\u01dc\5\20\t\2\u01d8\u01d9\7\u00c3\2\2\u01d9\u01db"+
		"\5\20\t\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2"+
		"\u01dc\u01dd\3\2\2\2\u01dd\u01e1\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0"+
		"\7\34\2\2\u01e0\u01e2\5\20\t\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2"+
		"\u01e2!\3\2\2\2\u01e3\u01e4\7+\2\2\u01e4\u01e5\7\13\2\2\u01e5\u01e6\5"+
		"*\26\2\u01e6#\3\2\2\2\u01e7\u01e8\7#\2\2\u01e8\u01eb\7\u00bf\2\2\u01e9"+
		"\u01ea\7\u00c3\2\2\u01ea\u01ec\7\u00bf\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec%\3\2\2\2\u01ed\u01ee\t\b\2\2\u01ee\'\3\2\2\2\u01ef\u01f0"+
		"\t\t\2\2\u01f0)\3\2\2\2\u01f1\u01f2\5\60\31\2\u01f2\u01f3\7\u00c0\2\2"+
		"\u01f3\u01f5\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f7\5,\27\2\u01f7\u01f8\7\u00c0\2\2\u01f8\u01fa\3\2\2"+
		"\2\u01f9\u01f4\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc"+
		"\5.\30\2\u01fc+\3\2\2\2\u01fd\u01fe\5\60\31\2\u01fe\u01ff\7\u00c0\2\2"+
		"\u01ff\u0201\3\2\2\2\u0200\u01fd\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u0203\5\64\33\2\u0203-\3\2\2\2\u0204\u0205\5\64\33\2\u0205"+
		"/\3\2\2\2\u0206\u0207\5\64\33\2\u0207\61\3\2\2\2\u0208\u0209\5\64\33\2"+
		"\u0209\63\3\2\2\2\u020a\u0211\7\u00bd\2\2\u020b\u0211\7\u00be\2\2\u020c"+
		"\u020d\7\u00c1\2\2\u020d\u020e\5\64\33\2\u020e\u020f\7\u00c2\2\2\u020f"+
		"\u0211\3\2\2\2\u0210\u020a\3\2\2\2\u0210\u020b\3\2\2\2\u0210\u020c\3\2"+
		"\2\2\u0211\65\3\2\2\2\u0212\u0213\t\n\2\2\u0213\67\3\2\2\2\u0214\u0217"+
		"\5*\26\2\u0215\u0217\5:\36\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217"+
		"9\3\2\2\2\u0218\u021d\5<\37\2\u0219\u021d\5> \2\u021a\u021d\5@!\2\u021b"+
		"\u021d\5F$\2\u021c\u0218\3\2\2\2\u021c\u0219\3\2\2\2\u021c\u021a\3\2\2"+
		"\2\u021c\u021b\3\2\2\2\u021d;\3\2\2\2\u021e\u0220\t\13\2\2\u021f\u0221"+
		"\7\64\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0224\3\2\2\2"+
		"\u0222\u0224\7\63\2\2\u0223\u021e\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0226\7\u00c1\2\2\u0226\u0227\5H%\2\u0227\u0228\7\u00c2"+
		"\2\2\u0228=\3\2\2\2\u0229\u022b\7\n\2\2\u022a\u022c\7\64\2\2\u022b\u022a"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u0231\3\2\2\2\u022d\u022e\7\u00c1\2"+
		"\2\u022e\u022f\5H%\2\u022f\u0230\7\u00c2\2\2\u0230\u0232\3\2\2\2\u0231"+
		"\u022d\3\2\2\2\u0231\u0232\3\2\2\2\u0232?\3\2\2\2\u0233\u0236\5B\"\2\u0234"+
		"\u0236\5D#\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236A\3\2\2\2\u0237"+
		"\u0240\t\f\2\2\u0238\u0239\7\u00c1\2\2\u0239\u023c\5J&\2\u023a\u023b\7"+
		"\u00c3\2\2\u023b\u023d\5L\'\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2"+
		"\u023d\u023e\3\2\2\2\u023e\u023f\7\u00c2\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u0238\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0246\3\2\2\2\u0242\u0246\7!"+
		"\2\2\u0243\u0246\7 \2\2\u0244\u0246\7\60\2\2\u0245\u0237\3\2\2\2\u0245"+
		"\u0242\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0246C\3\2\2\2"+
		"\u0247\u024c\7\33\2\2\u0248\u0249\7\u00c1\2\2\u0249\u024a\5J&\2\u024a"+
		"\u024b\7\u00c2\2\2\u024b\u024d\3\2\2\2\u024c\u0248\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u0252\3\2\2\2\u024e\u0252\7.\2\2\u024f\u0250\7\24\2\2\u0250"+
		"\u0252\7-\2\2\u0251\u0247\3\2\2\2\u0251\u024e\3\2\2\2\u0251\u024f\3\2"+
		"\2\2\u0252E\3\2\2\2\u0253\u026a\7\u0091\2\2\u0254\u0259\7\u00b1\2\2\u0255"+
		"\u0256\7\u00c1\2\2\u0256\u0257\5N(\2\u0257\u0258\7\u00c2\2\2\u0258\u025a"+
		"\3\2\2\2\u0259\u0255\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u0263\3\2\2\2\u025b"+
		"\u0260\7\u00b5\2\2\u025c\u025d\7\u00c1\2\2\u025d\u025e\5P)\2\u025e\u025f"+
		"\7\u00c2\2\2\u025f\u0261\3\2\2\2\u0260\u025c\3\2\2\2\u0260\u0261\3\2\2"+
		"\2\u0261\u0263\3\2\2\2\u0262\u0254\3\2\2\2\u0262\u025b\3\2\2\2\u0263\u0267"+
		"\3\2\2\2\u0264\u0265\7\67\2\2\u0265\u0266\7\u00b1\2\2\u0266\u0268\78\2"+
		"\2\u0267\u0264\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u0253"+
		"\3\2\2\2\u0269\u0262\3\2\2\2\u026aG\3\2\2\2\u026b\u026c\7\u00bf\2\2\u026c"+
		"I\3\2\2\2\u026d\u026e\7\u00bf\2\2\u026eK\3\2\2\2\u026f\u0270\7\u00bf\2"+
		"\2\u0270M\3\2\2\2\u0271\u0272\5R*\2\u0272O\3\2\2\2\u0273\u0274\5R*\2\u0274"+
		"Q\3\2\2\2\u0275\u0276\7\u00bf\2\2\u0276S\3\2\2\2\u0277\u0278\t\r\2\2\u0278"+
		"U\3\2\2\2\u0279\u027a\5\64\33\2\u027aW\3\2\2\2jZ_fkqx|\u0080\u0083\u0086"+
		"\u0089\u008c\u0095\u009e\u00a4\u00a9\u00ad\u00b0\u00b5\u00b8\u00bd\u00c4"+
		"\u00c8\u00cc\u00cf\u00d4\u00db\u00df\u00e3\u00e6\u00ec\u00ef\u00f8\u00fb"+
		"\u00fe\u0101\u0107\u010a\u010e\u0117\u011b\u011f\u0122\u0124\u012a\u012d"+
		"\u0133\u0136\u013d\u0140\u0144\u014b\u014e\u0152\u015c\u015f\u0165\u0168"+
		"\u016b\u016e\u0170\u0172\u017b\u0180\u0185\u018b\u018f\u0191\u0196\u0198"+
		"\u019b\u01a4\u01a9\u01b2\u01b7\u01bb\u01bd\u01c0\u01cb\u01d0\u01dc\u01e1"+
		"\u01eb\u01f4\u01f9\u0200\u0210\u0216\u021c\u0220\u0223\u022b\u0231\u0235"+
		"\u023c\u0240\u0245\u024c\u0251\u0259\u0260\u0262\u0267\u0269";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}