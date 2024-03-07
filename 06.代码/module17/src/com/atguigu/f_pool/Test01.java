package com.atguigu.f_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<String> f1 = es.submit(new MyString());
        Future<Integer> f2 = es.submit(new MySum());
        System.out.println(f1.get());
        System.out.println(f2.get());
    }
}
