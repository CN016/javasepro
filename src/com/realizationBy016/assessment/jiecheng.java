package com.realizationBy016.assessment;

import java.util.Scanner;

public class jiecheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            sum*=i;
        }
        System.out.println(sum);
    }
}
