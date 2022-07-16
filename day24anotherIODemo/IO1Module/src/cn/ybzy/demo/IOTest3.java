package cn.ybzy.demo;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class IOTest3 {
    public static void main(String[] args) {
//        File file = new File("D:\\aaaa\\bbb\\ccc");
//        //与名字有关的方法
//        System.out.println(file.getName());
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getParent());
//        //file.renameTo(new File("D:\\workspace\\workspaceidea\\ThreadDemo11"));
//
//
//        //与文件检查有关的方法
//        System.out.println(file.exists());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());
//        System.out.println(file.canWrite());
//        System.out.println(file.canRead());
//        System.out.println(file.isAbsolute());
//
//        //与文件常规信息有关的方法
//        System.out.println(file.lastModified());
//        System.out.println(file.length());

        //创建删除文件
//        File file = new File("D:\\aaa\\bbb\\ccc\\ddd");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        file.delete();

//        file.mkdirs();


//        //遍历(文件夹)目录
//        File file = new File("D:\\workspace\\workspaceidea\\ThreadDemo");
//        String[] fileNames = file.list();
//        File[] files = file.listFiles();
//
//        for(String filename:fileNames){
//            System.out.println(filename);
//        }
//
//        for(File subFile:files){
//            System.out.println(subFile);
//        }


        //文件过滤器的使用demo
        File file = new File("D:\\workspace\\workspaceidea\\ThreadDemo");
        getJavaFiles(file);

    }

    public static void getJavaFiles(File file){
        //判断传过来的file对象是不是文件夹
        if(!file.isDirectory()){
            return;
        }

        //是文件夹才是进一步扫描的基础
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File subFile) {
                //在这个方法里写过滤规则
                //1子目录要，2.java文件是我要的
                if(subFile.isDirectory()){
                    return true;
                }else{
                    return subFile.getName().toLowerCase().endsWith(".java");
                }
            }
        });

        //过滤后的结果文件我要给看看
        for(File rsFile:files){
            if(rsFile.isDirectory()){
                getJavaFiles(rsFile); //使用递归来进入更深层的文件夹
            }else {
                System.out.println(rsFile);
            }
        }
    }

}
