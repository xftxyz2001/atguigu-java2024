package com.atguigu.e_newjdk;

public class Test07 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        method(dog);
    }
    public static void method(Animal animal){
        /*if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.eat();
            dog.lookDoor();
        }*/
        if (animal instanceof Dog dog){
            dog.eat();
            dog.lookDoor();
        }
    }
}
