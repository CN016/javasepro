package com.my016.thread_learn;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.setName("一号");
        t1.start();

        Thread t2 = new MyThread();
        t2.setName("二号");
        t2.start();

        Thread m = Thread.currentThread();
        System.out.println(m.getName());


    }
}
