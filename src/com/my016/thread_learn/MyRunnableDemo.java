package com.my016.thread_learn;

public class MyRunnableDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"输出："+(i+1));

            try {
                System.out.println( Thread.currentThread().getName()   +"任务与线程绑定，线程进入休眠");
                Thread.sleep(1000000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
