/*
三元运算符（三目运算符）：

	格式：
		条件表达式  ?  表达式1  :  表达式2;

	①条件表达式结果为 true 执行 表达式1 否则执行 表达式2
	②表达式1 与 表达式2 结果的数据类型需要保持一致！
*/
class VariableTest5 {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		/*int res =  a > b ? a - b : a + b;
		System.out.println(res);*/

		//String str = a > b ? a : "哈哈哈";
		//System.out.println(a > b ? a : "哈哈哈");

		//需求：获取两个数的较大值
		int max = a > b ? a : b;
		System.out.println(max);
	}
}
