/*
������ֵ����

�����������ͣ�������������������Ϊ���������ݸ��������������н�����ԭֵ���ᷢ���ı�
�����������ͣ�

*/
class MethodTest3 {
	public static void main(String[] args) {
	
		//add(10, 20);

		int a = 10;
		int b = 20;

		System.out.println("main �������� add ����ǰ��a=" + a + " b=" + b);//i=10 j=20

		add(a, b);

		System.out.println("main �������� add ������a=" + a + " b=" + b);//i=10 j=20
	}

	//���󣺸ı���������ֵ
	public static void add(int a, int b){//����������ʱ���β�һ����ֵ
		System.out.println("add ��������ǰ��a=" + a + " b=" + b);//a=10 b=20

		a += 1;
		b += 2;

		System.out.println("add �������к�a=" + a + " b=" + b);//a=11 b=22
	}
}
