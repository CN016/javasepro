package com.my016.regex;

import java.util.Scanner;

public class RegexTest {
    public static void main(String[] args) {
        //目标：校验 手机号 邮箱 电话号码
        checkPhone();
        checkEmail();
    }
    public static void checkEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的邮箱：");
        String phone = sc.next();

        if (phone.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")){
            System.out.println("邮箱格式正确");
        }
        else {
            System.out.println("格式有误");
        }
    }


    public static void checkPhone(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的手机号：");
        String phone = sc.next();

        if (phone.matches("1[13-9]\\d{5}\\d*")){
            System.out.println("手机号格式正确");
        }
        else {
            System.out.println("格式有误");
        }
    }
}
