/*
方法：也叫函数，是一个功能的定义，是一个类中最基本的功能单元

1. 方法的格式

	修饰符 返回值类型 方法名(参数列表){
		//执行的功能语句

		return 返回值;
	}

修饰符：public static
返回值类型 : 说明该方法运行后，有结果，那个结果的数据类型
参数列表：就是局部变量，可以有0个或多个，每个变量之间以 "," 隔开
***return ：用于结束当前方法
返回值：方法运行结束后，那个结果具体的值

2. 方法的注意；
①“返回值类型” 与 “返回值” 的数据类型保持一致！
②通过 方法名+参数列表调用，方法名与参数列表（数据类型、参数的个数）必须与声明时保持一致！
③方法若声明了“返回值类型”，说明该方法运行后有结果，若调用者需要用到该结果，
	可以声明一个变量接收 该方法返回的值
④若方法运行后，不需要返回任何结果给调用者时，则“返回值类型”处声明为：void
	void：无返回值
⑤方法中可以调用其他方法，不能声明方法

3. 声明方法的两点明确
①是否需要返回结果给调用者（结果是否需要其他运算）
	确定：是否有返回值，返回值类型是什么
②是否有未知的数据参数运算
	确定：是否需要参数列表，需要几个

*/
class MethodTest {

	public static void main(String[] args) {

		//需求：计算一个数 * 2 + 1 的结果
		/*int num = 5;
		int res = num * 2 + 1;

		num = 7;
		res = num * 2 + 1;
		System.out.println(res);*/

		//利用 方法名+参数列表，调用方法
		int r = result(5); //实际参数：传递给形式参数具体的数值
		System.out.println(r);

		System.out.println(result(8));


		print99();
		print99();

		boolean b = compare(10, 20);
		System.out.println(b);
	}

	
	//声明一个方法
	public static int result(int n){//形式参数：用于接收调用者传递的实际参数值
		System.out.println("这是一个方法");
		int res = n * 2 + 1;

		return res;
	}
	
	//需求：打印九九乘法表
	public static void print99(){
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}

			System.out.println();
		}
		
		//调用其他方法
		result(10);
	}


	//需求：比较两个数是否相等
	public static boolean compare(int a, int b){
		return a == b;
	}
}
