package com.my016.consumption_system;

import java.util.Random;
import java.util.Scanner;

public class IDCard {
    private String hostName ;

    private double balanceMoney ;

    private int ID ;

    public void payFuntion(double neededMoney){
        if (neededMoney > getBalanceMoney()){
            System.out.println("余额不足！");
            System.out.println("当前余额为："+getBalanceMoney());
        }
        else {
            setBalanceMoney( getBalanceMoney() - neededMoney   );
            System.out.println("支付成功！");
            System.out.println("当前余额为："+getBalanceMoney());
        }

    }

    public IDCard() {
    }

    public IDCard(String hostName, double balanceMoney, int ID) {
        this.hostName = hostName;
        this.balanceMoney = balanceMoney;
        this.ID = ID;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public double getBalanceMoney() {
        return balanceMoney;
    }

    public void setBalanceMoney(double balanceMoney) {
        this.balanceMoney = balanceMoney;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }



    public static int randomID () {
        Random r = new Random();
        int[] newID = new int[8];
        int ID = 0;

        //随机账户生成

            for (int i = 0; i < newID.length; i++) {
                newID[i] = r.nextInt(10);
            }
            for (int i = 0; i < newID.length; i++) {
                ID = ID * 10 + newID[i];
            }


        return ID;
    }

    public static IDCard creatIDCard(){

        System.out.print("请输入存款金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        IDCard SC = new IDCard();
        SC.setBalanceMoney(money);
        SC.setID(  randomID()  );
        System.out.println("请输入姓名：");
        SC.setHostName(sc.next());
        return SC;

    }


}
