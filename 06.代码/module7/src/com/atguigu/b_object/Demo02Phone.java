package com.atguigu.b_object;

public class Demo02Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "苹果";
        phone.color = "黑色";
        phone.price = 7999;

        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.price);

        phone.call("金莲");
        String mess = phone.message();
        System.out.println(mess);
    }
}
