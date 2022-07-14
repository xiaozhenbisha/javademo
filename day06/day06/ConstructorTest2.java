/*
this 关键字：使用在本类中，代表当前对象，可以调用 属性、方法、构造器

this.属性
this.方法
this(...) : 调用本类的构造器
	注意：
		①避免递归构造器调用（当使用this调用本类其他构造器时，至少有一个构造器中不使用 this）
		②this()调用本类构造器，必须使用在当前构造器中可执行代码的首行
*/
class ConstructorTest2 {
	public static void main(String[] args) {

		Person p = new Person("张三", 18, '男', 180, 55.55);

		System.out.println(p.say());

	}
}

class Person{

	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;

	public Person(){}

	public Person(String name){
		this.name = name;
	}

	public Person(String name, int age){
		//
		this(name);
		this.age = age;
	}

	public Person(String name, int age, char gender){
		this(name, age);
		this.gender = gender;
	}

	public Person(String name, int age, char gender, double height){
		this(name, age, gender);
		this.height = height;
	}

	public Person(String name, int age, char gender, double height, double weight){
		this(name, age, gender, height);
		this.weight = weight;
	}

	public String say(){
		return name + "," + age + "," + gender + "," + height + "," + weight;
	}
}