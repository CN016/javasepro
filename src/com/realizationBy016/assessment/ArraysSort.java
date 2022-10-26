package com.realizationBy016.assessment;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] input = {123,45,8,22,99,3,38,41,6,1};
        new ArraysSortSolution().arraysSort(input);
        System.out.println(Arrays.toString(input));
    }
}
class ArraysSortSolution{
    public void arraysSort ( int[] data){
       //冒泡
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data.length-i-1; j++) {
                if (data[j] > data[j+1] ){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
