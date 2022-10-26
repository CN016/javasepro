package com.realizationBy016.assessment;

import java.util.Scanner;

public class StrLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new SteLenSolution().process(sc.next()));
    }
}
class SteLenSolution{
    public int process ( String s ){
        char[] chars = s.toCharArray();
       //char *p=chars;
        int index=0;
        while (chars[index] != '\0'){
            index++;
        }
        return index;

    }
}
