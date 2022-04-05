package com.hong.udf.func;

import java.util.Arrays;

/**
 * Description     :
 */
public class UDFC implements IUdfFunction {
	@Override
	public String executeFunc(Object... args) {
		return "UDFC("+ Arrays.asList(args) +")";
	}
}
