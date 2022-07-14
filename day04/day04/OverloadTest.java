/*
重载方法（Overload）
在同一个类中
①方法名相同
②参数列表不同（参数的个数、参数的类型）
注意：与返回值类型无关
*/
class OverloadTest {
	public static void main(String[] args) {

		add(10, 20);

	}

	//需求：计算两个整数的和
	/*public static int add(int a, int b){
		System.out.println("计算两个整数的和");
		return a + b;
	}*/

	//需求：计算三个整数的和
	public static int add(int a, int b, int c){
		return a + b + c;
	}

	public static double add(double d1, double d2){
		System.out.println("计算两个浮点数的和");
		return d1 + d2;
	}

	public static void add(float f1, float f2){
	
	}

	public static void add(int a, double d1){
		System.out.println("一个 int 一个 double");
	}	

	public static void add(String str, char c){
	
	}

	public static void add(char c, String str){
	
	}
}
