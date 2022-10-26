package com.realizationBy016.Demo;

import java.util.Arrays;

public class ArraysMoveZero {
    public static void main(String[] args) {
        int[] data1 = {0,1,0,3,12};
        int[] data2 = {0};

        new ArraysMoveZeroSolution().moveZeroes(data1);
        System.out.println(Arrays.toString(data1));
        System.out.println(Arrays.toString(data2));
        new ArraysMoveZeroSolution().moveZeroes(data2);
    }
}
class ArraysMoveZeroSolution {
    public void moveZeroes(int[] nums) {
       /* //冒泡交换
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if ( nums[j] == 0 ){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }
        }*/

        //双指针
        int index = 0;//一次遍历，把非零的都往前挪
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] != 0 ){
                nums[index++] = nums[i];
            }
        }
        //补零
        while (index<nums.length){
            nums[index++]=0;
        }

    }
}