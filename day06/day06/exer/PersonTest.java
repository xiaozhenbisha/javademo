/*
1.��������,�����ж��������ࣺPerson��TestPerson�ࡣ�������£�
    ��setAge()�����˵ĺϷ�����(0~130)����getAge()�����˵����䡣
	��TestPerson����ʵ����Person��Ķ���b������setAge()��getAge()������
	���Java�ķ�װ�ԡ�

1. ��ǰ�涨���Person������ӹ����������ù��������������˵�age���Գ�ʼֵ��Ϊ18��

2. �޸���������͹�����������name����,ʹ��ÿ�δ���Person�����ͬʱ��ʼ������
��age����ֵ��name����ֵ
*/
class PersonTest {
	public static void main(String[] args) {
		/*Person b = new Person();
		//b.age = -10;

		b.setAge(10);

		System.out.println(b.getAge());*/

		/*Person p = new Person();

		System.out.println(p.getAge());*/

		Person p = new Person("����", -18);
		System.out.println(p.getName() + "," + p.getAge());
	}
}

class Person{

	//1. ����˽�л�
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

	//2. �ṩ������ get/set ����
	public void setAge(int i){
		if(i >= 0 && i <= 130){
			age = i;
		}
	}

	//��ȡ����ֵ
	public int getAge(){
		return age;
	}
}
