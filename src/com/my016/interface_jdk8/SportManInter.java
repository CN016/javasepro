package com.my016.interface_jdk8;

public interface SportManInter {
    //研究新增内容
    default void run(){
        System.out.println("跑得很快");
    }

    /*
    *
    * 静态方法
    *
    * */
    static void inAddr(){
        System.out.println("Java新增接口函数调用");
    }
}
class PingPongMan implements SportManInter{

}

class Test{
    public static void main(String[] args) {
    PingPongMan p = new PingPongMan();
    p.run();
    SportManInter.inAddr();
    }
}
