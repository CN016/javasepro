package com.my016.thread_learn;

public class DrawThread extends Thread{
    private Account acc ;
    public DrawThread(Account acc ,String name){
        super(name);
        this.acc=acc;

    }

    @Override
    public void run() {
        while (true) {
            try {
                acc.drawMoney(100000);
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
