package com.atguigu.i_other;

public class Demo02Method {
    public static void main(String[] args) {
       int[] arr = {4,3,5,6,7};
        int max = getMax(arr);
        System.out.println("max = " + max);
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
