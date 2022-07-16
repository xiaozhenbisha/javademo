package cn.ybzy.demo;

import javax.swing.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.Set;

public class Client {
    //端口
    public static final int SERVER_PORT = 8888;
    //定义一个信息编码器
    private Charset charset = Charset.forName("GBK");
    //缓冲区
    private ByteBuffer rbuffer = ByteBuffer.allocate(1024);
    private ByteBuffer wbuffer = ByteBuffer.allocate(1024);
    //定义选择器
    private Selector selector;
    //第一次登录失败后，用到的小tip
    private String tip = "";


    //初始化
    private void init() {
        try {
            //获取SocketChannl
            SocketChannel clientChannl = SocketChannel.open();
            clientChannl.configureBlocking(false);
            selector = Selector.open();
            clientChannl.register(selector, SelectionKey.OP_CONNECT);
            clientChannl.connect(new InetSocketAddress("127.0.0.1", SERVER_PORT));
            while (true) {
                int count = selector.select(5000);
                if (count == 0) continue;
                Set<SelectionKey> keys = selector.selectedKeys();
                for (SelectionKey key : keys) {
                    //key进行处理
                    handler(key);
                    keys.remove(key);
                }

            }
        } catch (IOException e) {
            System.out.println("链接服务器异常，请查看网络！");
        }
    }

    /**
     * 处理事件的方法
     *
     * @param key
     */
    private void handler(SelectionKey key) {
        //首先第一件事情就是链接事件
        if (key.isConnectable()) {
            try {
                SocketChannel client = (SocketChannel) key.channel();
                if (client.isConnectionPending()) {
                    client.finishConnect();//此句话如果正常没有报错的情况下，执行过了，
                    //可以确定，客户端已经正常链接上了服务器
                    System.out.println("客户端链接服务器成功！");
                    //实现客户端去登录服务器
                    login(client, tip);
                    //开启一个子线程，负责获取键盘信息（公聊信息，和私聊信息）发送给服务器
                    new Thread(new ClientThread(client)).start();
                    //改变选择器对通道的兴趣事件
                    client.register(selector, SelectionKey.OP_READ);
                    //key.interestOps(SelectionKey.OP_READ); 和上面写法效果一样
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (key.isReadable()) {
            try {
                //服务器有信息发送过来，服务器会发送两种信息过来，一类是登录的回复，一类是聊天的内容
                SocketChannel client = (SocketChannel) key.channel();
                rbuffer.clear();
                int count = client.read(rbuffer);
                if (count > 0) {
                    //String str = String.valueOf(charset.decode(rbuffer));
                    String str = new String(rbuffer.array(),0,count,"GBK");
                    if (str.startsWith(ChatRoomProtocol.USER_ROUND) &&
                            str.endsWith(ChatRoomProtocol.USER_ROUND)) {
                        //拿到真正的登录回复信息
                        String loginRes = getRealMsg(str);
                        if (loginRes.equals(ChatRoomProtocol.NAME_REP)) {
                            tip = "用户名重复，请重新";
                            login(client, tip);
                        } else if (loginRes.equals(ChatRoomProtocol.LOGIN_SUCCESS)) {
                            System.out.println("客户端登录成功！");
                        }
                    } else {
                        //回来的是聊天信息
                        System.out.println(str);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //实现登录
    private void login(SocketChannel client, String tip) {
        try {
            //虽然我们还没见过到GUI，这里小小用一个gui里的弹出对话框
            String userName = JOptionPane.showInputDialog(tip + "输入用户名：");
            //把userName发送到服务器上去
            wbuffer.clear();
            wbuffer.put(charset.encode(ChatRoomProtocol.USER_ROUND + userName + ChatRoomProtocol.USER_ROUND));
            wbuffer.flip();
            while (wbuffer.hasRemaining()) {
                client.write(wbuffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //负责获取键盘信息（公聊信息，和私聊信息）发送给服务器
    private class ClientThread implements Runnable {
        private SocketChannel client;

        public ClientThread(SocketChannel client) {
            this.client = client;
        }

        @Override
        public void run() {
            while(true){
                try {
                    Scanner scanner = new Scanner(System.in);
                    String line = scanner.nextLine();
                    if (line.indexOf(":") > 0 && line.startsWith("//")) {
                        //私聊信息
                        line = line.substring(2);
                        wbuffer.clear();
                        wbuffer.put(charset.encode(ChatRoomProtocol.PRIVATEMSG_ROUND +
                                line.split(":")[0] + ChatRoomProtocol.SPLIT_SIGN +
                                line.split(":")[1] + ChatRoomProtocol.PRIVATEMSG_ROUND));
                        wbuffer.flip();
                        while (wbuffer.hasRemaining()) {
                            client.write(wbuffer);
                        }
                    } else {
                        //公聊信息
                        wbuffer.clear();
                        wbuffer.put(charset.encode(ChatRoomProtocol.PUBLICMSG_ROUND +
                                line + ChatRoomProtocol.PUBLICMSG_ROUND));
                        wbuffer.flip();
                        while (wbuffer.hasRemaining()) {
                            client.write(wbuffer);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //去除协议字符的方法
    private String getRealMsg(String lines) {
        return lines.substring(ChatRoomProtocol.PROTOCOL_LEN, lines.length() - ChatRoomProtocol.PROTOCOL_LEN);
    }

    //添加执行入口
    public static void main(String[] args) {
        Client client = new Client();
        client.init();
    }

}
