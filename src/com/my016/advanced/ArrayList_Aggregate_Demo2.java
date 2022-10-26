package com.my016.advanced;

import java.util.ArrayList;

public class ArrayList_Aggregate_Demo2 {
    public static void main(String[] args) {
    //泛型
        ArrayList<String> list= new ArrayList<String> ();
         list.add("114514");
         list.add("1919810");

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.add(115514);
        list2.add(1919810);

        System.out.println(list);
        System.out.println(list2);
    }
}
