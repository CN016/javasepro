package com.my016.regex;

public class RegexDemo {
    public static void main(String[] args) {
        String name = "很多戴护具爱无关jhfudyy21456巨尴尬吧打算asdfes大ddd";
        String[] arr =  name.split("\\w+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        String temp = name.replaceAll("\\w+","   ");
        System.out.println(temp);
    }
}
