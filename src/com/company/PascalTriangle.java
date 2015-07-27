package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emma on 20/6/15.
 */

// why leetcode uses list of lists, which intellij does not recognise?
    //why not use int[], like some online website did?

    /*
public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> kk= pascalTriangle(3);
        for(int i=0; i<kk.size(); i++){
            for(int j=0; j<kk.get(i).size(); j++)
                System.out.println(kk.get(i).get(j));
    }

    public static List<List<Integer>> pascalTriangle(int numRows){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0; i<numRows; i++){
            List<Integer> member = new ArrayList<Integer>();
            result.add(member);
            member.add(1);
            for (int j = 1; j <i ; j++) {
                int k= result.get(i-1).get(j - 1) + result.get(i-1).get(j);
                member.add(k);
            }
           // if(numRows==1) break;
            if(i>0) member.add(1);
        }
        return result;
    }
}
*/