package com.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Demo1 {

    public static void main(String[] args) throws Exception {
        //读取配置文件   采用的是集合+IO流
        //1. 创建Properties对象
        Properties pro=new Properties();
        //2. 肯定要取加载配置文件
        pro.load(new FileInputStream("./day24_design/src/config.properties"));
        //3. 读取内容   根据key读取value
        String username = pro.getProperty("username");
        System.out.println(username);
    }


}
