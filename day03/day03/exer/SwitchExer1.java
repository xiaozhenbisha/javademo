/*
2.��ѧ���ɼ�����60�ֵģ�������ϸ񡱡�����60�ֵģ���������ϸ񡱡�
*/
class SwitchExer1 {
	public static void main(String[] args) {

		int score = 25;

		switch(score / 10){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("���ϸ�");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("�ϸ�");
				break;
		}

	}
}
