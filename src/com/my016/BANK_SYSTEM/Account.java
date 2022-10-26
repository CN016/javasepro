package com.my016.BANK_SYSTEM;


public abstract class Account {

    private String cardID;
    private double money;

    public Account() {
    }

    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }

    /*
    *
    * 模板方法
    *
    *  */
    public void handle(String loginName , String passWord ) {
        if ("016".equals(loginName)   &&  "abc016016".equals(passWord) ){
            System.out.println("登陆成功");
            //
            //

            double result = calc();

            System.out.println("本账户利息是："+result);
        }else {
            System.out.println("用户名或密码错误QAQ");
        }
    }

    public abstract double calc();

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
