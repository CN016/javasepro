package com.my016.thread_learn;

public class AccountThread extends Thread{
    private Account acc;

    public AccountThread(Account acc ,String name){
        super(name);
        this.acc=acc;

    }

    @Override
    public void run() {
    acc.drawMoney(114514);
    }
}

