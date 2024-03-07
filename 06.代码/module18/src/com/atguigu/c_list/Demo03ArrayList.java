package com.atguigu.c_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo03ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        System.out.println(list);

        /*
          需求:删除2
          remove(Object o) -> 直接删除指定元素
          remove(int index) -> 删除指定索引位置上的元素

          如果remove中直接传递整数,默认调用按照指定索引删除元素的remove
          但是此时list中没有2索引,所以越界

          解决:我们可以将2包装成包装类,变成包装类之后,其父类就是Object了,


         */
        //list.remove(2);
        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }
}
