package com.hong.udf.handler;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Description     :
 */
@FunctionalInterface
public interface ClauseHandler {

	String handle(ParseTree node);

}
