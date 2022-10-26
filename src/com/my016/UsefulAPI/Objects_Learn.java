package com.my016.UsefulAPI;

import java.util.Objects;

public class Objects_Learn {
    public static void main(String[] args) {
        String s1 = "016";
        String s2 = "016";
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));
    }
}
