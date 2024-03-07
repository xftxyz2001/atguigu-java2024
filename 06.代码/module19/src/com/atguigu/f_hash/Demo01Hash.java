package com.atguigu.f_hash;

public class Demo01Hash {
    public static void main(String[] args) {
        Person p1 = new Person("涛哥", 18);
        Person p2 = new Person("涛哥", 18);
        System.out.println(p1);//com.atguigu.f_hash.Person@4eec7777
        System.out.println(p2);//com.atguigu.f_hash.Person@3b07d329

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        //System.out.println(Integer.toHexString(1324119927));//4eec7777
        //System.out.println(Integer.toHexString(990368553));//3b07d329

        System.out.println("======================");

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("=========================");

        String s3 = "通话";
        String s4 = "重地";
        System.out.println(s3.hashCode());//1179395
        System.out.println(s4.hashCode());//1179395

    }
}
