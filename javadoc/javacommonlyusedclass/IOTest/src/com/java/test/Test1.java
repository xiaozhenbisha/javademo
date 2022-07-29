package com.java.test;

import java.io.File;
import java.io.IOException;
/**
 * 2. 练习题：
 *     已知File file=new File("d:/test/mysql.txt");
 *     去判断文件是否存在，如果存在就打印其相关信息(名称、路径、大小、修改时间...)
 *     如果不存在就新建出来
 *
 *     目录也不存在呢  后面还有练习
 */
public class Test1 {
    public static void main(String[] args) {
        File file=new File("/Users/wangzhennan/Desktop/javademo/javadoc/testio/java.rtf");
        if(!file.exists()){//这里有个叹号
           /* System.out.println(file.getPath());
            int i = file.getPath().lastIndexOf("\\");//取到最后一个/出现的位置(需要进行转义)
            System.out.println("index:"+i);
            System.out.println(file.getPath().substring(i));*/
            if(file.getName().contains(".")){
                //新建失败(如果文件是不存在的isFile返回的是false;)
                System.out.println("是否执行到了");
                try {
                    file.createNewFile();//区分不开是文件还是文件夹(字符串处理)
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }else{
            System.out.println("名称："+file.getName());
            System.out.println("路径："+file.getPath());
            System.out.println("大小："+file.length());
            System.out.println("时间："+file.lastModified());
        }
    }
}
