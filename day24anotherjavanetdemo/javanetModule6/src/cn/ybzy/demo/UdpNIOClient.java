package cn.ybzy.demo;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UdpNIOClient {
    public static void main(String[] args) {
        //定义两个缓冲器，发数据 和 收数据
        ByteBuffer inbuffer = ByteBuffer.allocate(1024);
        ByteBuffer outbuffer = ByteBuffer.allocate(1024);
        try {
            Scanner scanner = new Scanner(System.in);
            DatagramChannel datagramChannel = DatagramChannel.open();
            datagramChannel.configureBlocking(false);
            while (scanner.hasNextLine()) {
                String content = scanner.nextLine();

                //发送数据
                outbuffer.clear();
                outbuffer.put(content.getBytes("UTF-8"));
                outbuffer.flip();
                datagramChannel.send(outbuffer,new InetSocketAddress("127.0.0.1", 40000));

                inbuffer.clear();
                datagramChannel.receive(inbuffer);
                inbuffer.flip();
                System.out.println("服务器发送来的信息："
                        + StandardCharsets.UTF_8.decode(inbuffer).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
