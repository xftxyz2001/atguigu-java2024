package com.atguigu.e_final_var;

public class Student {
    final String name = "广坤";

    public Student() {
    }

    //有参构造现在属于二次赋值了
    /*public Student(String name) {
        this.name = name;
    }*/

    public String getName() {
        return name;
    }
    //set方法现在属于二次赋值了
    /*public void setName(String name) {
        this.name = name;
    }*/
}
