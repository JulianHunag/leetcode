package leetcode.array;

/**
 * 167  Two Sum II - Input array is sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 */
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length-1;
        while (i<j){
            if(numbers[i] + numbers[j] < target){
                i++;
            }else if(numbers[i] + numbers[j] > target){
                j++;
            }else
                break;

        }

        return new int[]{i+1, j+1};
    }

}
