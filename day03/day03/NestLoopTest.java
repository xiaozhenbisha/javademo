/*
嵌套循环：一个循环充当另一个循环的循环体
*/
class NestLoopTest {
	public static void main(String[] args) {
		/*
			*****
		*/
		/*for(int i = 0; i < 5; i++){
			System.out.print("*");
		}*/

		/*
			*****
			*****
			*****
			*****
		*/
		for(int j = 0; j < 4; j++){//外层循环控制打印的行数
			for(int i = 0; i < 5; i++){//内层循环控制打印的列数
				System.out.print("*");
			}
			System.out.println();
		}


		/*
			*****
			****
			***
			**
			*
			i	j*
			0	5
			1	4
			2	3
			3	2
			4	1

			j = 5 - i;
		*/
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5 - i; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		/*
			*
			**
			***
			****
			i	j*
			0	1
			1	2
			2	3
			3	4

			j = i + 1;
		*/
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < i + 1 ; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		/*
			*
			**
			***
			****
			*****
			****
			***
			**
			*
		*/
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < i + 1 ; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5 - i; j++){
				System.out.print("*");
			}

			System.out.println();
		}


		/*

		【拓展】
		打印如下图形
		----*
		---* *
		--* * *
		-* * * *
		* * * * *
		i  j-	k*
		0  4	1
		1  3	2
		2  2	3
		3  1	4
		4  0	5
		j = 4 - i;
		k = i + 1;
	------------------------------

		-* * * *
		--* * *
		---* *
		----*

		i	j-	k*
		0	1	4
		1	2	3
		2	3	2
		3	4	1
		j = i + 1;
		k = 4 - i;
		*/
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 4 - i; j++){
				System.out.print(" ");
			}

			for(int k = 0; k < i + 1; k++){
				System.out.print("* ");
			}

			System.out.println();
		}
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < i + 1; j++){
				System.out.print(" ");
			}

			for(int k = 0; k < 4 - i; k++){
				System.out.print("* ");
			}

			System.out.println();
		}

	}
}
