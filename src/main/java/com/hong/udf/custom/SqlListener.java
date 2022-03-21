package com.hong.udf.custom;

import com.hong.udf.antlr.SqlParser;
import com.hong.udf.antlr.SqlParserBaseListener;
import com.hong.udf.dfa.DFAManager;
import com.hong.udf.handler.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * Description     :
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SqlListener extends SqlParserBaseListener {

	private DFAManager manager = new DFAManager();

	private String finalSql;

	private Map<String, String> paramsMap = new HashMap<>();

	private Set<String> elements = new LinkedHashSet<>();


	private static Map<Class<?>, ClauseHandler> executeMap = new HashMap<>();

	static {
		executeMap.put(SqlParser.From_clauseContext.class, new FromClauseHandler());
		executeMap.put(SqlParser.Set_qualifierContext.class, new QualifierClauseHandler());
		executeMap.put(SqlParser.Where_clauseContext.class, new WhereClauseHandler());
		executeMap.put(SqlParser.Limit_clauseContext.class, new LimitClauseHandler());
	}


	@Override
	public void exitSelect_stmt(SqlParser.Select_stmtContext ctx) {

		List<ParseTree> children = ctx.children;
		StringBuilder sb = new StringBuilder();

		if (ctx.EXPLAIN() != null) {
			sb.append(ctx.EXPLAIN().getText()).append(" ");
		}

		sb.append(ctx.SELECT().getText()).append(" ");


		for (ParseTree node: children) {
			if (node instanceof SqlParser.Element_clauseContext) {
				sb.append(String.join(",",elements)).append(" ");
				continue;
			}

			ClauseHandler handler = executeMap.get(node.getClass());
			if (handler != null)sb.append(handler.handle(node)).append(" ");
		}


		finalSql = sb.toString();

	}

	@Override
	public void enterElement_clause(SqlParser.Element_clauseContext ctx) {
		final List<ParseTree> children = ctx.children;
		int pNum = 0;
		for (ParseTree node : children) {
			if (node instanceof SqlParser.ElementContext) {
				paramsMap.put("p" + pNum, node.getText());
				pNum++;
			}

		}
	}

	@Override
	public void enterUdfFunctionExpr(SqlParser.UdfFunctionExprContext ctx) {
		manager.input(ctx);
	}

	@Override
	public void exitOriginFunctionExpr(SqlParser.OriginFunctionExprContext ctx) {
		if (ctx.column_alias() != null) {
			String text = ctx.getText();
			int end = text.length();
			if (ctx.AS() != null) end = (end - ctx.AS().getText().length());
			text = text.substring(0,end  - ctx.column_alias().getText().length());
			elements.add(text + " AS " + ctx.column_alias().getText());
		} else {
			elements.add(ctx.getText());
		}

	}

	@Override
	public void exitColumnNameExpr(SqlParser.ColumnNameExprContext ctx) {
		if (ctx.getParent() instanceof SqlParser.OriginFunctionExprContext)return;
		elements.add(ctx.getText());
	}





	/**
	 * 传进来的应该是一个UdfFunctionExprContext<br>
	 * 这里要编程ColumnNameContext
	 *
	 * @param ctx       UdfFunctionExprContext
	 * @param node
	 * @param tokenName
	 * @return
	 */
	private ParseTree createColumn(SqlParser.ExprContext ctx, ParseTree node, String tokenName) {
		/*
		 * ColumnNameContext->Column_nameContext->Any_nameContext
		 */
//		SqlParser.ExprContext


		return null;
	}
}
