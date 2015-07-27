package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emma on 14/7/15.
 */
public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7,8,9};
        List<String> l = summaryRanges(nums);
        for(String s : l) System.out.println(s);
    }

    public static List<String> summaryRanges(int[] nums){
        List<String> ls = new ArrayList<String>();
        int i=0;
        while(i<nums.length){
            StringBuilder s = new StringBuilder();
            int tmp = nums[i];
            s.append(tmp);
            while (i<nums.length-1 && nums[i+1]-nums[i]==1) i++;
            if(nums[i]-tmp>=1) {
                s.append("->");
                s.append(nums[i]);
            }
            ls.add(s.toString());
            i++;
        }
        return ls;
    }
}
