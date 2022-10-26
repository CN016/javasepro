package com.my016.params;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {
        int a = 114;
        int[] b = {1,1,4,5,1,4};
        sum(a);
        sum(b);
    }

    public static void sum(int...nums){
        System.out.println("长度："+nums.length);
        System.out.println("内容："+ Arrays.toString(nums));
    }
}
