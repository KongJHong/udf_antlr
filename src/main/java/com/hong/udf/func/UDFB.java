package com.hong.udf.func;

import java.util.Arrays;

/**
 * Description     :
 */
public class UDFB implements IUdfFunction {
	@Override
	public String executeFunc(Object... args) {
		return "UDFB("+ Arrays.asList(args) +")";
	}
}
