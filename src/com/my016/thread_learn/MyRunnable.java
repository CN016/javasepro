package com.my016.thread_learn;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //线程任务
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行:"+i);
        }
    }
}
