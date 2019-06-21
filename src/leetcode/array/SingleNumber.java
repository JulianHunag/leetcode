package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 136. Single Number
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {

    /**
     *
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {

        int a = 0;
        for (int n : nums) {
            a ^= n;
        }
        return a;
    }

    /**
     * Runtime: 222 ms, faster than 5.02% of Java online submissions for Single Number.
     * Memory Usage: 38 MB, less than 95.15% of Java online submissions for Single Number.
     *
     * @param nums
     * @return
     */
    public static int singleNumber1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            if (!list.contains(n)) {
                list.add(n);
            } else {
                remove(list, n);
            }
        }
        return list.get(0);
    }

    public static void remove(List<Integer> list, Integer target) {
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            Integer item = list.get(i);
            if (target.equals(item)) {
                list.remove(item);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(SingleNumber.singleNumber1(new int[]{1, 0, 1}));
    }
}
