package cn.ybzy.demo;

import java.io.*;

public class IOTest1 {
    public static void main(String[] args) {
        //做一个事儿：把在D盘里的a.txt文件的内容读出来
        try(FileReader fis = new FileReader("D:\\a.txt");
            FileWriter fos = new FileWriter("D:\\b.txt")
        ) {
            //先定义两个东西
            char[] b = new char[1024];
            int hasRead = 0; //一个计数器：已经读取到的数据的字节数
            while ((hasRead=fis.read(b))>0){
                //在项目中，根据应用需求对读出来的数据进行处理
                //System.out.println(new String(b,0,hasRead));
                //读到的数据写入b.txt文件里去，每次读到多少数，就写多少数据
                fos.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
