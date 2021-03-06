package leetcode.array;

import java.util.Arrays;

/**
 * 1051. Height Checker
 * https://leetcode.com/problems/height-checker/
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {
        int[] clone = heights;
        Arrays.sort(clone);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (clone[i] != heights[i])
                count++;
        }
        return count;
    }

}
