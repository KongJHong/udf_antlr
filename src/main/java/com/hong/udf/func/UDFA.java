package com.hong.udf.func;

import java.util.Arrays;

/**
 * Description     :
 */
public class UDFA implements IUdfFunction {
	@Override
	public String executeFunc(Object... args) {
		return "UDFA("+ Arrays.asList(args) +")";
	}
}
