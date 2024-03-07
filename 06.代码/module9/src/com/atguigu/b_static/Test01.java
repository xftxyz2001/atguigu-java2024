package com.atguigu.b_static;

public class Test01 {
    public static void main(String[] args) {
        //静态成员中访问非静态成员
        Test01 test01 = new Test01();
        test01.method03();

        Person person = new Person();
        person.eat();
    }

    public static void method01(){
       method02();
       Person.drink();
    }

    public static void method02(){

    }

    public void method03(){
       //同类中非静态成员访问静态成员
        method01();
        Test01.method01();

        //不同类中非静态成员访问静态成员
        //drink();
        Person.drink();
        Person person = new Person();
        person.drink();
    }

    public void method04(){
        method03();
        new Test01().method03();

        new Person().eat();
    }
}
