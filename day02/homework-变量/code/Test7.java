/*
2����������2��100���Ժ����ܼ���
*/
class Test7{
	public static void main(String[] args){
		int week = 2;
		week += 100;
		week = week % 7;
		System.out.println("��������2,100���Ժ�����" + (week==0?"��":week));
	}
}