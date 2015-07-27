package com.company;

/**
 * Created by emma on 16/7/15.
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "aba";
        String t = longestPalindrome(s);
        System.out.println(t);
    }
    // leetcode handbook
    public static String longestPalindrome(String s){
        int start = 0, end = 0;
        for (int i= 0; i<s.length(); i++){
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end-start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1); //the end index, exclusive.
    }

    public static int expand(String s, int left, int right){
        int R = right, L = left;
        while (L>=0 && R<s.length() && s.charAt(R)==s.charAt(L)){
            L--;
            R++;
        }
        return R-L-1; // not R-L+1; because when the while loop ends, either L=-1 or R=s.length,
        // ie, one of them is 1 too many, so need to -1
    }
}
