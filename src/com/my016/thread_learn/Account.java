package com.my016.thread_learn;


public class Account {
    private String name;
    private double money;

    public Account() {
    }

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void drawMoney(double i) {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            try {
                if (money>=i){
                    System.out.println(name+"取钱成功！"+i+"元取出");
                    money-=i;
                    System.out.println("余额："+money);
                    this.notifyAll();
                    this.wait();
                }else {
                    this.notifyAll();
                    this.wait();
                    System.out.println("余额不足QAQ");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void deposit(double i) {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            try {
                if (money==0){
                    //没钱了，该存钱了
                    System.out.println(name+"存钱成功！"+i+"元存入");
                    money+=i;
                    System.out.println("余额："+money);
                    this.notifyAll();
                    this.wait();
                }else {
                    this.notifyAll();
                    this.wait();
                    //System.out.println("余额不足QAQ");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
