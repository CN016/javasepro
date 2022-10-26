package com.realizationBy016.assessment;

import java.util.Scanner;

public class Tuzi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new TuziSolution().TuziNum(sc.nextInt()));
    }
}
class TuziSolution {
    public int TuziNum (int n){
        int[] dp = new int[n+1];
        if ( n <= 2){
            return 1;
        }
        dp[1] = dp[2] = 1;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
