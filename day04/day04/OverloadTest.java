/*
���ط�����Overload��
��ͬһ������
�ٷ�������ͬ
�ڲ����б�ͬ�������ĸ��������������ͣ�
ע�⣺�뷵��ֵ�����޹�
*/
class OverloadTest {
	public static void main(String[] args) {

		add(10, 20);

	}

	//���󣺼������������ĺ�
	/*public static int add(int a, int b){
		System.out.println("�������������ĺ�");
		return a + b;
	}*/

	//���󣺼������������ĺ�
	public static int add(int a, int b, int c){
		return a + b + c;
	}

	public static double add(double d1, double d2){
		System.out.println("���������������ĺ�");
		return d1 + d2;
	}

	public static void add(float f1, float f2){
	
	}

	public static void add(int a, double d1){
		System.out.println("һ�� int һ�� double");
	}	

	public static void add(String str, char c){
	
	}

	public static void add(char c, String str){
	
	}
}
