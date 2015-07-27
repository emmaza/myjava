package com.company;


/**
 * Created by emma on 6/7/15.
 */
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next=null;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        ListNode tmp = removeNthFromEnd(a,1);
        while (tmp!=null){
            System.out.println(tmp.val);
            tmp=tmp.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode fast = head;
        ListNode slow = head;
        int dist = 0;
        while (dist < n){
            fast = fast.next;
            dist++;
        }
        if(fast==null) {
            slow=head.next;
            return slow;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}

/*
public ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode start = new ListNode(0);
    ListNode slow = start, fast = start;
    slow.next = head;

    //Move fast in front so that the gap between slow and fast becomes n
    for(int i=1; i<=n+1; i++)   {
        fast = fast.next;
    }
    //Move fast to the end, maintaining the gap
    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
    //Skip the desired node
    slow.next = slow.next.next;
    return start.next;
}
 */