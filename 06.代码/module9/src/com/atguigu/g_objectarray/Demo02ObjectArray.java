package com.atguigu.g_objectarray;

public class Demo02ObjectArray {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("金莲",26);
        students[1] = new Student("大郎",50);
        students[2] = new Student("涛哥",18);

        for (int j = 0; j < students.length-1; j++) {
            for (int i = 0; i < students.length-1-j; i++) {
                if (students[i].getScore()>students[i+1].getScore()){
                    Student temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+"..."+students[i].getScore());
        }
    }
}
