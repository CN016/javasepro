package com.my016.Automatic_text_recognition;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("快递信息文本自动识别系统");
        System.out.println("请输入快递文本（不同信息用空格隔离开）:");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
       // System.out.println(str);
        //文本分割
        TextProcess tp = new TextProcess(str);
     //   tp.PrintResult();

    }
}
