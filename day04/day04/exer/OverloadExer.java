/*
1.��д���򣬶����������ط��������á�������ΪmOL��
���������ֱ����һ��int����������int������һ���ַ���������
�ֱ�ִ��ƽ�����㲢����������˲�������������ַ�����Ϣ��
�������main ()�����зֱ��ò��������������������
*/
class OverloadExer {
	public static void main(String[] args) {
		
		int res = mOL(10);
		System.out.println(res);

		res = mOL(10, 20);
		System.out.println(res);

		mOL("������������2����");

	}

	public static int mOL(int a){
		return a * a;
	}

	public static int mOL(int a, int b){
		return a * b;
	}

	public static void mOL(String str){	
		System.out.println(str);
	}
}
