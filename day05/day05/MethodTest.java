/*
������ֵ���ݣ�

�����������ͣ�����������������Ϊ���������ݸ��������������н�����ԭֵ���ᷢ���ı�
�����������ͣ�����������������Ϊ���������ݸ��������������н�����ԭ��������ֵ�ᷢ���ı�
*/
class MethodTest {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();


		/*int a = 10;
		int b = 20;
		mt.add(a, b);
		
		System.out.println("a=" + a + " b=" + b);*/

		
		//�����ĸ�ʽ���������� ������ = ֵ;
		/*int a = 10;
		String str = "abc";
		Number1 num1 = new Number1();*/

		Number1 n = new Number1();
		n.a = 10;
		n.b = 20;

		mt.add(n);
		
		System.out.println("n.a=" + n.a + " n.b=" + n.b);//n.a=11  n.b=22
	}

	//���󣺸ı���������ֵ
	/*public void add(int a, int b){//int a = 10, int b = 20
		a += 1; 
		b += 2;
	}*/

	public void add(Number1 num){//��������ʱ������һ����ֵ���൱�� ��Number1 num = new Number1();
		num.a += 1;
		num.b += 2;
	}
}

class Number1{

	int a;
	int b;

}