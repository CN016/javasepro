package com.my016.Packaging;

public class Packaging_Learn_Integer {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 10;
        Integer a2 = a; //自动装箱
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a2);

        Integer it =100;
        int it1 = it;
        System.out.println(it1);//自动拆箱

    }
}
