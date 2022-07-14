/*
一、面向对象编程（OOP Object Oriented Programming）

1. 面向对象与面向过程：
面向过程：强调的是功能行为
面向对象：将功能行为封装进对象，强调的是具备了功能行为的对象


【例子】把大象装冰箱一共分几步？
①打开冰箱  ②把大象装进去（存储大象）  ③关闭冰箱

如何运用面向对象思想思考上述问题？

人 开 门

人{

	拉(门){
		门.打开()
	}

}

门{

	打开(){}

}

-------------------------------------

人{

	拉(冰箱){
		冰箱.打开()
	}

	指挥(动物){
		动物.进入()
	}

	推(冰箱){
		冰箱.关闭()
	}

}

冰箱{

	打开(){}

	存储(){}

	关闭(){}

}

大象{

	进入(){}

}

大老虎{

	进入(){}

}

小海疼{
	进入(){}
}

面向对象更加注重前期的设计：
①就是对类的设计
②设计类就是设计类的成员：属性 & 方法

面向对象：将现实生活中的一类事物的共性内容进行提取，抽象成相应的 Java 类，用 Java 类对其进行描述
现实生活中的事物：张三 李四 王五
共性内容：姓名  性别  年龄  吃饭的功能  睡觉的功能

若需要具体到某一个人，要创建对象，通过 new 关键字。

类和对象：
类：抽象的，现实生活中的一类事物。类似于汽车设计图
对象：一个实实在在的个体。 类似于一辆辆的汽车
*/
class OOPTest {
	public static void main(String[] args) {
		//创建 Person 的对象
		Person p1 = new Person();
		p1.name = "张三";
		p1.gender = '男';
		p1.age = 18;

		String n = p1.name;
		System.out.println(n + "," + p1.gender + "," + p1.age);
		p1.eat();
		p1.sleep();


		Person p2 = new Person();
		p2.name = "周圆棋";
		p2.gender = '男';
		p2.age = 20;

		System.out.println(p2.name + "," + p2.gender + "," + p2.age);
		p2.eat();
		p2.sleep();
	}
}

//抽象的
class Person{

	//属性-变量
	String name;
	char gender;
	int age; 

	//功能行为-方法
	public void eat(){
		System.out.println("用嘴吃饭");
	}

	public void sleep(){
		System.out.println(name + " 躺着睡觉");
	}

}