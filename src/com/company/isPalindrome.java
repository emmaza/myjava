package com.company;

/**
 * Created by emma on 1/7/15.
 */
public class isPalindrome {
    public static void main(String[] args) {
        if(isPalindrome(1000021)) System.out.println("y");
        else System.out.println("no");
    }
    public static boolean isPalindrome(int n){
        if(n<0) return false;
        int div = 1;
        while (n/div >= 10){
            div *= 10;
        }
        while (n!=0){
            if(n/div != n%10) return false;
            n = n- (n/div) * div;
            div /= 100;
            n /= 10;
        }
        return true;
    }
    public static boolean isPalindrome2(int x) {
        if (x < 0) return false;
        int div = 1;
        while (x / div >= 10) {
            div *= 10; }
        while (x != 0) {
            int l = x / div;
            int r = x % 10;
            if (l != r) return false;
            x = (x % div) / 10;
            div /= 100; }
        return true;
    }
}
