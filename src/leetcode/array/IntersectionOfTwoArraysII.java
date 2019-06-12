package leetcode.array;

import java.util.*;

/**
 * 350 https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * 两个数组的交集
 */
public class IntersectionOfTwoArraysII {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int n1 : nums1) {
            if (map.containsKey(n1)) {
                map.put(n1, map.get(n1) + 1);
            } else {
                map.put(n1, 1);
            }
        }

        for (int n2 : nums2) {
            if (map.containsKey(n2) && map.get(n2) > 0) {
                list.add(n2);
                map.put(n2, map.get(n2) - 1);
            }
        }

        Object[] objs = list.toArray();

        int[] res = new int[objs.length];

        for (int i = 0; i < objs.length; i++) {
            res[i] = (Integer) objs[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] res = IntersectionOfTwoArraysII.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        System.out.println(Arrays.toString(res));
    }

}
