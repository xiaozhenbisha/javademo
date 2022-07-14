package com.atguigu.test;

import org.junit.Test;

import java.io.File;

/*
练习题3：
    已知目录File file=new File("d:/iotest");要删除该目录
    但是不知道此目录内是否有内容！  delete
        1. 先将file清空(会在次遇到文件夹[1.清空2.delete])  2. 在执行delete方法

 */
public class Test3 {
    @Test
    public void test(){
        File file=new File("d:/iotest2");//当做有内容去删除
        delete(file);
    }
    /*
        功能：删除目录
     */
    public void delete(File file){
        //1. 判断非空
        if(file!=null){
            //2. 判断是否是目录
            if(file.isDirectory()){
                //是目录    将目录清空(一个一个的删)
                File[] files = file.listFiles();//获得该目录下所有子级File对象
                for (File file1 : files) {
                    delete(file1);//这一块其实是不太好理解(画内存图)
                    //子集还有目录呢？会继续进去，继续删除
                }
            }
            //3. 删除(①. 文件  ②. 空目录)
            file.delete();
        }
    }
}
