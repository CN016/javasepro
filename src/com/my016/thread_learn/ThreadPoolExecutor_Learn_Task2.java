package com.my016.thread_learn;

import java.util.concurrent.*;

public class ThreadPoolExecutor_Learn_Task2 {
    public static void main(String[] args) throws Exception{
     /*
           public ThreadPoolExecutor(int corePoolSize,
                                        int maximumPoolSize,
                                        long keepAliveTime,
                                        TimeUnit unit,
                                        BlockingQueue<Runnable> workQueue,
                                        ThreadFactory threadFactory,
                                        RejectedExecutionHandler handler)
         */
        ExecutorService pool = new ThreadPoolExecutor(3,5,
                6, TimeUnit.SECONDS , new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //给任务给线程池处理
       // Runnable target = new MyRunnableDemo();

//        pool.execute(target);
//        pool.execute(target);
//        pool.execute(target);
//
//        pool.execute(target);
//        pool.execute(target);
//        pool.execute(target);
//        pool.execute(target);
//        pool.execute(target);
//
//        //开始创建临时线程
//        pool.execute(target);
//        pool.execute(target);
//
//        //拒绝策略触发
//        pool.execute(target);

        Future<String> f1 = pool.submit(new MyCallableDemo(100));
        Future<String> f2 = pool.submit(new MyCallableDemo(200));
        Future<String> f3 = pool.submit(new MyCallableDemo(300));
        Future<String> f4 = pool.submit(new MyCallableDemo(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}
