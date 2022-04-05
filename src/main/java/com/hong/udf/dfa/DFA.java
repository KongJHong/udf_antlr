package com.hong.udf.dfa;

import com.hong.udf.antlr.SqlParser;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

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

	private SqlParser.UdfFunctionExprContext self;
	private List<SqlParser.ExprContext> args;  // 完整参数
	private List<ParseTree> columns = new ArrayList<>(); // 参数拆解

	private boolean isAll = false;

	public DFA(SqlParser.UdfFunctionExprContext ctx) {
		if (!isUDF(ctx)) throw new RuntimeException("禁止常量作为dfa对象");

		this.self = ctx;

		List<SqlParser.ExprContext> exprs = ctx.expr();

		this.isAll = ctx.STAR() != null;
		this.args = exprs;

		for (SqlParser.ExprContext expr: exprs) {
			if (isUDF(expr) || isORIGIN(expr)) {
				this.columns.add(expr);
				continue;
			}

			final List<ParseTree> children = expr.children;
			for (ParseTree e: children) {
				if (!isTerminal(e)) this.columns.add(e);
			}
		}
	}

	private boolean isTerminal(ParseTree parseTree) {
		return parseTree instanceof TerminalNode;
	}

	private boolean isUDF(SqlParser.ExprContext ctx) {
		return ctx instanceof SqlParser.UdfFunctionExprContext;
	}

	private boolean isORIGIN(SqlParser.ExprContext ctx) {
		return ctx instanceof SqlParser.OriginFunctionExprContext;
	}


	@Override
	public String toString() {
		return "DFA{" +
				"self=" + self.getText() +
				", args=[" + args.stream().map(RuleContext::getText).collect(Collectors.joining(",")) +
				"], columns=[" + columns.stream().map(ParseTree::getText).collect(Collectors.joining(",")) +
				"], isAll=" + isAll +
				'}';
	}
}
