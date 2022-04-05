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

	private Set<String> elements = new LinkedHashSet<>();

	private ResultEntryHandler resultHandler = new ResultEntryHandler();


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

		for (ParseTree node : children) {
			// TODO 迟早要改
			if (node instanceof SqlParser.Element_clauseContext) {
				sb.append(String.join(",", elements)).append(" ");
				continue;
			}

			ClauseHandler handler = executeMap.get(node.getClass());
			if (handler != null) sb.append(handler.handle(node)).append(" ");
		}


		finalSql = sb.toString();

	}

	@Override
	public void exitElement(SqlParser.ElementContext ctx) {

		resultHandler.add(handleRealEntry(ctx));

		if (ctx.expr() != null && ctx.expr() instanceof SqlParser.BinaryExprContext) {
			SqlParser.BinaryExprContext binaryCtx = (SqlParser.BinaryExprContext) ctx.expr();
			for (ParseTree node : binaryCtx.children) {
				if (node instanceof SqlParser.UdfFunctionExprContext) return;
			}
			elements.add(handleAlias(ctx));
			return;
		}


		if (ctx.expr() != null && ctx.expr() instanceof SqlParser.UdfFunctionExprContext) {
			final List<SqlParser.ExprContext> expr = ((SqlParser.UdfFunctionExprContext) ctx.expr()).expr();
			for (SqlParser.ExprContext e:expr) {
				if (e instanceof SqlParser.OriginFunctionExprContext)elements.add(e.getText());
			}
			return;
		}


		if (ctx.expr() != null && !(ctx.expr() instanceof SqlParser.UdfFunctionExprContext)) {
			elements.add(handleAlias(ctx));
			return;
		}


	}

	@Override
	public void enterUdfFunctionExpr(SqlParser.UdfFunctionExprContext ctx) {
		manager.input(ctx);
	}


	@Override
	public void exitColumnNameExpr(SqlParser.ColumnNameExprContext ctx) {
		if (ctx.getParent() instanceof SqlParser.OriginFunctionExprContext) return;
		elements.add(ctx.getText());
	}


	private String handleAlias(SqlParser.ElementContext ctx) {
		if (ctx.column_alias() != null) {
			String text = ctx.getText();
			int end = text.length();
			if (ctx.AS() != null) end = (end - ctx.AS().getText().length());
			text = text.substring(0, end - ctx.column_alias().getText().length());
			return text + " AS " + ctx.column_alias().getText();
		} else {
			return ctx.getText();
		}
	}

	private ResultEntry handleRealEntry(SqlParser.ElementContext ctx) {
		ResultEntry entry = new ResultEntry();
		if (ctx.column_alias() != null) entry.setAlias(ctx.column_alias().getText());

		if (ctx.expr() != null) {
			entry.setReal(ctx.expr().getText());
			if (ctx.AS() != null)entry.setAlias(ctx.column_alias().getText());
			//TODO 还有一个dfaManager
//			entry.setDfaManager(manager);
//			if (ctx.expr() instanceof SqlParser.UdfFunctionExprContext) {
//				entry.setHasUdf(true);
//			}
//
			if (ctx.expr() instanceof SqlParser.BinaryExprContext) {
				final List<ParseTree> children = ctx.expr().children;
				for (ParseTree node : children) {
					if (node instanceof SqlParser.UdfFunctionExprContext) {
						entry.setDfaManager(manager);
						break;
					}
				}
			}

			if (ctx.expr() instanceof SqlParser.UdfFunctionExprContext) {
				entry.setDfaManager(manager);
			}
		}

		return entry;
	}
}
