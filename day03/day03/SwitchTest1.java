/*
一、流程控制

顺序结构

分支结构
	条件判断

	选择结构：
		
		switch(表达式){
			case 值1:
				//执行的语句
				break;
			case 值2:
				//执行的语句
				break;
			case 值3:
				//执行的语句
				break;
			……
			default:
				//执行的语句
				break;
		}

		注意：
			①表达式结果的数据类型只能是 byte short char int String(jdk1.7后) 枚举
			②default 是可选的
			③表达式结果的类型需要与case后值的类型保持一致！
			④break 是可选的，一旦表达式结果与case后值匹配成功，执行相应的语句，直到遇到 break 为止！
			⑤case后只能写常量值，不能写表达式
循环结构

*/
class SwitchTest1 {
	public static void main(String[] args) {

		/*int num = 5;

		switch(num){
			case 1:
				System.out.println("一");
				break;
			case 2:
				System.out.println("二");
				break;
			case 3:
				System.out.println("三");
				break;
			default:
				System.out.println("其他数字");
				break;
		}*/

		/*char ch = '1';

		switch(ch){
			case '1':
				System.out.println("一");
				break;
			case '2':
				System.out.println("二");
				break;
			case '3':
				System.out.println("三");
				break;
			default:
				System.out.println("其他数字");
				break;
		}*/

		int num = 8;

		//需求：若一个数大于等于2 并且，小于等于5，则打印 "2-5"

		switch(num){
			case 1:
				System.out.println("一");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("2-5");
				break;
			default:
				System.out.println("其他数字");
				break;
		}


		System.out.println("其他功能");
	}
}
