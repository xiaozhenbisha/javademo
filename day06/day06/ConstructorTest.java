/*
һ����������Ҳ�й��췽��������ĳ�Ա֮һ
	����
	����
	������

1. �������ĸ�ʽ

		���ʿ������η� ����(�����б�){
			//�������
		}

2. ������������
�ٴ�������
������Ϊ������г�ʼ���������󱻴�����ͬʱ�;߱����Ժ͹��ܣ�

3. ��������ע��
�ٹ����������Ʊ���������һ�£�
����һ������û����ʾ�ṩ�κι�������ϵͳ�ṩһ��Ĭ�ϵ��޲ι�����
		public Person(){}
����һ��������ʾ���ṩ���κι�������ϵͳĬ���޲ι������������ṩ
�ܹ�����ֻ�ܵ���һ�Σ��������ڴ��������ʱ��
�ݹ�����֮����Թ�������

4. ������������
ǰ�᣺��ͬһ������
�ٹ�����������ͬ
�ڲ����б�ͬ�����������͡������ĸ�����

5. Ϊ���Ը���ʼֵ�ķ�ʽ
��Ĭ��ֵ��ȱʡֵ��
��ֱ����ʾ��ֵ
�۹�������ֵ

˳�򣺢٢ڢ�
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

		Person p3 = new Person("����");
		System.out.println(p3.getName());

		Person p4 = new Person("����", 35);
		p4.setName("����");
		System.out.println(p4.getName() + "," + p4.getAge());

		Person p5 = new Person();*/

		Person p = new Person("����");
		System.out.println(p.getName());
	}
}

class Person{
	

	private String name = "����";
	private int age;

	//����һ��������
	public Person(){
		System.out.println("Person's Constructor����");
		cry();

		this.name = "����";
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
		System.out.println("�ޡ�����");
	}
}