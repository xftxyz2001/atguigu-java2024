package com.atguigu.j_exam;

import java.util.Random;
import java.util.Scanner;

public class Demo01Exam {
    public static void main(String[] args) {
        //1.创建Scanner和Random对象
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        //2.调用Random中的nextInt(100)+1在1-100之间随机一个数  rdNumber
        int rdNumber = rd.nextInt(100) + 1;
        while(true){
            //3.调用Scanner中的nextInt()方法 键盘录入一个要猜的数   scNumber
            System.out.println("请您猜一个数:");
            int scNumber = sc.nextInt();
            //4.如果scNumber大于rdNumber,证明猜大了
            if (scNumber>rdNumber){
                System.out.println("对不起,您猜大了!");
            }else if (scNumber<rdNumber){
                //5.如果scNumber小于rdNumber,证明猜小了
                System.out.println("对不起,您猜小了!");
            }else{
                //6.如果scNumber等于rdNumber,证明猜中了
                System.out.println("恭喜您,猜中了!");
                break;
            }
        }

    }
}
