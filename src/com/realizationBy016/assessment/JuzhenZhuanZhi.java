package com.realizationBy016.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JuzhenZhuanZhi {
    public static void main(String[] args) {
        new JuzhenZhuanZhiSolution().Process(   new JuzhenZhuanZhiSolution().inputArrays()  );
        //new JuzhenZhuanZhiSolution().printArrays(data1);

    }
}
class JuzhenZhuanZhiSolution {
    public void Process ( int[][] data){
        int[][] newArrays = new int[4][4];
        int[] temp = new int[16];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length-1 ; j >= 0; j--) {
                temp[index++] = data[i][j];
            }
        }
        index =0;
        for (int j = 0; j < newArrays.length; j++) {
            for (int i = 0; i < newArrays.length; i++) {
                newArrays[i][j]=temp[index++];
            }
        }
        printArrays(newArrays);

    }
    public int[][] inputArrays(){

        Random r = new Random();
        int[][] data = new int[4][4];
        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length; j++) {
                data[i][j]= r.nextInt(10);

            }

        }
        printArrays(data);
        System.out.println("___________________");
        return data;
    }
    public void printArrays (int[][] data){
       // System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print("[");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(   data[i][j]    );
            }
           // System.out.print(    i < data.length - 1 ? "," : ""     );
            System.out.println("]");
        }
       //System.out.println("]");

    }
}
