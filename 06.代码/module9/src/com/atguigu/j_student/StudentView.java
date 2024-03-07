package com.atguigu.j_student;

import java.util.Scanner;

public class StudentView {
    int count = 0;
    Scanner sc = new Scanner(System.in);
    Student[] students = new Student[50];

    Student[] newStudent = new Student[students.length - 1];

    public void start() {
        //假设咱们班人数为50个人

        while (true) {
            System.out.println("-------------------学生管理系统-----------------");
            System.out.println("1 添 加 学 生");
            System.out.println("2 修 改 学 生");
            System.out.println("3 删 除 学 生");
            System.out.println("4 查 看 学 生");
            System.out.println("5 退       出");
            System.out.print("请选择(1-5)：");

            int num = sc.nextInt();
            System.out.println("---------------------------------------------");

            switch (num) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    findAllStudent();
                    break;
                case 5:
                    System.out.println("是否退出?按0为退出/按9为取消");
                    int key = sc.nextInt();
                    if (key == 0) {
                        System.out.println("再见,欢迎再来");
                        return;
                    } else if (key == 9) {
                        break;
                    }
            }
        }
    }

    private void updateStudent() {
        System.out.println("请您输入要修改的学生编号:");
        int id = sc.nextInt();
        int updateIndex = ArrayUtils.binary(students,id,count);
        System.out.println("请您输入学生姓名:");
        String name = sc.next();
        System.out.println("请您输入学生年龄:");
        int age = sc.nextInt();
        System.out.println("请您输入学生性别:");
        String sex = sc.next();
        Student student = new Student(id, name, age, sex);
        students[updateIndex] = student;
        //count++;

        System.out.println("修改成功!!!!");

    }

    private void deleteStudent() {
        System.out.println("请您输入要删除的学生编号:");
        int id = sc.nextInt();//2  索引就是1
        int removeIdex = ArrayUtils.binary(students,id,count);//删除的就是这个对象 索引为1


        System.arraycopy(students, 0, newStudent, 0, removeIdex);
        System.arraycopy(students, removeIdex+1, newStudent, removeIdex, students.length - removeIdex - 1);

        students = newStudent;
        count--;
        System.out.println("删除成功!!!");
    }

    private void addStudent() {
        System.out.println("请您输入学生学号:");
        int id = sc.nextInt();
        System.out.println("请您输入学生姓名:");
        String name = sc.next();
        System.out.println("请您输入学生年龄:");
        int age = sc.nextInt();
        System.out.println("请您输入学生性别:");
        String sex = sc.next();
        Student student = new Student(id, name, age, sex);
        students[count] = student;
        count++;

        System.out.println("添加成功!!!!");
    }

    private void findAllStudent() {
        System.out.println("学号" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "性别");
        for (int j = 0; j < count-1; j++) {
            for (int i = 0; i < count-1-j; i++) {
                if (students[i].getId()>students[i+1].getId()){
                    Student temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                }
            }
        }
        //如果长度为0,证明没学生
        if (count == 0) {
            System.out.println("对不起,现在班级没有学生,待开班.......");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(students[i].getId() + "\t" + students[i].getName() + "\t" + students[i].getAge() + "\t" + students[i].getSex());
            }
        }
    }
}
