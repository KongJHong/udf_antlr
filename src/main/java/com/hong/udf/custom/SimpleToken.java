package com.hong.udf.custom;

import org.antlr.v4.runtime.CommonToken;

/**
 * Description     :
 */
public class SimpleToken extends CommonToken {

	private final String token;

	public SimpleToken(String token) {
		super(0);
		this.token = token;
	}

	@Override
	public String getText() {
		return token;
	}


	@Override
	public String toString() {
		return token + ":" + type;
	}
}
