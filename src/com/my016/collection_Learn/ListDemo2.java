package com.my016.collection_Learn;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        //入栈
        LinkedList<String> stack = new LinkedList<>();
        stack.addFirst("1");
        stack.addFirst("2");
        stack.addFirst("3");
        stack.addFirst("4");
        System.out.println(stack);
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);

        //队列
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");
        queue.addLast("4");
        System.out.println(queue);

        System.out.println(queue.getFirst());

    }
}
