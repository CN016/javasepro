package com.my016.collection_Learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

//学习Collection集合体系特点
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("016");
        list.add("016");
        list.add("114514");
        list.add("114514");
        list.add(1919810);
        list.add(84235.345);
        list.add(true);
        list.add(true);
        list.add('2');
        System.out.println(list);

        ////////////////////

        Collection list1 = new HashSet();
        list1.add("016");
        //list.add("016");
        list1.add("114514");
       // list.add("114514");
        list1.add(1919810);
        list1.add(84235.345);
      //  list.add(true);
        list1.add(true);
        list1.add('2');
        System.out.println(list1);
    }
}
