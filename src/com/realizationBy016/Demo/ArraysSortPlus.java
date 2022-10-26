package com.realizationBy016.Demo;

import java.util.Arrays;

public class ArraysSortPlus {
    public static void main(String[] args) {
        int[] data1 = {2,0,2,1,1,0};
        int[] data2 = {2,0,1};
        new ArraysSortPlusSolution().sortColors(data1);
        new ArraysSortPlusSolution().sortColors(data2);
        System.out.println(Arrays.toString(data1));
        System.out.println(Arrays.toString(data2));
    }
}
class ArraysSortPlusSolution {
    public void sortColors(int[] nums) {
        //红色蓝色放两边
        int redColor = 0;
        int blueColor = nums.length-1;
        for (int i = 0; i < blueColor+1; i++) {
            if ( nums[i] == 0 ){
                int temp = nums[redColor];
                nums[redColor++]=nums[i];
                nums[i] = temp;
            }else if (nums[i] == 2){
                int temp = nums[blueColor];
                nums[blueColor--]=nums[i];
                nums[i] = temp;
                i--;///
            }
        }
    }
}
