package com.my016.static_codeblock;

public class TestDemo2 {
    //构造代码块

    {
        System.out.println("构造代码块被触发执行");
    }

    public TestDemo2() {
        System.out.println("对象创建成功");
    }

    public static void main(String[] args) {
        new TestDemo2();
    }
}
