package com.hong.udf;

import com.hong.udf.antlr.SqlLexer;
import com.hong.udf.antlr.SqlParser;
import com.hong.udf.config.MybatisConfig;
import com.hong.udf.custom.ResultEntryHandler;
import com.hong.udf.custom.SqlListener;
import com.hong.udf.dao.UserMapper;
import com.hong.udf.entity.User;
import com.hong.udf.func.IUdfFunction;
import com.hong.udf.func.UdfHandler;
import com.hong.udf.utils.JDBCUtil;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.After;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

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
//		String sql = "select udfA(id),age, concat(name, \'xxxx\') as cc from user limit 10;";
//		String sql = "select e,1+udfA(c-udfB(b),f),udfC(udfB(a,b,c)),udfB(CONCAT(C,\'++\')),CONCAT(a,\'++\') as cc from t_a where a=1 and b=3;";
		String sql = "select age,udfA(age),udfB(udfC(name)),udfC(CONCAT(name,'++'),id),CONCAT(name,\'++\') as cc from user";
		ANTLRInputStream input = new ANTLRInputStream(sql);
		SqlLexer lexer = new SqlLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SqlParser parser = new SqlParser(tokens);
		ParseTree tree = parser.parse();
		ParseTreeWalker walker = new ParseTreeWalker();
		SqlListener listener = new SqlListener();
		walker.walk(listener, tree);

		System.out.println(listener.getManager());
//		System.out.println(listener.getResultHandler().getResultEntries());
//		System.out.println(listener.getFinalSql());

		String finalSql = listener.getFinalSql();
		final ResultSet resultSet = JDBCUtil.executeQuery(finalSql);
		ResultSetMetaData rsmd = resultSet.getMetaData();


		ResultEntryHandler resultHandler = listener.getResultHandler();
		System.out.println(finalSql);
		while (resultSet.next()) {
			final List<Object> objects = resultHandler.handleResult(resultSet);
			System.out.println(objects);
//			Integer id = resultSet.getInt("id");
//			Integer age = resultSet.getInt("age");
//			String cc = resultSet.getString("cc");
//			System.out.println(id+"--"+cc+"--"+age);


			// ?????????????????????dfa

		}


		JDBCUtil.close();
	}

	@Test
	public void mybatis() {
		UserMapper userMapper = MybatisConfig.getMapper(UserMapper.class);
		final User user = userMapper.selectById(1);
		System.out.println(user);
	}

	@Test
	public void subClasses() {
//		List<IUdfFunction> funcSet = new ArrayList<>();


		String jarPath = "file:///D:\\OpenSource\\PackageDemo\\target\\pp-1.0.jar";
		String classPath = "com.pp.UDFOuter";

		try {
			ClassLoader cl = new URLClassLoader(new URL[]{new URL(jarPath)});
			Class<?> clazz = cl.loadClass(classPath);

			if (clazz.newInstance() instanceof IUdfFunction) {
				// TODO ????????????????????????
				UdfHandler.put(clazz.getSimpleName().toLowerCase(),(IUdfFunction)clazz.newInstance());
				//put(clazz.getSimpleName().toLowerCase(),(IUdfFunction)clazz.newInstance())
				System.out.println("??????");
			}

		} catch (MalformedURLException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}

	}
}
