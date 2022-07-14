/*
1.创建程序,在其中定义两个类：Person和TestPerson类。定义如下：
    用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
	在TestPerson类中实例化Person类的对象b，调用setAge()和getAge()方法，
	体会Java的封装性。

1. 在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18。

2. 修改上题中类和构造器，增加name属性,使得每次创建Person对象的同时初始化对象
的age属性值和name属性值
*/
class PersonTest {
	public static void main(String[] args) {
		/*Person b = new Person();
		//b.age = -10;

		b.setAge(10);

		System.out.println(b.getAge());*/

		/*Person p = new Person();

		System.out.println(p.getAge());*/

		Person p = new Person("张三", -18);
		System.out.println(p.getName() + "," + p.getAge());
	}
}

class Person{

	//1. 属性私有化
	private int age;
	private String name;

	public Person(){
		age = 18;
	}

	public Person(String name, int age){
		this.name = name;
		setAge(age);
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	//2. 提供公共的 get/set 方法
	public void setAge(int i){
		if(i >= 0 && i <= 130){
			age = i;
		}
	}

	//获取属性值
	public int getAge(){
		return age;
	}
}
