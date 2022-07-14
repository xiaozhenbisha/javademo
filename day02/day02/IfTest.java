/*
流程控制：


顺序结构


分支结构

	条件判断：

			①
			if(条件表达式){
				//当条件表达式结果为 true 时，需要执行的语句
			}

			②
			if(条件表达式){
				//当条件表达式结果为 true 时，需要执行的语句
			}else{
				//当条件表达式结果为 false 时，需要执行的语句
			}

			③
			if(条件表达式1){
				//当条件表达式1 结果为 true 时，需要执行的语句
			}else if(条件表达式2){
				//当条件表达式2 结果为 true 时，需要执行的语句
			}else if(条件表达式3){
				//当条件表达式3 结果为 true 时，需要执行的语句
			}
			……
			else{
				//当上述条件表达式结果都为 false 时，需要执行的语句
			}

			注意：
				①当某个条件表达式结果为 true 时，执行相应的语句，其他 else-if 将不再执行
				② if-else 语句可以嵌套

	选择结构：


循环结构

*/
class IfTest {
	public static void main(String[] args) {

		int age = 69;

		/*if(age >= 18){
			System.out.println("已经成年！");
		}*/

		/*if(age >= 18){
			System.out.println("已经成年！");
		}else{
			System.out.println("未满18不得观看！");
		}*/

		/*if(age >= 18 && age < 30){
			System.out.println("青年");
		}else if(age >= 30 && age < 60){
			System.out.println("壮年");
		}else if(age >= 60){
			System.out.println("老年");
		}*/

		if(age > 0 && age < 150){
			if(age >= 60){
				System.out.println("老年");
			}else if(age >= 30){
				System.out.println("壮年");
			}else if(age >= 18){
				System.out.println("青年");
			}else{
				System.out.println("未成年");
			}
		}else{
			System.out.println("是个妖怪");
		}


		System.out.println("测试 if");
	}
}
