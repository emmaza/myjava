package com.company;

//Number of 1 Bits
//Write a function that takes an unsigned integer and returns the number of ’1' bits it has (the Hamming weight)
/**
 * Created by emma on 17/6/15.
 */
public class HammingWeight {
    public static void main(String[] args) {
        int a = 214748364;
        hammingWeight(a);
    }
    // you need to treat n as an unsigned value

    public static int hammingWeight(int n) {
        int cnt = 0;
        while(n!=0){
            if((n&1) == 1) cnt+=1;
            n = n>>>1;
        }
        return cnt;
    }
}
