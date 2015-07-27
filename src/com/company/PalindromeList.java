package com.company;

//Given a singly linked list, determine if it is a palindrome.
/**
 * Created by emma on 15/7/15.
 */
/*
public class PalindromeList {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(1);
        a.next = b;
        b.next = null;
        c.next = null;
        if(palindromeList(a)) System.out.println("y");
        else System.out.println("n");
    }

    public static boolean palindromeList(ListNode head){
        if(head==null) return true;
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = head;
        ListNode after = slow.next;
        while (fast != null && fast.next != null){
            pre = slow;
            slow = after;
            fast = fast.next.next;
            // reverse first part
            after = slow.next;
            slow.next = pre;
        }
        head.next=null;
        if(fast != null) slow = after;
        while (slow != null) {
            if(pre.val != slow.val) return false;
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }
}
*/