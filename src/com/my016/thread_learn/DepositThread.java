package com.my016.thread_learn;

public class DepositThread extends Thread{
    private Account acc ;
    public DepositThread(Account acc ,String name){
        super(name);
        this.acc=acc;
    }


    @Override
    public void run() {
        while (true) {
            try {
                acc.deposit(100000);
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
