package com.atguigu.homework;

import java.io.*;

/*
  图片的赋值
 */
public class Home1 {

    public static void main(String[] args) throws Exception {
        InputStream in=new FileInputStream("d:/iotest/8.jpg");
        OutputStream out=new FileOutputStream("d:/testIO/aaa.jpg");

        byte[] b=new byte[1024];
        int len=0;
        while((len=in.read(b))!=-1){
            out.write(b,0,len);
        }

        in.close();
        out.close();
    }
}
