package com.atguigu.j_innerclass;

public class Test03 {
    public static void main(String[] args) {
        Person person = new Person();
        method01(person);
        System.out.println("==================");
        Person person1 = method02();//Person person1 = new Person()
        person1.eat();
    }
    public static void method01(Person person){
        person.eat();
    }

    public static Person method02(){
        return new Person();
    }
}
