package com.atguigu.i_polymorphic;

public class Test01 {
    public static void main(String[] args) {
        //多态new对象  向上转型
        Animal animal = new Dog();
        animal.eat();//dog重写的
        //animal.lookDoor();//多态不能调用子类特有功能

        //向下转型
        Dog dog = (Dog) animal;
        dog.eat();
        dog.lookDoor();
    }
}
