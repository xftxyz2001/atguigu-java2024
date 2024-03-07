package com.atguigu.b_interface;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("鼠标打开");
    }

    @Override
    public String close() {
        return "鼠标关闭";
    }
}
