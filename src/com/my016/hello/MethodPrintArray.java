package com.my016.hello;

public class MethodPrintArray {
    public static void main(String[] args) {
        int[] sss={1,1,4,5,1,4,1,9,1,9,8,1,0};
        arrayIntPrint(sss);

    }
    public static  void  arrayIntPrint (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
