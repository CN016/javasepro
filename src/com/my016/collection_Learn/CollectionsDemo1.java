package com.my016.collection_Learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("016");
        names.add("016");
        names.add("016");
        names.add("016");
        Collections.addAll(names,"016","017","018");
        System.out.println(names);

        //打乱集合顺序
        Collections.shuffle(names);
        System.out.println(names);

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,4,5,1,4,1,9,1,9,8,1,0);
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);


    }
}
