/*
编写程序二：从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，
输入为0时结束程序。
*/
import java.util.Scanner;
class NumberExer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int pos = 0; //计数器
		int neg = 0;
		
		System.out.println("请输入整数（0-退出）:");
		while(true){
			int num = scan.nextInt();

			if(num > 0){
				pos++;
			}else if(num < 0){
				neg++;
			}else{
				break;
			}
		}

		System.out.println("正数的个数为：" + pos);
		System.out.println("负数的个数为：" + neg);
	}
}
