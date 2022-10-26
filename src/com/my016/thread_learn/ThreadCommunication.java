package com.my016.thread_learn;

public class ThreadCommunication {
    public static void main(String[] args) {
        //线程通信
        Account account = new Account("016",0);

        //创建两个取钱线程
        new DrawThread(account,"1").start();
        new DrawThread(account,"2").start();

        //创建三个取钱线程
        new DepositThread(account,"114").start();
        new DepositThread(account,"1919").start();
        new DepositThread(account,"814").start();
    }
}
