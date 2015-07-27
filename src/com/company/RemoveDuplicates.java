package com.company;

/**
 * Created by emma on 6/7/15.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {2,2,2,3,3};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }

    public static int removeDuplicates(int[] nums){
        if(nums.length < 2) return nums.length;
        int tmp = nums[0];
        int len=1;
        for(int j = 1; j<nums.length; j++){
            if(tmp != nums[j]){
                tmp = nums[j];
                nums[len] = tmp;
                len++;
            }
        }
        return len;
    }
}
