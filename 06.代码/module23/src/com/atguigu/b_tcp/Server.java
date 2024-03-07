package com.atguigu.b_tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)throws Exception {
        //1.创建ServerSocket对象,设置端口号
        ServerSocket ss = new ServerSocket(6666);
        //2.调用ServerSocket中的accept方法,等待客户端连接,返回Socket对象
        Socket socket = ss.accept();
        //3.调用socket中的getInputStream,用于读取客户端发送过来的数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //4.调用socket中的getOutputStream,用于给客户端响应数据
        OutputStream os = socket.getOutputStream();
        os.write("给你一个小电影".getBytes());
        //5.关闭资源
        os.close();
        is.close();
        socket.close();
        ss.close();
    }
}
