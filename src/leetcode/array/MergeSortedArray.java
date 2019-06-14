package leetcode.array;

import java.util.Arrays;

/**
 *88 https://leetcode.com/problems/merge-sorted-array/
 *
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = m;
        for(int n2:nums2){
            nums1[pos++] = n2;
        }

        Arrays.sort(nums1);

    }


    public static void merge2(int[] nums1, int m, int[] nums2, int n){
        int i = m-1, j = n-1, k = m+n-1;
        while (i>=0 && j>=0){
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j>=0){
            nums1[k--] = nums2[j--];
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeSortedArray.merge2(new int[]{0},0,new int[]{1},1);
    }


}
