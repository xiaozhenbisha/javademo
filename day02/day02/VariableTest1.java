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
*/
class VariableTest1 {
	public static void main(String[] args) {
		//变量的格式：数据类型 变量名 = 值;

		//整型：   byte(8位)   short(16位)   int(32位)-默认类型   long(64位)
		byte b1 = 123;
		short s1 = 12345;
		int i1 = 1235456;

		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);

		//注意：声明 long 型变量时，值后需要加 L 或 l
		long l1 = 245324534657L;
		System.out.println(l1);

		//浮点型：float(32位)  double(64位)-默认类型
		//注意：声明 float 型变量，值后必须加 F 或 f
		float f1 = 15.6f;
		System.out.println(f1);

		//注意：声明 double 型变量时，值后可以加 D 或 d
		double d1 = 1234.45645d;
		System.out.println(d1);

		double d2 = .512;
		double d3 = 5.12E6;
		System.out.println("-----" + d2);
		System.out.println("-----" + d3);

		//字符型：char(2个字节-16位)
		//注意：声明 char 型变量，值必须使用单引号，char 变量只能存单个字符
		//char 型以 Unicode 编码进行存储（ASCII、中文、日文、特殊字符）
		char c1 = 'A';
		char c2 = '中';
		char c3 = '1';
		char c4 = '$';

		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);

		//转义字符
		char c5 = '\'';
		char c6 = '\n';
		char c7 = '\t';
		char c8 = ' ';
		char c9 = '\u6C99';

		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);

		//布尔型：boolean
		//true-真
		//false-假
		boolean bb1 = true;
		boolean bb2 = false;

		System.out.println(bb1);
		System.out.println(bb2);

		//String : 字符串
		//注意：String 类型的值必须使用 双引号
		String str = "我大尚硅谷威武！";
		System.out.println(str);

		System.out.println("HelloWorld!");
	}
}
