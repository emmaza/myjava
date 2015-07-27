package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class MyStacktest{
    // testing can be done in a separate file like this or in the original class
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
