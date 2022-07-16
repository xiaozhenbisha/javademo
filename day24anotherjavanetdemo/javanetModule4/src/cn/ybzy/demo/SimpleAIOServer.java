package cn.ybzy.demo;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.Future;

public class SimpleAIOServer {
    public static void main(String[] args) {
        try(AsynchronousServerSocketChannel serverSocketChannel
                    = AsynchronousServerSocketChannel.open();){
            serverSocketChannel.bind(new InetSocketAddress("127.0.0.1",6500));
            //用循环不断地接收客户端的链接
            while (true){
                Future<AsynchronousSocketChannel> future = serverSocketChannel.accept();
                //while (!future.isDone()); //作用阻塞程序
                AsynchronousSocketChannel socketChannel = future.get(); //get()会阻塞程序，直到操作系统完成网络io
                //可以和客户端通信
                ByteBuffer wbuffer = ByteBuffer.allocate(1024);
                wbuffer.clear();
                wbuffer.put("我是服务器".getBytes("UTF-8"));
                wbuffer.flip();
                socketChannel.write(wbuffer); //在异步模式下就不要加循环
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
