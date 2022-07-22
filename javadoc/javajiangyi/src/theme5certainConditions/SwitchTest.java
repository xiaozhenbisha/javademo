package theme5certainConditions;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-07-23 0:23
 */

public class SwitchTest {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        String str = aa.next();
        char grade = str.charAt(0);
        switch(grade)
        {
            case 'A':
             //条件如果符合’A’时的入口
                System.out.println("你的期末成绩为 A.真是太有才了");
                break;

            case 'B':
                System.out.println("你的期末成绩为 B.还不错");
                break;
                //别忘了要中断，跳出判断，不执行后面的语句
            case 'C':
                System.out.println("你的期末成绩为 C.要好好努力");
                break;
            default:
            //满足除上面条件外的所有条件
                System.out.println("你未能通过考试，加油啊!");
        }
  //【注意】:每条 case 语句必须指定一个 值。如果要判断大于 或小于就不能使用 switch 语句，必须使 用一系列的 if 语句或 if-else 语句。

    }

}
