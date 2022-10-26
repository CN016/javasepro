package com.my016.lambda_Learn;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] arr = {1,1,4,5,1,4,1,9,1,9,8,1,0};
        Arrays.sort(arr, (Integer o1, Integer o2) ->{
                return o2-o1;

        });

        System.out.println(Arrays.toString(arr));
    }
}
