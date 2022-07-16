package cn.ybzy.demo;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Future;

public class SimpleAIOClient {
    public static void main(String[] args) {
        try(AsynchronousSocketChannel socketChannel =
                    AsynchronousSocketChannel.open();){
            //定义读数据的缓冲区
            ByteBuffer rbuffer = ByteBuffer.allocate(1024);
            Charset charset = Charset.forName("utf-8");
            //链接服务器
            Future<Void> future = socketChannel.connect(new InetSocketAddress("127.0.0.1", 6500));
            //while (!future.isDone());
            future.get(); //人为阻塞
            //可以从通道里拿数据
            rbuffer.clear();
            Future<Integer> fu = socketChannel.read(rbuffer);
            fu.get();//阻塞程序
            //表示数据从通道读取到缓冲区完成
            rbuffer.flip();
            String content = StandardCharsets.UTF_8.decode(rbuffer).toString(); //charset.decode(rbuffer).toString(); //String.valueOf(charset.decode(rbuffer));
            System.out.println("服务器发送来的数据：" + content);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
