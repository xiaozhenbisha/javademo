/*
��д���򣬴Ӽ��̽�����������.�������Ϊ1-7����ӡ��Ӧ������ֵ��
�����ӡ���Ƿ���������
*/
import java.util.Scanner;
class SwitchExer2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("������1-7��������");
		int num = scan.nextInt();

		switch(num){
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			default:
				System.out.println("�Ƿ��ַ�");
				break;
		}

	}
}
