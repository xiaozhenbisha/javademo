/*
��Ԫ���������Ŀ���������

	��ʽ��
		�������ʽ  ?  ���ʽ1  :  ���ʽ2;

	���������ʽ���Ϊ true ִ�� ���ʽ1 ����ִ�� ���ʽ2
	�ڱ��ʽ1 �� ���ʽ2 ���������������Ҫ����һ�£�
*/
class VariableTest5 {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		/*int res =  a > b ? a - b : a + b;
		System.out.println(res);*/

		//String str = a > b ? a : "������";
		//System.out.println(a > b ? a : "������");

		//���󣺻�ȡ�������Ľϴ�ֵ
		int max = a > b ? a : b;
		System.out.println(max);
	}
}
