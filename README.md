问题？

- 怎么解决用于计算的函数问题？(如1-udfA(a)的计算问题)
  - 下推自动机？
  - 通过处理最小udf单元（只有函数名+N个单独字段组成的），以及两段搜索，解决内嵌问题



**不要一开始就做一个完美的版本**

有缺陷的版本

- udf只能包含函数名和由N个单独字段组成的参数
- 不能参与数据库内置函数方法的计算
- udf兼容内置函数，可以嵌套内置函数或其他udf，但是内置函数不能嵌套UDF



**下推自动机设计**

构造下推自动机

**结果entry**

```
select e,1+udfA(c-udfB(b),f),udfC(c),CONCAT(a,\'++\') as cc from t_a where a=1 and b=3;
```

预先构造一个结果集映射关系ResultEntryTemplate，包含原始列，如e,udf(xxx),CONCAT(a,'++') as cc，别名列cc，

1. e-->set.get(e)
2. udf(xxx)执行对应的下推自动机

怎么生成包含elemnt-udf对应的dfaManager？



有udf的，抽column(带as别名)，拼回去，相当于把element的结构改了



现在





