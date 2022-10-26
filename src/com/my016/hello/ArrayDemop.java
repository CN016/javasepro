package com.my016.hello;

public class ArrayDemop {
    public static void main(String[] args) {
        int[] arr1 = { 11 , 22 , 33 , 44 , 55};
        int[] arr2=arr1;
        System.out.println(arr1);
        System.out.println(arr2);

        arr2[1]=99;
        System.out.println(arr1[1]);
        System.out.println(arr2[1]);
    }
}
