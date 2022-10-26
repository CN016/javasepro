package com.my016.consumption_system;


import java.util.Scanner;

public class SilverCard extends IDCard{
    @Override
    public void payFuntion(double neededMoney) {
        if ( neededMoney*0.85 > getBalanceMoney() ){
            System.out.println("余额不足！");
            System.out.println("当前余额为："+getBalanceMoney());
        }
        else {
            setBalanceMoney( getBalanceMoney() - neededMoney*0.85   );
            System.out.println("支付成功！");
            System.out.println("当前余额为："+getBalanceMoney());
        }
    }

    public static SilverCard creatSilverCard(){

        System.out.print("请输入存款金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        SilverCard SC = new SilverCard();
        SC.setBalanceMoney(money);
        SC.setID(  randomID()  );
        System.out.println("请输入姓名：");
        SC.setHostName(sc.next());
        return SC;

    }
}
