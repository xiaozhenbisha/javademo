package com.java.demo;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

/*   上午讲的内容不多(进度偏慢)
        此类用于演示  文件与IO(内容会比较多[比较好理解的：重复内容较多])
        1. 文件 (为IO做准备的)
        如果程序要操作一个文件(Java会如何看待一个文件呢？对象)
        java中如果想要实例化一个对象，必须得有什么？  类-->对象
        能够实例化文件对象的类是谁？   File类
        2. java.io.File类的概述
        简介：File类代表与平台(操作系统)无关的文件和目录(开发是在windows,项目部署在Linux上)
        功能：File类能新建、删除、重命名...文件和目录(File类是不能够操作文件内容的[如果想要操作，需要通过IO])
        3. File类的实战阶段(学过常用类，从哪几个方面去学习)  API
        构造器
        new File(String pathname)  根据文件或目录的路径字符串构造一个File对象
        绝对路径：从根目录开始的路径(windows系统是从盘符开始的，linux根目录就是一个/)
        相对路径：找一个参照物(当前文件/当前项目)
        ./   当前文件所在的文件夹(./在java中指的是当前项目[Project])
        day19_IO是项目下的一个模块
        ../   当前文件所在文件夹的上一级(当前项目的上一级)
        没有   .../  符号
        new File(File parent,String child) 根据父级File对象和子级字符串名称构建File对象
        new File(String parent,String child) 根据父级的字符串路径和子级字符串名称构建File对象
        方法

        子类




        练习：
        1. 将我刚刚将的构造器和常用方法  敲一遍
        2. 练习题1：
        已知File file=new File("d:/test/mysql.txt");
        去判断文件是否存在，如果存在就打印其相关信息(名称、路径、大小、修改时间...)
        如果不存在就新建出来
        3. 练习题2：
        已知File file=new File("d:/test/mysql.txt");
        文件和文件所在的目录是否存在，都不清楚(mysql.txt和test目录是否存在都不知道)
        最后我需要的结果是d盘下肯定有test目录，test目录下肯定有mysql.txt文件
        用getParent()做一次
        用getParentFile()在做一次
        4. 练习题3：
        已知目录File file=new File("d:/iotest");要删除该目录
        但是不知道此目录内是否有内容！  delete
        1. 先将file清空(会在次遇到文件夹[1.清空2.delete])  2. 在执行delete方法
        递归的知识点：
        递归属于循环的一种，递归的精髓在   方法自己调用自己

 */
public class Demo1 {
    /*
      public boolean renameTo(File dest)`：重命名文件或目录(了解)
      目录的遍历(File对象是一个目录的情况)
      String[] list();   返回目录中所有内容(一级)的名称
      File[] listFiles();   返回目录中所有子级File对象
      File[] listFiles(FileFilter filter);  返回目录中符合条件的子级File对象

   */
    @Test
    public void test6(){
        /*File file=new File("d:/iotest/mysql.txt");
        file.renameTo(new File(file.getParentFile(),"sql.txt"));
        System.out.println("success");*/
        File file=new File("/Users/wangzhennan/Desktop/javademo/javadoc/testio/");
        if(file.isDirectory()){
            String[] list = file.list();
            for (String s : list) {
                System.out.println("文件的名称为："+s);
            }
            File[] files = file.listFiles();
            for (File file1 : files) {
                System.out.println("file对象："+file1);//重写了toString
            }
            File[] files1 = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {//对取值进行筛选的
                    return pathname.getName().contains("sql");
                }
            });
            for (File file1 : files1) {
                System.out.println(file1);
            }
            file.listFiles(new FilenameFilter() {//没有必要掌握的
                @Override
                public boolean accept(File dir, String name) {
                    return false;
                }
            });
        }

    }
    /* 获得父级信息
        getParent();//获得父级的字符串路径
        getParentFile();//获得父级的File对象
     */
    @Test
    public void test5(){
        File file=new File("/Users/wangzhennan/Desktop/javademo/javadoc/testio/mysql.rtf");
        String parent = file.getParent();//获得父级的字符串路径
        System.out.println(parent);
        File parentFile = file.getParentFile();//获得父级的File对象
        System.out.println(parentFile.getPath());

    }
    /*
    创建和删除文件
        createNewFile()   新建文件，不能新建目录，如果文件所在的目录不存在会有异常产生
        mkdir()   新建一级目录(如果是多级，则一级也不新建)
        mkdirs()   可以创建多级目录
        delete()   删除  只能删除文件和空目录
     */
    @Test
    public void test4(){
        //delete   删除文件(直接删除)
        /*File file=new File("d:/iotest/java.txt");
        System.out.println(file.exists());
        if(file.exists()){//如果存在就删除
            file.delete();
        }*/

        //delete   删除目录   只能删除空目录(删除不了又内容的目录)
        //如果非要删除非空目录？(进行递归删除)   下午先讲递归，然后在讲递归删除
        File file1=new File("d:/iotest2");
        if(file1.exists()){
            file1.delete();
            System.out.println("success");
        }



       /* File file=new File("d:/iotest1/oracle.txt");
        if(!file.exists()){
            try {
                file.createNewFile();//新建文件[新建不了目录](如果此文件的目录是不存在的，会报错)
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        /*File file=new File("d:/iotest3");
        if(!file.exists()){
//            file.mkdir();//新建目录(只能新建一级)   它有何用？存在即合理
            //需求：需要创建一级目录(如果用户指定的是多级，那么我不创建)
            file.mkdirs();//新建多级目录(能否创建一级？太能了)
            System.out.println("新建成功");
        }*/
    }
    /*
    判断的方法
     */
    @Test
    public void test3(){
        File file=new File("d:/iotest/java_GBK.txt");
        File file1=new File("../day19_IO/src/test.properties");
        System.out.println("文件是否存在："+file.exists());
        System.out.println("file是否是目录："+file.isDirectory());//如果不存在返回值是false
        System.out.println("file是否是文件："+file.isFile());//如果不存在返回值是false
        System.out.println("file是否是采用绝对路径："+file.isAbsolute());
        System.out.println("file是否可读："+file.canRead());
        System.out.println("file是否可写："+file.canWrite());
        System.out.println("file是否隐藏："+file.isHidden());
    }
    /*
    2. 各种路径问题
- ` public String getPath() ` ：将此File转换为路径名字符串。
- `public String getAbsolutePath() ` ：返回此File的绝对路径名字符串。
- `String getCanonicalPath()`：返回此File对象所对应的规范路径名。
    会识别./ 和 ../这个符号
     */
    @Test
    public void test2(){//不能手动输入(main方法就可以)  不能采用相对路径(main方法就可以)
        File file=new File("d:/iotest/java_GBK.txt");
        File file1=new File("../day19_IO/src/test.properties");
        System.out.println("路径："+file.getPath());
        System.out.println("获得绝对路径："+file1.getAbsolutePath());
        //D:\workspace\atguigu\bigdata0523\day19_IO\.\day19_IO\src\test.properties
        //D:\workspace\atguigu\bigdata0523\day19_IO\day19_IO\src\test.properties
        try {
            System.out.println("获得规范路径："+file1.getCanonicalPath());//稍微规范一下
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Maven后面讲的    讲完JDBC就会讲   junit就按照之前的方式导包就可以
    /*
    1. 获取文件和目录基本信息的方法
    - public String getName()`  ：返回由此File表示的文件或目录的名称。
    - `public long length()`  ：返回由此File表示的文件的长度。
    - ` public String getPath() ` ：将此File转换为路径名字符串。
    - `public long lastModified()`：返回File对象对应的文件或目录的最后修改时间（毫秒值）
     */
    @Test
    public void test1(){
        File file=new File("d:/iotest/java_GBK.txt");
        File file1=new File("./day19_IO/src/test.properties");
        System.out.println("获得文件名称："+file.getName());
        System.out.println("获得文件的长度："+file.length());//文件内容的字节数
        //UTF-8 一个中文是三个字节   GBK  一个中文是两个字节
        System.out.println("文件的路径："+file1.getPath());//采用什么方式创建的对象，就把结果直接给你
        System.out.println("最后修改时间："+new Date(file.lastModified()));
    }

    public static void main(String[] args) {
        //1. 创建一个文件对象(File类的构造器)   D:\iotest\java.txt   D:\iotest
        // 为什么路径是错误的执行的时候不报错？ 因为有新建的功能
        File file=new File("D:\\iotest\\java.txt");//通过绝对路径创建的File对象
        System.out.println(file.exists());//判断file是否存在
        //通过相对路径在创建一个File对象
        File file1=new File("./day19_IO/src/test.properties");
        System.out.println(file1.exists());
        System.out.println("-------------------------------------");

        File parent=new File("d:/iotest");//parent指向的是一个目录
        System.out.println("目录是否存在："+parent.exists());
        //parent目录下是否存在一个java.txt文件
        //1. 新建一个File对象指向parent下的java.txt
        File javaFile=new File(parent,"java1.txt");
        System.out.println("java.txt是否存在"+javaFile.exists());

        String parent1="d:/iotest";//可能是外界传进来的
        File file2 = new File(parent1,"java.txt");
        System.out.println("file2是否存在："+file2.exists());

    }


}
