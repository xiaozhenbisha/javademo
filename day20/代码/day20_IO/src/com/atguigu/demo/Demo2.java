package com.atguigu.demo;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
此类用于演示   OutputStream   字节输出流(程序中的数据写到外界[磁盘上的文件])
    1. OutputSTream依然是一个抽象类
        第一大子类    FileOutputStream

    2. 练习：
        a. 将一个文件从d:iotest/java.txt复制到d:testIO/javaEE.txt
            int read()  和  write(int i)
            int read(byte[] b) {在最后一次读的时候有重复数据}   和   write(byte[] b)   是配对使用的吗？不是的
            文件  18字节     10   +   8+2(2个重复数据)

            int read(byte[] b)  和  write(byte[] b,int off,int len);  配对使用
 */
public class Demo2 {
    /*
    常用方法
        write(int i); 将字节写出
        write(byte[] b);将数组中所有字节写入   使用几率很小
        write(byte[] b,int off,int len);将数组中的数据从off索引位置开始写，写len个

        close();  关闭资源
     */
    @Test
    public void test2()throws Exception{
        OutputStream out=new FileOutputStream("d:/iotest/python.txt");
        out.write(97);
        byte[] b={99,99,98,100,101,102,103};//ccbdefg
        //out.write(b);//最开始这个97会存在吗？会
        out.write(b,2,3);//abde

        //3. 关闭资源
        //out.close();
    }
    /*
    构造器
        new FileOutputStream(String name);
        new FileOutputStream(File file);
            文件是可以不存在的，但是文件所在的目录是必须存在的
            他们在创建流对象时，如果文件是存在的会将内容清空！如果我想追加呢？
        new FileOutputStream(String name,boolean append);
        new FileOutputStream(File file,boolean append);
            设置追加内容
     */
    @Test
    public void test() throws Exception {//在运行一遍是追加还是覆盖？ 覆盖(输出流的位置)
        //1. 流对象的创建
        /*File file=new File("d:/iotest/python.txt");
        OutputStream out=new FileOutputStream(file);*/
        //发现python.txt在磁盘上是不存在的，是可以不存在的，但是文件所在的目录必须存在
        OutputStream out=new FileOutputStream("d:/iotest/python.txt",true);
        //2. 数据的操作
        out.write(65);//a写到文件中
        out.write(66);//b写到文件中
        out.write(100);//d写到文件中
        //3. 资源关闭
        out.close();
    }

}
