package com.my016.thread_learn;

import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class BetterTimer {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(11400);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        } , 0 , 2 , TimeUnit.MILLISECONDS);
    }
}
