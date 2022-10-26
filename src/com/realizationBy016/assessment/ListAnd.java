package com.realizationBy016.assessment;


public class ListAnd {
    public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

        System.out.println(new ListAndSolution().process(l1, l2));
    }
}
class ListAndSolution{
    public ListNode process (ListNode l1 , ListNode l2 ){
//        ListNode p1 = l1;
//        ListNode p2 = l2;
//        ListNode temp = null;
//        while ( true ){
//            if (p1.val < p2.val){
//                temp = p1.next;
//                p1.next = p2;
//                p2 = temp;
//            }else {
//                temp = p1.next;
//                p2.next = p1;
//                p1 = temp;
//            }
//            if (p1.next!=null){
//                p1=p1.next;
//            }
//            if (p2.next!=null){
//                p2=p2.next;
//            }
//            if ( p1.next==null || p2.next==null){
//                break;
//            }
//        }
        //还是创建新链表合并吧
        ListNode newList =new ListNode();
        ListNode p =newList;
        while (true){
            if ( l1!=null && l2!=null ){
             if ( l1.val > l2.val  ){
                 p.val = l2.val;
                 l2=l2.next;
             }else {
                 p.val = l1.val;
                 l1=l1.next;
             }
            }
            if ( l1==null && l2==null ){
               // p.next=new ListNode( Math.max(l1.val, l2.val) );
                break;
            } else if (l1==null && l2!=null){
                p.next=new ListNode(l2.val);
                p=p.next;
                l2=l2.next;
            }else if (l2==null && l1!=null){
                p.next=new ListNode(l1.val);
                p=p.next;
                l1=l1.next;
            }
        }

        return newList;
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
