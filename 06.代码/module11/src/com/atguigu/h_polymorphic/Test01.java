package com.atguigu.h_polymorphic;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();//重写的
        dog.lookDoor();//特有的

        //dog = new Cat();
        System.out.println("=============");
        method(dog);

        Cat cat = new Cat();
        method(cat);

       /* houzi houzi = new houzi();
        method(houzi);

        bird bird = new bird();
        method(bird);*/
    }

    public static void method(Dog dog){
        dog.eat();
        dog.lookDoor();
    }

    public static void method(Cat cat){
        cat.eat();
        cat.catchMouse();
    }

   /* public static void method(houzi houzi){
        cat.eat();
        cat.catchMouse();
    }*/
}
