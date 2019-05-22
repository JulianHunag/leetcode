package leetcode.easy.array;

public class RemoveElement {
  public int[] removeDuplicates(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val){
        nums[i] = nums[j];
        i++;
      }
    }
    return nums;
  }


  public static void main(String[] args) {
    int[] arry = new RemoveElement().removeDuplicates(new int[] {3,2,2,3}, 3);
    for (int i = 0; i < arry.length; i++) {
      System.out.print(arry[i]);
    }
  }
}
