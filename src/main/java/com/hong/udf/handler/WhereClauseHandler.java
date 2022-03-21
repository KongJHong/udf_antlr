package com.hong.udf.handler;

import com.hong.udf.antlr.SqlParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * Description     :
 */
public class WhereClauseHandler implements ClauseHandler {
	@Override
	public String handle(ParseTree node) {
		if (node instanceof SqlParser.Where_clauseContext) {
			StringBuilder sb = new StringBuilder();
			SqlParser.Where_clauseContext ctx = (SqlParser.Where_clauseContext) node;
			sb.append(ctx.WHERE().getText()).append(" ").append(ctx.expr().getText()).append(" ");

			if (CollectionUtils.isNotEmpty(ctx.where_link_semi())) {
				List<SqlParser.Where_link_semiContext> where_link_semiContexts = ctx.where_link_semi();
				for (SqlParser.Where_link_semiContext wCtx: where_link_semiContexts) {
					sb.append(wCtx.operation.getText()).append(" ").append(wCtx.expr().getText());
				}
			}

			return sb.toString();
		}
		return "";
	}
}
