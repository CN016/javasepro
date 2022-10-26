package com.realizationBy016.Demo;

import java.util.Arrays;

public class ArraysRemove {
    public static void main(String[] args) {
        int[] data1 = {3,2,2,3};
        int[] data2 = {0,1,2,2,3,0,4,2};

        System.out.println(new ArraysRemoveSolution().removeElement(data1, 3));
        System.out.println(Arrays.toString(data1));
        System.out.println(new ArraysRemoveSolution().removeElement(data2, 2));
        System.out.println(Arrays.toString(data2));

    }
}
class ArraysRemoveSolution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int notValIndex=0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i]!=val){
                nums[notValIndex++]=nums[i];  //把不要删的元素放到前面;
                count++;
            }
        }
        return count;
    }
}
