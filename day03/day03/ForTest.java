/*
ѭ���ṹ���ظ���ִ��ĳ���

�ٳ�ʼ��ֵ
��ѭ������
�۵�������
��ѭ����

	for(�� ;  �� ; ��){
		��
	}

	�٢ڢܢۢڢܢۢڡ�����
*/
class ForTest {
	public static void main(String[] args) {
		/*System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");*/

		/*for(int i = 0; i < 5; i++){
			System.out.println("Hello World!");
		}*/

		/*int i = 0;
		for(i = 0, System.out.print("a") ; i < 5 ; i++, System.out.print("b")){
			System.out.print("c");
		}//acbcbcbcbcb*/

		//���󣺴�ӡ 100 ���ڵ�ż��, ż���ĸ�����ż���ĺ�
		int count = 0; //������
		int sum = 0;
		for(int i = 0; i <= 100; i++){
			if(i % 2 == 0){
				System.out.println(i);
				count++;

				sum += i;
			}
		}

		System.out.println("ż���ĸ���Ϊ��" + count);
		System.out.println("ż���ĺ�Ϊ��" + sum);
	}
}
