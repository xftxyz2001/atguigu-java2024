package com.atguigu.c_upload;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args)throws Exception {
        //1.创建ServerSocket对象
        ServerSocket ss = new ServerSocket(6666);
        //2.调用accept方法等待客户端的连接
        Socket socket = ss.accept();
        //3.调用socket中的getInputStream,读取客户端发送过来的图片
        InputStream is = socket.getInputStream();

        /*
          UUID调用randomUUID(),再调用toString,将其转成String
         */
        String s = UUID.randomUUID().toString();
        String name = s + System.currentTimeMillis();

        //4.创建FileOutputStream,将读取过来的图片写到硬盘上
        FileOutputStream fos = new FileOutputStream("E:\\Idea\\io\\upload\\"+name+".jpg");
        //5.边读边写
        byte[] bytes = new byte[1024];
        int len;
        while((len = is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        System.out.println("======以下代码是给客户端的响应结果======");

        //6.调用socket中的getOutputStream,给客户端响应结果
        OutputStream os = socket.getOutputStream();
        os.write("上传成功".getBytes());
        //7.关流
        os.close();
        fos.close();
        is.close();
        socket.close();
        ss.close();
    }
}
