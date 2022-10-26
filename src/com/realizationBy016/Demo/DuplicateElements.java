package com.realizationBy016.Demo;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] numsArr = {1,1,1,3,3,4,3,2,4,2};
        int[] numsArr1 = {1,2,3,1};
        int[] numsArr2 = {1,2,3,4};
        System.out.println(new DuplicateElementsSolution().containsDuplicate(numsArr));
        System.out.println(new DuplicateElementsSolution().containsDuplicate(numsArr1));
        System.out.println(new DuplicateElementsSolution().containsDuplicate(numsArr2));
    }
}
class DuplicateElementsSolution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if ( set.size()< i+1 ){
                return true;
            }
        }
        return false;

    }
}