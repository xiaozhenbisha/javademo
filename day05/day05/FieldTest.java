/*
����С����

����

�ֲ����� & ��Ա����

1. ���ԣ�Ҳ�г�Ա������Ҳ��ʵ������

2. ��Ա������ֲ�����������
���ڴ��е�λ�ò�ͬ
��������ͬ
�۳�Ա������Ĭ��ֵ�����ֲ�����û��Ĭ��ֵ����˾ֲ�����ʹ��ǰ���븳ֵ��

3. ���Ե�Ĭ��ֵ
�����������ͣ�
byte short int ---> 0
long  ---> 0L
float ---> 0.0F
double  ---> 0.0D
char ---> '\u0000'
boolean  ---> false


�����������ͣ� ---> null
	|--��(class)
	|--�ӿ�(interface)
	|--����([])

4. Ϊ���Ը���ʼֵ�ķ�ʽ
��Ĭ��ֵ��ȱʡֵ��
��ֱ����ʾ��ֵ
*/
class FieldTest {
	public static void main(String[] args) {

		/*Car c1 = new Car();
		c1.name = "����";
		c1.color = "��ɫ";
		c1.tyre = 4;

		Car c2 = new Car();
		c2.name = "����";
		c2.color = "��ɫ";
		c2.tyre = 5;

		c1.color = "��ɫ";
		System.out.println(c1.name + "," + c1.color + "," + c1.tyre);
		System.out.println(c2.name  + "," + c2.color + "," + c2.tyre);*/

		Car c1 = new Car();
		c1.color = "��ɫ";

		System.out.println(c1.name + "," + c1.color + "," + c1.tyre);

		Car c2 = new Car();
		System.out.println(c2.name + "," + c2.color + "," + c2.tyre);
	}
}

class Car{

	String name;
	String color = "��ɫ";
	int tyre; //������̥����

	public void start(){
		System.out.println("����");
	}

}