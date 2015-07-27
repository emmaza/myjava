package com.company;
import java.util.Arrays;

/**
 * Created by emma on 16/6/15.
 */
/*
public class CountPrimes {
    public static void main(String[] args) {
        int a = 10;
        int k = countPrimes(a);
        System.out.println(k);
    }

    // someone's solution
    // https://leetcode.com/discuss/36568/java-o-n-solution-for-count-primes
    public static int countPrimes(int n) {
        int res = 0;
        boolean[] used = new boolean[n];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!used[i - 1]) {
                int temp = i * i;
                while (temp < n) {
                    used[temp - 1] = true;
                    temp += i;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!used[i - 1]) {
                res++;
            }
        }
        return res;
    }
}
//https://leetcode.com/discuss/35195/my-simple-java-solution
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }

        return count;
    }
    /*
    public static int countPrimes(int n) {
        if(n==0 || n==1) return 0;
        int root = (int) Math.sqrt(n);
        boolean[] arr = new boolean[n]; //all values defaults to false
        Arrays.fill(arr, Boolean.TRUE);
        arr[0] = false;
        arr[1] = false;
        for(int i=2; i<=root; i++ ){
            if (arr[i] && !isPrime(i)) arr[i] = false;
            //change its multiples to non-primes, ie false
            int j=i + i;
            while(j<n){
                arr[j] = false;
                j+=i;
            }
        }
        int cnt = 0;
        for(int k=0; k<n; k++){
            if(arr[k]==true) cnt++;
        }
        return cnt;
    }

    public static boolean isPrime(int m){
        if(m==1 || m==0) return false;
        if(m==2 || m==3) return true;
        for(int i=2; i<= (int)Math.sqrt(m); i++){
            if(m%i==0) return false;
        }
        return true;
    }
}
*/
