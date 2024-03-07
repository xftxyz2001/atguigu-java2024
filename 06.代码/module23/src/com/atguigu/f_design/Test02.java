package com.atguigu.f_design;

public class Test02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton1 singleton = Singleton1.getSingleton1();
            System.out.println(singleton);
        }
    }
}
