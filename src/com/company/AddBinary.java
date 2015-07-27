package com.company;

/**
 * Created by emma on 19/6/15.
 */

/*
StringBuilder is handy, but StringBuilder.insert(0, Object) is O(N) time complexity which leads to a O(N^2) overall time complexity.

I may suggest to append first then reverse the whole buffer after the main loop. It will guarantee O(N) time complexity.
 */

public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "11";
        System.out.println(addBinary(a, b));
    }
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i >=0 && j >=0){
            if(carry == 0) {
                if (a.charAt(i) == '0' && b.charAt(j) == '0') result.append("0");
                if (a.charAt(i) != b.charAt(j)) result.append("1");
                if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                    result.append("0");
                    carry = 1;
                }
            }
            else if(carry == 1){
                if (a.charAt(i) == '0' && b.charAt(j) == '0'){
                    result.append("1");
                    carry = 0;
                }
                if (a.charAt(i) != b.charAt(j)) result.append("0");
                if (a.charAt(i) == '1' && b.charAt(j) == '1') result.append("1");
            }
            i--; j--;
        }
        while(i >= 0){
            if(carry==0) {
                result.append(a.charAt(i));
            }
            else {
                if(a.charAt(i)=='0'){
                    result.append('1');
                    carry=0;
                }
                else{
                    result.append('0');
                }
            }
            i--;
        }
        while(j >= 0){
            if(carry==0) {
                result.append(b.charAt(j));
            }
            else {
                if(b.charAt(j)=='0'){
                    result.append('1');
                    carry=0;
                }
                else{
                    result.append('0');
                }
            }
            j--;
        }
        if(carry == 1) result.append('1');
        return result.reverse().toString();
    }
}

/*
public class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sa = new StringBuilder(a);
        sa.reverse();
        StringBuilder sb = new StringBuilder(b);
        sb.reverse();
        int maxLen = Math.max(a.length(), b.length());
        StringBuilder ret = new StringBuilder();
        int carry = 0;

        for(int i = 0; i < maxLen; i++){
            char ca = (i < sa.length()) ? sa.charAt(i) : '0';
            char cb = (i < sb.length()) ? sb.charAt(i) : '0';
            if(ca == cb){
                ret.append(carry);
                carry = (ca == '0') ? 0 : 1;
            }else{
                ret.append(1 - carry);
                carry = (carry == 1) ? 1 : 0;
            }
        }

        ret = (carry == 0) ? ret : ret.append(1);
        ret.reverse();
        return ret.toString();

    }
}
 */

/*
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int aPtr = a.length() - 1;
        int bPtr = b.length() - 1;
        int carry = 0;
        int count = 0;
        while(aPtr >= 0 || bPtr >= 0) {
            if(aPtr >= 0) {
                if(a.charAt(aPtr) == '1') {
                    count ++;
                }
            }
            if(bPtr >= 0) {
                if(b.charAt(bPtr) == '1') {
                    count ++;
                }
            }
            if(carry == 1) {
                count++;
            }
            carry = (count > 1 ? 1 : 0);
            str.insert(0, ((count == 0 || count == 2)? '0' : '1'));
            count = 0;
            aPtr--;
            bPtr--;
        }
        if(carry == 1) {
            str.insert(0, '1');
        }
        return str.toString();
    }
}
 */