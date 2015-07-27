package com.company;
//https://leetcode.com/problems/zigzag-conversion/

import java.util.List;

/**
 * Created by emma on 1/7/15.
 */
public class Convert {
    public static void main(String[] args) {
        String s = "ABC";
        String t = convert(s, 2);
        System.out.println(t);
        if(t.equals("AB")) System.out.println("yes");
       // else System.out.println("no");
    }
    public static String convert(String s, int numRows){
        if(numRows==1) return s;
        StringBuilder[] str = new StringBuilder[numRows];
        for(int k=0; k<numRows; k++){
            str[k] = new StringBuilder();
        }
        StringBuilder conStr = new StringBuilder();
        int row = 0;
        int reverse = 0;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            str[row].append(c);
            if(reverse==0) {
                row+=1;
            }else {
                row-=1;
            }
            if(row==numRows) {
                reverse = 1;
                row = row - 2;
            }
            if(row==0) reverse=0;
        }
        for (int j=0; j<numRows; j++){
            conStr.append(str[j]);
        }
        return conStr.toString();
    }
}

/*
public String convert(String s, int nRows) {
    char[] c = s.toCharArray();
    int len = c.length;
    StringBuffer[] sb = new StringBuffer[nRows];
    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

    int i = 0;
    while (i < len) {                //###good: once idx reaches nRows, it goes to the next for-loop
        for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
            sb[idx].append(c[i++]);
        for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
            sb[idx].append(c[i++]);
    }
    for (int idx = 1; idx < sb.length; idx++)
        sb[0].append(sb[idx]);
    return sb[0].toString();
}
 */
