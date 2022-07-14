package com.atguigu.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        InputStream in=null;
        Socket socket=null;
        OutputStream out=null;
        Scanner input=new Scanner(System.in);
        try {
            //1. 创建客户端的套接字对象
            socket=new Socket("127.0.0.1",8888);
            while (true) {
                //2. 读取服务器端写过来的数据    启动一个线程
                in = socket.getInputStream();
                byte[] b=new byte[1024];
                int len = in.read(b);
                System.out.println("server say:"+new String(b,0,len));

                //3. 接收到服务器端传递过来的数据后，给个回话(原理和刚才是一样的)  启动另一个线程
                out = socket.getOutputStream();
                System.out.println("请输入你需要发给服务器的信息：");
                byte[] b1=input.next().getBytes();
                out.write(b1);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
