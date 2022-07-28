package com.java.exceptiontest.javaexception;

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
