//1. 导包
import java.util.Scanner;
class ScannerTest {
	public static void main(String[] args) {
		//2. 创建 Scanner 的对象
		Scanner scan = new Scanner(System.in);

		//3. 通过 next() 或 nextXxx() 方法接收键盘输入。 Xxx ：基本数据类型
		//注意：没有 nextChar()
		System.out.print("请输入姓名：");
		String name = scan.next();

		System.out.print("请输入年龄：");
		int age = scan.nextInt();

		System.out.print("请输入成绩：");
		double score = scan.nextDouble();

		System.out.print("请输入性别：");
		char gender = scan.next().charAt(0); //abcdef

		System.out.println("姓名：" + name);
		System.out.println("年龄：" + age);
		System.out.println("成绩：" + score);
		System.out.println("性别：" + gender);
	}
}
