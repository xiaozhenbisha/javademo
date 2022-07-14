package com.atguigu.exer;

import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("张三", 101, new MyDate(2000, 10, 10), 8000);
        employees[1] = new HourlyEmployee("李四", 102, new MyDate(2010, 11, 11), 800, 8);
        employees[2] = new SalariedEmployee("王五", 103, new MyDate(1999, 10, 15), 10000);
        employees[3] = new HourlyEmployee("赵六", 104, new MyDate(1990, 5, 8), 500, 4);
        employees[4] = new SalariedEmployee("田七", 105, new MyDate(1988, 10, 20), 20000);

        Scanner scan = new Scanner(System.in);

        System.out.print("请输入月份：");
        int month = scan.nextInt();

        for (Employee employee : employees) {//多态
            System.out.println(employee);//虚拟方法调用（动态绑定）
            System.out.println("您的工资为：" + employee.earnings());//虚拟方法调用
            if(employee.getBirthday().getMonth() == month){
                System.out.println("生日奖励：100" + " 总工资为：" + (employee.earnings() + 100));
            }
        }
    }

}
