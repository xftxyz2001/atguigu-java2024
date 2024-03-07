package com.atguigu.b_tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws Exception {
        //1.创建Socket对象,指明服务端的ip以及端口号
        Socket socket = new Socket("127.0.0.1", 6666);
        //2.调用socket中的getOutputStream,往服务端发送请求
        OutputStream os = socket.getOutputStream();
        os.write("我想下载一个小电影".getBytes());
        //3.调用socket中的getInputStream,读取服务端响应回来的数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //4.关流
        is.close();
        os.close();
        socket.close();
    }
}
