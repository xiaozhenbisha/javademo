/*
һ��������������֮һ����װ��

1. ��װ����⣺�����ص������������ñ�¶�ı�¶����

2. ���ʿ������η�
public : �����ģ��������� ���ԡ��������ࡣ���κεط������Է���
private : ˽�еģ��������� ���ԡ�������ֻ���ڱ����з���

3. ��װ�Ĳ��裺
������˽�л�(private)
���ṩ������(public) get/set ����
*/
class EncapsulationTest {
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		//a1.name = "����";
		//a1.legs = -7;

		a1.setName("����");
		a1.setLegs(4);

		System.out.println("���ƣ�" + a1.getName() + " �ȵĸ�����" + a1.getLegs());

	}
}

class Animal{

	private String name;
	private int legs; //�����ȵĸ���

	//��������ֵ
	public void setLegs(int l){
		if(l > 0 && l <= 4 && l % 2 == 0){
			legs = l;
		}
	}

	//��ȡ����ֵ
	public int getLegs(){
		return legs;
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}
}