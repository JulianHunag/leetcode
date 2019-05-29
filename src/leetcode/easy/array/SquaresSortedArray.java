package leetcode.easy.array;

import java.util.Arrays;

public class SquaresSortedArray {

    public static int[] sortedSquares(int[] A){
        int[] res = new int[A.length];
        for(int i=0; i<A.length; i++){
            res[i] = A[i] * A[i];
        }

        Arrays.sort(res);

        return res;
    }


    public static void main(String[] args) {
        int [] res = SquaresSortedArray.sortedSquares(new int[]{-7,-3,2,3,11});
        System.out.println(Arrays.toString(res));
    }

}
