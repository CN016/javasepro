package com.realizationBy016.Demo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class StartEqualWithEndLinkList {
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

    public static void main(String[] args) {
        //创建链表？
        Random r = new Random();
        ListNode listNodeHead = new ListNode(1);
        headAddLinked(listNodeHead,114);
        headAddLinked(listNodeHead,114);
        headAddLinked(listNodeHead,114);
        headAddLinked(listNodeHead,1);


        /*
        ListNode note = listNodeHead;
        for (int i = 0; i < 8; i++) {
           note.val= r.nextInt(6);
           note.next=new ListNode();
           note=note.next;
        }
        note=null;
        note=listNodeHead;
        ListNode note = listNodeHead;
        while (note != null){
            System.out.println(note.val);
            note=note.next;
        }*/
       /* ListNode note = listNodeHead;
        while (note != null){
            System.out.println(note.val);
            note=note.next;
        }
*/

        System.out.println(new Solution().isPalindrome(listNodeHead));


    }
    public static void headAddLinked (ListNode head, int data){ //尾插
        ListNode node = head;
        while ( node.next!=null ){
            node=node.next;
        }
        node.next=new ListNode(data);
        node.next.next=null;

    }

}
class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
             ListNode p = new ListNode();
             p=this;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (p!=null){
            sb.append(p.val);
            sb.append(  p.next != null ? "," : ""   );
            p = p.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        /*if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head , fast =head ;
        ListNode cur = head , pre = null;
        while (fast != null && fast.next!= null){
            fast = fast.next.next;
            cur = slow;
            slow= slow.next;
            //反转
            cur.next = pre;
            pre = cur;
        }
        if (fast != null){
            slow = slow.next;
        }
        while (cur != null && slow != null){
            if (cur.val != slow.val){
                return false;
            }
            cur=cur.next;
            slow=slow.next;
        }
        return true;*/ // 纯链表方法

        //数组方法
        ArrayList<Integer> before = new ArrayList<>();
        while (head != null){
            before.add(head.val);
            head=head.next;
        }
        for (int i = 0; i < before.size(); i++) {
         if(  !Objects.equals(before.get(i),before.get(before.size()-i-1))  ){
             return false;
         }
        }
        return true;
    }
}
