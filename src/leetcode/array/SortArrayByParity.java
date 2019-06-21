package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 905. Sort Array By Parity
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] A) {
        List<Integer> list = new LinkedList<>();
        for (int n : A) {
            if (n % 2 == 0) {
                list.add(0, n);
            } else {
                list.add(list.size(), n);
            }
        }
        Object[] arrays = list.toArray();
        for (int i = 0; i < arrays.length; i++) {
            A[i] = (Integer) arrays[i];
        }
        return A;
    }


    public static int[] sortArrayByParity1(int[] A) {
        Integer[] B = new Integer[A.length];
        for (int t = 0; t < A.length; ++t)
            B[t] = A[t];

        Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));

        for (int t = 0; t < A.length; ++t)
            A[t] = B[t];
        return A;

        /* Alternative:
        return Arrays.stream(A)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(a%2, b%2))
                     .mapToInt(i -> i)
                     .toArray();
        */
    }


    public static int[] sortArrayByParity2(int[] A) {
        int[] res =  new int[A.length];
        int t = 0;
        int f = A.length-1;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] % 2 == 0)
                 res[t++] = A[i];
            if (A[i] % 2 == 1)
                res[f--] = A[i];
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(SortArrayByParity.sortArrayByParity2(new int[]{3,1,2,4})));
    }

}
