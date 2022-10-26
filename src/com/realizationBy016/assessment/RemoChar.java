package com.realizationBy016.assessment;

import java.util.HashSet;
import java.util.Scanner;
//import java.util.Set;

public class RemoChar {
    public static void main(String[] args) {
//        char a = 'a';
//        char z = 'A';
        Scanner sc = new Scanner(System.in);
        System.out.println(new RemoveChar().process(sc.next(), 'a'));
    }
}
class RemoveChar {
    public String process (String s ,char target){
        char[] nums = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char num : nums) {
            if ( num != target && num != target +32 && num != target -32){
                sb.append(num);
            }
        }
        return sb.toString();
    }
 }
