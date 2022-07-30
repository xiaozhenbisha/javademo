package com.java.demo;

import org.junit.Test;

import java.io.*;

/**
 *   此类用于演示转换流
 *     字符编码：
 *         编码: 字符编成二进制序列
 *         解码： 二进制序列翻译成字符
 *      字符编码 : 就是一套自然语言的字符与二进制数之间的对应规则
 *      转换流(字节流转为字符流)
 *         InputStream-->Reader
 *             InputStreamReader
 *                 构造器：
 *                      new InputStreamReader(InputStream in); 单纯的转换(处理不了中文乱码)
 *                      new InputStreamReader(InputStream in,String charsetName); 可以处理乱码问题
 *         OutputStream-->Writer
 *             OutputStreamWriter
 *                 构造器：
 *                     new OutputStreamWriter(OutputStream out);  单纯的转换
 *                     new OutputStreamWriter(OutputStream out,String charsetName);  指定字符集(采用指定字符集创建文件)
 */
public class Demo6 {
    /*
     需求：程序是utf-8的格式，想要创建一个文件，文件的格式是GBK
     */
    @Test
    public void test3() throws Exception {
        //程序会在iotest中新建一个文件javaidea.txt,这个文件的格式是？和程序默认格式一致  utf-8
        Writer out=new OutputStreamWriter(
                new FileOutputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/avaidea1.txt"),"GBK");
        out.write("尚硅谷abc123");//中文
        out.close();
    }
    @Test
    public void test2() throws Exception {
        //d:/iotest/java_GBK.txt
        Reader in = new InputStreamReader(
                new FileInputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/java_GBK.txt"),"GBK");
        int i=0;
        while((i=in.read())!=-1){
            System.out.print((char)i);
        }
        in.close();
    }
    /*
    采用字符流读取文件内容(如果编码格式不一致会乱码)

     */
    @Test
    public void test1() throws Exception {
        //程序的编码格式和文件的编码格式支持中文并且保持一致
        //文件是GBK的   程序是UTF-8的如何去完成读取操作
        //文件是UTF-8   程序是GBK原理是一样的
        String str="尚硅谷";
        Reader in=new FileReader("/Users/wangzhennan/Desktop/javademo/javadoc/testio/java_GBK.txt");
        int i=0;
        while((i=in.read())!=-1){
            System.out.print((char)i);
        }
        in.close();
    }
}
