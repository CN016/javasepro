package com.my016.vote_SYSTEM;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapTest1 {
    public static void main(String[] args) {
        //把80个学生的数据拿过来
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        String[] selects = {"A","B","C","D"};
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
      //  System.out.println(sb);
        Map<Character,Integer> infos = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch =sb.charAt(i);
            //判断Map是否出现这个键
            if (infos.containsKey(ch)){
                infos.put(ch,infos.get(ch) + 1);
            }else {
                infos.put(ch,1);
            }
        }
        System.out.println(infos);

    }
}
