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
*/
class VariableTest1 {
	public static void main(String[] args) {
		//�����ĸ�ʽ���������� ������ = ֵ;

		//���ͣ�   byte(8λ)   short(16λ)   int(32λ)-Ĭ������   long(64λ)
		byte b1 = 123;
		short s1 = 12345;
		int i1 = 1235456;

		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);

		//ע�⣺���� long �ͱ���ʱ��ֵ����Ҫ�� L �� l
		long l1 = 245324534657L;
		System.out.println(l1);

		//�����ͣ�float(32λ)  double(64λ)-Ĭ������
		//ע�⣺���� float �ͱ�����ֵ������ F �� f
		float f1 = 15.6f;
		System.out.println(f1);

		//ע�⣺���� double �ͱ���ʱ��ֵ����Լ� D �� d
		double d1 = 1234.45645d;
		System.out.println(d1);

		double d2 = .512;
		double d3 = 5.12E6;
		System.out.println("-----" + d2);
		System.out.println("-----" + d3);

		//�ַ��ͣ�char(2���ֽ�-16λ)
		//ע�⣺���� char �ͱ�����ֵ����ʹ�õ����ţ�char ����ֻ�ܴ浥���ַ�
		//char ���� Unicode ������д洢��ASCII�����ġ����ġ������ַ���
		char c1 = 'A';
		char c2 = '��';
		char c3 = '1';
		char c4 = '$';

		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);

		//ת���ַ�
		char c5 = '\'';
		char c6 = '\n';
		char c7 = '\t';
		char c8 = ' ';
		char c9 = '\u6C99';

		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);

		//�����ͣ�boolean
		//true-��
		//false-��
		boolean bb1 = true;
		boolean bb2 = false;

		System.out.println(bb1);
		System.out.println(bb2);

		//String : �ַ���
		//ע�⣺String ���͵�ֵ����ʹ�� ˫����
		String str = "�Ҵ��й�����䣡";
		System.out.println(str);

		System.out.println("HelloWorld!");
	}
}
