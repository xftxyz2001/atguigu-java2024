package com.atguigu.c_reflect;

import org.junit.Test;

public class Demo01GetClass {
    @Test
   public void get1()throws Exception{
        /*
        1.方式1:调用Object中的getClass方法:
                Class <?> getClass()
         */
        Person person = new Person();
        Class<? extends Person> aClass1 = person.getClass();
        System.out.println("aClass1 = " + aClass1);

        System.out.println("==========================");

        //2.方式2:不管是基本类型还是引用类型,jvm都为其提供了一个静态成员:class
        Class<Person> aClass2 = Person.class;
        System.out.println("aClass2 = " + aClass2);

        System.out.println("===========================");

        /*
             static Class<?> forName(String className)
                           className:传递的是类的全限定名(包名.类名)
         */
        Class<?> aClass3 = Class.forName("com.atguigu.c_reflect.Person");
        System.out.println("aClass3 = " + aClass3);

        System.out.println("==========================");

        System.out.println(aClass1==aClass2);
    }

}
