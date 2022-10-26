package com.my016.hello;

import java.util.Scanner;

public class Project1_BuyTick {
    public static void main(String[] args) {
        System.out.println("机票价格计算程序");
        System.out.println("请按以下格式输入信息");
        System.out.println("机票原价 月份 头等舱/经济舱");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble(),finally_Prince=0;
        int month = sc.nextInt();
        String mood = sc.next();
        if (month >=5 && month <=10){
            if (mood.equals("头等舱")){
                finally_Prince=price*0.9;
            }
            if (mood.equals("经济舱")){
                finally_Prince=price*0.85;
            }

        }
        else{
            if (mood.equals("头等舱")){
                finally_Prince=price*0.7;
            }
            if (mood.equals("经济舱")){
                finally_Prince=price*0.65;
            }
        }
        System.out.println("最终价格为："+finally_Prince);


    }
}
