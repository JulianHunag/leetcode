package leetcode.array;

import java.util.*;

/**
 * 349 https://leetcode.com/problems/intersection-of-two-arrays/
 * 两个数组的交集
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <nums1.length ; i++) {
            map.put(nums1[i],1);
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i <nums2.length ; i++) {
            if(map.containsKey(nums2[i])){
                set.add(nums2[i]);
            }
        }

        Object[] objs = set.toArray();

        int[] res = new int[objs.length];

        for (int i = 0; i <objs.length ; i++) {
            res[i] = (Integer) objs[i];
        }

        return res;
    }

}
