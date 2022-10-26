package com.my016.thread_learn;

import java.util.concurrent.*;

public class ThreadPoolExecutor_Learn {
    public static void main(String[] args) {
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
        Runnable target = new MyRunnableDemo();

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //开始创建临时线程
        pool.execute(target);
        pool.execute(target);

        //拒绝策略触发
        pool.execute(target);




    }
}
