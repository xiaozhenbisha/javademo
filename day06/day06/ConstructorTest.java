/*
一、构造器：也叫构造方法，是类的成员之一
	属性
	方法
	构造器

1. 构造器的格式

		访问控制修饰符 类名(参数列表){
			//功能语句
		}

2. 构造器的作用
①创建对象
②用于为对象进行初始化（当对象被创建的同时就具备属性和功能）

3. 构造器的注意
①构造器的名称必须与类名一致！
②若一个类中没有显示提供任何构造器，系统提供一个默认的无参构造器
		public Person(){}
③若一个类中显示的提供了任何构造器，系统默认无参构造器将不再提供
④构造器只能调用一次，并且是在创建对象的时候
⑤构造器之间可以构成重载

4. 构造器的重载
前提：在同一个类中
①构造器名称相同
②参数列表不同（参数的类型、参数的个数）

5. 为属性赋初始值的方式
①默认值（缺省值）
②直接显示赋值
③构造器赋值

顺序：①②③
*/
class ConstructorTest {
	public static void main(String[] args) {

		/*Person p = new Person();
		//p.cry();

		System.out.println(p.getName());

		//Person p1 = new Person();
		//p1.cry();

		//Person p2 = new Person();
		//p2.cry();

		Person p3 = new Person("李四");
		System.out.println(p3.getName());

		Person p4 = new Person("王五", 35);
		p4.setName("王六");
		System.out.println(p4.getName() + "," + p4.getAge());

		Person p5 = new Person();*/

		Person p = new Person("田七");
		System.out.println(p.getName());
	}
}

class Person{
	

	private String name = "张三";
	private int age;

	//声明一个构造器
	public Person(){
		System.out.println("Person's Constructor……");
		cry();

		this.name = "张三";
	}

	public Person(String name){
		this.name = name;
	}


	public Person(String name, int age){
		this.name = name;
		this.age = age;
		//this.setName(name);
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void cry(){
		System.out.println("哭。。。");
	}
}