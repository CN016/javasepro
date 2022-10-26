package com.my016.advanced;

import java.util.Arrays;

public class Sort_Learn {
    public static void main(String[] args) {
        //选择排序
        int[] arr = {1,1,4,5,1,4,1,9,1,9,8,1,0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
      //  Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
