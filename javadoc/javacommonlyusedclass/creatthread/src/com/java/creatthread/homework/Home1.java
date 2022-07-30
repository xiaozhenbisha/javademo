package com.java.creatthread.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Home1 {
    public static void main(String[] args) throws Exception {
        InputStream in=new FileInputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/8.jpg");
        OutputStream out=new FileOutputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/aaa.jpg");

        byte[] b=new byte[1024];
        int len=0;
        while((len=in.read(b))!=-1){
            out.write(b,0,len);
        }

        in.close();
        out.close();
    }
}
