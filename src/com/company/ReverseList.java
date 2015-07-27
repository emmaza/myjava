package com.company;

class ListNode {
      ListNode nodes = null;
      int val;
      ListNode next;
      ListNode(int x) {
        this.val = x;
        this.next = null;
    }
     public void printList() {
        if (nodes == null) return;
        for (ListNode n = nodes; n != null; n = n.next)
            System.out.println("ha" + n.val);
    }
}
public class ReverseList {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = null;
        reverseList(a);
        System.out.println("reversed list:");
        for (ListNode n = c; n != null; n = n.next)
            System.out.println(n.val);
        c.printList();
        b.printList();
    }

    public static ListNode reverseList(ListNode head) {
        //try recursion
        if(head==null || head.next == null) return head;
        ListNode tail = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return tail;

    }
}