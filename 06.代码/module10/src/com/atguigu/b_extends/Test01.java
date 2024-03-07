package com.atguigu.b_extends;

public class Test01 {
    public static void main(String[] args) {
        //创建父类对象
        Fu fu = new Fu();
        System.out.println(fu.numFu);//父类中的numFu
        //System.out.println(fu.numZi);//不能直接调用子类特有的成员
        System.out.println(fu.num);//父类的

        System.out.println("=================");
        //创建子类对象
        Zi zi = new Zi();
        System.out.println(zi.numZi);
        System.out.println(zi.numFu);//继承了父类,可以使用父类中非私有成员
        System.out.println(zi.num);//子类的

        System.out.println("=================");
        Fu fu1 = new Zi();
        System.out.println(fu1.num);
    }
}
