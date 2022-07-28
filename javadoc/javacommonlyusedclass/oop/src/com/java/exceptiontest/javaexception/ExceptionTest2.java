package com.java.exceptiontest.javaexception;

public class ExceptionTest2 {
    public static void main(String[] args) {
        int num = div(10, 0);
        System.out.println(num);
    }
    public static int div(int a, int b){
        int n = 0;

        try{
            n = a / b;
        }catch (ArithmeticException e){
            e.printStackTrace();
            n += 100;
            return n;
        }catch (Exception e){
            System.out.println("其他异常");
        }finally{
            n += 200;
            System.out.println("一定执行的语句");
            return n;
        }
    }
}
