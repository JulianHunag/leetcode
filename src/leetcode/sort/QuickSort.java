package leetcode.sort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    public static void quickSort(int[] arr) {
         quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int hight) {

        if (low >= hight || arr == null || arr.length <= 1) {
            return;
        }

        int i = low, j = hight;
        int pivot = arr[(low + hight) / 2];

        while (i < j) {

            while (arr[j] > pivot) { //从最右开始扫，如果大于基准值，则向左边继续扫
                j--;
            }

            while (arr[i] < pivot) { //从最左开始扫，如果小于基准值，则向右边继续扫
                i++;
            }

            //当上面2个while结束时，说明i与j对应的位置上的值，i>p and j<p 这时候交换它们的位置
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }else if (i == j) {
                i++;
            }


        }
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,hight);

    }
    public static void main(String[] args) {

        int a[] = { 49, 38, 65, 97, 76, 13, 27, 49 };
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }

}
