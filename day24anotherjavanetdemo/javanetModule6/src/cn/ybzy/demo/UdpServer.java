package cn.ybzy.demo;

import java.net.*;

public class UdpServer {
    public static void main(String[] args) {
        //首先拿套接字
        try(DatagramSocket socket =
                    new DatagramSocket(new InetSocketAddress("127.0.0.1",30000));) {
            //定义接收和发送数据的集装箱
            byte[] inbuffer = new byte[4096];
            DatagramPacket inPacket = new DatagramPacket(inbuffer,inbuffer.length);
            //定义发数据的集装箱
            DatagramPacket outPacket;

            while(socket.isClosed()==false){
                //收数据
                socket.receive(inPacket);
                System.out.println(new String(inbuffer,0,inPacket.getLength()));
                SocketAddress clientAddr = inPacket.getSocketAddress();
                //原路把一些数据返回去
                byte[] sendData = "服务器收到".getBytes();
                outPacket = new DatagramPacket(sendData,sendData.length,clientAddr);
                socket.send(outPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
