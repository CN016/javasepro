package com.my016.map_Learn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//键值对
public class MapDemo1 {
    public static void main(String[] args) {
        //creat
        Map<String , Integer> maps = new HashMap<>(); //经典代码，多态
        maps.put("辣条",114514);
        maps.put("Java",114514);
        maps.put("显示器",1919810);
        maps.put(null,null);
        System.out.println(maps);

        Map<String , Integer> map = new LinkedHashMap<>();
        map.put("辣条",114514);
        map.put("Java",114514);
        map.put("显示器",1919810);
        map.put(null,null);
        System.out.println(map);


    }
}
