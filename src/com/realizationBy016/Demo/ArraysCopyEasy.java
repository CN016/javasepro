package com.realizationBy016.Demo;

import java.util.Arrays;

public class ArraysCopyEasy {
    public static void main(String[] args) {
        int[] data11 = {1,2,3,0,0,0};
        int[] data12 = {2,5,6};
        int[] data21 = {1};
        int[] data22 = {};
        int[] data31 = {0};
        int[] data32 = {1};
        new ArraysCopyEasySolution().merge(data11,3,data12,3);
        new ArraysCopyEasySolution().merge(data21,1,data22,0);
        new ArraysCopyEasySolution().merge(data31,0,data32,1);
        System.out.println(Arrays.toString(data11));
        System.out.println(Arrays.toString(data21));
        System.out.println(Arrays.toString(data31));
    }
}
class ArraysCopyEasySolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (n == 0){
                return;
            }
        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}