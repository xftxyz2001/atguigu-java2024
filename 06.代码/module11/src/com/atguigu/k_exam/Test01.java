package com.atguigu.k_exam;

public class Test01 {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        Mouse mouse = new Mouse();
        noteBook.start();
        noteBook.useUSB(mouse);
        noteBook.stop();

        System.out.println("===========");
        KeyBoard keyBoard = new KeyBoard();
        noteBook.start();
        noteBook.useUSB(keyBoard);
        noteBook.stop();
    }
}
