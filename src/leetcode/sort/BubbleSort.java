package leetcode.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void bubleSort(int[] arr){

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        BubbleSort.bubleSort(new int[]{3,6,7,1,3,9,7});
    }

}
