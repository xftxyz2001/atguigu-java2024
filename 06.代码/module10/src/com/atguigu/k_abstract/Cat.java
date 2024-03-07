package com.atguigu.k_abstract;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void drink() {
        System.out.println("猫喝水");
    }
}
