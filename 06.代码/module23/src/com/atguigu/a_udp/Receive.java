package com.atguigu.a_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Receive {
    public static void main(String[] args) throws Exception{
        //1.创建DatagramSocket对象,指定服务端的端口号
        DatagramSocket socket = new DatagramSocket(6666);
        //2.接收数据包
        byte[] bytes = new byte[1024];//用于保存接收过来的数据
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        socket.receive(dp);
        //3.解析数据包
        byte[] data = dp.getData();//接收的数据
        int len = dp.getLength();//从数据包中获取多少个数据
        InetAddress address = dp.getAddress();//获取发送端的主机
        int port = dp.getPort();//发送端的端口号
        System.out.println(new String(data,0,len));
        System.out.println(address+"..."+port);
        //4.释放资源
        socket.close();
    }
}
