/*
��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů����
��ȻҪ���һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
�������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
�������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
������������������㣬�򣺡����ޣ���

*/
import java.util.Scanner;
class IfExer5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("���������(cm):");
		int height = scan.nextInt();

		System.out.println("������Ƹ�(��):");
		double money = scan.nextDouble();

		System.out.println("��������ֵ(��/��):");
		//char face = scan.next().charAt(0);
		String face = scan.next();

		if(height >= 180 && money >= 1000 && face.equals("��")){
			System.out.println("��һ��Ҫ�޸���!!!");
		}else if(height >= 180 || money >= 1000 || face.equals("��")){
			System.out.println("�ްɣ����ϲ��㣬�������ࡣ");
		}else{
			System.out.println("���ޣ�");
		}
	}
}
