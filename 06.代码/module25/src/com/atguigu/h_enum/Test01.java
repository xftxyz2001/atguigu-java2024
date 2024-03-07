package com.atguigu.h_enum;

public class Test01 {
    public static void main(String[] args) {
        State weifahuo = State.WEIFAHUO;
        System.out.println(weifahuo);//默认调用toString

        State yifukuan = State.YIFUKUAN;
        System.out.println(yifukuan.getName());

    }
}
