/*
编写程序，声明一个method方法，在方法中打印一个10*8的矩形，
在main方法中调用该方法。

修改上一个程序，在method方法中，除打印一个10*8的矩形外，再计算该矩形的面积，
并将其作为方法返回值。
在main方法中调用该方法，接收返回的面积值并打印

修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的矩形，
并计算该矩形的面积， 将其作为方法返回值。
在main方法中调用该方法，接收返回的面积值并打印。

修改上一个程序，新建一个Another类，将method方法移到该类中。
在原类的main方法中调用Another类的method方法，接收返回的面积值并打印。

*/
class MethodExer1 {
	public static void main(String[] args) {
	
		//method();

		/*int area = method();
		System.out.println(area);*/

		/*int area = method(10, 20);
		System.out.println(area);*/

		int area = Another.method(10, 20);
		System.out.println(area);
	}

	/*public static void method(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 8; j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}*/

	/*public static int method(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 8; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		return 10 * 8;
	}*/

	public static int method(int m, int n){
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		return m * n;
	}
}

class Another{

	public static int method(int m, int n){
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		return m * n;
	}

}