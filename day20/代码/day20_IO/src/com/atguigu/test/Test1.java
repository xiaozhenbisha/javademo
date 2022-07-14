package com.atguigu.test;

import org.junit.Test;

import java.io.*;

/*
将一个文件从d:iotest/java.txt复制到d:testIO/javaEE.txt
 */
public class Test1 {
    @Test
    public void test1(){
        //1. 流对象的创建
        InputStream in=null;
        OutputStream out=null;
        try {
            in=new FileInputStream("d:/iotest/java.txt");
            out=new FileOutputStream("d:/testIO/javaEE1.txt");
            //2. 读写操作
            //2.1
            /*int i=0;
            while((i=in.read())!=-1){
                out.write(i);
            }*/
            //2.2
            byte[] b=new byte[1024];
            int len=0;
            while((len=in.read(b))!=-1){
                out.write(b,0,len);//会有重复数据
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //3. 流资源的关闭
            try {
                if(in!=null)
                    in.close();
                if(out!=null)
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
