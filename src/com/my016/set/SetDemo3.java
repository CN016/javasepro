package com.my016.set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Integer> sets  = new TreeSet<>();
        sets.add(1);
        sets.add(1);
        sets.add(4);
        sets.add(5);
        sets.add(1);
        sets.add(4);
        System.out.println(sets);

        Set<String> set = new TreeSet<>();
        set.add("Java");
        set.add("Python");
        set.add("amazing");
        set.add("傻逼");
        System.out.println(set);


        Set<Apple> apples =new TreeSet<>();
        apples.add(new Apple("红富士","绿色",9.9,800));
        apples.add(new Apple("白富士","绿色",9.9,700));
        apples.add(new Apple("绿富士","黑色",3.9,600));
        apples.add(new Apple("金富士","绿色",9.9,300));
        apples.add(new Apple("红富士","绿色",9.9,500));
        System.out.println(apples);
    }
}
