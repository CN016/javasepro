package com.realizationBy016.Demo;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] data1 = {10,15,20};
        int[] data2 = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(new MinCostClimbingStairsSolution().minCostClimbingStairs(data1));
        System.out.println(new MinCostClimbingStairsSolution().minCostClimbingStairs(data2));
    }
}
class MinCostClimbingStairsSolution {
    public int minCostClimbingStairs(int[] cost) {

        for(int i = cost.length - 3;i >= 0; i--) {
            cost[i] += Math.min(cost[i + 1], cost[i + 2]);
        }
        return Math.min(cost[0], cost[1]);


    }
}
