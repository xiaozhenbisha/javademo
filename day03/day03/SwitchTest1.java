/*
һ�����̿���

˳��ṹ

��֧�ṹ
	�����ж�

	ѡ��ṹ��
		
		switch(���ʽ){
			case ֵ1:
				//ִ�е����
				break;
			case ֵ2:
				//ִ�е����
				break;
			case ֵ3:
				//ִ�е����
				break;
			����
			default:
				//ִ�е����
				break;
		}

		ע�⣺
			�ٱ��ʽ�������������ֻ���� byte short char int String(jdk1.7��) ö��
			��default �ǿ�ѡ��
			�۱��ʽ�����������Ҫ��case��ֵ�����ͱ���һ�£�
			��break �ǿ�ѡ�ģ�һ�����ʽ�����case��ֵƥ��ɹ���ִ����Ӧ����䣬ֱ������ break Ϊֹ��
			��case��ֻ��д����ֵ������д���ʽ
ѭ���ṹ

*/
class SwitchTest1 {
	public static void main(String[] args) {

		/*int num = 5;

		switch(num){
			case 1:
				System.out.println("һ");
				break;
			case 2:
				System.out.println("��");
				break;
			case 3:
				System.out.println("��");
				break;
			default:
				System.out.println("��������");
				break;
		}*/

		/*char ch = '1';

		switch(ch){
			case '1':
				System.out.println("һ");
				break;
			case '2':
				System.out.println("��");
				break;
			case '3':
				System.out.println("��");
				break;
			default:
				System.out.println("��������");
				break;
		}*/

		int num = 8;

		//������һ�������ڵ���2 ���ң�С�ڵ���5�����ӡ "2-5"

		switch(num){
			case 1:
				System.out.println("һ");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("2-5");
				break;
			default:
				System.out.println("��������");
				break;
		}


		System.out.println("��������");
	}
}
