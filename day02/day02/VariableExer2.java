/*
1. 使用三元运算符，获取两个数中的较大数
2. 使用三元运算符，获取三个数中的较大数 

*/
class VariableExer2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		/*int max = a > b ? a : b;
		max = max > c ? max : c;*/

		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println(max);

	}
}
/*
算数运算符

+  -   +  -  *  /  %  ++  --  +

赋值运算符

=   +=  -=  *=  /=  %=


比较运算符（关系运算符）
==     !=    >   <   >=   <=


逻辑运算符
&&    ||    !   &  |   ^



位运算符
~     &   |   ^    <<  >>  >>>



三元运算符



*/