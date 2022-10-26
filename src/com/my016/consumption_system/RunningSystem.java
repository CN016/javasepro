package com.my016.consumption_system;

import java.util.Random;

public class RunningSystem {
    public static final int n;
    public static final double oilMoney;
    static {
        Random r = new Random();
        n = r.nextInt(3);
        oilMoney = r.nextDouble(114514.1919810);
    }
    public static void main(String[] args) {
        System.out.println("---------------开始开卡---------------");
        System.out.println("卡片类型随机");
        switch (n){
            case 0 :
                System.out.println("恭喜您，获得一张普通卡（无特权）");
                IDCard Card1 = IDCard.creatIDCard();
                System.out.println("卡号:"+Card1.getID());
                System.out.println("当前油费："+oilMoney);
                Card1.payFuntion(oilMoney);
                break;

            case 1 :
                System.out.println("恭喜您，获得一张银卡（八五折支付优惠）");
                IDCard Card2 = SilverCard.creatSilverCard();
                System.out.println("卡号:"+Card2.getID());
                System.out.println("当前油费："+oilMoney);
                Card2.payFuntion(oilMoney);
                break;

            case 2 :

                System.out.println("恭喜您，获得一张金卡（八折支付优惠）");
                IDCard Card3 = GoldCard.creatGoldCard();
                System.out.println("卡号:"+Card3.getID());
                System.out.println("当前油费："+oilMoney);
                Card3.payFuntion(oilMoney);
                break;
        }



    }
}
