package com.company;

/**
 * Created by emma on 14/7/15.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int k = 6;
        if(isPowerOfTwo(k)) System.out.println("yes");
        else System.out.println("no");
    }

    public static boolean isPowerOfTwo(int n){
        if(n<=0) return false;
        if(n==1) return true;
        while(n>1){
            if(n%2 != 0) return false;
            n/=2;
        }
        return true;
    }
}
// If a binary number n has 1 bit set then (n & (n - 1)) should equal 0. Why ? assume n = 8 (bit 3 is set) (1000)
// then n-1 = 7. Hence n-1 is the largest number you can represent using 3 bits,
// the largest number should have all bits set.
