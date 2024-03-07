package com.atguigu.i_innerclass;

public class Person {
    public void eat(){
        class Heart{
            public void jump(){
                System.out.println("心脏哐哐哐的跳");
            }
        }

        new Heart().jump();
    }
}
