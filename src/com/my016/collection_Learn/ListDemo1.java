package com.my016.collection_Learn;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("016");
        list.add("016");
        list.add("016");
        list.add("114514");
        list.add("1919810");
        System.out.println(list);
        list.add(2,"789");
        System.out.println(list);
        list.clear();
    }
}
