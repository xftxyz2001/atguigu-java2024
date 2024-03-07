package com.atguigu.c_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo02Serializable {
    public static void main(String[] args) throws Exception {
        //write();
        read();
    }

    //反序列化流
    private static void read() throws Exception {
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("module22\\person.txt"));
       /* for (int i = 0; i < 4; i++) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        }*/
        //将集合反序列化出来即可
        ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
        for (Person person : list) {
            System.out.println(person);
        }
        ois.close();
    }

    //序列化
    private static void write() throws Exception {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("module22\\person.txt"));
        //创建一个集合,存储多个Person对象
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("涛哥", 12);
        Person p2 = new Person("三上", 30);
        Person p3 = new Person("金莲", 24);
        //将对象存储到集合中
        list.add(p1);
        list.add(p2);
        list.add(p3);
        oos.writeObject(list);
        oos.close();
    }
}
