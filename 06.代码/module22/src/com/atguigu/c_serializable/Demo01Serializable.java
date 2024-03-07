package com.atguigu.c_serializable;

import java.io.*;

public class Demo01Serializable {
    public static void main(String[] args)throws Exception {
        //write();
        read();
    }

    //反序列化流
    private static void read()throws Exception {
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("module22\\person.txt"));
        Person person = (Person) ois.readObject();
        System.out.println(person);
        ois.close();
    }

    //序列化
    private static void write()throws Exception {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("module22\\person.txt"));
        Person p1 = new Person("涛哥", 12);
        oos.writeObject(p1);
        oos.close();
    }
}
