package com.company;

import java.util.Stack;

/**
 * Created by emma on 28/6/15.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        if(validParentheses(s)) System.out.println("yes");
        else System.out.println("no");
    }

    public static boolean validParentheses(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length();i++){
            char p = s.charAt(i);
            if(p=='(' || p=='{' || p=='[') st.push(p);
            else{
                if (st.empty()) return false;
                char q = st.pop(); // must use q; don't use three st.pop(), because each time, one element is removed
                if(p==')' && q!='('
                        || p=='}' && q !='{'
                        || p==']' && q !='[' ) return false;
            }
        }
        return st.empty();
    }
}
