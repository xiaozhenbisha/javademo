/*
��ϰһ
����һ��char���͵�26��Ԫ�ص����飬�ֱ� ����'A'-'Z����
ʹ��forѭ����������Ԫ�ز���ӡ������
��ʾ��char������������ 'A'+1 -> 'B'��'0'+1 -> '1��
��ϰ��
����һ��char���͵�36��Ԫ�ص����飬ǰ26��Ԫ�ط���'A'-'Z��,   
��10��Ԫ�ط���'0'-'9����
ʹ��forѭ����������Ԫ�ز���ӡ������

*/
class ArrayTest1 {
	public static void main(String[] args) {
		char[] letters = new char[36];

		/*letters[0] = (char)('A' + 0);
		letters[1] = (char)('A' + 1);
		letters[2] = (char)('A' + 2);*/

		for(int i = 0; i < letters.length; i++){
			if(i < 26){
				letters[i] = (char)('A' + i);
			}else{
				letters[i] = (char)('0' + i - 26);			
			}
		}

		//����ı���
		for(int i = 0; i < letters.length; i++){
			System.out.println(letters[i]);
		}
	}
}
