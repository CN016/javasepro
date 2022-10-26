package com.my016.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("Java");
        sets.add("Java");
        sets.add("MySQL");
        sets.add("MySQL");
        sets.add("MySQ");
        sets.add("MyQ");
        System.out.println(sets);
    }
}
