package com.java.demo;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
此类用于演示  IO流
     1. IO   功能：进行内容的传输
        I:   Input   输入(程序去将磁盘[网络、设备]上的文件内容读取出来)
            上传附件简历(方向，程序员站在程序这一端)
        O:   Output  输出(程序将内容写入到磁盘[网络、设备]上的文件)
            HR下载你的简历(程序-->电脑上)
     2. 案例：
        2.1 需要将d:/iotest/java.txt的内容读取到程序中
        2.2 将字符串写到d:/iotest/mysql.txt中   (二合一就是文件的复制)
     3. IO流的分类
        ① 按方向分
            输入流(数据从外界[磁盘(此时)，网络(网络编程)，输入设备(Scanner)...]到程序)
            输出流(数据从程序到外界[磁盘、网络、显示设备...])
        ② 按数据处理类型
            字节流:处理单位是字节
            字符流:处理单位是字符
        ③ 按角色分
            节点流(原始流)  :  没有经过任何处理的流[效率低]
            处理流 :  在原始流的基础上进行了处理[ ①提高效率  ②提供好用的方法]
     4. IO流是一个庞大的家族
        4大根类(全部都是抽象类)
                    字节流         字符流
        输入流     InputStream     Reader
        输出流     OutputStream    Writer

     5.  字节输入流
            InputStream(抽象类)  -->  第一大子类FileInputStream(处理磁盘上的文件的)
        5.1  构造器(设置你读取的文件)
            new FileInputStream(File file); 读取file对象指向的文件
            new FileInputStream(String path); 读取path路径指向的文件

        5.2  读的方法
            int read();   返回的是一个字节的内容(只是采用int[ASCII]值去存储),执行一次读取一个字节
                          如果已经没有数据了，返回值是-1(可以采用循环了)
                        读取方式：
                            int i=0;
                            while((i=in.read())!=-1){//① in.read()  ② i=值  ③ i!=-1
                                System.out.print((char)i);
                            }
            int read(byte[] b); 执行一次，读取多个字节，多个字节存储到b数组中，返回值是读取的字节数
                            文件剩余字节数大于数组的长度，最多就能读取数组长度个字节
                            文件剩余字节数小于数组的长度，读取的字节数就是文件剩余字节数
                           如果读到没有数据了，返回值是-1(可以写循环了)

            close();   进行关闭资源

 */
public class Demo3 {

    @Test
    public void test2()  {
        InputStream in=null;
        try {
            in=new FileInputStream("d:/iotest/java.txt");
            //操作数据  分析过程
           /* byte[] b=new byte[10];//数组是用于接收读取的数据的,数组的长度，一般是1024或1024的倍数
            //第一次读
            int len = in.read(b);
            //1. 展示数据
            for (int i = 0; i < b.length; i++) {
                System.out.print((char)b[i]);
            }
            System.out.println("----------");
            //2. 展示字节数
            System.out.println(len);

            byte[] b1=new byte[10];
            int len1=in.read(b1);
            for (int i = 0; i < b1.length; i++) {
                System.out.print((char)b1[i]);
            }
            System.out.println("----------");
            //2. 展示字节数
            System.out.println(len1);//8*/
            //循环读取数据
            byte[] b=new byte[10];
            int len=0;
            while((len=in.read(b))!=-1){//① read(b) ② 赋值  ③  比较
                //展示数据
                System.out.print(new String(b,0,len));//掌握此方式，为以后做铺垫
            }
            //发现有重复数据
            //1   public voi
            //2   d staticoi


        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /*
    字节输入流
        需要将d:/iotest/java.txt的内容读取到程序中
     */
    @Test
    public void test1(){
        InputStream in=null;
        try {
            //1. 流对象的创建
            /*File file=new File("d:/iotest/java1.txt");
            InputStream in=new FileInputStream(file);//多态*/

            in=new FileInputStream("d:/iotest/java.txt");
            System.out.println(in);
            //2. 进行数据的操作
            /*int i = in.read();
            System.out.println(i);//97
            int j = in.read();
            System.out.println(j);//98*/
            //如何知道里面有多少个字节？想起了File中的length()问题：流对象可以不采用File，所以length()不是最终的解决方式
            //循环去读取(什么时候结束循环)
            int i=0;//只读了一次
            while((i=in.read())!=-1){//① in.read()  ② i=值  ③ i!=-1
                System.out.print((char)i);
            }
            //3. 流资源的关闭
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}