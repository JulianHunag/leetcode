package leetcode.array;

import java.util.Arrays;

/**
 * 922. Sort Array By Parity II
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 */
public class SortArrayByParityII {

    public static int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int t = 0;
        int f = 1;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] % 2 == 0) {
                res[t] = A[i];
                t += 2;
            } else {
                res[f] = A[i];
                f += 2;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(SortArrayByParityII.sortArrayByParityII(new int[]{4, 2, 5, 7})));
    }

}
