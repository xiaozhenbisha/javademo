/*
����һ��intArray�����������Ϊ�������顣��main�����д���20��Ԫ�ص����飬
�����䴫�ݸ�intArray������
intArray�����н������д��2��ʼ��20��ż����Ȼ��ʹ����ǿ��for
ѭ����������Ԫ�ز���ӡ������

*/
class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr = new int[20];

		ArrayTest2 at = new ArrayTest2();

		at.intArray(arr);

		for(int a : arr){
			System.out.println(a);
		}

	}

	public void intArray(int[] arr){
	
		for(int i = 0; i < arr.length; i++){
			arr[i] = 2 * i + 2;
		}

	}
}
