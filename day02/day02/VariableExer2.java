/*
1. ʹ����Ԫ���������ȡ�������еĽϴ���
2. ʹ����Ԫ���������ȡ�������еĽϴ��� 

*/
class VariableExer2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		/*int max = a > b ? a : b;
		max = max > c ? max : c;*/

		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println(max);

	}
}
/*
���������

+  -   +  -  *  /  %  ++  --  +

��ֵ�����

=   +=  -=  *=  /=  %=


�Ƚ����������ϵ�������
==     !=    >   <   >=   <=


�߼������
&&    ||    !   &  |   ^



λ�����
~     &   |   ^    <<  >>  >>>



��Ԫ�����



*/