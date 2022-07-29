package com.java.homework;

import org.junit.Test;

import java.io.File;

/**
 * 遍历指明目录下的所有[不止一级]的文件，输出所有的文件名。
 */
public class Home2 {
    @Test
    public void test(){
        //1. 要遍历的目录
        File file=new File("/Users/wangzhennan/Desktop/javademo/javadoc/iotest");//所有文件
        printFileName(file);
    }

    /*
     * 打印目录下所有的文件名称
     * @param file
     */
    public void printFileName(File file){
        if(file!=null){
            // 判断是否是目录
            if(file.isDirectory()){
                //说明是目录。进去
                File[] files = file.listFiles();
                for (File file1 : files) {
                    printFileName(file1);
                }
            }else {
                //说明是文件，打印名称
                System.out.println(file.getName());
            }
        }
    }

}
