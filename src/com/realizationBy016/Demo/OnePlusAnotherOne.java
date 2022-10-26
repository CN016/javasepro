package com.realizationBy016.Demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OnePlusAnotherOne {
    public static void main(String[] args) {
        int[] data1 = {2,7,11,15};
        int[] data2 = {3,2,4};
        int[] data3 = {3,3};
        System.out.println(Arrays.toString(new OnePlusAnotherOneSolution().twoSum(data1, 9)));// new OnePlusAnotherOneSolution().twoSum(data1,9)
        System.out.println(Arrays.toString(new OnePlusAnotherOneSolution().twoSum(data2, 6)));// new OnePlusAnotherOneSolution().twoSum(data1,9)
        System.out.println(Arrays.toString(new OnePlusAnotherOneSolution().twoSum(data3, 6)));// new OnePlusAnotherOneSolution().twoSum(data1,9)
    }
}
class OnePlusAnotherOneSolution {
    public int[] twoSum(int[] nums, int target) {
        int[] returnAnswer = new int[2];
        /*
        for (int i = 0; i < nums.length; i++) {
            int answer = target - nums[i];
            for (int j = 0; j < nums.length && j != i; j++) {
                if (  nums[j] == answer ){
                    returnAnswer[0]=i;
                    returnAnswer[1]=j;
                    if ( i > j ){
                        returnAnswer[0]=j;
                        returnAnswer[1]=i;
                    }
                    break;
                }

            }
        }
        return returnAnswer;*/
        Map<Integer,Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hash.put(target - nums[i], i );
        }
        for (int j = 0; j < nums.length; j++) {
            if ( hash.containsKey(nums[j]) && j!=hash.get(nums[j]) ){
                returnAnswer[0] = j;
                returnAnswer[1] = hash.get(nums[j]);
                break;
            }
        }
        return returnAnswer;
    }
}
