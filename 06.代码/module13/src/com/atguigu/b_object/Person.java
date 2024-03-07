package com.atguigu.b_object;

import java.util.Objects;

public class Person implements Cloneable{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
       问题1:obj直接调用name和age调用不了,因为Object接收了Person类型的对象
            属于多态,多态前提下不能直接调用子类特有内容
       解决问题1:向下转型

       问题2:如果传递的不是Person类型,就会出现类型转换异常
       解决问题2:先判断类型,如果是Person类型,再强转成Person

       问题3:如果传递null呢?,就不用判断类型了,直接给false

       问题4:如果传递自己呢?就不用判断非空了,也不同判断类型了,直接给true
     */
   /* public boolean equals(Object obj){
        if (this==obj){
            return true;
        }

        if (obj==null){
            return false;
        }

        if (obj instanceof Person){
            Person p = (Person) obj;
            return this.name.equals(p.name)&&this.age==p.age;
        }
        return false;

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
