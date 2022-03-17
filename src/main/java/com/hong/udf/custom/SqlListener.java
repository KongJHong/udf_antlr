package com.hong.udf.custom;

import com.hong.udf.antlr.SqlParser;
import com.hong.udf.antlr.SqlParserBaseListener;
import com.hong.udf.dfa.DFAManager;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * Description     :
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SqlListener extends SqlParserBaseListener {

	private DFAManager manager = new DFAManager();

	@Override
	public void exitSelect_stmt(SqlParser.Select_stmtContext ctx) {
		final List<ParseTree> children = ctx.children;
		StringBuilder sb = new StringBuilder();
		for (ParseTree tree : children) {
			if (tree instanceof SqlParser.From_clauseContext) {
				sb.append(tree.getChild(0).getText()).append(" ").append(tree.getChild(1).getText());
				continue;
			}
			sb.append(tree.getText()).append(" ");
		}
		System.out.println(sb.toString());
	}

	@Override
	public void enterUdfFunctionExpr(SqlParser.UdfFunctionExprContext ctx) {
		manager.input(ctx);
	}


}
