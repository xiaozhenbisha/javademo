/*
��д��������һ��method�������ڷ����д�ӡһ��10*8�ľ��Σ�
��main�����е��ø÷�����

�޸���һ��������method�����У�����ӡһ��10*8�ľ����⣬�ټ���þ��ε������
��������Ϊ��������ֵ��
��main�����е��ø÷��������շ��ص����ֵ����ӡ

�޸���һ��������method�����ṩm��n���������������д�ӡһ��m*n�ľ��Σ�
������þ��ε������ ������Ϊ��������ֵ��
��main�����е��ø÷��������շ��ص����ֵ����ӡ��

�޸���һ�������½�һ��Another�࣬��method�����Ƶ������С�
��ԭ���main�����е���Another���method���������շ��ص����ֵ����ӡ��

*/
class MethodExer1 {
	public static void main(String[] args) {
	
		//method();

		/*int area = method();
		System.out.println(area);*/

		/*int area = method(10, 20);
		System.out.println(area);*/

		int area = Another.method(10, 20);
		System.out.println(area);
	}

	/*public static void method(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 8; j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}*/

	/*public static int method(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 8; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		return 10 * 8;
	}*/

	public static int method(int m, int n){
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		return m * n;
	}
}

class Another{

	public static int method(int m, int n){
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		return m * n;
	}

}