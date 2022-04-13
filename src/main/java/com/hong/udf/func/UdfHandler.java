package com.hong.udf.func;

import java.util.HashMap;
import java.util.Map;

/**
 * Description     : UDF执行器
 */
public class UdfHandler {

	private static final Map<String,IUdfFunction> FUNC_MAP = new HashMap<>();

	static {
		FUNC_MAP.put(UDFA.class.getSimpleName().toLowerCase(), new UDFA());
		FUNC_MAP.put(UDFB.class.getSimpleName().toLowerCase(), new UDFB());
		FUNC_MAP.put(UDFC.class.getSimpleName().toLowerCase(), new UDFC());
	}


	private UdfHandler() {}

	public static Object execute(String funcName,Object... args) {
		final IUdfFunction func = FUNC_MAP.getOrDefault(funcName, null);
		if (func == null) throw new RuntimeException("名称对不上:"+funcName);
		return func.executeFunc(args);
	}

	public static synchronized void put(String key,IUdfFunction func) {
		FUNC_MAP.put(key, func);
	}


}
