package com.atguigu.e_final_var;

public class Test02 {
    public static void main(String[] args) {
        //Person p1 = new Person("金莲",26);
        //System.out.println(p1);//地址值
        //p1 = new Person("涛哥",18);
        //System.out.println(p1);//地址值

        final Person p1 = new Person("金莲",26);
        System.out.println(p1);//地址值
        //p1 = new Person("涛哥",18);
        //System.out.println(p1);//地址值

        p1.setName("大郎");
        p1.setAge(30);
        System.out.println(p1.getName()+"..."+p1.getAge());
    }
}
