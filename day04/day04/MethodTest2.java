/*
������÷���������ʱʹ�� static ���εķ���Ϊ����

ͨ�� ����.������() �ķ�ʽ����

ע�⣺���� .java Դ�ļ��е�����÷�����JVM ����ʱ���Զ�����˳����
���� ����.java Դ�ļ�����û�� .java Դ�ļ������� .class �ֽ����ļ�ִ��

*/

class MethodTest2 {
	public static void main(String[] args) {
		
		/*int area = Another.method(10, 20);
		System.out.println(area);*/

		StaticMethodClass.print99();
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