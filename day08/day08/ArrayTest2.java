/*
����ĳ����㷨
1.������Ԫ�ص����ֵ����Сֵ��ƽ�������ܺ͵�

2.����ĸ��ơ���ת

3.*����Ԫ�ص�����

*/
import java.util.Arrays;
class ArrayTest2 {
	public static void main(String[] args) {
		int[] array = {2, 3, 20, 0, -100};

		//���ֵ
		int max = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}

		System.out.println("���ֵΪ��" + max);

		//��Сֵ
		int min = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}

		System.out.println("��СֵΪ��" + min);

		//�ܺ�
		int sum = 0; //������
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}

		System.out.println("�ܺ�Ϊ��" + sum);

		//ƽ��ֵ
		System.out.println("ƽ��ֵΪ��" + (double)sum / array.length);

		//����ĸ���
		int[] array2 = new int[array.length];

		for(int i = 0; i < array2.length; i++){
			array2[i] = array[i];
		}

		//����ķ�ת
		for(int a : array){
			System.out.print(a + "\t");
		}

		for(int i = 0; i < array.length / 2; i++){
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}


		//���������
		Arrays.sort(array);


		//����ı���
		System.out.println();
		for(int a : array){
			System.out.print(a + "\t");
		}

	}
}
