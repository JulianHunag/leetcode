package leetcode.array;

import java.util.Arrays;

/**
 * 移动零元素到末尾，并保持非零元素的顺序
 * 283 https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeros {

    public static void moveZeroes(int[] nums) {

        int pos = 0;
        int len = nums.length;
        for (int i = 0; i < len ; i++) {
            if(nums[i] != 0){//非零的数放数组中
                nums[pos++] = nums[i];
            }
        }

        //在数组最后补上0
        while (pos<len){
            nums[pos++] = 0;
        }

        System.out.println(Arrays.toString(nums));

    }


    public static void main(String[] args) {
        MoveZeros.moveZeroes(new int[]{5,0,0,3,12});
    }

}
