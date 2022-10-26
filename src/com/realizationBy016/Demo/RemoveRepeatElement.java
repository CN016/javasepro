package com.realizationBy016.Demo;

import java.util.Arrays;

public class RemoveRepeatElement {
    public static void main(String[] args) {
        int[] data1 =  {1,1,2};
        int[] data2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(new RemoveRepeatElementSolution().removeDuplicates(data1));
        System.out.println(Arrays.toString(data1));
        System.out.println(new RemoveRepeatElementSolution().removeDuplicates(data2));
        System.out.println(Arrays.toString(data2));
    }
}
class RemoveRepeatElementSolution {
    public int removeDuplicates(int[] nums) {
        int headIndex=1;
        //int count = 0 ;
        for (int i = 1; i < nums.length; i++) {
            if ( nums[i]!=nums[i-1] ){
                nums[headIndex++]=nums[i];
            }
        }
        return headIndex;
    }
}
