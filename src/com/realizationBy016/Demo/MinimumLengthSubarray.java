package com.realizationBy016.Demo;

public class MinimumLengthSubarray {
    public static void main(String[] args) {
        int[] data1 = {2,3,1,2,4,3};
        int[] data2 = {1,4,4};
        int[] data3 = {1,1,1,1,1,1,1,1};

        System.out.println(new MinimumLengthSubarraySolution().minSubArrayLen(7, data1));
        System.out.println(new MinimumLengthSubarraySolution().minSubArrayLen(4, data2));
        System.out.println(new MinimumLengthSubarraySolution().minSubArrayLen(11, data3));
    }
}
class MinimumLengthSubarraySolution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0,right = -1;
        int sum = 0;
        int len = nums.length;
        int minLen = len + 1;
        while(left < len){
            if(sum < target && right+1 < len){
                sum+=nums[++right];
            }else{
                sum-=nums[left++];

            }
            if(sum >= target){
                minLen = Math.min(right-left+1,minLen);
            }

        }
        if(minLen == len+1){
            return 0;
        }
        return minLen;
    }
}
