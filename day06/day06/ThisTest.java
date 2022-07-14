/*
this 关键字：使用在本类中，代表当前对象，可用于调用 属性、方法、**构造器

谁让拥有 this 关键字的方法运行了，谁就是当前对象
*/
class ThisTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("张三");
		p.setAge(18);

		System.out.println(p.getName() + "," + p.getAge());
		System.out.println(p.say());

		Person p2 = new Person();
		p2.setName("李四");

		System.out.println(p2.say());
	}
}

class Person{

	private String name;
	private int age;

	public void setName(String name){
		this.name = name; //区分成员变量与局部变量
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

	public String say(){
		return this.getName() + "," + getAge(); 
	}
}