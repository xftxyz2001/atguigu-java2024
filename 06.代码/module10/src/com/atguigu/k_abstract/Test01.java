package com.atguigu.k_abstract;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.drink();
        System.out.println("===================");
        Cat cat = new Cat();
        cat.eat();
        cat.drink();

    }
}
