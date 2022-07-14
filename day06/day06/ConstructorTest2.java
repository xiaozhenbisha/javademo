/*
this �ؼ��֣�ʹ���ڱ����У�����ǰ���󣬿��Ե��� ���ԡ�������������

this.����
this.����
this(...) : ���ñ���Ĺ�����
	ע�⣺
		�ٱ���ݹ鹹�������ã���ʹ��this���ñ�������������ʱ��������һ���������в�ʹ�� this��
		��this()���ñ��๹����������ʹ���ڵ�ǰ�������п�ִ�д��������
*/
class ConstructorTest2 {
	public static void main(String[] args) {

		Person p = new Person("����", 18, '��', 180, 55.55);

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