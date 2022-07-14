/*
1.编写程序，定义三个重载方法并调用。方法名为mOL。
三个方法分别接收一个int参数、两个int参数、一个字符串参数。
分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main ()方法中分别用参数区别调用三个方法。
*/
class OverloadExer {
	public static void main(String[] args) {
		
		int res = mOL(10);
		System.out.println(res);

		res = mOL(10, 20);
		System.out.println(res);

		mOL("张玉鹏，旷课2分钟");

	}

	public static int mOL(int a){
		return a * a;
	}

	public static int mOL(int a, int b){
		return a * b;
	}

	public static void mOL(String str){	
		System.out.println(str);
	}
}
