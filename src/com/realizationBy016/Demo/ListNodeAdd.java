package com.realizationBy016.Demo;

public class ListNodeAdd {
    public static void main(String[] args) {
        //创建链表
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(new ListNodeAddSolution().addTwoNumbers(l1,l2));

    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNodeAddSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int data1 = 0  , data2 = 0 ;
//
//        //遍历链表
//        ListNode p = l1;
//        while (p!=null){
//            data1 = data1*10 + p.val;
//            p = p.next;
//        }
//        p = l2;
//        while (p!=null){
//            data2 = data2*10 + p.val;
//            p = p.next;
//        }
//
//        int sum = data1+data2;
//
//        //创建链表
//        ListNode newList = new ListNode();
//        p = newList;
//        while (sum!=0){
//            p.val=sum%10;
//            sum = sum/10;
//            if (sum == 0){
//                break;
//            }
//            p.next = new ListNode();
//            p = p.next;
//        }
//
//        return newList;

//        ListNode newList = new ListNode();
//        ListNode p = newList;
//        int data1 =0, data2 =0,temp = 0,count=0;
//        //同时遍历
//        while (l1 != null || l2 !=null){
//             if (l1 !=null && l2 != null) {
//                 data1 =  l1.val;
//                 data2 =  l2.val;
//             }
//             if ( data1+data2 + temp > 9  ){
//                 if (count ==0){
//                     p.val +=   data1+data2 -10 ;
//                     count++;
//                 } else {
//                     p.val += data1+data2  - 9;
//                 }
//                 p.next = new ListNode(1);
//             } else {
//                 p.val += data1 + data2;
//                 assert l1 != null;
//                 assert l2 != null;
//                 if (l1.next != null || l2.next !=null){
//                     p.next = new ListNode();
//                 }
//
//             }
//             p = p.next;
//
//            assert l1 != null;
//            l1 = l1 .next;
//
//            assert l2 != null;
//            l2 = l2 .next;
//
//
//
//        }
//        return newList;


        //遍历两遍！
        ListNode newList = new ListNode();
        ListNode p = newList;
        ListNode p2 = l2;
        while (l1 != null){//第一遍
            p.val = l1.val;
            if ( p.next == null && l1.next != null){
                p.next = new ListNode();
            }
            p = p.next;
            l1 = l1.next;
        }
        p = newList;
        int temp = 0;
        while (p2 != null){ // 第二遍
            if ( temp + p2.val + p.val > 9 ){
                p.val = p.val + p2.val + temp -10;
                temp = 1;
            }else {
                p.val = p.val + p2.val + temp ;
                temp = 0;
            }
            if ( p.next == null && p2.next != null){
                p.next = new ListNode();
            }
            p=p.next;
            p2 = p2.next;
        }p = newList; p2 = l2;
        while (p2.next != null) {
            p = p.next;
            p2 = p2.next;
        }
        if ( p.next == null && temp == 1){
            p.next=new ListNode();
        }
        p=p.next;
        while (temp==1){

            if ( p.val + temp >9 ){
                p.val = p.val - 9;
            }
            else {
                p.val = p.val +temp;
                temp = 0;
            }
            if ( p.next == null && temp==1){
                p.next = new ListNode();
                p = p.next;
            }
            if (p.next != null){
                p = p.next;
            }
        }

        return newList;


    }
}

