/*
跨类调用方法：（暂时使用 static 修饰的方法为例）

通过 类名.方法名() 的方式调用

注意：若跨 .java 源文件中的类调用方法，JVM 编译时的自动编译顺序是
先找 类名.java 源文件，若没有 .java 源文件，再找 .class 字节码文件执行

*/

class MethodTest2 {
	public static void main(String[] args) {
		
		/*int area = Another.method(10, 20);
		System.out.println(area);*/

		StaticMethodClass.print99();
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