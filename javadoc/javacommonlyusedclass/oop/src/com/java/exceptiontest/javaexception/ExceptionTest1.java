package com.java.exceptiontest.javaexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一、异常：不可预知的非正常情况
 *
 * Java 中的异常都是以对象的形式存在的，一旦某句代码发生异常，
 * 会在该代码处生成一个异常对象，然后以堆栈式抛出
 * 若不对该异常对象进行处理，最终会导致程序的终止运行。
 *
 * 二、异常的结构体系
 * java.lang.Throwable : 所有错误和异常的父类
 *     |--java.lang.Error :错误，一些严重的错误。如：内存溢出、系统错误。我们不在代码中进行处理
 *     |--java.lang.Exception : 异常，我们要尽可能的预知并处理的异常。 如：用户输入不匹配、网路连接中断等。
 *         |--编译时异常（受检异常 checked）：编译时对其进行检查，若不对该异常进行处理，编译不能通过。
 *         |--运行时异常（非受检异常 unchecked）：可以保证程序的正常运行，一旦发生异常，会在该代码处生成一个异常对象
 *                                               ，然后抛出，若不对该异常对象进行处理，程序终止运行
 *
 * 三、异常的处理：java中异常的处理采用抓抛模型
 * "抛"：一旦某句代码发生异常，会在该代码处生成一个异常对象，然后以堆栈式抛出
 * "抓"：将上述抛出的异常对象进行捕获处理
 *
 * try{
 *     //可能发生异常的语句
 * }catch(异常类型 变量名){
 *     //异常处理的语句
 * }catch(Exception1 e1){
 *     //异常处理的语句
 * }catch(Exception2 e2){
 *     //异常处理的语句
 * }
 * ……
 * finally{
 *     //一定被执行的语句
 * }
 *
 * 注意：
 * ① catch 块可以有多个，一旦某个catch异常类型匹配成功，其他 catch 块将不再执行
 * ② catch 块可以有多个，若多个 catch 块的异常类型具有子父类关系，则子上父下
 * ③ try-catch 语句可以嵌套
 * ④ finall 是可选的，表示一定被执行的语句,即使有 return 语句
 *
 * 四、异常处理的常用方法
 * printStackTrace() ： 打印异常的堆栈信息（详细信息）
 * getMessage() : 异常的描述信息
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        //------------------------Error------------------------
        //java.lang.StackOverflowError
        //main(args);

        //java.lang.OutOfMemoryError
        //byte[] bs = new byte[1024 * 1000 * 1000 * 1000];

        //------------------------Exception------------------------
        //------------------------编译时异常（受检异常）------------------------
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("");

            fis.read();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                fis.close();//null.close();
            }catch(IOException e){
                e.printStackTrace();
            }catch (NullPointerException e){
                e.printStackTrace();
            }
        }

        //------------------------运行时异常（非受检异常）------------------------
        //java.lang.ClassCastException : 类型转换异常
        /*Object obj = new String();

        try{
            Customer cust2 = (Customer) obj;
        }catch(ClassCastException e){
            e.printStackTrace();
            String mes = e.getMessage();
            System.out.println(mes);
        }*/

        //java.lang.ArithmeticException : 算数异常
        /*try{
            div(10, 0);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }*/

        //java.lang.ArrayIndexOutOfBoundsException : 数组下标越界异常
        /*int[] arr = new int[5];
        try{
            arr[8] = 10;//new ArrayIndexOutOfBoundsException()
            System.out.println(arr.length);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }catch(Exception e){
            System.out.println("其他异常");
        }*/

        //java.lang.NullPointerException : 空指针异常
        /*Customer[] customers = new Customer[5]; //{new Customer(), null, new Customer, null, null}
        customers[0] = new Customer();
        customers[2] = new Customer();

        try{
            for (Customer customer : customers) {
               customer.show();
            }
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }*/

        /*Customer cust = null;

        try{
            cust.show();//null.show();
        }catch(NullPointerException e){
            System.out.println("空指针异常！");
        }*/


        //java.util.InputMismatchException : 输入不匹配异常
        /*Scanner scan = new Scanner(System.in);

        System.out.println("用户请输入一个整数：");

        try {
            int num = scan.nextInt(); //new InputMismatchException();
            System.out.println(num);
        }catch(InputMismatchException e){
            System.out.println("您的输入有误！");
        }*/



        System.out.println("其他庞大的功能");
    }
    public static int div(int a, int b){
        return a / b;
    }
}
