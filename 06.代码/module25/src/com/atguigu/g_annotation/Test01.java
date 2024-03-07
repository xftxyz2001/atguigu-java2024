package com.atguigu.g_annotation;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        //1.获取BookShelf的class对象
        Class<BookShelf> bookShelfClass = BookShelf.class;
        //2.判断bookShelf上有没有Book注解
        boolean b = bookShelfClass.isAnnotationPresent(Book.class);
        //3.判断,如果b为true,就获取
        if (b){
            Book book = bookShelfClass.getAnnotation(Book.class);
            System.out.println(book.bookName());
            System.out.println(Arrays.toString(book.author()));
            System.out.println(book.price());
            System.out.println(book.count());
        }
    }
}
