package com.my016.stream_Learn;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
    //收集stream流
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"016","017","008","111");
        System.out.println(list);
        list = list.stream().filter(s -> s.startsWith("0")).collect(Collectors.toList());
        System.out.println(list);
        //流只能使用一次，流完就没了

        Stream<String> s1 = list.stream();
        Object[] arrs = s1.toArray();
        System.out.println(Arrays.toString(arrs));

        Stream<String> s2 = list.stream();
        String[] arr = s2.toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));

        Stream<String> s3 = list.stream();
        String[] arr1 = s3.toArray(String[]::new);
        System.out.println(Arrays.toString(arr1));
    }
}
