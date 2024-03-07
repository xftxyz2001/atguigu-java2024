package com.atguigu.l_dielock;

public class Test01 {
    public static void main(String[] args) {
        DieLock dieLock1 = new DieLock(true);
        DieLock dieLock2 = new DieLock(false);

        new Thread(dieLock1).start();
        new Thread(dieLock2).start();
    }
}
