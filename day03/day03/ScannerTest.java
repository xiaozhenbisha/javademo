//1. ����
import java.util.Scanner;
class ScannerTest {
	public static void main(String[] args) {
		//2. ���� Scanner �Ķ���
		Scanner scan = new Scanner(System.in);

		//3. ͨ�� next() �� nextXxx() �������ռ������롣 Xxx ��������������
		//ע�⣺û�� nextChar()
		System.out.print("������������");
		String name = scan.next();

		System.out.print("���������䣺");
		int age = scan.nextInt();

		System.out.print("������ɼ���");
		double score = scan.nextDouble();

		System.out.print("�������Ա�");
		char gender = scan.next().charAt(0); //abcdef

		System.out.println("������" + name);
		System.out.println("���䣺" + age);
		System.out.println("�ɼ���" + score);
		System.out.println("�Ա�" + gender);
	}
}
