package com.atguigu.d_object;

public class Test02 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        System.out.println(phone1);//地址值
        phone1.brand = "xiaomi";
        phone1.price = 2999;
        System.out.println(phone1.brand);//xiaomi
        System.out.println(phone1.price);//2999
        System.out.println("=============");
        Phone phone2 = new Phone();
        System.out.println(phone2);
        phone2.brand = "huawei";
        phone2.price = 6999;
        System.out.println(phone2.brand);
        System.out.println(phone2.price);
    }
}
