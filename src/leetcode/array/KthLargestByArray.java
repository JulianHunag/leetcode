package leetcode.array;

import java.util.Arrays;

/**
 * 703 https://leetcode.com/problems/kth-largest-element-in-a-stream/
 * <p>
 * Your KthLargestByArray object will be instantiated and called as such:
 * <p>
 * KthLargestByArray obj = new KthLargestByArray(k, nums);
 * int param_1 = obj.add(val);
 */
public class KthLargestByArray {

    int k;
    int[] nums;

    public KthLargestByArray(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
    }

    public int add(int val) {

        if (nums.length == 0) {
            nums = new int[1];
            nums[0] = val;
        }

        Arrays.sort(nums);

        if (k < nums.length) {
            if (nums[0] < val)
                nums[0] = val;
        } else {
            int[] nnums = new int[nums.length + 1];
            for (int i = 0; i <= nums.length - 1; i++) {
                nnums[i] = nums[i];
            }
            nnums[nnums.length - 1] = val;
            nums = nnums;
        }

        Arrays.sort(nums);
        int j = 0;
        int[] knums = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            knums[j] = nums[i];
            j++;
        }

        for (int i = knums.length - 1; i >= 0; i--) {
            if (i == k - 1) {
                return knums[i];
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int k = 1;
        int[] arr = {};
        KthLargestByArray kthLargest = new KthLargestByArray(k, arr);

        System.out.println(kthLargest.add(-3));
        System.out.println(kthLargest.add(-2));
        System.out.println(kthLargest.add(-4));
        System.out.println(kthLargest.add(0));
        System.out.println(kthLargest.add(4));
    }


}
