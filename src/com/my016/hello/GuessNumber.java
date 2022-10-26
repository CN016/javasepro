package com.my016.hello;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random c =new Random();
        int getIn , RandomNub;
        System.out.println("本程序为猜数（0~1919810）程序，请输入\"开始\"来开始游戏：");
        String st = sc.next();
        if ("开始".equals(st) ){
            RandomNub = c.nextInt(1919811);
            while (true){
                System.out.println("请猜数：");
                getIn=sc.nextInt();
                if (getIn>RandomNub)
                    System.out.println("大了！");
                else if (getIn<RandomNub)
                    System.out.println("小了！");
                else{
                    System.out.println("猜对了！是："+RandomNub);
                    break;
                }

            }
        }
        else{
            System.out.println("程序结束");
        }
    }
}
