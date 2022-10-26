package com.my016.advanced;

import java.util.Scanner;

public class TryStringDemo6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入您的手机号：");
        String tel =sc.next();

        //截取手机号前三位，后四位
        String tel13 =tel.substring(0,3);
        String telAfter=tel.substring(7);
        String finallyTel=tel13+"****"+telAfter;
        System.out.println("Result:"+finallyTel);

    }
}
