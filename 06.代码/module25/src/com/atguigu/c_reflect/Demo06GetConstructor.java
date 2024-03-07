package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

public class Demo06GetConstructor {
    public static void main(String[] args)throws Exception {
        //获取Class对象
        Class<Person> aClass = Person.class;

        Constructor<Person> constructor = aClass.getConstructor(String.class, Integer.class);
        System.out.println("constructor = " + constructor);

        //创建对象-> 好比是Person person = new Person("三上",26)
        Person person = constructor.newInstance("三上", 26);

        //好比是直接输出Person对象,直接调用toString
        System.out.println(person);
    }
}
