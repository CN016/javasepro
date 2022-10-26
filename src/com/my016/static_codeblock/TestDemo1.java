package com.my016.static_codeblock;

public class TestDemo1 {
    //静态代码块
    //优先执行
    public static String aaa;

    public static void main(String[] args) {
        System.out.println("666");
        System.out.println(aaa);
    }

    static {
        System.out.println("==静态代码块被触发执行==");
        aaa="114514";
    }
    //作用：在程序加载时进行静态数据初始化操作
}
