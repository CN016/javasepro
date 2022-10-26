package com.my016.static_codeblock;

import java.util.ArrayList;
import java.util.Random;

public class StaticCodeTest3_For_FightAgainstLandlords {
    //初始化ArrayList
    public static ArrayList<String> cards = new ArrayList<>();

    static {
        //加载54张牌
        String[] colors = {"♠","♥","♣","♦"};
        //定义点数
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //遍历
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                cards.add(sizes[i]+colors[j]);
            }
        }
        cards.add("🃏（大）");
        cards.add("🃏（小）");
    }

    public static void main(String[] args) {
        System.out.println("新牌："+cards);
        //洗牌
       washCards(cards);
        System.out.println("洗牌后："+cards);
    }

    public static void washCards (ArrayList<String> cards){
        Random r = new Random();
        String temp;
        int index;
        for (int i = 0; i < cards.size(); i++) {
            index= r.nextInt(   cards.size()   );
            temp= cards.get( index  );
            cards.set(index,       cards.get(i)          );
            cards.set(i,temp);
        }
    }


}
