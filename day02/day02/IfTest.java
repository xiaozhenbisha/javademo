/*
���̿��ƣ�


˳��ṹ


��֧�ṹ

	�����жϣ�

			��
			if(�������ʽ){
				//���������ʽ���Ϊ true ʱ����Ҫִ�е����
			}

			��
			if(�������ʽ){
				//���������ʽ���Ϊ true ʱ����Ҫִ�е����
			}else{
				//���������ʽ���Ϊ false ʱ����Ҫִ�е����
			}

			��
			if(�������ʽ1){
				//���������ʽ1 ���Ϊ true ʱ����Ҫִ�е����
			}else if(�������ʽ2){
				//���������ʽ2 ���Ϊ true ʱ����Ҫִ�е����
			}else if(�������ʽ3){
				//���������ʽ3 ���Ϊ true ʱ����Ҫִ�е����
			}
			����
			else{
				//�������������ʽ�����Ϊ false ʱ����Ҫִ�е����
			}

			ע�⣺
				�ٵ�ĳ���������ʽ���Ϊ true ʱ��ִ����Ӧ����䣬���� else-if ������ִ��
				�� if-else ������Ƕ��

	ѡ��ṹ��


ѭ���ṹ

*/
class IfTest {
	public static void main(String[] args) {

		int age = 69;

		/*if(age >= 18){
			System.out.println("�Ѿ����꣡");
		}*/

		/*if(age >= 18){
			System.out.println("�Ѿ����꣡");
		}else{
			System.out.println("δ��18���ùۿ���");
		}*/

		/*if(age >= 18 && age < 30){
			System.out.println("����");
		}else if(age >= 30 && age < 60){
			System.out.println("׳��");
		}else if(age >= 60){
			System.out.println("����");
		}*/

		if(age > 0 && age < 150){
			if(age >= 60){
				System.out.println("����");
			}else if(age >= 30){
				System.out.println("׳��");
			}else if(age >= 18){
				System.out.println("����");
			}else{
				System.out.println("δ����");
			}
		}else{
			System.out.println("�Ǹ�����");
		}


		System.out.println("���� if");
	}
}
