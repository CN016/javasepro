package com.realizationBy016.assessment;

import java.util.Scanner;

public class EatPeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        while (n>1){
            sum=(sum+1)*2;
            n--;
        }
        System.out.println(sum);

    }
}
