/*
һ�����飺������������һ�����ݣ���������������֮һ��

�����ע�⣺
	�����۾�̬��ʼ�����Ƕ�̬��ʼ��������ָ�����ȡ�����̬��ʼ�� JVM �Զ����䳤�ȣ�
	��������ÿ��Ԫ�ص�λ�ö���һ������ֵ���½Ǳ꣬�±꣩������ֵ�� 0 ��ʼ��������ĳ��� - 1 
	�ۻ�ȡ����ĳ��ȣ� length
*/
class ArrayTest1 {
	public static void main(String[] args) {

		//1. �����ĸ�ʽ���������� ������ = ֵ;
		/*int a = 10;
		int b;
		b = 20;*/

		//1. ����һ������
		int[] scores;
		String[] names;

		//2. Ϊ�����ʼ��
		//��ʽһ����̬��ʼ������ʼ�������͸�ֵ����ͬʱ����
		scores = new int[]{55,66,77,88,99};

		//��ʽ������̬��ʼ������ʼ�������͸�ֵ�����ֿ�����
		names = new String[5];
		
		names[0] = "����";
		names[1] = "����";
		names[2] = "����";
		names[3] = "����";
		names[4] = "����";

		//3. ��ȡ�����е�Ԫ��
		/*String n = names[0];
		System.out.println(n);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);*/

		//4. ����ѭ�����������е�Ԫ��
		int len = names.length;
		System.out.println(len);
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}

		//5. �����ע�⣺
		int[] arr;

		//int arr[];
		
	}
}
