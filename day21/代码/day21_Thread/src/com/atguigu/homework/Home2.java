package com.atguigu.homework;

import java.io.*;

/*
将gbk格式的文件转换为utf-8格式存储
 */
public class Home2 {
    public static void main(String[] args) throws Exception {
        //程序是utf-8   要读取gbk格式的文件     转换流
        Reader in=new InputStreamReader(new FileInputStream("d:/iotest/java_GBK.txt"),"GBK");
        //输出流的创建
        //本可以就采用字符输出流(程序本身就是utf-8)
        Writer out=new OutputStreamWriter(new FileOutputStream("d:/testIO/java_UTF-8.txt"),"UTF-8");
        //以后遇到异常直接抛出就行吗   分析一下(如果方法中的代码都是需要监控的代码，就可以抛出)
        int i=0;
        while((i=in.read())!=-1){
            out.write(i);
        }
        //如果上述出现异常，流资源是关闭不了的！(每次try-catch比较浪费)
        //如果使用 try(in out){}catch 出现异常是不是也不能自动关闭
        //1.7就出现了，但是真正采用的很少
        in.close();
        out.close();

    }
}
