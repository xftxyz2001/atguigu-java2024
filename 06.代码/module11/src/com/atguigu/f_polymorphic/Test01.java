package com.atguigu.f_polymorphic;

public class Test01 {
    public static void main(String[] args) {
        //原始方式
        Dog dog = new Dog();
        dog.eat();//重写的
        dog.lookDoor();//特有的

        Cat cat = new Cat();
        cat.eat();//重写的
        cat.catchMouse();//特有的

        System.out.println("==================");
        //多态形式new对象
        Animal animal = new Dog();//相当于double b = 10
        animal.eat();//重写的 animal接收的是dog对象,所以调用的是dog中的eat
//      animal.lookDoor();   多态前提下,不能直接调用子类特有成员

        Animal animal1 = new Cat();
        animal1.eat();//cat重写的


    }
}
