package com.my016.arrays_Learn;

import java.util.Arrays;

public class ArraysDemo1 {
    //学arrays常用API
    public static void main(String[] args) {
        int[] arr = {1,1,4,5,1,4,1,9,1,9,8,1,0};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        //排序API，默认升序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //API调用工程师

        //二分搜索(前提数组排好序)

       int index = Arrays.binarySearch(arr,1);
        System.out.println(index);
    }
}
