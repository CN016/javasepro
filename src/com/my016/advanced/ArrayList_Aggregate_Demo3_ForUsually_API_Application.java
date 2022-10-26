package com.my016.advanced;

import java.util.ArrayList;

public class ArrayList_Aggregate_Demo3_ForUsually_API_Application {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Jvav");
        list.add("114514");
        list.add("1919810");

        // public E get (int index)
       String s1 = list.get(1);
        System.out.println("list1:"+s1);
        // public int size()

        int size =list.size();
        System.out.println("List's size="+size);

        //遍历

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }

        //public E remove (int index) 删除某位置的元素，返回被删除的元素

        String s2 = list.remove(2);
        System.out.println(  '<' +s2+ '>' +"删除成功！");

        //public boolean remove(Object) 删除某元素，只删除第一次出现的元素

        //public E set(int index , Object) 修改某位置元素，返回被修改元素



    }
}
