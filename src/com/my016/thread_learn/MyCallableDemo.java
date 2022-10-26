package com.my016.thread_learn;

import java.util.concurrent.Callable;

public class MyCallableDemo implements Callable<String> {
    private int n;
    public MyCallableDemo() {
    }

    public MyCallableDemo(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName() +  ": " + n +"Result="+sum;
    }
}
