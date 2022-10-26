package com.my016.advanced;

import java.util.ArrayList;

public class ArrayList_Aggregate_Demo1 {
    public static void main(String[] args) {
    //创建ArrayList集合的对象
        ArrayList list =new ArrayList();

        //添加元素
        list.add("Java");
        list.add("is");
        list.add("best");
        list.add("编程语言！");
        list.add(114514);
        list.add(1919810);
        list.add(true);

        System.out.println(list);

        //插入元素
        list.add(1,"016");
        System.out.println(list);



    }
}
