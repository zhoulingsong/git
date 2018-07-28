# 《JAVA 151 个建议》

## 第一章

## 第二章 基本类型

### 21. 用偶判断，不用奇判断
	
	原因： 1 % 2 = 1； -1 % 2 = -1; 单 2 % 2 = 0； -2 % 2 = 0；
	结论： 负奇数 % 2 等于 -1， 正奇数 % 2 等于 1，正负偶数 % 2 都等于 0；
 
### 22. 精确小数用 BigDecimal

### 23. 自动类型转换时主动转换防止溢出

	long num = 1L * num1 * num2; (推荐)
	long num = (long)num1 * (long)num2 	(不推荐)
	第一个参数就主动声明类型转换成 long，而不是使用强制类型转换




## 第三章 类、对象及方法

### 42. 工具类不可实例化
	
	1. 私有构造方法（反射还是能拿到）;
	2. 私有构造方法内抛异常;(解决反射问题)

### 47. 在 equals 中使用 getClass() 进行类型判断代替 instanceof

	instanceof 无法区分父类与子类;
	即再有继承或者实现的情况下，子类 instanceof 父类 为 true；

### 48. 覆写 equals() 则必须同时覆写 hashCode() ###

	Map 使用的是哈希表（数组+列表）存储结构，通过 key 的 hashCode 找到数组下标位置;
	推荐使用 HashCodeBuilder 工具类来实现；

### 49. 推荐覆写 toString() ###

	原始的 toString 方法打印内容没有实际意义;

### 50. 使用 package-info 为包服务 ###

	仅包内可访问到，功能如下：
	1. 定义公共类、常量;
	2. 给包标注注解;
	3. 提供包的整体注释说明;

### 51. 不要主动进行垃圾回收 ###

	主动调用：System.gc() 会暂停当前所有操作，直到 gc 完成；

## 第四章 字符串 

### 52. 推荐 String 直接赋值 ###

	eg： String str = "aa"; 不要 new String("aa")；

### 53. 注意方法参数要求 ###

### 54. 正确使用 String、StringBuffer、StringBuilder ###

### 55. 字符串用 "+" 拼接问题 ###

	"+" 遇到字符串时，所有类型都变成字符串，对象则调用 toString()；
	eg: 1 + 2 + "num" = "3num"
	eg: "num" + 1 + 2 = "num12"
	
### 56. 字符串拼接 ###

	"+" < concat() < stringBuffer.append() 































