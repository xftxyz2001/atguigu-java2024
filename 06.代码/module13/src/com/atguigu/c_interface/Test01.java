package com.atguigu.c_interface;

public class Test01 {
    public static void main(String[] args) {
        //创建一个数组
        Student[] students = new Student[3];
        Student s1 = new Student("张三", 100);
        Student s2 = new Student("李四", 60);
        Student s3 = new Student("王五", 80);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int j = 0; j<students.length-1;j++){
            for (int i = 0;i<students.length-1-j;i++){
                //如果students[i]比students[i+1]大,就排序换位置
                if (students[i].compareTo(students[i+1])>0){
                    Student temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                }
            }
        }

        //遍历
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
