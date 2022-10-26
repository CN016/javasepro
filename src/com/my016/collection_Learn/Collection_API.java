package com.my016.collection_Learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Collection_API {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        list.add("016");
        list.add("NB!");
        System.out.println(list);
        System.out.println(list.size());
          Object[] arr= list.toArray();
        System.out.println(Arrays.toString(arr));

        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        c1.add("016");
        c1.add("NB!");
        c2.add("114514");
        c2.add("1919810");
        c1.addAll(c2);
        System.out.println(c1);
        Iterator<String> iterator = c1.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        for (String string : c1) {
            System.out.println(string);
        }
    }
}
