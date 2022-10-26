package com.realizationBy016.Demo;

public class MaxSum {
    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {1};
        int[] nums3 = {5,4,-1,7,8};

        System.out.println(new MaxSumSolution().maxSubArray(nums1));
        System.out.println(new MaxSumSolution().maxSubArray(nums2));
        System.out.println(new MaxSumSolution().maxSubArray(nums3));
    }
}
class MaxSumSolution {
    public int maxSubArray(int[] nums) {

        ///////////////////////////////////////////////////
        //暴力穷举法
        /*int sum ,max = -114514;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum = 0;
                for (int k = i; k <=j ; k++) {
                    sum += nums[k];
                    if (sum > max){
                        max = sum;
                    }
                }
            }
        }
        return max;*/
        ///////////////////////////////////////////////////
//----------------------------------------------------------------//
        ///////////////////////////////////////////////////
        //动态规划

        //dp[i]表示以num[i]结尾的连续子数组的最大和
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if ( dp[i-1] >0  ){
                dp[i] = dp[i-1] + nums[i];
            }else {
                dp[i] = nums[i];
            }
        }

        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
        ///////////////////////////////////////////////////
    }
}
