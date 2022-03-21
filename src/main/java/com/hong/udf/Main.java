package com.hong.udf;

import com.hong.udf.antlr.SqlLexer;
import com.hong.udf.antlr.SqlParser;
import com.hong.udf.config.MybatisConfig;
import com.hong.udf.custom.SqlListener;
import com.hong.udf.dao.UserMapper;
import com.hong.udf.entity.User;
import com.hong.udf.utils.JDBCUtil;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.After;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Description     :
 */
public class Main {


	@After
	public void after() {
		MybatisConfig.close();
	}


	@SuppressWarnings("all")
	@Test
	public void demo1() throws SQLException {
		String sql = "select udfA(id),age, concat(name, \'xxxx\') as cc from user limit 10;";
//		String sql = "select e,udfA(a+c-udfB(b)),udfC(c),CONCAT(a,\'++\') as cc from t_a where a=1 and b=3;";
		ANTLRInputStream input = new ANTLRInputStream(sql);
		SqlLexer lexer = new SqlLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SqlParser parser = new SqlParser(tokens);
		ParseTree tree = parser.parse();
		ParseTreeWalker walker = new ParseTreeWalker();
		SqlListener listener = new SqlListener();
		walker.walk(listener, tree);
		System.out.println(listener.getFinalSql());

		String finalSql = listener.getFinalSql();
		final ResultSet resultSet = JDBCUtil.executeQuery(finalSql);

		while (resultSet.next()) {
			Integer id = resultSet.getInt("id");
			Integer age = resultSet.getInt("age");
			String cc = resultSet.getString("cc");
			System.out.println(id+"--"+cc+"--"+age);


			// 执行下推自动机dfa

		}


		JDBCUtil.close();
	}

	@Test
	public void mybatis() {
		UserMapper userMapper = MybatisConfig.getMapper(UserMapper.class);
		final User user = userMapper.selectById(1);
		System.out.println(user);
	}
}
