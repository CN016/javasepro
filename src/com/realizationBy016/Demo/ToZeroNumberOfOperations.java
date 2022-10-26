package com.realizationBy016.Demo;

import java.util.Scanner;

public class ToZeroNumberOfOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("operations:"+new ToZeroNumberOfOperationsSolution().numberOfSteps(sc.nextInt()));
    }
}
class ToZeroNumberOfOperationsSolution {
    public int numberOfSteps(int num) {
       int count = 0;
       while ( num != 0 ){
           if ( num % 2 == 0 ){
               num = num/2;
           } else {
               num--;
           }
           count++;
       }


       return count;
    }
}
