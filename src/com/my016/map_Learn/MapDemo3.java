package com.my016.map_Learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
       // public static void main(String[] args) {
            Map<String ,Integer> maps= new HashMap<>();
            //1.添加元素:无序，不重复，无索引。
            maps.put("娃娃",30);
            maps.put( "iphoneX" ,100);
            maps.put ( "huawei" ,1000) ;
            maps.put("生活用品",10);
            maps.put("手表" ,10);
            System.out.println(maps);

            //键找值
            Set<String>  keys =maps.keySet();
            System.out.println(keys);
            for (String key : keys) {
            int value = maps.get(key);
                System.out.println(key + "===>"+value);
            }

            //把Map集合转成Set集合形式（entrySet）
        Set<Map.Entry<String,Integer>> entries = maps.entrySet();
        System.out.println(entries);

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() +   "===>"+entry.getValue());

        }
        System.out.println("------------------------------------------------");

        maps.forEach( (k,v)-> System.out.println(k+"------>"+v) );
    }
}
