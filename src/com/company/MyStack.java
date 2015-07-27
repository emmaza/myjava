package com.company;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by emma on 13/7/15.
 */

//Implement the following operations of a stack using queues
    //can use : push to back, peek/pop from front, size, and is empty
class MyStack {
    private Queue<Integer> qu = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        qu.add(x);
        // move the new element to queue front
        for(int i=1; i<qu.size(); i++){
            qu.add(qu.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        qu.poll();
    }

    // Get the top element.
    public int top() {
       return qu.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return qu.isEmpty();
    }

    public static void main(String[] args) {
        MyStack myQu = new MyStack();
        myQu.push(1);
        myQu.push(2);
        myQu.push(3);

        for(int i=1; i<=3; i++){
            int k = myQu.top();
            System.out.println(k);
            myQu.pop();

        }
    }
}

