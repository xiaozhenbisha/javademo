/*
ʹ�ü�����
(1)����һ����ΪTestArray���࣬��main()����������array1��array2����������
������int[]���͵����顣
(2)ʹ�ô�����{}����array1��ʼ��Ϊ8��������2,3,5,7,11,13,17,19��
(3)��ʾarray1�����ݡ�
(4)��ֵarray2��������array1���޸�array2�е�ż����Ԫ�أ�ʹ���������ֵ
(��array[0]=0,array[2]=2)����ӡ��array1��
*/
class ArrayTest2 {
	public static void main(String[] args) {
		//int[] arr = new int[]{1,2,3,4,5};
		//int[] arr;
		//arr = new int[]{1,2,3,4,5};

		//int[] arr = {1,2,3,4,5};
		/*
		������﷨��ʽ
		int[] arr;
		arr = {1,2,3,4,5};*/

		int[] array1 = {2,3,5,7,11,13,17,19};
		int[] array2;

		for(int a : array1){
			System.out.print(a + "\t");
		}
		
		System.out.println();
		System.out.println("--------------------------");

		//���ݵĵ�ֵַ
		array2 = array1;

		for(int i = 0; i < array2.length; i++){
			if(i % 2 == 0){
				array2[i] = i;
			}
		}
		
		System.out.println("--------------------------");

		for(int a : array1){
			System.out.print(a + "\t");
		}

		System.out.println();

		for(int a : array2){
			System.out.print(a + "\t");
		}
	}
}
