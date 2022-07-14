/*
赋值运算符： =     +=   -=    *=    /=   %=

比较运算符（关系运算符）： ==   !=   >  <   >=   <=

逻辑运算符： 
&&  ：短路与    ||  ： 短路或    !    ： 逻辑非     &  :  逻辑与   |   -  逻辑或    ^   - 逻辑异或


【面试题】 &&  和  &  的区别？
&& ：称为短路与，当&&左边表达式结果为 false 时，右边表达式将不再计算
& ：是位运算符，当用于逻辑运算时，无论左边表达式结果为 true 还是 false，右边表达式都计算


||  和  | 的 区别？

*/
class VariableTest4 {
	public static void main(String[] args) {
		//赋值运算符
		/*int a = 10;

		a += 5; //相当于  a = a + 5
		System.out.println(a);//15

		a %= 3; //a = a % 3;
		System.out.println(a);

		//【面试题】
		short s = 5;
		//s = s + 1; //编译？NO  运行？

		s += 1; //s = (short)(s + 1) 编译？ YES
		System.out.println(s);*/

		//比较运算符（关系运算符）: 运算的结果都为 boolean
		/*int a = 10;
		int b = 10;

		boolean boo = a == b;
		System.out.println(boo);

		System.out.println(a != b);*/

		//逻辑运算符：运算的结果都为 boolean
		
		//需求：判断一个数是不是大于10 小于20 
		//int a = 10;

		//错误的写法
		/*boolean boo = 10 < a < 20;
		System.out.println(boo);*/

		/*boolean boo = a > 10 && a < 20;
		System.out.println(boo);*/

		/*boolean b1 = true && true;
		boolean b2 = true && false;
		boolean b3 = false && true;
		boolean b4 = false && false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);*/

		/*boolean b1 = true || true;
		boolean b2 = true || false;
		boolean b3 = false || true;
		boolean b4 = false || false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);*/

		/*boolean b1 = !true;
		System.out.println(b1);*/

		int a = 10;

		boolean boo = a > 10 && a++ < 20;

		System.out.println(boo);
		System.out.println(a);//10    11

		/*boolean b1 = true ^ true;
		boolean b2 = true ^ false;
		boolean b3 = false ^ true;
		boolean b4 = false ^ false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);*/

		
		
	}
}
