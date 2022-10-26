package com.realizationBy016.assessment;

import java.util.Arrays;

public class CharArraysSort {
    public static void main(String[] args) {
        String str = "saQdMs";
        System.out.println(new CharArraysSortSolution().stringSort(str));
    }
}
class CharArraysSortSolution{
    public String stringSort (String s){
        char[] str = s.toCharArray();
        //冒泡
        for (int i = 0; i < str.length-1; i++) {
            for (int j = 0; j < str.length-i-1; j++) {
                if (str[j] > str[j+1] ){
                    char temp = str[j+1];
                    str[j+1] = str[j];
                    str[j] = temp;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
