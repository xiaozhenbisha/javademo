package com.atguigu.demo;

import com.atguigu.bean.Dog;
import com.atguigu.bean.User;
import org.junit.Test;

import java.io.*;

/*
    此类用于演示  对象流(希望可以将一个java中的对象写到文件中，并还能读取出来)
       1. 对字节流进行的处理    字节输入流
        1.1 字节输出流   ObjectOutputStream
            构造器：
                new ObjectOutputStream(OutputStream out)
            方法：
                包含OutputStream中的三个write方法
                writeXXX(XXX xxx);
                writeObject(Object obj);
        1.2 字节输入流   ObjectInputStream
            采用对象流去读的文件，必须是采用对象流写出的文件
            读的时候和写的时候顺序要保持一致
            构造器：
                new ObjectInputStream(InputStream in);
            方法：
                包括三个read方法
                XXX readXXX();
                readObject();

        2. 序列化  对象-->字节序列的过程   底层原理在JVM中
            对象如果没有序列化，就会报错   java.io.NotSerializableException: com.atguigu.bean.User
            java中的对象如何序列化
                在对象的类型上实现 一个接口Serializable(该接口下没有抽象方法)
                字节序列是不可读的！计算机可读！
                static、transient修饰的内容不会被序列化的
                如果有对象的关联，要求关联的对象也是需要序列化的
        3. 反序列化   字节序列-->对象


        4. 总结
            4.1 四大根类
                字节输入  字节输出   字符输入  字符输出
            4.2 缓冲流  4个
            4.3 转换流  (处理乱码)   2个
            4.4 对象流  (处理java对象持久化的)   2个   对字节流的处理
        5. 打印流  PrintStream  对输出流处理
            他是System.out的类型
            //所有的输出语句都是io操作(比较浪费资源)
            //以后的项目输出语句，有用吗？没用(方便程序员看结果)
            //采用日志打印，代替输出语句
            构造器
                new PrintStream(OutputStream out);
                new PrintStream(File file);
                new PrintStream(String  name);
            方法：
                具备三个write方法
                print(XXX xxx)
        6. 标准的输入输出流
            System.out类型是一个PrintStream,这个流对象指向哪里？控制台
                是否可以改变其指向？  System.setOut(PrintStream out)
            System.in类型InputStream,这个流对象指向哪里？输入设备
                是否可以改变其指向？  System.setIn();
        7. 异常处理
            try{}catch(){}的一种新写法
            try(定义需要关闭的对象){}catch(){}
                定义到try小括号中的对象，大括号中可以使用，而且会自动关闭
 */
public class Demo7 {
    @Test
    public void test5(){
        /*InputStream in=null;
        try {
            in=new FileInputStream("d:/iotest/java.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        try(InputStream in=new FileInputStream("")) {
            int read = in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void test4() throws FileNotFoundException {

        PrintStream out=new PrintStream("d:/iotest/print.txt");
        System.setOut(out);
        System.out.println("尚硅谷");
    }
    @Test
    public void test3() throws Exception {
        System.out.print(11);//所有的输出语句都是io操作
        PrintStream out=new PrintStream("d:/iotest/print.txt");
        out.print(100);
        out.println("你好");//ln是带换行的
        out.print(true);

        out.close();
    }
    /*
     读出user.txt中的数据(有可能是一个月之后)
     */
    @Test
    public void test2() throws Exception {
        ObjectInputStream ois=
                new ObjectInputStream(
                        new FileInputStream("d:/iotest/user3.txt"));
        int i = ois.readInt();
        double v = ois.readDouble();
        String s = ois.readUTF();
        Object o = ois.readObject();
        System.out.println(i+" "+v+" "+s);
        System.out.println(o);
        ois.close();
    }
    /*
    需求：想要将User的一个对象写入到文件中
        将内存中的对象进行持久化(永久存储[磁盘的文件])
     */
    @Test
    public void test1() throws Exception {
        User u=new User(1,"张三",18,new Dog());
        //1. 对象的创建
        ObjectOutputStream oos=
                new ObjectOutputStream(
                        new FileOutputStream("d:/iotest/user3.txt"));
        //2. 写入
        oos.writeInt(100);//int几个字节？4
        oos.writeDouble(12.5);//double几个字节？8
        oos.writeUTF("尚硅谷");//
        oos.writeObject(u);
        //3. 关闭资源
        oos.close();
    }
}
