package com.my016.singleinstance;

public class Test {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;
        SingleInstance s3 = SingleInstance.instance;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1 == s2 );
    }
}
