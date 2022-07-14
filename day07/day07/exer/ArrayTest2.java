/*
声明一个intArray方法，其参数为整型数组。在main方法中创建20个元素的数组，
并将其传递给intArray方法。
intArray方法中将数组中存放2开始的20个偶数。然后使用增强型for
循环访问所有元素并打印出来。

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
