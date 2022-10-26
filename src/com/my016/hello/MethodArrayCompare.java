package com.my016.hello;

import java.util.Scanner;

public class MethodArrayCompare {
    public static void main(String[] args) {
        int[] arr1= new int[5];
        int[] arr2= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input arr1:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Input arr2:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= sc.nextInt();
        }
        System.out.println(arrayIntCompare(arr1, arr2));
    }
    public static boolean arrayIntCompare (int[] a,int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i])
                    return false;
            }
            return true;
        }
        else {
            return false;
        }
    }
}
