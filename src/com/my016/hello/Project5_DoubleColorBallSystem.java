package com.my016.hello;

import java.awt.desktop.SystemEventListener;
import java.util.Random;
import java.util.Scanner;

public class Project5_DoubleColorBallSystem {
    public static void main(String[] args) {
        int[] luckNumbers=creatIntLuckyNumber();
        int[] userNumber=userInputIntNumber();
        judge(luckNumbers,userNumber);
    }
    public static int[] creatIntLuckyNumber (){
        Random r =new Random();
        int[] fina=new int[7];
        int blueBall=r.nextInt(16)+1;
        int[] temp=new int[33];
        int num;
        for (int i = 0; i < temp.length; i++) {
            temp[i]=i+1;
        }
        for (int i = 0; i < temp.length; i++) {
            int k=r.nextInt(33);
            num=temp[k];
            temp[k]=temp[i];
            temp[i]=num;
        }
        for (int i = 0; i < 6; i++) {
            fina[i]=temp[i];
        }
        fina[6]=blueBall;
        return fina;
    }
    public static int[] userInputIntNumber(){
        System.out.print("请输入猜球号码（空格隔开）：");
        int[] input=new int[7];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < input.length; i++) {
            input[i]=sc.nextInt();
        }
        return input;
    }
    public static void judge(int[] creat,int[] userInput){
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < creat.length; i++) {
            System.out.print(creat[i]+"\t");
        }
        System.out.println("（开奖号码）");
        for (int i = 0; i < userInput.length; i++) {
            System.out.print(userInput[i]+"\t");
        }
        System.out.println("（您的号码）");
        for (int i = 0; i < creat.length; i++) {
            if(creat[i]==userInput[i]){
                System.out.print("√\t");
            }
            else{
                System.out.print("X\t");
            }
        }
        System.out.println("(中奖情况)");
    }
}
