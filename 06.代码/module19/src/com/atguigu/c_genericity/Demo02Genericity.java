package com.atguigu.c_genericity;


import java.util.ArrayList;
import java.util.Collection;

/**
 * Integer -> Number -> Object
 * String -> Object
 */
public class Demo02Genericity {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();

        get1(list1);
        //get1(list2);错误
        get1(list3);
        //get1(list4);错误

        System.out.println("=================");

        //get2(list1);错误
        //get2(list2);错误
        get2(list3);
        get2(list4);
    }

    //上限  ?只能接收extends后面的本类类型以及子类类型
    public static void get1(Collection<? extends Number> collection){

    }

    //下限  ?只能接收super后面的本类类型以及父类类型
    public static void get2(Collection<? super Number> collection){

    }
}
