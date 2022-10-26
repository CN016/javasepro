package com.my016.thread_learn;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor_Learn_Task3 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new MyRunnableDemo());
        pool.execute(new MyRunnableDemo());
        pool.execute(new MyRunnableDemo());
        pool.execute(new MyRunnableDemo()); //没有多余线程
    }
}
