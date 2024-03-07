package com.atguigu.c_reflect;

import java.lang.reflect.Constructor;

public class Demo05GetConstructor {
    public static void main(String[] args)throws Exception {
        //获取Class对象
        Class<Person> aClass = Person.class;
        /*
          好比是Person person = new Person()
         */
        Person person = aClass.newInstance();

        //好比是直接输出对象名,默认调用toString
        System.out.println(person);
    }
}
