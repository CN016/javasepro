package com.my016.map_Learn;

import java.util.*;

public class MapTest1 {
    public static void main(String[] args) {
        //记录每个学生选择情况
        //Map集合存储
        Map<String , List<String> > data = new HashMap<>();
        List<String> selects = new ArrayList<>();
        Collections.addAll(selects,"A","D");
        data.put("016",selects);
        System.out.println(data);

        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1,"A","B");
        data.put("012",selects1);
        System.out.println(data);

        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2,"A","D","C");
        data.put("011",selects2);
        System.out.println(data);


        Map<String , Integer> infos =new HashMap<>();

        Collection<List<String>> values = data.values();
        System.out.println("values:"+values);

        for (List<String> value : values) {
            for (String s : value) {
                if (infos.containsKey(s)){
                    infos.put(s,infos.get(s)+1);
                }else {
                    infos.put(s,1);
                }
            }
        }

        System.out.println(infos);
    }
}
