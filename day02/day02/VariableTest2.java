/*
一、变量的数据类型

基本数据类型（8种）：
	整型：   byte(8位)   short(16位)   int(32位)   long(64位)
	浮点型：float(32位)  double(64位)
	字符型：char(16位-2个字节)
	布尔型：boolean


引用数据类型：
	|--类(class)  --------------------  String
	|--接口(interface)
	|--数组([])

二、数据类型之间的转换
自动类型转换（自动升级）：小容量转大容量。系统自动完成
	①byte  short  char --->  int --->  long  --->  float  ---> double
	②byte short char 三者之间不做运算，若运算都将自动提升成 int 再做运算
	③boolean 不参与运算

	④任何基本数据类型与 String 使用连接符 "+" ，都将自动串接成 String

强制类型转换：大容量转小容量。需要使用 强转符 "(需要转换的类型)"
			     可能损失精度
*/
class VariableTest2 {
	public static void main(String[] args) {
		//自动类型转换
		/*byte b = 123;
		short s = b; //自动类型转换（自动升级）
		System.out.println(s);

		int i1 = 100;

		int i2 = b + i1; //自动类型转换
		System.out.println(i2);

		//注意：
		long l1 = 230L;
		float f1 = 15.6F;

		float res = l1 + f1;

		System.out.println(res);

		char c1 = 'A';
		short s1 = 100;

		int i3 = c1 + s1;
		System.out.println(i3);

		char c2 = 'A';
		char c3 = 'B';
		int i4 = c2 + c3;
		System.out.println(i4);*/

		//强制类型转换
		/*int i1 = 297;
		byte b1 = (byte)i1;
		System.out.println(b1);

		float f = (float)15.6;*/

		//任何基本数据类型与 String 使用连接符 "+" ，都将自动串接成 String
		
		int a = 10;
		boolean b = false;
		double d1 = 15.6;
		float f = 22.22F;

		String str = "哈哈哈";

		String str2 = str + a + b + d1 + f;
		System.out.println(str2);

		String str3 = a + d1 + str + b + f + a * 2;
		System.out.println(str3);

		String str4 = "";
	}
}
