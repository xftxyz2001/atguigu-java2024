package com.atguigu.c_reflect;

public class Person {
    private String name;
    private Integer age;

    public Person() {
    }

    //私有构造
    private Person(String name){
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void eat(){
        System.out.println("人要吃饭");
    }

}
