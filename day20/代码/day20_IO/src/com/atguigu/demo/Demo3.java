package com.atguigu.demo;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/*
    此类用演示  字符输入流  Reader
    1. Reader依然是一个抽象类   第一大子类  FileReader
    2. 构造器
        new FileReader(String filename);
        new FileReader(File file);
    3. 常用方法
        int read(); 执行一次读取一个字符(采用int值去表示),读到文件末尾在读返回-1
        int read(char[] c);执行一次读取多个字符,读取到的字符存放在char数组中，
                            返回值是读取的字符数，读到文件末尾在读返回-1
        int read(char[] c,int off,int len);执行一次读取len个字节，从数组的off索引位置开始存 (了解)
 */
public class {
    @Test
    public void test1() throws Exception {
//        Reader in=new FileReader(new File("d:/iotest/java.txt"));
        Reader in=new FileReader("d:/iotest/java.txt");
        /*int i = in.read();
        System.out.println(i);
        int j = in.read();
        System.out.println(j);*/

        /*int i=0;
        while((i=in.read())!=-1){
            System.out.print((char)i);
        }*/
        /*char[] c=new char[10];
        int len = in.read(c);
        System.out.println(c);
        System.out.println(len);*/

       /* char[] c=new char[10];
        int len=0;
        while((len=in.read(c))!=-1){
            System.out.print(new String(c,0,len));
        }*/
        char[] c=new char[10];
        int i = in.read(c, 3, 5);
        for (int j = 0; j < c.length; j++) {
            System.out.print(c[j]+"-");
        }
        System.out.println("长度："+i);


        in.close();
    }
}
