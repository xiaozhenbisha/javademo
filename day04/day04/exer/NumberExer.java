/*
��д��������Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ�����
����Ϊ0ʱ��������
*/
import java.util.Scanner;
class NumberExer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int pos = 0; //������
		int neg = 0;
		
		System.out.println("������������0-�˳���:");
		while(true){
			int num = scan.nextInt();

			if(num > 0){
				pos++;
			}else if(num < 0){
				neg++;
			}else{
				break;
			}
		}

		System.out.println("�����ĸ���Ϊ��" + pos);
		System.out.println("�����ĸ���Ϊ��" + neg);
	}
}
