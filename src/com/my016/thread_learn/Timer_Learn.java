package com.my016.thread_learn;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Timer_Learn {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println( Thread.currentThread().getName() + "执行一次");
            }
        } , 3000 , 2000 );
    }
}
