package com.company;

/**
 * Created by emma on 6/7/15.
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1};
        int val = 1;
        int k = removeElement(nums,val);
        System.out.println(k);
    }

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i=0;   //The basic idea is when elem is found at index i, let A[i] = the last element in the modifying array,
        // then repeat searching until elem is not found.
        while(i<len){
            if(nums[i]==val){
                nums[i]=nums[len-1];
                len--;
            } else i++;
        }
        for (int j : nums){
            System.out.println(j);
        }
        return len;
    }
}
