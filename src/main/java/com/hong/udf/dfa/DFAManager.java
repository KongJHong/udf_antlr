package com.hong.udf.dfa;

import com.hong.udf.antlr.SqlParser;
import com.hong.udf.func.UdfHandler;
import org.antlr.v4.runtime.tree.ParseTree;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Description     :
 */
public class DFAManager {

	List<DFA> stack = new ArrayList<>();

	Map<String, Object> resultCache = new HashMap<>();

	private int rowIndex = -1;

	public void input(SqlParser.UdfFunctionExprContext udfExprCtx) {
		// 从udf开始构造
		push(new DFA(udfExprCtx));
	}

	public Object handleResult(ResultSet resultSet, String real, int rowIndex) throws SQLException {
		if (this.rowIndex == rowIndex) {
			return resultCache.get(real);
		}
		for (int pp = stack.size() - 1; pp >= 0; pp--) {
			final DFA dfa = stack.get(pp);

			// getSelf获取udf方法名和参数名
			// 通过rs获取参数，传入udf方法执行，获取结果
			String funcName = dfa.getSelf().udf_function_name().getText();
			String dfaName = dfa.getSelf().getText();
			List<Object> columns = new ArrayList<>(dfa.getColumns().size());

			for (ParseTree node : dfa.getColumns()) {
				if (node instanceof SqlParser.Column_nameContext || node instanceof SqlParser.OriginFunctionExprContext) {
					columns.add(resultSet.getObject(node.getText()));
				} else if (node instanceof SqlParser.UdfFunctionExprContext) {
					columns.add(resultCache.getOrDefault(node.getText(), null));
				}
			}

			resultCache.put(dfaName,  UdfHandler.execute(funcName.toLowerCase(),columns.toArray()));
		}
		this.rowIndex = rowIndex;
		return resultCache.get(real);
	}

	private void push(DFA dfa) {
		stack.add(dfa);
	}


	@Override
	public String toString() {
		return "DFAManager{\n" +
				"stack=\n" + stack.stream().map(DFA::toString).collect(Collectors.joining("\n")) +
				"\n}";
	}

}
