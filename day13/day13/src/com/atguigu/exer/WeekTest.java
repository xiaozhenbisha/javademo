package com.atguigu.exer;

/*
声明Week枚举类，其中包含星期一至星期日的定义；
在TestWeek类中声明方法中printWeek(Week week)，根据参数值打印相应的中文星期字符串。
提示，使用switch语句实现。
在main方法中从命令行接收一个1-7的整数(使用Integer.parseInt方法转换)，
分别代表星期一至星期日，打印该值对应的枚举值，然后以此枚举值调用printWeek方法，输出中文星期。

 */
public class WeekTest {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        /*switch(num){
            case 1:
                System.out.println(Week.MONDAY);
                printWeek(Week.MONDAY);
                break;
            case 2:
                System.out.println(Week.TUESDAY);
                printWeek(Week.TUESDAY);
                break;
            case 3:
                System.out.println(Week.WEDNESDAY);
                printWeek(Week.WEDNESDAY);
                break;
        }*/

        Week[] weeks = Week.values();
        printWeek(weeks[num-1]);
    }

    public static void printWeek(Week week){
        switch(week){
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
        }
    }

}
