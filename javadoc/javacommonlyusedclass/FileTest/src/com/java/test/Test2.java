package com.java.test;

import java.io.File;
import java.io.IOException;

/**
 * 练习题2：
 *     已知File file=new File("d:/test/mysql.txt");
 *     文件和文件所在的目录是否存在，都不清楚(mysql.txt和test目录是否存在都不知道)
 *     最后我需要的结果是d盘下肯定有test目录，test目录下肯定有mysql.txt文件
 *         用getParent()做一次
 *         用getParentFile()在做一次
 */
public class Test2 {
    public static void main(String[] args) {
        File file=new File("/Users/wangzhennan/Desktop/javademo/javadoc/testio/mysql1.rtf");
        //1. 在新建文件之前，一定要保证目录是存在的
        //1.1 先获得文件所在目录File对象
        String parent = file.getParent();
        File parentFile=new File(parent);

        File parentFile1 = file.getParentFile();
        if(!parentFile.exists()){//如果不存在就会进入到if
            //1.2 新建目录
            parentFile.mkdirs();
            System.out.println("目录创建成功");
        }

        //2.新建文件
        if(!file.exists()){
            try {
                file.createNewFile();//有可能会出错
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件创建成功");
        }
    }
}
