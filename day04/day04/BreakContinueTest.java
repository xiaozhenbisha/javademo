/*
�������̿�����䣺

break : ������������ǰ��ѭ���������� switch-case �����ڽ�����ǰ�� switch-case ���
continue : �������������Ρ�ѭ����

*/
class BreakContinueTest {
	public static void main(String[] args) {
		
		/*for(int i = 0; i <= 10; i++){
			if(i == 3){
				System.out.println("--" + i);
				//break;
				continue;
			}
		
			System.out.println(i);
		}*/


		/*label:for(int i = 0; i <= 10; i++){
			for(int j = 0; j <= 10; j++){
				if(j == 3){
					System.out.println("--" + j);
					//break label;
					continue label;
				}

				System.out.println(j);
			}
		}*/

		/*label:{//continue ��֧�ֽ�����������ʽ

			for(int i = 0; i <= 10; i++){
				for(int j = 0; j <= 10; j++){
					if(j == 3){
						System.out.println("--" + j);
						break label;
					}

					System.out.println(j);
				}
			}

			System.out.println("Hello Break!");

		}*/


		/*while(true){
			System.out.println("����ѭ��");
		}*/

		for(;;){
			System.out.println("����ѭ��");	
		}

	}
}
