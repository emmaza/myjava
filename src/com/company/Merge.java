package com.company;
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold
additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */

/**
 * Created by emma on 4/7/15.
 */
public class Merge {
    public static void main(String[] args) {
        int[] n1 = {2,0};
        int[] n2 = {1};
        merge(n1, 1, n2, 1);
        for(int i : n1) System.out.println(i);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        for(int k=0; k<n; k++){ // copy nums2 to nums1, then sort
            nums1[m+k]=nums2[k];
        }
       // for(int i=0, j=m; i<m, j<m+n; i++, j++)
        int j=m;
        while(j<m+n){
            int tmp = j;
            while(j>0 && nums1[j-1]>=nums1[j]){
                int t=nums1[j-1]; //swap(nums1[j-1], nums1[j]);---java has no pointers
                nums1[j-1]=nums1[j];
                nums1[j]=t;
                j--;
            }
            j=tmp+1;
        }

    }
}
/*  ### going backwards avoids shifting, good!!!
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i >= 0 && j >= 0) {
            A[k--] = A[i] > B[j] ? A[i--] : B[j--];
        }
        while(j >= 0) {
            A[k--] = B[j--];
        }
    }
}

 */
