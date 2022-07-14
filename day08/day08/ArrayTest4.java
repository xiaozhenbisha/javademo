/*
可变参数（重要）：
	public int add(int ... args){//当调用者调用时可以传递 0 个或多个 int 类型的实参
	注意：
		①可变参数与数组参数之间不能构成重载
		②可变参数必须写在参数列表的末尾
*/
class ArrayTest4 {
	public static void main(String[] args) {

		ArrayTest4 at = new ArrayTest4();

		//每次调用方法需要创建一个数组，有点麻烦
		/*int[] array = {1,2,3,4,5};
		int sum = at.add(array);
		System.out.println(sum);*/

		/*int sum = at.add(1,2,3,4,5);
		System.out.println(sum);*/

		at.add(15.6, "aaa", "bbb", "ccc");
	}

	//需求：计算两个整数的和
	public int add(int a, int b){
		return a + b;
	}

	public int add(int a, int b, int c){
		return a + b + c;
	}

	//需求：可以实现计算 N 个整数的和
	/*public int add(int[] arr){
	
		int sum = 0;

		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}

		return sum;

	}*/

	
	public int add(int ... args){//当调用者调用时可以传递 0 个或多个 int 类型的实参
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
