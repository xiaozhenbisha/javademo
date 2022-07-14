package com.atguigu.test;

import org.junit.Test;

import java.io.*;

/*
采用字符流，进行文件(文本文件)的复制(尽可能多的写法)
 */
public class Test2 {
    @Test
    public void test1() throws Exception {
        //1.
        Reader in=new FileReader("d:/iotest/java.txt");
        Writer out=new FileWriter("d:/testIO/javaSE3.txt");
        //2.
        //2.1  read();
        /*int i=0;
        while((i=in.read())!=-1){
            out.write(i);
        }*/
        //2.2 read(char[] c)
        /*char[] c=new char[10];
        int len=0;
        while((len=in.read(c))!=-1){
            out.write(c,0,len);
        }*/
        //2.3
        /*char[] c=new char[10];
        int len=0;
        while((len=in.read(c))!=-1){
            out.write(new String(c,0,len));
        }*/
        //2.4
        char[] c=new char[10];
        int len=0;
        while((len=in.read(c))!=-1){
            out.write(new String(c),0,len);
        }
        //3.
        in.close();
        out.close();
    }
}
