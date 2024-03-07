package com.atguigu.e_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());

        //es.shutdown();//关闭线程池对象
    }
}
