/*
1��100֮�����������:����1���䱾�����ܱ�������Ȼ����������

*/
class PrimeNumber {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		boolean flag = true;

		for(int i = 2; i <= 100000; i++){
			//boolean flag = true;

			for(int j = 2; j < i; j++){
				
				if(i % j == 0){
					//����һ����������
					flag = false;
					break;
				}
			}

			//����ȷ�� i �Ƿ�����������������ӡ��
			if(flag){
				System.out.println(i);
			}

			flag = true;
		}

		long end = System.currentTimeMillis();

		System.out.println("�ķ�ʱ��Ϊ��" + (end - start));//28312   2792

	}
}
