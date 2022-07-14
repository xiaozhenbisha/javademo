/*
参数的值传递：

基本数据类型：将基本数据类型作为参数，传递给方法，方法运行结束后，原值不会发生改变
引用数据类型：将引用数据类型作为参数，传递给方法，方法运行结束后，原对象属性值会发生改变
*/
class MethodTest {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();


		/*int a = 10;
		int b = 20;
		mt.add(a, b);
		
		System.out.println("a=" + a + " b=" + b);*/

		
		//变量的格式：数据类型 变量名 = 值;
		/*int a = 10;
		String str = "abc";
		Number1 num1 = new Number1();*/

		Number1 n = new Number1();
		n.a = 10;
		n.b = 20;

		mt.add(n);
		
		System.out.println("n.a=" + n.a + " n.b=" + n.b);//n.a=11  n.b=22
	}

	//需求：改变两个数的值
	/*public void add(int a, int b){//int a = 10, int b = 20
		a += 1; 
		b += 2;
	}*/

	public void add(Number1 num){//方法运行时，参数一定有值。相当于 ：Number1 num = new Number1();
		num.a += 1;
		num.b += 2;
	}
}

class Number1{

	int a;
	int b;

}