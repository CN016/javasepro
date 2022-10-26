package com.my016.hello;

import java.util.Scanner;

public class MethodReturnNumber {
    public static void main(String[] args) {
        int[] arr ={114,514,1919,8,10};
        arrayIntPrint(arr);
        System.out.println("输入数字以查找索引：");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(returnIntNumber(arr, n));

    }
    public static int returnIntNumber (int[] arr,int find){
        int i;
        for ( i = 0; i < arr.length; i++) {
            if (find == arr[i])
                return i;
        }
            return -1;

    }
    public static  void  arrayIntPrint (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);

        }
        System.out.println();
    }
}
