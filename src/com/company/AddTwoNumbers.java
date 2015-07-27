package com.company;
//You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order
// and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
/**
 * Created by emma on 15/7/15.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(7);
        ListNode c = new ListNode(9);
        a.next = null;
        b.next = null;
        c.next = null;
        ListNode m = new ListNode(9);
        ListNode n = new ListNode(9);
        ListNode p = new ListNode(9);
        m.next = n;
        n.next = null;
        p.next = null;
        ListNode k = addTwoNumbers(a,m);
        while (k!=null){
            System.out.println(k.val);
            k=k.next;
        }
    }

    // other's solution
    public static ListNode addTwoNumbers22(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }


    // my original solution
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = l1;
        ListNode tail = l1;
        //ListNode tail2 = l2;
        while (l1 != null && l2 != null){
            int k = l1.val + l2.val;
            l1.val = (carry==1)? k+1 : k;
            if(l1.val > 9){
                l1.val = l1.val - 10;
                carry = 1; // addition of digits won't make carry more than 1
            }
            else carry =0;
            tail = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            if(carry==0) return result;
            else{
                int a = l1.val + 1;
                if(a>9) l1.val = a -10;
                else {
                    l1.val = a;
                    carry = 0;
                }
            }
            tail = l1;
            l1=l1.next;
        }
        if(l2 != null) tail.next = l2;
        while (l2 != null){
            if(carry==0) return result;
            else {
                int b = l2.val + 1;
                if (b <= 9) {
                    l2.val = b;
                    carry =0;
                } else {
                    l2.val = b - 10;
                }
            }
            tail = l2;
            l2=l2.next;
        }
        if(carry==1) {
            tail.next = new ListNode(1);
        }
        return result;
    }
}
