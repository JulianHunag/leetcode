package leetcode.array;

import java.util.Arrays;

/**
 * 832. Flipping an Image
 * https://leetcode.com/problems/flipping-an-image/
 */
public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {

        int[][] res = new int[A.length][A.length];
        for (int[] firstArr : A) {
            reverseArray(firstArr);//逆序
            invert(firstArr);
        }
        return A;
    }


    public void reverseArray(int[] nums) {
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public void invert(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] == 0 ? 1 : 0;
        }
    }


    public static void main(String[] args) {
        FlippingAnImage f = new FlippingAnImage();
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        A = f.flipAndInvertImage(A);

        for (int i = 0; i < A.length; i++) {
            System.out.print(Arrays.toString(A[i]));
        }
    }

}
