package com.realizationBy016.Work;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class manu {
    public static List<Player> LIST = new ArrayList<>();
    private static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {

        while (true){
            System.out.println("/////////////////////////////////////");
            System.out.println("0-开始比赛评分");
            System.out.println("1-输出排名信息");
            System.out.println("2-退出程序");
            System.out.print("请输入数字执行操作：");
            char temp = SC.next().charAt(0);
            switch (temp){
                case '0' : beginMark(); break;
                case '1' : printLIST(); break;
                case '2' : return;
            }
        }
    }

    private static void printLIST() {
        System.out.println(LIST);
    }

    private static void beginMark() {
        System.out.print("请输入选手人数：");
        int contestant = SC.nextInt();
        System.out.print("请输入裁判人数：");
        int markMan = SC.nextInt();

        for (int i = 0; i < contestant; i++) {
            double sum = 0;
            System.out.print("请输入选手"+i+"的名字：");
            String name = SC.next();
            System.out.println("/////////////////请输入评委对选手"+i+"的评分/////////////////////////");
            for (int j = 0; j < markMan; j++) {
                System.out.print("请输入评委"+j+"的评分：");
                double tempScore = SC.nextDouble();
                sum+=tempScore;
            }
            sum = sum/markMan;
            System.out.println("最终得分："+sum);
            LIST.add(new Player(name,sum));
        }
       // System.out.println(LIST);
    }
}
