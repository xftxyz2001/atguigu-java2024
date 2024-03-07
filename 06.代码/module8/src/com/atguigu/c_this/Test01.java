package com.atguigu.c_this;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person+"=========");
        person.name = "沉香";
        person.speak("刘彦昌");

        System.out.println("==========");

        Person person2 = new Person();
        System.out.println(person2+"+++++");
        person2.name = "奥特曼";
        person2.speak("奥特曼之父");
    }
}
