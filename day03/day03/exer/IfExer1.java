/*
�Ӽ�������С������ĩ�ɼ���
���ɼ�Ϊ100��ʱ������һ��BMW��
���ɼ�Ϊ[80-99]ʱ������һ��̨iphone15s��
���ɼ�Ϊ[60-80]ʱ������һ���ο��飻
����ʱ��ʲô����Ҳû�С�
*/
//1. ����
import java.util.Scanner;
class IfExer1 {
	public static void main(String[] args) {
		//2. ���� Scanner �Ķ���
		Scanner scan = new Scanner(System.in);

		//3. ���ռ�������
		System.out.print("������ɼ���");
		int score = scan.nextInt();

		//�ж�
		if(score == 100){
			System.out.println("����һ��BMW");
		}else if(score >= 80 && score < 100){
			System.out.println("����һ̨ iphone15s");
		}else if(score >= 60 && score < 80){
			System.out.println("����һ���ο���");
		}else{
			System.out.println("ʲô��û��");
		}
	}
}
