package com.my016.hello;

public class Project3_ArrayCopy {
    public static void main(String[] args) {
        int[] fin=new int[111];
        int[] k={1,1,4,5,1,4};
        arrayIntCpy(fin,k);
        outputIntArray(fin);
    }
    public static void arrayIntCpy (int[] a1 , int[] a2){
        for (int i = 0; i < a2.length; i++) {
            a1[i]=a2[i];
        }
    }
    public static void outputIntArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }
    }
}
