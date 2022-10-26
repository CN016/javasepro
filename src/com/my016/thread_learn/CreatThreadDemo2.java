package com.my016.thread_learn;

public class CreatThreadDemo2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行："+i);
        }
    }
}
