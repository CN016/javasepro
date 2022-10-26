package com.my016.thread_learn;

public class ThreadSafety {
    public static void main(String[] args) {
        //安全问题：同时访问/修改共享资源
    Account acc = new Account("016",114514);

    new AccountThread(acc,"1").start();
    new AccountThread(acc,"2").start();
    }
}
