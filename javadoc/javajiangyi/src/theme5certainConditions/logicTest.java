package theme5certainConditions;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-07-22 23:58
 */

public class logicTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = scan.nextInt();
        System.out.println("请输入性别");
        String str = scan.next();
        char gendar = (char)str.charAt(0);
        if( age>50 && gendar=='M'){
            System.out.println("您可以参加体检!");
        }
        System.out.println("请输入里程数:");
        int mileage = scan.nextInt();
        if( mileage < 5000 || mileage > 10000 ){
            System.out.println("您的车不在此次的保修范围内!");
        }

    }
}
