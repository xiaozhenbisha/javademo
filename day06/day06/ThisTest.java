/*
this �ؼ��֣�ʹ���ڱ����У�����ǰ���󣬿����ڵ��� ���ԡ�������**������

˭��ӵ�� this �ؼ��ֵķ��������ˣ�˭���ǵ�ǰ����
*/
class ThisTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("����");
		p.setAge(18);

		System.out.println(p.getName() + "," + p.getAge());
		System.out.println(p.say());

		Person p2 = new Person();
		p2.setName("����");

		System.out.println(p2.say());
	}
}

class Person{

	private String name;
	private int age;

	public void setName(String name){
		this.name = name; //���ֳ�Ա������ֲ�����
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