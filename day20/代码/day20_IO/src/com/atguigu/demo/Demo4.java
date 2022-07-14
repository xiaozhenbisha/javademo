package com.atguigu.demo;

import org.junit.Test;

import java.io.*;
import java.time.format.TextStyle;

/*
此类用于演示  字符输出流   Writer
1. Writer  抽象类     FileWriter
2. 构造器
    new FileWriter(String name);
    new FileWriter(String name,boolean append);
    new FileWriter(File file);
    new FileWriter(File file,boolean append);

3. 常用方法
    write(int i)   写一个字符    和  int read()   配合使用
    write(char[] c)  执行一次将char数组中全部数据写出   (了解)
    write(char[] c,int off,int len); 执行一次将char数组中数据从off索引位置开始写，写len个
    write(String str);   将字符串全部内容写入到文件
    write(String str,int off,int len);执行一次将字符串中数据从off索引位置开始写，写len个

    close();
    flush();//刷新 --> 缓存中的内容应用到文件中
        既然关闭有刷新，为甚还要有刷新呢？
            刷新后，out对象还是可以继续用的！
            关闭后，out对象就不能用了！
    flush什么时候用？
        写大量内容的时候,可以多几次刷新，保证内存一直是比较好的状态

    练习：
        采用字符流，进行文件(文本文件)的复制(尽可能多的写法)
 */
public class Demo4 {

    @Test
    public void test2() throws Exception {
        //1. 流对象创建
        Writer out=new FileWriter(new File("d:/iotest/oracle.txt"));
        //2. 数据操作
        out.write("尚硅谷确实棒");//①将数据写到缓存中
        //3. 刷新 (②将缓存中的内容应用到文件中)
        out.flush();

        out.write("上面说的对！");
        out.flush();

        for (int i = 0; i <10000000 ; i++) {
            out.write(97+i);
            if(i%1000==0)
                out.flush();
        }


        //3. 关闭资源(先刷新，在关闭)
        out.close();//忘记关流(资源会浪费，导致写入失败)
        //因为字符流有一个缓存
        //字节输出流   忘记关资源，写入是失败的吗？不是
    }
    @Test
    public void test1() throws Exception {
        //1. 流对象创建
        Writer out=new FileWriter(new File("d:/iotest/oracle.txt"));
        //2. 数据操作
        out.write(97);//a
        char[] c={'尚','硅','谷','棒'};
//        out.write(c);
        out.write(c,1,3);
        out.write("尚硅谷确实棒");
        out.write("尚硅谷确实棒",0,3);

        //3. 关闭资源
        out.close();
    }

}
