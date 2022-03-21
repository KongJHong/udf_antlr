package com.hong.udf.handler;

import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * Description     :
 */
public class ElementClauseHandler {
//	@Override
//	public String handle(ParseTree node) {
//		if (node instanceof SqlParser.Element_clauseContext) {
//			StringBuilder sb = new StringBuilder();
//			List<SqlParser.ElementContext> elements = ((SqlParser.Element_clauseContext) node).element();
//			for (SqlParser.ElementContext ele: elements) {
//				if (ele.STAR() != null) sb.append(ele.STAR().getText()).append(" ");
//				else sb.append(ele.getText()).append(" ");
//			}
//			return sb.toString();
//		}
//
//		return "";
//	}


	public String handle(List<String> elements) {
		if (CollectionUtils.isEmpty(elements))return "";
		return String.join(",",elements);
	}

}
