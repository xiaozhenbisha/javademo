/*
从键盘分别输入年、月、日，判断这一天是当年的第几天
 
   注：判断一年是否是闰年的标准：
       1）可以被4整除，但不可被100整除
       2）可以被400整除

*/
import java.util.Scanner;
class SwitchExer4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("请输入年：");
		int year = scan.nextInt();

		System.out.print("请输入月：");
		int month = scan.nextInt();

		System.out.print("请输入日：");
		int day = scan.nextInt();

		int sum = 0; //计数器

		switch(month){
			case 12:
				sum += 30;
			case 11:
				sum += 31;
			case 10:
				sum += 30;
			case 9:
				sum += 31;
			case 8:
				sum += 31;
			case 7:
				sum += 30;
			case 6:
				sum += 31;
			case 5:
				sum += 30;
			case 4:
				sum += 31;
			case 3:
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
					sum += 29;
				}else{
					sum += 28;
				}
			case 2:
				sum += 31;
			case 1:
				sum += day;//sum = sum + day;
				break;
		}
		
		System.out.println("当年的第" + sum  + "天");
	}
}
