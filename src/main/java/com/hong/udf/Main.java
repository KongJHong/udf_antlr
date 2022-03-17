package com.hong.udf;

import com.hong.udf.antlr.SqlLexer;
import com.hong.udf.antlr.SqlParser;
import com.hong.udf.custom.SqlListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

/**
 * Description     :
 */
public class Main {

	@SuppressWarnings("all")
	@Test
	public void demo1() {
		String sql = "select e,udfA(a+c-udfB(b)) from t_a;";
		ANTLRInputStream input = new ANTLRInputStream(sql);
		SqlLexer lexer = new SqlLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SqlParser parser = new SqlParser(tokens);
		ParseTree tree = parser.parse();
		ParseTreeWalker walker = new ParseTreeWalker();
		SqlListener listener = new SqlListener();
		walker.walk(listener, tree);
		System.out.println(listener.getManager());
	}
}
