package com.java.demo;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
    基于TCP协议 网络编程
        面向连接   客户端(Socket) 和 服务器端(Socket)   通过套接字对象Socket
        TCP协议采用的是流套接字
            Socket: 客户端的Socket
            ServerSocket:服务端的Socket
    1. 先创建服务器端

 */
public class Demo2 {
    public static void main(String[] args) {
        //1. 创建服务器端的套接字对象,要求设置一个端口号   (供客户端连接--> ip地址+端口号去找服务器端的程序)
        OutputStream out =null;
        ServerSocket server=null;
        Socket socket=null;
        Scanner input=new Scanner(System.in);
        try {
            server=new ServerSocket(8888);//ip地址就是这个代码运行在哪个电脑，就是采用哪个电脑的ip地址
            System.out.println("服务器端启动，客户端来呀。。。");
            //2. 等待客户端来连接    这行代码会有阻塞的情况   一旦创建连接成功，服务器端也是采用Socket
            socket = server.accept();
            System.out.println("有客户端来了。。。。");
            //3. 服务器给客户端发送第一条数据(输出)    IO流   数据从我这里到外界(网络)
            //3.1  获得输出流对象
            out = socket.getOutputStream();
            //3.2  将数据输出   将数据写到网络中-->连接的socket
            System.out.println("请输入对客户端说的话：");
            byte[] b=input.next().getBytes();
            out.write(b);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
                server.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /*
        服务器端
     */
    @Test
    public void server() {
        //1. 创建服务器端的套接字对象,要求设置一个端口号   (供客户端连接--> ip地址+端口号去找服务器端的程序)
        OutputStream out =null;
        ServerSocket server=null;
        Socket socket=null;
        Scanner input=new Scanner(System.in);
        try {
            server=new ServerSocket(8888);//ip地址就是这个代码运行在哪个电脑，就是采用哪个电脑的ip地址
            System.out.println("服务器端启动，客户端来呀。。。");
            //2. 等待客户端来连接    这行代码会有阻塞的情况   一旦创建连接成功，服务器端也是采用Socket
            socket = server.accept();
            System.out.println("有客户端来了。。。。");
            //3. 服务器给客户端发送第一条数据(输出)    IO流   数据从我这里到外界(网络)
            //3.1  获得输出流对象
            out = socket.getOutputStream();
            //3.2  将数据输出   将数据写到网络中-->连接的socket
            System.out.println("请输入对客户端说的话：");
            byte[] b=input.next().getBytes();
            out.write(b);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
                server.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    客户端
        new Socket(InetAddress ip,int port);
        new Socket(String ip,int port);

     */
    @Test
    public void client(){
        InputStream in=null;
        Socket socket=null;
        try {
            //1. 创建客户端的套接字对象
            socket=new Socket("127.0.0.1",8888);
            //2. 读取服务器端写过来的数据
            in = socket.getInputStream();
            byte[] b=new byte[1024];
            int len = in.read(b);
            System.out.println("server say:"+new String(b,0,len));

            //3. 接收到服务器端传递过来的数据后，给个回话(原理和刚才是一样的)

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
