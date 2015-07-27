package com.company;
//Given a column title as appear in an Excel sheet, return its corresponding column number.

/**
 * Created by emma on 10/7/15.
 */
public class TitleToNumber {
    public static void main(String[] args) {
        String s = "AA";
        int k = titleToNumber(s);
        System.out.println(k);
    }

    public static int titleToNumber(String s){
        int len = s.length();
        int num=0;
        int partnum=0;
        for(int i=0; i<len; i++){
            partnum = s.charAt(i)-'A'+1;
            num = num*26 + partnum;
        }
        return num;
    }

}
