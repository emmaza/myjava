package com.company;

import java.util.HashMap;

/**
 * Created by emma on 8/7/15.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,3,3,4};
        int k = majorityElement(arr);
        System.out.println(k);
    }

    public static int majorityElement(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len=nums.length;
        for(int i : nums){
            if(map.get(i)==null) map.put(i,1);
            else map.put(i,map.get(i)+1);
            if(map.get(i) > len/2) return i;
        }
        return 0;
    }
}
/*
This can be solved by Moore's voting algorithm. Basic idea of the algorithm is if we cancel out each occurrence of
an element e with all the other elements that are different from e then e will exist till end if it is a majority
element. Below code loops through each element and maintains a count of the element that has the potential of being
the majority element. If next element is same then increments the count, otherwise decrements the count.
If the count reaches 0 then update the potential index to the current element and sets count to 1.

public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }
 */
