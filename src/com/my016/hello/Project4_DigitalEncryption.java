package com.my016.hello;

import java.util.Scanner;

public class Project4_DigitalEncryption {
    public static void main(String[] args) {
        System.out.print("需要加密几位数字：");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] pinIntArray=new int[n];
        for (int i = 0; i < pinIntArray.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数字");
            pinIntArray[i]=sc.nextInt();
        }
// pin
        for (int i = 0; i < pinIntArray.length; i++) {
             pinIntArray[i] =(pinIntArray[i]+5) % 10;
        }
        //upside down
    int[] temp=new int[pinIntArray.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=pinIntArray[pinIntArray.length-1-i];
        }
        for (int i = 0; i < pinIntArray.length; i++) {
            pinIntArray[i]=temp[i];
        }
        System.out.println("加密后:");
        printIntArray(pinIntArray);
    }
    public static void printIntArray (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
