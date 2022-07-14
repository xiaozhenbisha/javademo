/*
练习2：
编写一个Dog类，包含name、age、weight属性
类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。
 在另一个TestDog类中的main方法中，创建Dog对象，并访问say方法和所有属性，
 将调用结果打印输出。

改写Dog类，name属性使用缺省初始值，age和weight属性使用显式初始值1和10。
在TestDog类的main方法中，创建两个Dog对象，分别调用两对象的say方法，
将调用结果打印输出。
继续在main方法中，将两个Dog对象的name属性分别设为“京叭 ”和“吉娃娃”，
第二个对象的体重设为8。再分别调用两对象的say方法，将调用结果打印输出。
根据输出结果，理解由同一类创建的不同对象的属性的独立性。

*/
class TestDog {
	public static void main(String[] args) {
		/*Dog d1 = new Dog();
		d1.name = "哈士奇";
		d1.age = 1;
		d1.weight = 15.6;

		String str = d1.say();
		System.out.println(str);

		Dog d2 = new Dog();
		d2.name = "金毛";
		d2.age = 2;
		d2.weight = 25.55;

		System.out.println(d2.say());*/

		Dog d1 = new Dog();
		d1.name = "京巴";

		Dog d2 = new Dog();
		d2.name = "吉娃娃";
		d2.weight = 8;

		System.out.println(d1.say());
		System.out.println(d2.say());
	}
}

class Dog{

	String name;
	int age = 1;
	double weight = 10;

	public String say(){
		return "名称：" + name + " 年龄：" + age + " 重量：" + weight;
	}

}