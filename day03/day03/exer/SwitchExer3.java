/*
��д���򣺴Ӽ����϶���һ��ѧ���ɼ�������ڱ���score�У�
����score��ֵ������Ӧ�ĳɼ��ȼ���

score>=90           �ȼ���A
70=<score<90     �ȼ�: B
60=<score<70     �ȼ�: C
score<60             �ȼ���D

*/
import java.util.Scanner;
class SwitchExer3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("������ѧ���ɼ���");
		int score = scan.nextInt();

		switch(score / 10){
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
			case 7:
				System.out.println("B");
				break;
			case 6:
				System.out.println("C");
				break;
			default :
				System.out.println("D");
				break;
		}
	}
}
