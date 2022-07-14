/*
编写程序，从键盘接收整数参数.如果该数为1-7，打印对应的星期值，
否则打印“非法参数”。
*/
import java.util.Scanner;
class SwitchExer2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("请输入1-7的整数：");
		int num = scan.nextInt();

		switch(num){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			default:
				System.out.println("非法字符");
				break;
		}

	}
}
