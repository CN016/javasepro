package com.my016.fileAndio_Learn;

import java.util.Scanner;

public class BeerRecursionDemo {
    /**
     * 目标:啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶，
     * 请问10元钱可以喝多少瓶酒，剩余多少空瓶和盖子。
     * 答案;15瓶3盖子1瓶子
     */
    public static int totalNumber = 0;
    public static int lastBottleNumber = 0;
    public static int lastCoverNumber = 0;
    public static void main(String[] args) {
        buy(new Scanner(System.in).nextInt());
        System.out.println(totalNumber);
    }
    public static void buy(int money){
        int buyNumber = money/2;
        totalNumber+=buyNumber;
        //换盖子和瓶子
        //统计盖子和瓶子
        int coverNumber = lastCoverNumber+buyNumber;
        int bottleNumber = lastBottleNumber+buyNumber;

        int allMoney = 0;
        if (coverNumber >=4){
            allMoney+= (coverNumber /4)*2;
        }
        if (bottleNumber >=2){
            allMoney+= (bottleNumber /  2) *2;
        }
        lastCoverNumber = coverNumber%4;
        lastBottleNumber = bottleNumber%2;
        if (allMoney>=2){
            buy(allMoney);
        }
    }
}
