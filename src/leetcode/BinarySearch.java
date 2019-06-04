package leetcode;

/**
 * 二分查找
 * return 目标位置的在数组中的下标
 */
public class BinarySearch {

    /**
     * 使用递归
     * @param arr
     * @param target
     * @return
     */
    public static int binarySearch (int[] arr,int target){

        int l = 0;
        int r = arr.length - 1;
        int mid = 0;

        if(target < arr[l] || target > arr[r] || l > r){
            return -1;
        }

        while (l < r) {

            mid = (l+r)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                l = mid + 1;
            }

            if (arr[mid] > target) {
                r = mid - 1;
            }

        }
        return -1;
    }


    /**
     *
     * @param arr
     * @param target
     * @param l
     * @param r
     * @return
     */
    public static int binarySearch2(int[] arr, int target,int l, int r){

        if(target < arr[l] || target > arr[r] || l > r){
            return -1;
        }

        int mid = (l+r)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return binarySearch2(arr,target,l,mid-1);
        }

        if(arr[mid] < target){
            return binarySearch2(arr,target,mid+1,r);
        }


        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int target = 9;
        System.out.println(BinarySearch.binarySearch2(arr,target,0,arr.length-1));
    }

}
