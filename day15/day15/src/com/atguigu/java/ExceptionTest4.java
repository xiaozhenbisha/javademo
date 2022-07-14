package com.atguigu.java;

/*
一、制造异常：throw  【可以替代 return】
    使用在方法方法体内，后面跟异常对象。

 【面试题】throw 和 throws 的区别?

 throw 不仅可以制造 Java 内置的异常类对象，还可以制造自定义异常类对象

 二、自定义异常
 ①声明一个类继承一个异常类。
 （若该类继承 RuntimeException，则该异常为运行时异常，若继承 Exception 则该异常为编译时异常）
 ②编写一个有参构造器，为 getMessage 方法设置值
 */
public class ExceptionTest4 {

    public static void main(String[] args) {
        try {
            div(10, 0);
        } catch (MyException e) {
            e.printStackTrace();
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }

    /*public static int div(int a, int b) throws MyException {
        if(b == 0){
//            throw new ArithmeticException("除数不能为零！");

            throw new MyException("除数不能为零");
        }else{
            return a / b;
        }
    }*/

    public static int div(int a, int b){
        if(b == 0){
//            throw new ArithmeticException("除数不能为零！");

            throw new MyException("除数不能为零");
        }else{
            return a / b;
        }
    }

}
