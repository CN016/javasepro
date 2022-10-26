package com.my016.map_Learn;

import com.my016.set.Apple;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeHashMap_Learn {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new TreeMap<>();
        map1.put(13,"016");
        map1.put(132,"06");
        map1.put(1,"012");
        map1.put(113,"0126");
        System.out.println(map1);

        Map<Apple , String> map2 = new TreeMap<>();
        map2.put(new Apple("红富士","绿色",9.9,800),"山东");
        map2.put(new Apple("白富士","绿色",9.9,700),"广西");
        map2.put(new Apple("绿富士","黑色",3.9,600),"广东");
        map2.put(new Apple("金富士","绿色",9.9,300),"河南");
        map2.put(new Apple("红富士","绿色",9.9,500),"哈尔滨");
        System.out.println(map2);


    }
}
