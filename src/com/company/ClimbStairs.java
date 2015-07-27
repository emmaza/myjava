package com.company;

/**
 * Created by emma on 29/6/15.
 */
public class ClimbStairs {
    public static void main(String[] args) {
        int n = 2;
        int x = climbStairs(n);
        int y = climbStairs2(n);
        System.out.println(x);
        System.out.println(y);

    }

    public static int climbStairs(int n){
            int way = 0;
            if(n==1) way=1;
            if(n==2) way= 2;
            if(n>2) way=climbStairs(n-1)+climbStairs(n-2);
            return way;
    }

    public static int climbStairs2(int n){
        int way1 = 1;
        int way2 = 1;
        int way=1;
        //if(n==0) way= 1;
        //if(n==1) way= 1;
        for (int i=2; i<n+1; i++){
            way = way1 + way2;
            way1=way2;
            way2=way;
        }
        return way;
    }

}
