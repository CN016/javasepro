package com.my016.hello;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] score ={11,4,51,4,19,19,8,10};
        int sum=0;
        for (int i=0;i< score.length;i++){
            sum+=score[i];
            System.out.println("score["+(i+1)+"]="+score[i]);
        }

        System.out.println("Sum="+sum);
    }

}
