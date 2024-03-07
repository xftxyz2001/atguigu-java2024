package com.atguigu.j_student;

public class ArrayUtils {
    private ArrayUtils() {

    }

    public static int binary(Student[] arr, int id, int count) {
        //定义一个变量,此变量用来表示是否有要查找的数据
        int flag = 0;

        //3.遍历数组,在遍历的过程中判断是否和录入的数相等,如果相等,输出索引
        for (int i = 0; i < count; i++) {
            if (id == arr[i].getId()) {
                return i;
            }
        }
        return -1;
    }
}
