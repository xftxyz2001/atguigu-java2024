package com.atguigu.e_object;

public class Test01 {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        citizen.name = "涛哥";
        citizen.idCard = "111111111";

        /*
           citizen.birthday获取的是MyDate对象
           再去点year获取的是MyDate对象中的year

           链式调用
         */
        citizen.birthday.year = 2000;
        citizen.birthday.month = 10;
        citizen.birthday.day = 10;

        System.out.println(citizen.name+","+citizen.birthday.year+","+citizen.idCard);

    }
}
