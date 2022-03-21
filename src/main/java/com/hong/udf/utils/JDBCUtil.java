package com.hong.udf.utils;

import java.sql.*;

/**
 * Description     :
 */
public class JDBCUtil {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String URL = "jdbc:mysql://192.168.10.100:3306/test?useSSL=true";
	private static final String PASSWORD = "123456";


	private static Connection connection = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	static {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}


	public static ResultSet executeQuery(String sql) {
		if (connection == null)throw new RuntimeException("连接不存在");

		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
			throw new RuntimeException("搜索失败:"+sql);
		}

		return rs;
	}


	public static void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
		}
	}

}
