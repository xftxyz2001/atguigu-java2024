package com.atguigu.d_if;

import java.util.Scanner;

public class Demo10ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
       /* if (age>=0 && age<=6){
            System.out.println("婴幼儿");
        }else if (age>=7 && age<=12){
            System.out.println("少儿");
        }else if (age>=13 && age<=17){
            System.out.println("青少年");
        }else if(age>=18 && age<=45){
            System.out.println("青年");
        }else if(age>=46 && age<=69){
            System.out.println("中年");
        }else if (age>69 && age<=130){
            System.out.println("老年");
        }else {
            System.out.println("年龄不太符合实际");
        }*/

        if (age<0 || age>130){
            System.out.println("年龄不太符合实际");
        }else{
            if (age>=0 && age<=6){
                System.out.println("婴幼儿");
            }else if (age>=7 && age<=12){
                System.out.println("少儿");
            }else if (age>=13 && age<=17){
                System.out.println("青少年");
            }else if(age>=18 && age<=45){
                System.out.println("青年");
            }else if(age>=46 && age<=69){
                System.out.println("中年");
            }else if (age>69 && age<=130){
                System.out.println("老年");
            }
        }
    }
}
