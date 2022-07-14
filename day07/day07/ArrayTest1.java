/*
一、数组：用于批量保存一类数据，是引用数据类型之一。

数组的注意：
	①无论静态初始化还是动态初始化，必须指明长度。（静态初始化 JVM 自动分配长度）
	②数组中每个元素的位置都有一个索引值（下角标，下标），索引值从 0 开始，到数组的长度 - 1 
	③获取数组的长度： length
*/
class ArrayTest1 {
	public static void main(String[] args) {

		//1. 变量的格式：数据类型 变量名 = 值;
		/*int a = 10;
		int b;
		b = 20;*/

		//1. 声明一个数组
		int[] scores;
		String[] names;

		//2. 为数组初始化
		//方式一：静态初始化：初始化操作和赋值操作同时进行
		scores = new int[]{55,66,77,88,99};

		//方式二：动态初始化：初始化操作和赋值操作分开进行
		names = new String[5];
		
		names[0] = "张三";
		names[1] = "李四";
		names[2] = "王五";
		names[3] = "赵六";
		names[4] = "田七";

		//3. 获取数组中的元素
		/*String n = names[0];
		System.out.println(n);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);*/

		//4. 利用循环遍历数组中的元素
		int len = names.length;
		System.out.println(len);
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}

		//5. 数组的注意：
		int[] arr;

		//int arr[];
		
	}
}
