/*
从键盘输入小明的期末成绩。
当成绩为100分时，奖励一辆BMW；
当成绩为[80-99]时，奖励一个台iphone15s；
当成绩为[60-80]时，奖励一本参考书；
其它时，什么奖励也没有。
*/
//1. 导包
import java.util.Scanner;
class IfExer1 {
	public static void main(String[] args) {
		//2. 创建 Scanner 的对象
		Scanner scan = new Scanner(System.in);

		//3. 接收键盘输入
		System.out.print("请输入成绩：");
		int score = scan.nextInt();

		//判断
		if(score == 100){
			System.out.println("奖励一辆BMW");
		}else if(score >= 80 && score < 100){
			System.out.println("奖励一台 iphone15s");
		}else if(score >= 60 && score < 80){
			System.out.println("奖励一本参考书");
		}else{
			System.out.println("什么都没有");
		}
	}
}
