package com.atguigu.homework;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/*
1、使用绝对路径，在D盘下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件
2、使用相对路径，在当前项目下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件
 */
public class Home1 {
    public static void main(String[] args) throws IOException {
        //相对路径采用主方法   单元测试 ./和主方法的是不一样的(不需要大家掌握)
        //项目时部署在服务器上，服务器上运行的代码会有单元测试
        //./ 代表就是当前项目下
        File file=new File("./testIO");
        if(!file.exists()){
            file.mkdirs();
            System.out.println("文件夹创建成功");
        }
        File file1=new File(file,"1.txt");
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println("文件创建成功");
        }
    }
    @Test
    public void test() throws IOException {
        File file=new File("d:/testIO");
        if(!file.exists()){
            file.mkdirs();
            System.out.println("文件夹创建成功");
        }
        File file1=new File(file,"1.txt");
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println("文件创建成功");
        }
    }
}
