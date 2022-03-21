package com.hong.udf.handler;

import com.hong.udf.antlr.SqlParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Description     :
 */
public class QualifierClauseHandler implements ClauseHandler{
	@Override
	public String handle(ParseTree node) {
		if (node instanceof SqlParser.Set_qualifierContext) {
			return node.getText();
		}
		return "";
	}
}
