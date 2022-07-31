package com.java.demo;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
    基于UDP进行  网络编程
    1. 非面向连接    传输单位是一个数据报
    2. UDP协议采用数据报套接字完成网络编程
        DatagramSocket  既可以发送也可以接收
            接收端的创建方式：
                new DatagramSocket(6666);
            发送端的创建方式
                new DatagramSocket();
        DatagramPacket   数据报(存放目的地+数据)
            发送数据的数据报
                 new DatagramPacket(byte[] b,int len,InetAddress ip,int port)
            接收数据的数据报
                 new DatagramPacket(byte[] b,int len)
 */
public class Demo3 {

    /*
        发送端
            new DatagramSocket();  单纯的发送端

        数据报   DatagramPacket
            new DatagramPacket(byte[] b,int len,InetAddress ip,int port)   准备发送的

     */
    @Test
    public void send(){
        //1. 创建发送端对象
        DatagramSocket socket=null;
        try {
            socket=new DatagramSocket();
            //2. 发送数据
            //2.1 准备数据报包
            byte[] b="hello receive123".getBytes();
            DatagramPacket dp=new DatagramPacket(b,b.length, InetAddress.getLocalHost(),6666);
            //2.2 发送   发出去后，不管是否能接收到
            socket.send(dp);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //3. 关闭资源
            socket.close();
        }
    }
    /*
        接收端
            new DatagramSocket(int port);  创建的接收端对象(也可以发送)

        数据报
            new DatagramPacket(byte[] b,int length);   准备一个空的数据报接收数据
     */
    @Test
    public void receive(){
        //1. 创建接收端的对象
        DatagramSocket socket=null;
        try {
            socket=new DatagramSocket(6666);

            //2. 接收数据
            //2.1   准备一个数据报(空)
            byte[] b=new byte[1024];
            DatagramPacket dp=new DatagramPacket(b,b.length);//预想接收到的字节数

            //2.2 接收
            socket.receive(dp);

            //3. 展示数据    获得接收到的数据长度
            int len=dp.getLength();//获得实际接收到的内容字节数
            System.out.println("send say:"+new String(b,0,len));
            System.out.println("length:"+len);



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            socket.close();
        }
    }

}
