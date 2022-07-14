/*
1—100之间的所有质数:除了1和其本身，不能被其他自然数整除的数

*/
class PrimeNumber {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		boolean flag = true;

		for(int i = 2; i <= 100000; i++){
			//boolean flag = true;

			for(int j = 2; j < i; j++){
				
				if(i % j == 0){
					//该数一定不是质数
					flag = false;
					break;
				}
			}

			//可以确定 i 是否是质数，是质数打印。
			if(flag){
				System.out.println(i);
			}

			flag = true;
		}

		long end = System.currentTimeMillis();

		System.out.println("耗费时间为：" + (end - start));//28312   2792

	}
}
