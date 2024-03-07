package com.atguigu.b_genericity;

import java.util.Arrays;

public class MyArrayList <E>{
    //定义一个数组,充当ArrayList底层的数组,长度直接规定为10
    Object[] obj = new Object[10];
    //定义size,代表集合元素个数
    int size;

    /**
     * 定义一个add方法,参数类型需要和泛型类型保持一致
     *
     * 数据类型为E  变量名随便取
     */
    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    /**
     * 定义一个get方法,根据索引获取元素
     */
    public E get(int index){
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
