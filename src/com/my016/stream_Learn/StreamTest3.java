package com.my016.stream_Learn;
//常用API

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"016","017","008","111");

        list.stream().filter(s -> s.startsWith("0")).forEach(System.out::println);



        long size =  list.stream().filter(s -> s.startsWith("0")).count();
        System.out.println(size);

        list.stream().filter(s -> s.startsWith("0")).limit(2).forEach(System.out::println);
        //限制2个

        list.stream().filter(s -> s.startsWith("0")).skip(2).forEach(System.out::println);
        //跳过前两个

        //map加工
        list.stream().map(s -> "NB"+s).forEach(System.out::println);
//        list.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return "NB"+s;
//            }
//        });
       // System.out.println(list);

        //把名称加工成学生对象

        list.stream().map(Student::new).forEach(System.out::println); //构造器引用 方法引用

        //合并引用
        Stream<String>  stringStream  =   list.stream().filter(s -> s.startsWith("0"));
       // System.out.println(stringStream);
        Stream<String>  stringStream1 = list.stream().filter(s -> s.startsWith("1"));
        Stream<String> stringStream2 = Stream.of("Java1","Java2");

        Stream<String> stringStream3 = Stream.concat(stringStream1,stringStream2);
        Stream<String> stringStream4 = Stream.concat(stringStream,stringStream3);
        stringStream4.forEach(System.out::println);


        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"016","016","016","016","017","008","111");
        // stream去重复

        list1.stream().distinct().forEach(System.out::println);
        //stream流不会影响原来数组或者集合的元素


    }
}
