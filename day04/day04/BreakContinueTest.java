/*
特殊流程控制语句：

break : 用于跳出“当前”循环。可用于 switch-case ，用于结束当前的 switch-case 语句
continue : 用于跳出“当次”循环。

*/
class BreakContinueTest {
	public static void main(String[] args) {
		
		/*for(int i = 0; i <= 10; i++){
			if(i == 3){
				System.out.println("--" + i);
				//break;
				continue;
			}
		
			System.out.println(i);
		}*/


		/*label:for(int i = 0; i <= 10; i++){
			for(int j = 0; j <= 10; j++){
				if(j == 3){
					System.out.println("--" + j);
					//break label;
					continue label;
				}

				System.out.println(j);
			}
		}*/

		/*label:{//continue 不支持结束代码块的形式

			for(int i = 0; i <= 10; i++){
				for(int j = 0; j <= 10; j++){
					if(j == 3){
						System.out.println("--" + j);
						break label;
					}

					System.out.println(j);
				}
			}

			System.out.println("Hello Break!");

		}*/


		/*while(true){
			System.out.println("无限循环");
		}*/

		for(;;){
			System.out.println("无限循环");	
		}

	}
}
