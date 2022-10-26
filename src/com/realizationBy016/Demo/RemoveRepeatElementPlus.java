package com.realizationBy016.Demo;

import java.util.Arrays;

public class RemoveRepeatElementPlus {
    public static void main(String[] args) {
        int[] data1 =  {1,1,1,2,2,3};
        int[] data2 = {0,0,1,1,1,1,2,3,3};
        System.out.println(new RemoveRepeatElementPlusSolution().removeDuplicates(data1));
        System.out.println(Arrays.toString(data1));
        System.out.println(new RemoveRepeatElementPlusSolution().removeDuplicates(data2));
        System.out.println(Arrays.toString(data2));
    }
}
class RemoveRepeatElementPlusSolution {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( len<2  || nums[i]!=nums[len-2]  ){
                nums[len++]=nums[i];

            }

        }

        return len;
    }
}
