package com.atguigu.g_innerclass;

public class Person {
    public void eat(){
        System.out.println("人要干饭");
    }

    static class Heart{
        public void jump(){
            System.out.println("心脏哐哐哐跳");
        }
    }
}
