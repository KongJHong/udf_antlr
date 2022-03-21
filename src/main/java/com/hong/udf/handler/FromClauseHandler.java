package com.hong.udf.handler;

import com.hong.udf.antlr.SqlParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Description     :
 */
public class FromClauseHandler implements ClauseHandler{
	@Override
	public String handle(ParseTree node) {
		if (node instanceof SqlParser.From_clauseContext) {
			return node.getChild(0).getText() + " " + node.getChild(1).getText();
		}
		return "";
	}
}
