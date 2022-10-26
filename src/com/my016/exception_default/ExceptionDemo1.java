package com.my016.exception_default;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("程序开始——————————————————————————");
        chu(11,0);
        System.out.println("程序结束——————————————————————————");
    }
    public static void chu(int a , int b){
        System.out.println(a);
        System.out.println(b);
        int c = a/b;
        System.out.println(c);
    }
}
