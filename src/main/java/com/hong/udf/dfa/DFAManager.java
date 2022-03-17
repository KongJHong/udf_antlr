package com.hong.udf.dfa;

import com.hong.udf.antlr.SqlParser;
import org.antlr.v4.runtime.RuleContext;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description     :
 */
public class DFAManager {

	List<DFA> stack = new ArrayList<>();

	int cnt = 0;

	public void input(SqlParser.UdfFunctionExprContext udfExprCtx) {
		// 从udf开始构造
		push(new DFA(udfExprCtx));
		while (cnt < stack.size()) {
			DFA dfa = stack.get(cnt);
			List<SqlParser.ExprContext> exprs = dfa.getArgs();
			for (SqlParser.ExprContext ctx : exprs) {
				if (isBinary(ctx)) push(new DFA(ctx));
			}
			cnt++;
		}
	}


	private void push(DFA dfa) {
		stack.add(dfa);
	}

	private boolean isBinary(SqlParser.ExprContext ctx) {
		return ctx instanceof SqlParser.BinaryExprContext;
	}

	public List<String> getColumns() {
		List<String> columns = new ArrayList<>();
		for (int i = stack.size() - 1; i >= 0; i--) {
			DFA dfa = stack.get(i);
			if (dfa.isAll()) {
				columns.clear();
				columns.add("*");
				return columns;
			}


			if (CollectionUtils.isNotEmpty(dfa.getColumns())) {
				columns.addAll(dfa.getColumns().stream().map(RuleContext::getText).collect(Collectors.toList()));
			}
		}
		return columns;
	}

	@Override
	public String toString() {
		return "DFAManager{\n" +
				"stack=\n" + stack.stream().map(DFA::toString).collect(Collectors.joining("\n")) +
				"\n}";
	}

}
