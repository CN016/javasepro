package com.my016.fight_against_landlords;

import java.util.Comparator;

public  class Card implements Comparator<Card> {
    private String size;
    private String color;
    private int index;

    public Card() {
    }

    public Card(String size, String color, int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return size+color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public int compare(Card o1, Card o2) {
        return o1.getIndex()-o2.getIndex();
    }

    //    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

//    @Override
//    public int compare(Card o1, Card o2) {
//        return o1.getIndex() - o2.getIndex();
//    }


}
