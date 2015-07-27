package com.company;

/**
 * Created by emma on 12/7/15.
 */
public class ConvertToTitle {
    public static void main(String[] args) {
        int n = 52;
        String s = convertToTitle(n);
        System.out.println(s);
    }
    public static String convertToTitle(int n){
        StringBuilder s = new StringBuilder();
        while (n>0){
            char c = (n%26==0) ? 'Z' : (char) (n % 26 + 'A' - 1);
            s.insert(0,c);
            int t = n/26;
            n= (n%26==0) ? t-1 : t;
        }
        return s.toString();
        /*
        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }
         */
    }
}
