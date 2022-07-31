package com.java.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        //1. 创建服务器端的套接字对象,要求设置一个端口号   (供客户端连接--> ip地址+端口号去找服务器端的程序)
        OutputStream out =null;
        ServerSocket server=null;
        Socket socket=null;
        InputStream in =null;
        Scanner input=new Scanner(System.in);
        try {
            server=new ServerSocket(8888);//ip地址就是这个代码运行在哪个电脑，就是采用哪个电脑的ip地址
            System.out.println("服务器端启动，客户端来呀。。。");
            //2. 等待客户端来连接    这行代码会有阻塞的情况   一旦创建连接成功，服务器端也是采用Socket
            socket = server.accept();
            System.out.println("有客户端来了。。。。");
            while (true) {
                //3. 服务器给客户端发送第一条数据(输出)    IO流   数据从我这里到外界(网络)
                //3.1  获得输出流对象
                out = socket.getOutputStream();
                //3.2  将数据输出   将数据写到网络中-->连接的socket
                System.out.println("请输入对客户端说的话：");
                byte[] b=input.next().getBytes();
                out.write(b);

                //4. 接收客户端的回话
                in = socket.getInputStream();
                byte[] b1=new byte[1024];
                int len = in.read(b1);
                System.out.println("client say:"+new String(b1,0,len));


            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
                server.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
