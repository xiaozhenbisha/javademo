/*
��ϰ2��
��дһ��Dog�࣬����name��age��weight����
��������һ��say����������String���ͣ�����������Ϣ�а�����������ֵ��
 ����һ��TestDog���е�main�����У�����Dog���󣬲�����say�������������ԣ�
 �����ý����ӡ�����

��дDog�࣬name����ʹ��ȱʡ��ʼֵ��age��weight����ʹ����ʽ��ʼֵ1��10��
��TestDog���main�����У���������Dog���󣬷ֱ�����������say������
�����ý����ӡ�����
������main�����У�������Dog�����name���Էֱ���Ϊ������ ���͡������ޡ���
�ڶ��������������Ϊ8���ٷֱ�����������say�����������ý����ӡ�����
�����������������ͬһ�ഴ���Ĳ�ͬ��������ԵĶ����ԡ�

*/
class TestDog {
	public static void main(String[] args) {
		/*Dog d1 = new Dog();
		d1.name = "��ʿ��";
		d1.age = 1;
		d1.weight = 15.6;

		String str = d1.say();
		System.out.println(str);

		Dog d2 = new Dog();
		d2.name = "��ë";
		d2.age = 2;
		d2.weight = 25.55;

		System.out.println(d2.say());*/

		Dog d1 = new Dog();
		d1.name = "����";

		Dog d2 = new Dog();
		d2.name = "������";
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
		return "���ƣ�" + name + " ���䣺" + age + " ������" + weight;
	}

}