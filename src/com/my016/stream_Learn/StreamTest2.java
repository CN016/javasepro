package com.my016.stream_Learn;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        //获取流
        Collection<String> list =new ArrayList<>();
        Stream<String> s = list.stream();

        Map<String,Integer> maps = new HashMap<>();

        Stream<String> keyStream = maps.keySet().stream();
        Stream<Integer> valueStream = maps.values().stream();

        Stream<Map.Entry<String,Integer> > keyAndValueStream = maps.entrySet().stream();

        String[] names = {"016","017","008"};
        Stream<String> nameStream  =    Arrays.stream(names);
        Stream<String> nameStream2 = Stream.of(names);
    }
}
