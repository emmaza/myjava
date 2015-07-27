package com.company;

/**
 * Created by emma on 30/6/15.
 */
public class ComputeArea {

    public static void main(String[] args) {
        int a = -3;
        int b = 0;
        int c = 3;
        int d = 4;
        int e = 0;
        int f = -1;
        int g = 9;
        int h = 2;
        int area = computeArea(a,b,c,d,e,f,g,h);
        System.out.println(area);
    }

    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H){
        int area = 0;
        area = recArea(A,B,C,D) + recArea(E,F,G,H);
        if(C <= E || G <= A || H <= B || D <= F) return area;
        else{
            int a = Math.max(A,E);
            int b = Math.max(B,F);
            int c = Math.min(C,G);
            int d = Math.min(D,H);
            area = area - recArea(a,b,c,d);
        }
        return area;
    }

    public static int recArea(int a, int b, int c, int d){
        return Math.abs((a-c)*(b-d));
    }
}
