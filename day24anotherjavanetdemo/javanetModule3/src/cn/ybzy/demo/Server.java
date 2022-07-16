package cn.ybzy.demo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Set;

public class Server {
    //服务端绑定的端口号
    public static final int SERVER_PORT = 8888;
    //定义字符的编码器
    private Charset charset = Charset.forName("GBK");
    //定义两个缓冲区
    private ByteBuffer readBuffer = ByteBuffer.allocate(1024);
    private ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
    //定义集合放链接进来的用户剬信息
    private static ChatRoomMap<String, SocketChannel> clients = new ChatRoomMap<>();
    //定义选择器
    private Selector selector;

    //初始化服务器包装为一个方法
    private void init() {
        //拿到ServerSoketChannel的实例
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            ServerSocket serverSocket = serverSocketChannel.socket();
            serverSocket.bind(new InetSocketAddress("127.0.0.1", SERVER_PORT));
            selector = Selector.open();
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("服务器已经启动......");
        } catch (IOException e) {
            System.out.println("服务器链接异常，可能是端口好被占用了！");
        }
    }


    //循环监听通道
    public void listen() {
        while (true) {
            try {
                int count = selector.select(5000);
                if (count == 0) continue;
                Set<SelectionKey> keys = selector.selectedKeys();
                for (SelectionKey key : keys) {
                    handler(key); //处理准备就绪的通道
                    keys.remove(key); //把处理过的通道手动地从集合中移除
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //处理准备就绪的通道的方法
    private void handler(SelectionKey key) {
        //第一件要处理接入客户端
        if (key.isAcceptable()) {
            try {
                //有新的客户端进来
                ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
                //正式地接入客户端
                SocketChannel clientSocketChannel = serverSocketChannel.accept();
                clientSocketChannel.configureBlocking(false);
                clientSocketChannel.register(selector, SelectionKey.OP_READ);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (key.isReadable()) {
            //客户端有信息发送过来了
            SocketChannel clientSocketChannl = (SocketChannel) key.channel();
            try {
                readBuffer.clear();
                int hasRead = clientSocketChannl.read(readBuffer);
                if (hasRead > 0) {
                    readBuffer.flip();
                    String str = new String(readBuffer.array(),0,hasRead,"GBK");
                    if (str.startsWith(ChatRoomProtocol.USER_ROUND) && str.endsWith(ChatRoomProtocol.USER_ROUND)) {
                        login(clientSocketChannl, str);
                    }else if(str.startsWith(ChatRoomProtocol.PRIVATEMSG_ROUND) && str.endsWith(ChatRoomProtocol.PRIVATEMSG_ROUND)){
                        sendMsyToUser(clientSocketChannl,str);
                    }else if(str.startsWith(ChatRoomProtocol.PUBLICMSG_ROUND) && str.endsWith(ChatRoomProtocol.PUBLICMSG_ROUND)){
                        dispatch(clientSocketChannl,str);
                    }
                }
            } catch (IOException e) {
                Server.clients.removeByValue(clientSocketChannl);
            }
        }
    }

    /**
     * 实现客户端的登录，把客户端用一个用户名标记
     * @param client
     * @param str
     */
    private void login(SocketChannel client, String str) {
        System.out.println("登录来啦....");
        try{
            //接受到的是用户名称
            //拿到真正的用户名称
            String userName = getRealMsg(str);
            //判断用户不能重复
            if (Server.clients.map.containsKey(userName)) {
                System.out.println("用户名重复了");
                writeBuffer.clear();
                writeBuffer.put(charset.encode(ChatRoomProtocol.USER_ROUND+ChatRoomProtocol.NAME_REP
                +ChatRoomProtocol.USER_ROUND));
                writeBuffer.flip();
                while (writeBuffer.hasRemaining()){
                    client.write(writeBuffer);
                }
            } else {
                System.out.println("用户登录成功！");
                writeBuffer.clear();
                writeBuffer.put(charset.encode(ChatRoomProtocol.USER_ROUND+ChatRoomProtocol.LOGIN_SUCCESS
                +ChatRoomProtocol.USER_ROUND));
                writeBuffer.flip();
                while (writeBuffer.hasRemaining()){
                    client.write(writeBuffer);
                }
                Server.clients.put(userName,client);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 对私聊信息的转发
     * @param client
     * @param str
     */
    private void sendMsyToUser(SocketChannel client, String str){
        try{
            //客户端发送来的信息是私聊
            //拿到真正的信息,信息里包含了目标用户和消息
            String userAndMsg = getRealMsg(str);
            //上面的信息是用ChatRoomProtocol.SPLIT_SIGN来隔开的
            String targetUser = userAndMsg.split(ChatRoomProtocol.SPLIT_SIGN)[0];
            String privatemsg = userAndMsg.split(ChatRoomProtocol.SPLIT_SIGN)[1];

            //服务器就可以转发给指定的用户了三
            writeBuffer.clear();
            writeBuffer.put(charset.encode(Server.clients.getKeyByValue(client) +"悄悄地说：" + privatemsg));
            writeBuffer.flip();
            while (writeBuffer.hasRemaining()){
                Server.clients.map.get(targetUser).write(writeBuffer);
            }
        }catch (IOException e){
            Server.clients.removeByValue(client);
        }
    }

    /**
     * 对公聊信息的广播
     * @param client
     * @param str
     */
    private void dispatch(SocketChannel client, String str){
        try{
            //拿到真正的信息
            String publicmsg = getRealMsg(str);
            Set<SocketChannel> valueSet = Server.clients.getValueSet();
            for(SocketChannel cli : valueSet){
                writeBuffer.clear();
                writeBuffer.put(charset.encode(Server.clients.getKeyByValue(client) +"说：" + publicmsg));
                writeBuffer.flip();
                while(writeBuffer.hasRemaining()){
                    cli.write(writeBuffer);
                }
            }
        }catch (IOException e){
            Server.clients.removeByValue(client);
        }
    }


    //去除协议字符的方法
    private String getRealMsg(String lines) {
        return lines.substring(ChatRoomProtocol.PROTOCOL_LEN, lines.length() - ChatRoomProtocol.PROTOCOL_LEN);
    }

    //程序的执行入口
    public static void main(String[] args) {
        Server server = new Server();
        server.init();
        server.listen();
    }

}
