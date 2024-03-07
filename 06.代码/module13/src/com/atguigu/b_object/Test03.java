package com.atguigu.b_object;

public class Test03 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p2 = new Person("涛哥", 16);
        Object o = p2.clone();
        Person p3 = (Person) o;//克隆了一个新对象

        System.out.println(p2==p3);//比较地址值  false
        System.out.println(p2.equals(p3));//true
    }
}
