package com.atguigu.a_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //boolean add(E e) : 将给定的元素添加到当前集合中(我们一般调add时,不用boolean接收,因为add一定会成功)
        collection.add("萧炎");
        collection.add("萧薰儿");
        collection.add("彩鳞");
        collection.add("小医仙");
        collection.add("云韵");
        collection.add("涛哥");
        System.out.println(collection);
        //boolean addAll(Collection<? extends E> c) :将另一个集合元素添加到当前集合中 (集合合并)
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("张无忌");
        collection1.add("小昭");
        collection1.add("赵敏");
        collection1.add("周芷若");
        collection1.addAll(collection);
        System.out.println(collection1);

        //void clear():清除集合中所有的元素
        collection1.clear();
        System.out.println(collection1);
        //boolean contains(Object o)  :判断当前集合中是否包含指定的元素
        boolean result01 = collection.contains("涛哥");
        System.out.println("result01 = " + result01);
        //boolean isEmpty() : 判断当前集合中是否有元素->判断集合是否为空
        System.out.println(collection1.isEmpty());
        //boolean remove(Object o):将指定的元素从集合中删除
        collection.remove("涛哥");
        System.out.println(collection);
        //int size() :返回集合中的元素个数。
        System.out.println(collection.size());
        //Object[] toArray(): 把集合中的元素,存储到数组中
        Object[] arr = collection.toArray();
        System.out.println(Arrays.toString(arr));

    }
}
