package com.realizationBy016.assessment;

//import java.io.File;
import java.util.Scanner;

public class jiechengSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n>=1){
            sum+= new jiechengSumSolution().jiecheng(n);
            n--;
        }
        System.out.println(sum);
    }
}
class jiechengSumSolution{
    public int jiecheng (int n){
        int sum = 1;
        for (int i = 1; i <= n ; i++) {
            sum*=i;
        }
        return sum;
    }
}
