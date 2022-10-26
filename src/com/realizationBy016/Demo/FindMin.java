package com.realizationBy016.Demo;

import java.util.Arrays;
import java.util.Map;

public class FindMin {
    public static void main(String[] args) {
        int[] line = new int[10];
        System.out.println(Arrays.toString(line));

        int[][] data = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1} };
        System.out.println(Arrays.toString(new Solution2().kWeakestRows(data , 3)));     //new Solution2().kWeakestRows(data)
    }
}
class Solution2 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] lineData = new int[mat.length];
        int[] line = new int[mat.length];
        int[] out  = new int[k];
        for (int i = 0; i < mat.length; i++) {
            line[i]=i;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] ==1 ){
                    lineData[i] += mat[i][j];
                }
            }
        }
        //冒泡排序
        for (int i = 0; i < lineData.length-1; i++) {
            for (int j = 0; j < line.length-1-i ; j++) {
                    if ( lineData[j] > lineData[j+1] ){
                        int temp = lineData[j+1];
                        lineData[j+1] = lineData[j];
                        lineData[j] = temp;

                        temp       =  line[j+1];
                        line[j+1]  =  line[j];
                        line[j]    =  temp;
                    }
            }
        }

        for (int i = 0; i < out.length; i++) {
            out[i] = line[i];
        }

        return out;
    }
}