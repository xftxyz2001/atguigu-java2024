package com.atguigu.f_design;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getSingleton();
            System.out.println(singleton);
        }
    }
}
