/*
�ɱ��������Ҫ����
	public int add(int ... args){//�������ߵ���ʱ���Դ��� 0 ������ int ���͵�ʵ��
	ע�⣺
		�ٿɱ�������������֮�䲻�ܹ�������
		�ڿɱ��������д�ڲ����б��ĩβ
*/
class ArrayTest4 {
	public static void main(String[] args) {

		ArrayTest4 at = new ArrayTest4();

		//ÿ�ε��÷�����Ҫ����һ�����飬�е��鷳
		/*int[] array = {1,2,3,4,5};
		int sum = at.add(array);
		System.out.println(sum);*/

		/*int sum = at.add(1,2,3,4,5);
		System.out.println(sum);*/

		at.add(15.6, "aaa", "bbb", "ccc");
	}

	//���󣺼������������ĺ�
	public int add(int a, int b){
		return a + b;
	}

	public int add(int a, int b, int c){
		return a + b + c;
	}

	//���󣺿���ʵ�ּ��� N �������ĺ�
	/*public int add(int[] arr){
	
		int sum = 0;

		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}

		return sum;

	}*/

	
	public int add(int ... args){//�������ߵ���ʱ���Դ��� 0 ������ int ���͵�ʵ��
		int sum = 0;

		for(int i = 0; i < args.length; i++){
			sum += args[i];
		}

		return sum;
	}

	public int add(String ... strs){
		return 0;
	}

	/*public void add(Person ... persons){
		for(int i = 0; i < persons.length; i++){
			Person p = persons[i];
		}
	}*/

	public void add(double d1, String ... args){
		System.out.println(d1);

		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}
}
