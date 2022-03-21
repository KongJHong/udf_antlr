package com.hong.udf.dfa;

import com.hong.udf.antlr.SqlParser;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description     :
 */
@Data
@Accessors
@NoArgsConstructor
public class DFA {

	private SqlParser.ExprContext self;
	private List<SqlParser.ExprContext> args;
	private List<SqlParser.ColumnNameExprContext> columns = new ArrayList<>();

	private boolean isAll = false;

	public DFA(SqlParser.ExprContext ctx) {
		if (isColumn(ctx)) throw new RuntimeException("禁止常量作为dfa对象");

		this.self = ctx;
		List<SqlParser.ExprContext> exprs;

		if (isUdf(ctx)) {
			exprs = ((SqlParser.UdfFunctionExprContext) ctx).expr();
			this.isAll = ((SqlParser.UdfFunctionExprContext) ctx).STAR() != null;
		} else if (isBinaryF(ctx)) exprs = ((SqlParser.BinaryExprContext) ctx).expr();
		else exprs = ((SqlParser.BinaryExprContext) ctx).expr();

		this.args = exprs;
		for (SqlParser.ExprContext e : exprs) {
			if (isColumn(e)) {
				this.columns.add((SqlParser.ColumnNameExprContext) e);

			}
		}
	}

	private boolean isColumn(SqlParser.ExprContext ctx) {
		return ctx instanceof SqlParser.ColumnNameExprContext;
	}

	private boolean isUdf(SqlParser.ExprContext ctx) {
		return ctx instanceof SqlParser.UdfFunctionExprContext;
	}

	private boolean isBinaryF(SqlParser.ExprContext ctx) {
		return ctx instanceof SqlParser.BinaryExprContext;
	}


	@Override
	public String toString() {
		return "DFA{" +
				"self=" + self.getText() +
				", args=[" + args.stream().map(RuleContext::getText).collect(Collectors.joining(",")) +
				"], columns=[" + columns.stream().map(RuleContext::getText).collect(Collectors.joining(",")) +
				"], isAll=" + isAll +
				'}';
	}
}
