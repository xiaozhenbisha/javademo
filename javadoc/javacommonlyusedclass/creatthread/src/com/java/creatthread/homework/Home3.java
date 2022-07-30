package com.java.creatthread.homework;

import org.junit.Test;

import java.io.*;

/**
 * 1、声明一个Message类，包含：发送者(sender)、接收者(recipient)、消息内容(content)、发送时间(time)，
 *     创建一个Message对象，并写到message.dat文件(数据流文件)中，并再次读取显示
 *     转换流设置文件格式(不要采用utf-16)  非中文文件显示是UTF-8  如果有中文  GBK
 *     非中文，采用UTF-8的程序去读取GBK的文件，也是不会乱码的！
 *     老师，昨天那个只能输入中文，才能变编码格式的，等下讲不？
 *         昨天有个同学说改成utf-16，是改idea吗
 */
public class Home3 {
    @Test
    public void test1()  {
        ObjectInputStream in=null;
        try {
            in=new ObjectInputStream(new FileInputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/message.dat"));
            //如果我换了一台电脑，在读会出错的！更换设备或者更换系统(java--python)传输数据的话(xml或json)
            //java的优化  垃圾回收机制  GC   垃圾回收机制什么时候回收垃圾对象？不定时回收
            //什么样的对象会被垃圾回收机制认为是垃圾对象     没有指向关系的对象
            // (当内存中都是有执行关系的对象，但是内存块满了)   找老板加内存   可以将长时间不用的对象，暂时保存到磁盘中，用的时候在读出来
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
    public static void main(String[] args) {
        //对象流
        Message message=new Message("张三","蔡徐坤","听说你篮球打的好");
        ObjectOutputStream out=null;
        try {
            out=new ObjectOutputStream(new FileOutputStream("/Users/wangzhennan/Desktop/javademo/javadoc/testio/message.dat"));//这行代码出现异常out是null
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

class Message implements Serializable {
    private static final long serialVersionUID = 1807488176719711405L;
    //如果是之前是显式赋值，后来改了这个显式赋值，但是只读不写，结果会怎么样(之前的值)
    //之前在哪里见过？serialVersionUID标记版本  (可以不写)
    //自定义异常也是有这个serialVersionUID   一会讲解一下
    /*
        serialVersionUID标记版本的
        加上之后：可以版本兼容(改版本)
        1. 在没有serialVersionUID的情况下会有什么问题
            修改了Message类的内容(版本发生了变化)
     */


    private String sender;
    private String recipient;
    private String content;
//    private Date time;   //对Message发生了修改操作，版本发生了改变

    public Message(String sender, String recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
//        this.time = time;
    }

    public Message() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public Date getTime() {
//        return time;
//    }
//
//    public void setTime(Date time) {
//        this.time = time;
//    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", content='" + content + '\'' +
//                ", time=" + time +
                '}';
    }
}

