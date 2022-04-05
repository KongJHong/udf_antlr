package com.hong.udf.custom;

import com.hong.udf.dfa.DFAManager;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.StringUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Description     :
 */
@Data
@EqualsAndHashCode(exclude = "dfaManager")
@Accessors(chain = true)
public class ResultEntry implements Cloneable {

	// 别名
	private String alias;

	// 真实
	private String real;

	// 对应的dfa处理器
	private DFAManager dfaManager;

	@Override
	protected Object clone() {
		return new ResultEntry().setAlias(alias).setReal(real).setDfaManager(dfaManager);
	}

	/**
	 * 处理结果
	 */
	public Object getResult(ResultSet resultSet,Integer rowIndex) throws SQLException {
		// 有dfa处理dfa
		if (dfaManager != null) return dfaManager.handleResult(resultSet,real,rowIndex);
		if (StringUtils.isNotEmpty(alias))return resultSet.getObject(alias);
		return resultSet.getObject(real);
	}

	@Override
	public String toString() {
		return "ResultEntry{" +
				"alias='" + alias + '\'' +
				", real=" + real +
				", dfaManager=" + dfaManager +
				'}';
	}
}
