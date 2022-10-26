package com.realizationBy016.Demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OnePlusAnotherOnePro {
    public static void main(String[] args) {
        int[] data1 = {2,7,11,15};
        int[] data2 = {2,3,4};
        int[] data3 = {-1,0};
        //new OnePlusAnotherOneProSolution().twoSum(data1,9)
        System.out.println(Arrays.toString(new OnePlusAnotherOneProSolution().twoSum(data1, 9)));
        System.out.println(Arrays.toString(new OnePlusAnotherOneProSolution().twoSum(data2, 6)));
        System.out.println(Arrays.toString(new OnePlusAnotherOneProSolution().twoSum(data3, -1)));
    }
}
class OnePlusAnotherOneProSolution {
    public int[] twoSum(int[] numbers, int target) {
//
//        Map<Integer,Integer> hash = new HashMap<>();
//        for (int i = 0; i < numbers.length; i++) {
//            hash.put(target-numbers[i] , i+1);
//        }
//        for (int j = 0; j < numbers.length; j++) {
//            if ( hash.containsKey(numbers[j]) && j!=hash.get(numbers[j]) ){
//                returnAnswer[0] = j+1;
//                returnAnswer[1] = hash.get(numbers[j]);
//                break;
//            }
//        }
//        return returnAnswer;
        int[] returnAnswer = new int[2];
        //双指针
        int i=0;
        int j= numbers.length-1;
        int sum=0;

        while(i<j){
            sum= numbers[i]+numbers[j];
            if(sum==target) {
            returnAnswer[0]=i+1;
            returnAnswer[1]=j+1;
            break;
            }
            //sum>target ? j-- : i++;
            if (sum>target ){
                j--;
            }else {
                i++;
            }
        }
        return returnAnswer;

    }
}
