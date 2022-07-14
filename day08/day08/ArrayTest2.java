/*
数组的常见算法
1.求数组元素的最大值、最小值、平均数、总和等

2.数组的复制、反转

3.*数组元素的排序

*/
import java.util.Arrays;
class ArrayTest2 {
	public static void main(String[] args) {
		int[] array = {2, 3, 20, 0, -100};

		//最大值
		int max = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}

		System.out.println("最大值为：" + max);

		//最小值
		int min = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}

		System.out.println("最小值为：" + min);

		//总和
		int sum = 0; //计数器
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}

		System.out.println("总和为：" + sum);

		//平均值
		System.out.println("平均值为：" + (double)sum / array.length);

		//数组的复制
		int[] array2 = new int[array.length];

		for(int i = 0; i < array2.length; i++){
			array2[i] = array[i];
		}

		//数组的反转
		for(int a : array){
			System.out.print(a + "\t");
		}

		for(int i = 0; i < array.length / 2; i++){
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}


		//数组的排序
		Arrays.sort(array);


		//数组的遍历
		System.out.println();
		for(int a : array){
			System.out.print(a + "\t");
		}

	}
}
