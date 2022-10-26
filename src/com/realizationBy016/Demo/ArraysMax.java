package com.realizationBy016.Demo;

public class ArraysMax {
    public static void main(String[] args) {
        int[][] accounts = { {2,8,7},{7,1,3},{1,9,5}   };
        System.out.println(new ArraysMaxSolution().maximumWealth(accounts));
    }
}
class ArraysMaxSolution {
    public int maximumWealth(int[][] accounts) {
        int[] lineData = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                lineData[i]+=accounts[i][j];
            }
        }
        int max = lineData[0];
        for (int lineDatum : lineData) {
            if ( lineDatum > max ){
                max = lineDatum;
            }
        }
        return max;
    }
}