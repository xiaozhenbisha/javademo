package cn.ybzy.demo;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private static final int SERVER_PORT = 40000;
    private Socket socket = null;
    private PrintStream ps = null;
    private BufferedReader inServer = null;
    private BufferedReader inKey = null;


    /**
     * 客户端链接服务器的功能,并且实现用户的登录
     */
    public void init(){
        try{
            //首先键盘的输入流初始化
            inKey = new BufferedReader(new InputStreamReader(System.in,"GBK"));
            //链接到服务器
            socket = new Socket("127.0.0.1",SERVER_PORT);
            //获取socket对应的输入输出流
            ps = new PrintStream(socket.getOutputStream(),true,"GBK");
            inServer = new BufferedReader(new InputStreamReader(socket.getInputStream(),"GBK"));

            //用一个循环来进行服务器的登录
            String tip = "";
            while(true){
                //虽然我们还没见过到GUI，这里小小用一个gui里的弹出对话框
               String userName = JOptionPane.showInputDialog(tip + "输入用户名：");
               //就把用户输入的用户名发送给服务器
                ps.println(ChatRoomProtocol.USER_ROUND + userName + ChatRoomProtocol.USER_ROUND);
                //发送后，紧接着获取服务器的响应
                String res = inServer.readLine();
                //用户名重复了，返回-1
                if(res.equals(ChatRoomProtocol.NAME_REP)){
                    tip = "用户名重复，请重新";
                    continue;
                }
                if(res.equals(ChatRoomProtocol.LOGIN_SUCCESS)){
                    break;
                }
            }
        }catch (UnknownHostException e1){
            System.out.println("找不到服务器，请确认服务器是后启动！");
            closeRes();
            System.exit(1);
        }catch (IOException e2){
            System.out.println("网络异常，请确实网络是否链接！");
            closeRes();
            System.exit(1);
        }
        //启动线程，获取服务器的响应信息，在控制台显示
        new Thread(new ClientThread(inServer)).start();
    }

    /**
     * 客户端获取键盘上的信息并且发送给服务器的功能
     */
    private void readAndSend(){
        try{
            //通过循环不断地获取键盘上信息，包装发送
            String line = null;
            while((line=inKey.readLine())!=null){
                //对line的内容进行判断，发送的是私聊信息，还是公聊信息
                //规定：发送的信息如果有冒号，并且是以"//"开头，表示你发送的信息是私聊信息
                if(line.indexOf(":") > 0 && line.startsWith("//")){
                    line = line.substring(2);
                    ps.println(ChatRoomProtocol.PRIVATEMSG_ROUND +
                            line.split(":")[0] + ChatRoomProtocol.SPLIT_SIGN +
                            line.split(":")[1] + ChatRoomProtocol.PRIVATEMSG_ROUND);
                }else{
                    //就是公聊信息
                    ps.println(ChatRoomProtocol.PUBLICMSG_ROUND +
                            line + ChatRoomProtocol.PUBLICMSG_ROUND);
                }
            }
        }catch (IOException e){
            System.out.println("网络通信异常，请检查网络是否通畅！");
            closeRes();
            System.exit(1);
        }
    }

    /**
     * 对资源关闭的功能
     */
    private void closeRes(){
        try{
            if(inKey!=null) inKey.close();
            if(inServer!=null) inServer.close();
            if(ps!=null) ps.close();
            if(socket!=null) socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.init();
        client.readAndSend();
    }
}
