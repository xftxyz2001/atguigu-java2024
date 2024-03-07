package com.atguigu.d_poker;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        //1.创建ArrayList集合-> color -> 专门存花色
        ArrayList<String> color = new ArrayList<>();
        //2.创建一个ArrayList集合 -> number -> 专门存牌号
        ArrayList<String> number = new ArrayList<>();
        //3.创建一个ArrayList集合 -> poker -> 专门存花色和牌号组合好的牌面
        ArrayList<String> poker = new ArrayList<>();

        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");

        for (int i = 2; i <= 10; i++) {
            number.add(i + "");
        }

        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");

        //System.out.println(color);
        //System.out.println(number);

        for (String num : number) {
            for (String huaSe : color) {
                String pokerNumber = huaSe + num;
                poker.add(pokerNumber);
            }
        }

        poker.add("😊");
        poker.add("☺");
        //System.out.println(poker);

        //4.打乱poker
        Collections.shuffle(poker);
        //System.out.println(poker);
        //5.创建4个ArrayList集合,分别代表三个玩家,以及存储一个底牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            //6.如果index为最后三张,往dipai集合中存
            if (i >= 51) {
                dipai.add(s);
                //7.如果index%3==0 给p1
            } else if (i % 3 == 0) {
                p1.add(s);
                //8.如果index%3==1 给p2
            } else if (i % 3 == 1) {
                p2.add(s);
                //9.如果index%3==2 给p3
            }else if (i%3==2){
                p3.add(s);
            }
        }

        //10.遍历看牌
        System.out.println("涛哥:"+p1);
        System.out.println("三上:"+p2);
        System.out.println("金莲:"+p3);
        System.out.println("底牌:"+dipai);
    }
}
