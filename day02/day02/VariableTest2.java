/*
һ����������������

�����������ͣ�8�֣���
	���ͣ�   byte(8λ)   short(16λ)   int(32λ)   long(64λ)
	�����ͣ�float(32λ)  double(64λ)
	�ַ��ͣ�char(16λ-2���ֽ�)
	�����ͣ�boolean


�����������ͣ�
	|--��(class)  --------------------  String
	|--�ӿ�(interface)
	|--����([])

������������֮���ת��
�Զ�����ת�����Զ���������С����ת��������ϵͳ�Զ����
	��byte  short  char --->  int --->  long  --->  float  ---> double
	��byte short char ����֮�䲻�����㣬�����㶼���Զ������� int ��������
	��boolean ����������

	���κλ������������� String ʹ�����ӷ� "+" �������Զ����ӳ� String

ǿ������ת����������תС��������Ҫʹ�� ǿת�� "(��Ҫת��������)"
			     ������ʧ����
*/
class VariableTest2 {
	public static void main(String[] args) {
		//�Զ�����ת��
		/*byte b = 123;
		short s = b; //�Զ�����ת�����Զ�������
		System.out.println(s);

		int i1 = 100;

		int i2 = b + i1; //�Զ�����ת��
		System.out.println(i2);

		//ע�⣺
		long l1 = 230L;
		float f1 = 15.6F;

		float res = l1 + f1;

		System.out.println(res);

		char c1 = 'A';
		short s1 = 100;

		int i3 = c1 + s1;
		System.out.println(i3);

		char c2 = 'A';
		char c3 = 'B';
		int i4 = c2 + c3;
		System.out.println(i4);*/

		//ǿ������ת��
		/*int i1 = 297;
		byte b1 = (byte)i1;
		System.out.println(b1);

		float f = (float)15.6;*/

		//�κλ������������� String ʹ�����ӷ� "+" �������Զ����ӳ� String
		
		int a = 10;
		boolean b = false;
		double d1 = 15.6;
		float f = 22.22F;

		String str = "������";

		String str2 = str + a + b + d1 + f;
		System.out.println(str2);

		String str3 = a + d1 + str + b + f + a * 2;
		System.out.println(str3);

		String str4 = "";
	}
}
