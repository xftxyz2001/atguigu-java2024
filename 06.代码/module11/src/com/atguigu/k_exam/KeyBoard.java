package com.atguigu.k_exam;

public class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

    //特有功能
    public void input(){
        System.out.println("来呀,敲我呀!");
    }
}
