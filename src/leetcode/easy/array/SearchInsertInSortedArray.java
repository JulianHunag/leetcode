package leetcode.easy.array;

public class SearchInsertInSortedArray {

  public int searchInsert(int[] nums, int target) {

    int res = -1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        res = i;
        break;
      }
    }

    if (res == -1) {
      for (int i = 0; i < nums.length; i++) {

        if (target > nums[nums.length - 1]) {
          res = nums.length;
          break;
        }

        if (nums[i] > target) {
          res = i;
          break;
        }
      }
    }


    return res;
  }

  public static void main(String[] args) {
    // System.out.println(new SearchInsertInSortedArray().searchInsert(new int[]{1,3,5,6}, 5));
    System.out.println(new SearchInsertInSortedArray().searchInsert(new int[] {1, 3, 5, 6}, 0));
  }


}
