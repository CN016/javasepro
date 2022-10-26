package com.my016.stream_Learn;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 初步体验stream流
* */
public class StreamTest1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"016","007","008","111","08");
        List<String> zeroName = new ArrayList<>();
        for (String name : names) {
            if ( name.startsWith("0") ){
                zeroName.add(name);
            }
        }
        List<String> threeLenName = new ArrayList<>();
        for (String name : zeroName) {
            if ( name.length() == 3 ){
                threeLenName.add(name);
            }
        }
        System.out.println(names);
        System.out.println(zeroName);
        System.out.println(threeLenName);

        //使用stream使用
        List<String> temp = new ArrayList<>();
        names.stream().filter(s -> s.startsWith("0")).filter(s->s.length() == 3).forEach(temp::add);
        System.out.println(temp);
    }
}
