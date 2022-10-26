package com.my016.thread_learn;
//创建线程
public class CreatThreadDemo {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出："+i);
        }
    }
}













