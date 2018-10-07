JAVA 中的 return 与 finally 的先后关系



1. 计算 return 表达式的值；
2. 执行 finally 代码；
3. 返回 return 表达式的值；

备注： finally 无法修改 return 表达式的值，因为在执行 finally 代码之前，return 表达式的值已经计算结束了；