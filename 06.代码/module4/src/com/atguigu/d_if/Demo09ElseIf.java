package com.atguigu.d_if;

import java.util.Scanner;

public class Demo09ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        /*if (week==1){
            System.out.println("周一");
        }else if (week==2){
            System.out.println("周二");
        }else if (week==3){
            System.out.println("周三");
        }else if (week==4){
            System.out.println("周四");
        }else if (week==5){
            System.out.println("周五");
        }else if (week==6){
            System.out.println("周六");
        }else if (week==7){
            System.out.println("周日");
        }else{
            System.out.println("是不是有点大病,没有这个星期!");
        }*/

        if (week<1 || week>7){
            System.out.println("是不是有点大病,没有这个星期!");
        }else{
            if (week==1){
                System.out.println("周一");
            }else if (week==2){
                System.out.println("周二");
            }else if (week==3){
                System.out.println("周三");
            }else if (week==4){
                System.out.println("周四");
            }else if (week==5){
                System.out.println("周五");
            }else if (week==6){
                System.out.println("周六");
            }else if (week==7){
                System.out.println("周日");
            }
        }
    }
}
