package com.atguigu.f_pool;

import java.util.concurrent.Callable;

public class MyString implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "那一夜,你没有拒绝我,那一夜,你伤害了我";
    }
}
