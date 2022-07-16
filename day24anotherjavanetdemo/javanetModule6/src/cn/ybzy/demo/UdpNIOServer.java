package cn.ybzy.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

public class UdpNIOServer {
    //定义两个缓冲器，发数据 和 收数据
    private ByteBuffer inbuffer = ByteBuffer.allocate(1024);
    private ByteBuffer outbuffer = ByteBuffer.allocate(1024);

    public void init() {
        try {
            DatagramChannel datagramChannel = DatagramChannel.open();
            datagramChannel.configureBlocking(false);
            //主要接收数据，要绑定一个固定端口
            datagramChannel.bind(new InetSocketAddress("127.0.0.1", 40000));
            //选择器
            Selector selector = Selector.open();
            datagramChannel.register(selector, SelectionKey.OP_READ);
            //通过循环不断地接收和发送数据
            while (true) {
                int count = selector.select(5000);
                if (count == 0) continue;
                Iterator<SelectionKey> it = selector.selectedKeys().iterator();
                while (it.hasNext()) {
                    SelectionKey key = it.next();
                    if (key.isReadable()) {
                        handlerRead(key);
                    }
                    selector.selectedKeys().remove(key);
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handlerRead(SelectionKey key) {
        try {
            DatagramChannel datagramChannel = (DatagramChannel) key.channel();
            inbuffer.clear();
            InetSocketAddress sendAddr = (InetSocketAddress) datagramChannel.receive(inbuffer);
            inbuffer.flip();
            System.out.println("客户端发来的信息："
                    + StandardCharsets.UTF_8.decode(inbuffer).toString());


            //System.out.println(sendAddr);
            //回应
            String content = "服务器收到！";
            outbuffer.clear();
            outbuffer.put(content.getBytes("UTF-8"));
            outbuffer.flip();
//            System.out.println(sendAddr.getHostName());
//            System.out.println(sendAddr.getPort());
            datagramChannel.send(outbuffer, new InetSocketAddress(sendAddr.getHostName(),sendAddr.getPort()));
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        UdpNIOServer server = new UdpNIOServer();
        server.init();
    }

}
