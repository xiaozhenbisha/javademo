/*
λ�������  ~    |    &   ^      <<    >>   >>>    ע�⣺û���޷��� <<<

(�˽�) һ�����ڼ�����еĶ����Ʊ�����ʽ��������Ϊ������
	    ���������λΪ����λ��0��ʾ������1��ʾ����

	    ������ԭ�롢���롢���������һ

	    ������ԭ�룺
			����λ���䣬����ֵ�ľ���ֵ

	    �����ķ��룺
			ԭ���ȡ��

	     �����Ĳ��룺
			���� + 1

	      �ڼ�����ж����� ���� ����ʽ�洢��

*/
class VariableTest2 {
	public static void main(String[] args) {
		int a = 12;
		int b = 5;

		System.out.println(~a); //-13
		System.out.println(a | b);
		System.out.println(a & b);
		System.out.println(a ^ b);

		System.out.println(12 << 2);
		System.out.println(12 >> 2);
		System.out.println(12 >>> 2);

		System.out.println(-12 >> 2);
		System.out.println(-12 >>> 2);
	}
}
