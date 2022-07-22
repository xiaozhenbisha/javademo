package theme5certainConditions;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-07-22 23:24
 */

public class IfTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        int elephantTotal = scan.nextInt();
        boolean canbuyanother = false;
        if(age>=60)
            System.out.println("你可以享受老年人优惠");
        if(elephantTotal<=11)
            canbuyanother=true;
        System.out.println(canbuyanother);
    }
}
