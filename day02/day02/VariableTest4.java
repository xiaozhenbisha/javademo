/*
��ֵ������� =     +=   -=    *=    /=   %=

�Ƚ����������ϵ��������� ==   !=   >  <   >=   <=

�߼�������� 
&&  ����·��    ||  �� ��·��    !    �� �߼���     &  :  �߼���   |   -  �߼���    ^   - �߼����


�������⡿ &&  ��  &  ������
&& ����Ϊ��·�룬��&&��߱��ʽ���Ϊ false ʱ���ұ߱��ʽ�����ټ���
& ����λ��������������߼�����ʱ��������߱��ʽ���Ϊ true ���� false���ұ߱��ʽ������


||  ��  | �� ����

*/
class VariableTest4 {
	public static void main(String[] args) {
		//��ֵ�����
		/*int a = 10;

		a += 5; //�൱��  a = a + 5
		System.out.println(a);//15

		a %= 3; //a = a % 3;
		System.out.println(a);

		//�������⡿
		short s = 5;
		//s = s + 1; //���룿NO  ���У�

		s += 1; //s = (short)(s + 1) ���룿 YES
		System.out.println(s);*/

		//�Ƚ����������ϵ�������: ����Ľ����Ϊ boolean
		/*int a = 10;
		int b = 10;

		boolean boo = a == b;
		System.out.println(boo);

		System.out.println(a != b);*/

		//�߼������������Ľ����Ϊ boolean
		
		//�����ж�һ�����ǲ��Ǵ���10 С��20 
		//int a = 10;

		//�����д��
		/*boolean boo = 10 < a < 20;
		System.out.println(boo);*/

		/*boolean boo = a > 10 && a < 20;
		System.out.println(boo);*/

		/*boolean b1 = true && true;
		boolean b2 = true && false;
		boolean b3 = false && true;
		boolean b4 = false && false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);*/

		/*boolean b1 = true || true;
		boolean b2 = true || false;
		boolean b3 = false || true;
		boolean b4 = false || false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);*/

		/*boolean b1 = !true;
		System.out.println(b1);*/

		int a = 10;

		boolean boo = a > 10 && a++ < 20;

		System.out.println(boo);
		System.out.println(a);//10    11

		/*boolean b1 = true ^ true;
		boolean b2 = true ^ false;
		boolean b3 = false ^ true;
		boolean b4 = false ^ false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);*/

		
		
	}
}
