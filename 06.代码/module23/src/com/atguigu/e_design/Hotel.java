package com.atguigu.e_design;

public abstract class Hotel {
    public void eat(){
        System.out.println("点菜");
        eatCai();
        System.out.println("买单");
    }
    public abstract void eatCai();
}
