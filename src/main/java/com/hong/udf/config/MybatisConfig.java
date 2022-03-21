package com.hong.udf.config;

import com.hong.udf.dao.UserMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;

/**
 * Description     :
 */
public class MybatisConfig {

//	DataSource dataSource = null;

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String URL = "jdbc:mysql://192.168.10.100:3306/test?useSSL=true";
	private static final String PASSWORD = "123456";

	private static SqlSession sqlSession = null;


	static {
		DataSource dataSource = new PooledDataSource(DRIVER, URL, USERNAME, PASSWORD);
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);
		Configuration configuration = new Configuration(environment);


		configuration.addMapper(UserMapper.class);
//		configuration.addMappers("classpath:mapper/*.xml");


		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

		sqlSession =  sqlSessionFactory.openSession();

	}

	public static <T> T getMapper(Class<T> clazz) {
		return sqlSession.getMapper(clazz);
	}

	public static void close() {
		if (sqlSession != null)sqlSession.close();
	}


}
