package com.atguigu.d_object;

public class Test01 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        System.out.println(phone1);//地址值
        System.out.println(phone1.brand);//null
        System.out.println(phone1.price);//0
        phone1.brand = "xiaomi";
        phone1.price = 2999;
        System.out.println(phone1.brand);//xiaomi
        System.out.println(phone1.price);//2999
        phone1.call();
    }
}
