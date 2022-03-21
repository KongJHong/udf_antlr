package com.hong.udf.handler;

import com.hong.udf.antlr.SqlParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Description     :
 */
public class LimitClauseHandler implements ClauseHandler {
	@Override
	public String handle(ParseTree node) {
		if (node instanceof SqlParser.Limit_clauseContext) {
			StringBuilder sb = new StringBuilder();

			SqlParser.Limit_clauseContext ctx = (SqlParser.Limit_clauseContext) node;
			final List<TerminalNode> terminalNodes = ctx.NUMERIC_LITERAL();
			sb.append(ctx.LIMIT().getText()).append(" ")
					.append(terminalNodes.stream().map(ParseTree::getText).collect(Collectors.joining(",")));
			return sb.toString();
		}

		return "";
	}
}
