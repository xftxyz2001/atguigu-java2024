package com.atguigu.d_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        /*
           FutureTask(Callable<V> callable)
         */
        FutureTask<String> futureTask = new FutureTask<>(myCallable);

        //创建Thread对象-> Thread(Runnable target)
        Thread t1 = new Thread(futureTask);
        t1.start();

        //调用get方法获取call方法返回值
        System.out.println(futureTask.get());
    }
}
