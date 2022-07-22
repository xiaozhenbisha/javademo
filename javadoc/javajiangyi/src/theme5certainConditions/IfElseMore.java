package theme5certainConditions;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-07-23 0:20
 */

public class IfElseMore {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        String str = aa.next();
        char grade = str.charAt(0);
        if (grade == 'A')
            System.out.println("你的期末成绩为 A.太优秀了");
        else if (grade == 'B')
            System.out.println("你的期末成绩为 B.还不错");
        else if (grade == 'C')
            System.out.println("你的期末成绩为 C.要好好努力");
        else
            System.out.println("你未能通过考试，加油啊!");
    }
}
