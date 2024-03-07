package com.atguigu.d_object;

public class Person {
    String name;//成员变量
    public void eat(){
        int i = 10;//局部变量
        System.out.println(i);

        System.out.println(name);//成员变量不用手动赋值可以直接使用,因为有默认值
    }

    public void drink(){
        int j;
        //System.out.println(j);//局部变量没有默认值,所以需要手动赋值再使用
        System.out.println(name);

        //System.out.println(i);//i是eat方法的局部变量,在drink中使用不了
    }
}
