package com.my016.hello;

public class Test {
    public static void main(String[] args) {
        //设计对象并使用
        Car c = new Car();
        c.name = "🐎杀拉弟";
        c.price = 114514;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();


        Car c1 = new Car();
        c1.name = " 法垃粒";
        c1.price = 1919810;
        System.out.println(c1.name);
        System.out.println(c1.price);
        c1.start();
        c1.run();
    }
}
