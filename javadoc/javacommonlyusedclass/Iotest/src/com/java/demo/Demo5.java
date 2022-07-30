package com.java.demo;

import org.junit.Test;

import java.io.*;

/**
 *  此类用于演示  处理流(在节点流的基础上进行了不同的处理)
 *     缓冲流 4个    转换流  2个    对象流   2个        打印流，标准的输入输出流
 *    1. 缓冲流  (在节点流的基础上添加了缓冲效果)
 *       能用缓冲流的地方肯定使用缓冲流
 */
public class Demo5 {
    /*
   字符输出缓冲流   BufferedWriter(对Writer的处理)
   构造器
       new BufferedWriter(Writer out)
       new BufferedWriter(Writer out,int size)
   方法
       包含五个write方法
       newLine();换行

    */
    @Test
    public void test6() throws Exception {
        BufferedWriter out=
                new BufferedWriter(
                        new FileWriter("/Users/wangzhennan/Desktop/javademo/javadoc/testio/java.txt"));
        out.write("尚硅谷真棒");//\r\n  目前是ok的   \r回车  \n换行
        out.newLine();//换行
        out.write("我说的对吗？");
        out.close();
    }
    /*
    字符输入缓冲流    BufferedReader(对Reader的处理)
        构造器
            new BufferedReader(Reader reader)
            new BufferedReader(Reader reader,int size)
        方法
            包含Reader中的三个read方法
            String readLine();  执行一次读取一行,读到没有会返回null
     */
    @Test
    public void test5() throws Exception {
        BufferedReader in=
                new BufferedReader(
                        new FileReader("/Users/wangzhennan/Desktop/javademo/javadoc/testio/java.txt"));
        /*String s = in.readLine();
        System.out.println(s);
        String s1 = in.readLine();
        System.out.println(s1);*/
        String str=null;
        while((str=in.readLine())!=null){
            System.out.println(str);
        }

        in.close();
    }
    /*
    采用缓冲流完成文件的复制
     */
    @Test
    public void test4() throws Exception {
        long start=System.currentTimeMillis();
        BufferedInputStream in=
                new BufferedInputStream(
                        new FileInputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/java.txt"));
        BufferedOutputStream out=
                new BufferedOutputStream(
                        new FileOutputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/java.txt"));
        int i=0;
        while((i=in.read())!=-1){
            out.write(i);
        }

        in.close();
        out.close();
        long end=System.currentTimeMillis();
        System.out.println("time:"+(end-start));//1142
    }
    /*
    采用节点流完成文件的复制，记录程序运行时间
     */
    @Test
    public void test3() throws Exception {
        long start=System.currentTimeMillis();
        InputStream in=new FileInputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/abc.wmv");//找一个不大不小的文件
        OutputStream out=new FileOutputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/java.wmv");

        int i=0;
        while((i=in.read())!=-1){
            out.write(i);
        }

        in.close();
        out.close();
        long end=System.currentTimeMillis();
        System.out.println("time:"+(end-start));//242816
    }

    /*
        字节输出缓冲流(对OutputStream的处理)
            BufferedOutputStream
         构造器
            new BufferedOutputStream(OutputStream out);
            new BufferedOutputStream(OutputStream out,int size);
         方法
            和OutputStream方法一致

     */
    @Test
    public void test2() throws Exception {
        BufferedOutputStream bout=
                new BufferedOutputStream(
                        new FileOutputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/abc.wmv"));
        bout.write(97);
        bout.close();
    }

    /*
    主要演示的是  字节输入缓冲流 (对InputStream的处理)
        BufferedInputStream
        构造器
            BufferedInputStream(InputStream in);
            BufferedInputStream(InputStream in,int size);  设置缓冲区大小
        方法
            和InputStream中的三个read方法用法一致(提高了一些效率)

     */
    @Test
    public void test1() throws Exception {
        //1. 流对象的创建
        InputStream in=new FileInputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/python.txt");
        BufferedInputStream bin=new BufferedInputStream(in);
        //2.
        int i = bin.read();
        System.out.println(i);
        //3.
        bin.close();//只关最外层的就可以
    }
}
