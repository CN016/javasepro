package com.my016.hello;

public class SubArrayMethod {
    public static void main(String[] args) {
    int[] array={11,4,5,1,4,1,9,1,9,8,10};
        System.out.println("Sum="+sumForArray(array));
    }
    public static int sumForArray (int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
