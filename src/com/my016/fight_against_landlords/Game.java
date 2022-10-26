package com.my016.fight_against_landlords;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class Game {

    public static List<Card> allCards = new ArrayList<>();

    static {
        //点数
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //花色
        String[] colors ={"♥","♣","♠","♦"};
        //组合
        int index = 0;
        for (String size : sizes) {
            for (String color : colors) {
                index++;
                Card c = new Card(size,color,index);
                allCards.add(c);
            }
        }
        allCards.add(new Card("","🃏",++index));
        allCards.add(new Card("","🃏",++index));
    }

    public static void main(String[] args) {
        //System.out.println(allCards);  开始洗牌
        Collections.shuffle(allCards);
       // System.out.println(allCards);
        //发牌
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();

        for (int i = 0; i < allCards.size()-3; i++) {
            Card c = allCards.get(i);
            if (i%3 == 0){
                //player1接牌
                player1.add(c);
            }else if (i%3 == 1){
                player2.add(c);
            }else {
                player3.add(c);
            }
        }

        //拿地主牌
        List<Card> lastTreeCards = allCards.subList(allCards.size()-3, allCards.size());

        //玩家牌排序
        // Collections.sort(player1,Card);
        sortCard(player1);
        sortCard(player2);
        sortCard(player3);


        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println("地主牌："+lastTreeCards);

    }

    private static void sortCard(List<Card> player) {
        Collections.sort(player,  (Card o1, Card o2) -> o1.getIndex()-o2.getIndex()  );
    }
}
