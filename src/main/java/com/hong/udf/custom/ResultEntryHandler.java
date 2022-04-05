package com.hong.udf.custom;

import lombok.Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Description     :
 */
@Data
public class ResultEntryHandler {

	Set<ResultEntry> resultEntries = new LinkedHashSet<>();

	private int rowIndex = 0;

	public List<Object> handleResult(ResultSet resultSet) throws SQLException {
		List<Object> result = new ArrayList<>(resultEntries.size());
		for (ResultEntry resultEntry: resultEntries) {
			result.add(resultEntry.getResult(resultSet,rowIndex));
		}
		rowIndex++;
		return result;
	}

	public void add(ResultEntry resultEntry) {
		resultEntries.add(resultEntry);
	}
}
