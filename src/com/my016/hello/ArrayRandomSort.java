package com.my016.hello;

import java.util.Random;

public class ArrayRandomSort {
    public static void main(String[] args) {
        Random ra = new Random();
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9,10};
        int num,change;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            num=ra.nextInt(10);
            change=arr[num];
            arr[num]=arr[i];
            arr[i]=change;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
