package com.atguigu.b_genericity;

import java.util.ArrayList;

public class Demo01Genericity {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add(1);
        list.add("abc");
        list.add(2.5);
        list.add(true);

        //获取元素中为String类型的字符串长度
        for (Object o : list) {
            String s = (String) o;
            System.out.println(s.length());
        }

    }
}
