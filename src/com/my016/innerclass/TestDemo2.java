package com.my016.innerclass;

public class TestDemo2 {
    public static void main(String[] args) {
//    Swimming s = new
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生在游泳~~");
            }
        };

        go(s);
    }

    public static void go(Swimming s){
        System.out.println("开始~~");
        s.swim();
        System.out.println("结束~~");
    }
}

interface Swimming{
    void swim();
}