/*
2.�����������ط���max()����һ������������intֵ�е����ֵ��
�ڶ�������������doubleֵ�е����ֵ������������������doubleֵ�е����ֵ��
���ֱ��������������
*/
class OverloadExer2 {
	public static void main(String[] args) {

		double m = max(15.6, 222.22, 555.55);
		System.out.println(m);

	}

	public static int max(int a, int b){
		return a > b ? a : b;
	}

	public static double max(double d1, double d2){
		return d1 > d2 ? d1 : d2;
	}

	public static double max(double d1, double d2, double d3){
		/*double m = d1 > d2 ? d1 : d2;
		m = m > d3 ? m : d3;*/

		double m = max(d1, d2);
		m = max(m, d3);

		return m;
	}
}
