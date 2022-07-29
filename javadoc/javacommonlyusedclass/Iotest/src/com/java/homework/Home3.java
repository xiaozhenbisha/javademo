package com.java.homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 将d://aa/java.txt读取到程序中，并显示(采用两种写法)
 */
public class Home3 {
    public static void main(String[] args) {
        //1
        InputStream in=null;
        try {
            in=new FileInputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/java.txt");

            /*int i=0;
            while((i=in.read())!=-1){
                System.out.print((char)i);//(原因：字节流每次读一个字节)
            }*/
            byte[] b=new byte[10];
            int len=0;
            while((len=in.read(b))!=-1){
                System.out.print(new String(b,0,len));//虽然有好的，但是也不是最终的方式
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //2

        //3
    }
}
