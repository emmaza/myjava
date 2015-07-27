package com.company;

/**
 * Created by emma on 30/6/15.
 */
public class CountAndSay {
    public static void main(String[] args) {
        int n=3;
        String s = countAndSay(n);
        System.out.println(s);
        //6 "312211"
    }

    public static String countAndSay(int n){
        StringBuilder ps = new StringBuilder("1");
        for(int i=2; i<=n ; i++){
            StringBuilder s = new StringBuilder();
            int j;
            for(j=0; j<ps.length()-1; j++ ) {
                int k=1;
                while(j<ps.length()-1 && ps.charAt(j)== ps.charAt(j+1)) {
                    k++;
                    j++;
                }
                s.append(k);
                s.append(ps.charAt(j));
            }
            if(j==ps.length()-1) {
                s.append('1');
                s.append(ps.charAt(j));
            }
            ps=s;
        }
        return ps.toString();
    }

}
