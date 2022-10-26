package com.realizationBy016.Demo;

import java.util.*;
//import java.util.Map;


public class ArraysIntersection {
    public static void main(String[] args) {
    int[] data11 = {1,2,2,1};
    int[] data12 = {2,2};
    int[] data21 = {4,9,5};
    int[] data22 = {9,4,9,8,4};

        System.out.println(Arrays.toString(new ArraysIntersectionSolution().intersect(data11, data12)));
        System.out.println(Arrays.toString(new ArraysIntersectionSolution().intersect(data21, data22)));
    }
}
class ArraysIntersectionSolution {
    public int[] intersect(int[] nums1, int[] nums2) {
//        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        Map<Integer, Integer> data2 = creatHashMap(nums2);
//        Map<Integer, Integer> data1 = creatHashMap(nums1);
//
//        data1.forEach();
//
//
//    }
//
//    private Map<Integer, Integer> creatHashMap(int[] nums2) {
//        Map<Integer,Integer> data2 = new HashMap<>();
//        for (int n2 : nums2) {
//            if ( data2.containsKey(n2) ){
//                data2.put(n2, data2.get(n2)+1);
//            }else {
//                data2.put(n2,1);
//            }
//        }
//        return data2;
        /*
          使用集合实现
         */
//        List<Integer> list1 = new ArrayList<>();
//        for (int num : nums1) {
//            list1.add(num);
//        }
//        List<Integer> list2 = new ArrayList<>();
//        for (int num : nums2) {
//            if (list1.contains(num)) {
//                list2.add(num);
//            }
//        }
//        int[] res = new int[list2.size()];
//        int i = 0;
//        for (int num : list2) {
//            res[i++] = num;
//        }
//        return res;

        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int num1 : nums1) {
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }
        for (int num2 : nums2) {
            int tmp = map.getOrDefault(num2, 0);
            if (tmp > 0) {
                nums1[i++] = num2;
                map.put(num2, tmp - 1);
            }
        }
        int[] res = new int[i];
        System.arraycopy(nums1, 0, res, 0, i);
        return res;
    }
}
