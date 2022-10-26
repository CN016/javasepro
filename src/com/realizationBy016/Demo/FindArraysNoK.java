package com.realizationBy016.Demo;

import java.util.Arrays;

public class FindArraysNoK {
    public static void main(String[] args) {
        int[] data1 = {3,2,1,5,6,4};
        int[] data2 = {3,2,3,1,2,4,5,5,6};
        System.out.println(new FindArraysNoKSolution().findKthLargest(data1, 2));
        System.out.println(new FindArraysNoKSolution().findKthLargest(data2, 4));
    }
}
class FindArraysNoKSolution {
    public int findKthLargest(int[] nums, int k) {
       /* //冒泡
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j]<nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }

        return nums[k-1];*/
        //堆排序
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}