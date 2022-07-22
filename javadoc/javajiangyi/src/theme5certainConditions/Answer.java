package theme5certainConditions;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-07-22 23:28
 */

public class Answer {
    public static void main(String[] args) {
        int score = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("你爱我吗:");
        String s1 = "爱";
        String s11 = scan.next();
        if (s11.equals(s1)) {
            score = score + 10;
            System.out.println("回答正确");
        } else {
            score = score - 5;
        }
        System.out.println("现在的分数是" + score);
        System.out.println("爱我什么:");
        String s2 = "长得好看";
        String s22 = scan.next();
        if (s22.equals(s2)) {
            score = score + 10;
            } else {
                score = score - 5;
            }
        System.out.println("现在的分数是" + score);
        System.out.println("要怎么爱我:");
        String s3 = "用一辈子去爱";
        String s33 = scan.next();
        if (s33.equals(s3)) {
            score = score + 10;
            } else {
                score = score - 5;
            }
            System.out.println("现在的分数是" + score);

    }
}
