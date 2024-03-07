package com.atguigu.a_static;

public class Test01 {
    public static void main(String[] args) {
        //先给静态成员赋个值
        Student.classRoom = "222";

        Student s1 = new Student();
        s1.name = "郭靖";
        s1.age = 28;
        //s1.classRoom = "111";

        System.out.println(s1.name+","+s1.age+","+Student.classRoom);

        System.out.println("==============");

        Student s2 = new Student();
        s2.name = "黄蓉";
        s2.age = 26;
        //s2.classRoom = "111";

        System.out.println(s2.name+","+s2.age+","+Student.classRoom);
    }
}
