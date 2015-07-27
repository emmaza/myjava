package com.company;


import java.util.HashMap;

public class ContainDupK {
    public static void main(String[] args) {
        int[] kk = {5,5};
        if(containDupK(kk, 2)) System.out.println("yes");
        else if(!containDupK(kk, 2)) System.out.println("no");
    }
    public static boolean containDupK(int[] nums, int k) {
        HashMap<Integer, Integer> k_num = new HashMap<Integer, Integer>();
        int i;
        for(i=0; i<nums.length; i++){
            if(k_num.containsValue(nums[i])) return true;
            if(i-k+1 > 0 && nums.length - i >= k) k_num.remove(i-k+1);
            k_num.put(nums[i], i);
        }
        return false;
    }

}
/*
public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }
 */