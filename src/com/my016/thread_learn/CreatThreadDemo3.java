package com.my016.thread_learn;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CreatThreadDemo3 {
    /**
     * 实现Callable接口，结合FutureTask完成
     */
    public static void main(String[] args) {
    //创建任务对象
        Callable<String> callable = new MyCallable(100);
        FutureTask<String> f1 = new FutureTask<>(callable);
        Thread t = new Thread(f1);
        t.start();

//        try {
//            System.out.println(f1.get());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
