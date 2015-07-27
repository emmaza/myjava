package com.company;

/**
 * Created by emma on 10/7/15.
 */
public class PalindromeString {
    public static void main(String[] args) {
        String s = ".,";
        if(palindromeString(s)) System.out.println("y");
        else System.out.println("n");
    }

    public static boolean palindromeString(String s){
        if(s.equals(" ")) return true;
        s=s.toLowerCase();
        int len = s.length();
        int i=0, j=len-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){ i++; continue;}
            if(!Character.isLetterOrDigit(s.charAt(j))){ j--; continue;}
            if(s.charAt(i)!=s.charAt(j)) return false;
            else{i++; j--;}
        }
        return true;
    }
}
