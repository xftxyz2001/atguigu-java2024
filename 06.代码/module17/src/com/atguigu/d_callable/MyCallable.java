package com.atguigu.d_callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "涛哥和金莲...的故事";
    }
}
