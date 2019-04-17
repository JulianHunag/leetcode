package leetcode.easy;

public class RemoveDuplicatesOfArray {
  public int[] removeDuplicates(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return nums;
    // return i+1;
  }


  public static void main(String[] args) {
    int[] arry = new RemoveDuplicatesOfArray().removeDuplicates(new int[] {1, 1, 2, 3, 3, 5});
    for (int i = 0; i < arry.length; i++) {
      System.out.print(arry[i]);
    }
  }
}
