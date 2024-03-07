package com.atguigu.c_upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerThread {
    public static void main(String[] args) throws Exception {
        //1.创建ServerSocket对象
        ServerSocket ss = new ServerSocket(6666);

        while (true) {
            //2.调用accept方法等待客户端的连接
            Socket socket = ss.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    InputStream is = null;
                    FileOutputStream fos = null;
                    OutputStream os = null;
                    try {
                        //3.调用socket中的getInputStream,读取客户端发送过来的图片
                        is = socket.getInputStream();

        /*
          UUID调用randomUUID(),再调用toString,将其转成String
         */
                        String s = UUID.randomUUID().toString();
                        String name = s + System.currentTimeMillis();

                        //4.创建FileOutputStream,将读取过来的图片写到硬盘上
                       fos = new FileOutputStream("E:\\Idea\\io\\upload\\" + name + ".jpg");
                        //5.边读边写
                        byte[] bytes = new byte[1024];
                        int len;
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }

                        System.out.println("======以下代码是给客户端的响应结果======");

                        //6.调用socket中的getOutputStream,给客户端响应结果
                        os = socket.getOutputStream();
                        os.write("上传成功".getBytes());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        //7.关流
                       CloseUtils.closeQ(socket,fos,is,os);
                    }

                }
            }).start();


        }


    }
}
