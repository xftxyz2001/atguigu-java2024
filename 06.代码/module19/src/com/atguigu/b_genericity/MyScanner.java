package com.atguigu.b_genericity;

public class MyScanner implements MyIterator<String>{
    @Override
    public String next() {
        return "涛哥和金莲的故事";
    }
}
