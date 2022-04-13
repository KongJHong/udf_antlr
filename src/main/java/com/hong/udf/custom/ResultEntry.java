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
public class ResultEntry {

	// 别名
	private String alias;

	// 真名
	private String real;

	// dfa处理器
	private DFAManager dfaManager;

	/**
	 * 处理结果
	 */
	public Object getResult(ResultSet resultSet,Integer rowIndex) throws SQLException {
		// 有dfa处理dfa
		if (dfaManager != null) return dfaManager.handleResult(resultSet,real,rowIndex);
		// 没有dfa处理别名
		if (StringUtils.isNotEmpty(alias))return resultSet.getObject(alias);
		// 没有别名处理real
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
