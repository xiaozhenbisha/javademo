package com.atguigu.homework;

import com.atguigu.homework.Message;
import org.junit.Test;

import java.io.*;
import java.util.Date;

/*
    此类用于演示   serialVersionUID情况
     1. 在没有serialVersionUID的情况下会有什么问题
        版本升级之后，直接读，而不写了(会报错)
     2.  有serialVersionUID
        版本升级，还是直接读，不写(会有什么问题？)不会报错，删掉的属性，数据不取了
 */
public class Demo1 {
    @Test
    public void test2(){
        ObjectInputStream in=null;
        try {
            //之前读message.dat是没有问题的，现在在读的时候就出现报错了(Message版本发生了变化)
            in=new ObjectInputStream(new FileInputStream("d:/testIO/message1.dat"));
            Message m = (Message)in.readObject();
            System.out.println(m);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(in!=null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test1(){
        //对象流   本包内可以访问
        Message message=new Message("张三","蔡徐坤","听说你篮球打的好");
        ObjectOutputStream out=null;
        try {
            out=new ObjectOutputStream(new FileOutputStream("d:/testIO/message1.dat"));//这行代码出现异常out是null
            out.writeObject(message);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(out!=null)
                    out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
