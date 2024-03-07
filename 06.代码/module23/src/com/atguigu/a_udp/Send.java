package com.atguigu.a_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
    public static void main(String[] args) throws Exception{
        /*1.创建DatagramSocket对象(快递公司)
        a.空参:端口号从可用的端口号中随机一个使用
        b.有参:自己指定*/
        DatagramSocket socket = new DatagramSocket();
       /* 2.创建DatagramPacket对象,将数据进行打包
        a.要发送的数据-> byte[]
        b.指定接收端的IP
        c.指定接收端的端口号*/
        byte[] bytes = "你好呀".getBytes();
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 6666;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, ip, port);
        //3.发送数据
        socket.send(dp);
        //4.释放资源
        socket.close();
    }
}
