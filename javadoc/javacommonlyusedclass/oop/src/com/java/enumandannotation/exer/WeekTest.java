package com.java.enumandannotation.exer;

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
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
            case SATURDAY:
                System.out.println("星期六");
                break;
            case SUNDAY:
                System.out.println("星期日");
                break;
        }
    }
}
