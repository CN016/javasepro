package com.realizationBy016.Demo;

public class HouseRobber {
    public static void main(String[] args) {
    int[] data1 = {1,2,3,1};
    int[] data2 = {2,7,9,3,1};

        System.out.println(new HouseRobberSolution().rob(data1));
        System.out.println(new HouseRobberSolution().rob(data2));
    }
}
class HouseRobberSolution {
    public int rob(int[] nums) {
    int[] dp = new int[nums.length+1];
    dp[0] = 0;
    dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i-1] , dp[i-2] + nums[i-1] );
        }
        return dp[nums.length];
    }
}
