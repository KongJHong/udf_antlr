// Generated from F:/Self Project/UDF_Antlr/src/main/resources\SqlParser.g4 by ANTLR 4.9.2
package com.hong.udf.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SqlParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt_list(SqlParser.Select_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SqlParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_qualifier(SqlParser.Set_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#element_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_clause(SqlParser.Element_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(SqlParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(SqlParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code originFunctionExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginFunctionExpr(SqlParser.OriginFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalValueExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralValueExpr(SqlParser.LiteralValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code udfFunctionExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfFunctionExpr(SqlParser.UdfFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(SqlParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code innerExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerExpr(SqlParser.InnerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperation(SqlParser.UnaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code existsExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExpr(SqlParser.ExistsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inMethodExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInMethodExpr(SqlParser.InMethodExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenExpr(SqlParser.BetweenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicateExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateExpr(SqlParser.PredicateExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNotExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotExpr(SqlParser.IsNotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnNameExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNameExpr(SqlParser.ColumnNameExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryEqualOrAssignExpr}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryEqualOrAssignExpr(SqlParser.BinaryEqualOrAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(SqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(SqlParser.Table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_alias_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias_specification(SqlParser.Table_alias_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#joined_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_clause(SqlParser.Joined_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SqlParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SqlParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(SqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#where_link_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_link_semi(SqlParser.Where_link_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(SqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(SqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(SqlParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#domain_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_name(SqlParser.Domain_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SqlParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_classify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_classify(SqlParser.Type_classifyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#character_string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_string_type(SqlParser.Character_string_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bit_string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_string_type(SqlParser.Bit_string_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_type(SqlParser.Numeric_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exact_numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExact_numeric_type(SqlParser.Exact_numeric_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#approximate_numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApproximate_numeric_type(SqlParser.Approximate_numeric_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#datetime_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_type(SqlParser.Datetime_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(SqlParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(SqlParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#scala}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScala(SqlParser.ScalaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#time_precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_precision(SqlParser.Time_precisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#timestamp_precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_precision(SqlParser.Timestamp_precisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#time_fractional_seconds_precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_fractional_seconds_precision(SqlParser.Time_fractional_seconds_precisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#origin_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrigin_function_name(SqlParser.Origin_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#udf_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdf_function_name(SqlParser.Udf_function_nameContext ctx);
}