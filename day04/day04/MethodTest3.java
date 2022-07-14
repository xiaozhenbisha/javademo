/*
参数的值传递

基本数据类型：当将基本数据类型作为参数，传递给方法，方法运行结束后，原值不会发生改变
引用数据类型：

*/
class MethodTest3 {
	public static void main(String[] args) {
	
		//add(10, 20);

		int a = 10;
		int b = 20;

		System.out.println("main 方法调用 add 方法前：a=" + a + " b=" + b);//i=10 j=20

		add(a, b);

		System.out.println("main 方法调用 add 方法后：a=" + a + " b=" + b);//i=10 j=20
	}

	//需求：改变两个数的值
	public static void add(int a, int b){//当方法运行时，形参一定有值
		System.out.println("add 方法运行前：a=" + a + " b=" + b);//a=10 b=20

		a += 1;
		b += 2;

		System.out.println("add 方法运行后：a=" + a + " b=" + b);//a=11 b=22
	}
}
