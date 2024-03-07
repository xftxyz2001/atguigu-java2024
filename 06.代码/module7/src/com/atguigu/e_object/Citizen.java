package com.atguigu.e_object;

public class Citizen {
    //姓名
    String name;  //默认值 null
    /*
      生日  MyDate类型

      MyDate属于自定义类型(引用数据类型)
      这种类型要操作之前必须要赋值
      怎么赋值?  需要new对象赋值
     */
    MyDate birthday = new MyDate(); // 默认值 null
    //身份证
    String idCard;  //默认值null
}
