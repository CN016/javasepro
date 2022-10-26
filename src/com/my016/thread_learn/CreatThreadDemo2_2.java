package com.my016.thread_learn;

public class CreatThreadDemo2_2 {
    public static void main(String[] args) {
        Thread t =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程执行:"+i);
                }
            }
        });
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行："+i);
        }//匿名内部类实现

    }
}
