package com.java.demo;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
此类用于演示    InputStream的第三个read方法
    int read()
    int read(byte[] b)
    int read(byte[] b,int offset,int len); 从文件开头读取len个字节,从数组的off索引值位置开始存(了解)
 */
public class Demo1 {
    @Test
    public void test() throws Exception {
        InputStream in=new FileInputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/java.txt");
        byte[] b=new byte[10];
        int len=0;
        int i = in.read(b, 2, 5);
        for (int j = 0; j <b.length ; j++) {
            System.out.print(b[j]+" ");
        }
        System.out.println("返回值："+i);

        in.close();
    }
}