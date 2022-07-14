/*
描述小汽车

变量

局部变量 & 成员变量

1. 属性：也叫成员变量，也叫实例变量

2. 成员变量与局部变量的区别？
①内存中的位置不同
②作用域不同
③成员变量有默认值，而局部变量没有默认值（因此局部变量使用前必须赋值）

3. 属性的默认值
基本数据类型：
byte short int ---> 0
long  ---> 0L
float ---> 0.0F
double  ---> 0.0D
char ---> '\u0000'
boolean  ---> false


引用数据类型： ---> null
	|--类(class)
	|--接口(interface)
	|--数组([])

4. 为属性赋初始值的方式
①默认值（缺省值）
②直接显示赋值
*/
class FieldTest {
	public static void main(String[] args) {

		/*Car c1 = new Car();
		c1.name = "奔驰";
		c1.color = "白色";
		c1.tyre = 4;

		Car c2 = new Car();
		c2.name = "宝马";
		c2.color = "黑色";
		c2.tyre = 5;

		c1.color = "红色";
		System.out.println(c1.name + "," + c1.color + "," + c1.tyre);
		System.out.println(c2.name  + "," + c2.color + "," + c2.tyre);*/

		Car c1 = new Car();
		c1.color = "黑色";

		System.out.println(c1.name + "," + c1.color + "," + c1.tyre);

		Car c2 = new Car();
		System.out.println(c2.name + "," + c2.color + "," + c2.tyre);
	}
}

class Car{

	String name;
	String color = "绿色";
	int tyre; //描述轮胎个数

	public void start(){
		System.out.println("启动");
	}

}