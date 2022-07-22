package theme5certainConditions;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-07-22 23:20
 */

public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int account = scan.nextInt();
        if(account < 0)
            System.out.println("账户中已经没有余额了！");
    }


}
