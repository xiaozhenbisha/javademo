package com.atguigu.exer;

/*
编写TestException类，在main方法中接收两个命令行参数，将它们转换为整数，并用第二个数除以第一个数，
打印结果。
在命令行运行程序，给出两个参数，测试以下情况，观察运行结果：
其中某个参数不是数字
第二个参数为0
提示：
分别接收两个参数的语句为：
	int n1 = Integer.parseInt(args[0]);
 	int n2 = Integer.parseInt(args[1]);
改写TestException类的main方法，在其中捕获可能发生的异常。
运行并测试各种异常情况，确认是否均被捕获。
 */
public class ExceptionExer1 {

    public static void main(String[] args) {//new String[0];

        try{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int res = num2 / num1;
            System.out.println(res);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }



        System.out.println("其他庞大功能");

    }

}
