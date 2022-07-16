package cn.ybzy.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdbClient {
    public static void main(String[] args) {
        //套接字
        try(DatagramSocket socket = new DatagramSocket();) {
             //不传参数就是随机使用本地端口
            //定义两个用来收和发的数据的集装箱
            //在收数据的集装箱上面指定的长度，是每次收数据的报包大小上限,4K
            byte[] inbuffer = new byte[4096];
            DatagramPacket inPacket = new DatagramPacket(inbuffer,inbuffer.length);
            //预定义一个发数据的集装箱
            DatagramPacket outPacket = new DatagramPacket(new byte[0],0,
                    new InetSocketAddress("127.0.0.1",30000));

            //发送数据，是键盘上输入的数据
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()){
                byte[] datas = sc.nextLine().getBytes();
                outPacket.setData(datas);
                socket.send(outPacket);
                //服务器端收到我发送的数据，服务器应该可以沿着去的路，给我回应一个信息过来
                socket.receive(inPacket);
                System.out.println("服务器发来的信息："
                        + new String(inbuffer,0,inPacket.getLength()));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
