package com.my016.advanced;

import java.util.Arrays;

public class FindIndex_Learn {
    public static void main(String[] args) {
        int[] arr = {1,1,4,5,1,4,1,9,1,9,8,1,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 8));
        System.out.println(binarySearch(arr, 114));
    }

    public static int binarySearch (int[] arr , int data){
        //定义在右边
        int left =0;
        int right = arr.length-1;

        while (left<=right){
            //取中间索引
            int middleIndex = (left+right)/2;

            //判断中间位置元素与目标元素大小情况

            if (data > arr[middleIndex]){
                left = middleIndex+1;
            }else if (data < arr[middleIndex]){
                right= middleIndex-1;
            }else {
                return middleIndex;
            }

        }
        return -1;
    }
}
