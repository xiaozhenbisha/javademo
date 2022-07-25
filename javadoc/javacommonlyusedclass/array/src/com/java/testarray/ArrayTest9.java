package com.java.testarray;

public class ArrayTest9 {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.println("--" + args[i]);
        }

        //将 String 转换成 int
		/*int num = Integer.parseInt(args[0]);
		System.out.println(num);*/
    }
}
