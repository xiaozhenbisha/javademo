/*

①初始化值
②循环条件
③迭代条件
④循环体

①
while(②){
	④

	③
}

-----------------------------------------

①
do{

	④

	③

}while(②);


while 和 do-while 的区别？
while ：先判断循环条件，再执行循环体
do-while ：先执行循环体，再判断循环条件，至少执行一次

*/
class WhileTest {
	public static void main(String[] args) {

		//需求：打印100以内的偶数, 偶数的个数, 偶数的和
		/*int count = 0;
		int sum = 0;
		int i = 0;
		while(i <= 100){
			
			if(i % 2 == 0){
				System.out.println(i);

				count++;

				sum += i;
			}

			i++;
		}

		System.out.println("偶数的个数为：" + count);
		System.out.println("偶数的和为：" + sum);*/

		
		/*int i = 0;
		int count = 0;
		int sum = 0;

		do{
		
			if(i % 2 == 0){
				System.out.println(i);

				count++;
				sum += i;
			}

			i++;

		}while(i <= 100);

		System.out.println("偶数的个数为：" + count);
		System.out.println("偶数的和为：" + sum);*/


		int i = 10;

		/*while(i < 10){
			System.out.println(i);

			i++;
		}*/


		do{

			System.out.println(i);

			i++;
		
		}while(i < 10);

	}
}
