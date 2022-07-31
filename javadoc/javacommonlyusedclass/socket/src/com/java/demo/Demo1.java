package com.java.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    此类用于演示  网络编程(底层)   了解
    1. 作用    通信
    2. 软件结构
        C/S   客户端(需要安装到设备上)/服务器端
        B/S   浏览器/服务器
    3. 服务器
        硬件设备
        软件设备
    4. C/S  和  B/S的优缺点
        C/S   需要客户下载安装客户端，通过客户端访问服务器
            访问速度较高，稳定性较好   但是  扩展性和维护性较差
        B/S   客户通过浏览器去访问服务器
            扩展性和维护性较好  但是   访问速度较慢，稳定性比较而言差一些

    5. 移动端(没有微信小程序的)   手机上太多的app(经常遇到更新)
            微信小程序：   外卖、卖票、旅游...

    6. 客户端和服务器端
        张三-->李四  :  张三-->服务器-->李四

    7. 网络通信协议
        7.1 OSI参考模型
            模型过于理想化(分的太细)，未能在因特网上进行广泛推广
        7.2 TCP/IP协议参考模型(目前使用)
            应用层-->传输层★-->网络层-->物理层

            传输层对应的协议有：
                TCP：传输控制协议 (Transmission Control Protocol)。
                    面向连接(三次握手才可以连接上，四次挥手才可以断开)   数据传输是可靠的
                    理论上没有数据限制的
                    举例：打电话
                UDP: 用户数据报协议(User Datagram Protocol)
                    非面向连接              数据传输是不可靠的
                    大小限制的    数据被限制在64kb以内，超出这个范围就不能发送了
                    数据报(Datagram)：网络传输的基本单位   将目的地和发送内容达成一个数据报，抛给服务器
                    举例：发短信

    8. 网络编程的三大要素
        协议
        ip地址 ：在当前的网络环境中标记一台唯一的计算机
        端口号 ：对计算机中一个应用程序的唯一标识   8080：tomcat   3306:mysql   1521 :oracle
            1-65535   1024以内的最好不要用
    9. InetAddress类    对ip地址的标记(一个计算机的地址)
        getLocalHost();  //获得本机的InetAddress对象
 */
public class Demo1 {
    public static void main(String[] args) {
        // 在同一个路由器下  两台设备就可以发消息
        try {
            //获得本机的InetAddress对象
            InetAddress ip=InetAddress.getLocalHost();
            System.out.println(ip);

            InetAddress ip1 = InetAddress.getByName("localhost");//ip地址字符串   计算机的名称
            System.out.println(ip1);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
