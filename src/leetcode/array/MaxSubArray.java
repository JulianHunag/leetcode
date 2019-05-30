package leetcode.array;

public class MaxSubArray {

  public static int maxSubArray(int[] nums){
    int maxSum = nums[0];
    int currSum = 0;
    for(int i = 0; i<nums.length; i++){
      if(currSum < 0){
        currSum = 0;
      }
      currSum = currSum + nums[i];
//      System.out.println(currSum);
      maxSum = Math.max(maxSum, currSum);
    }
    
    return maxSum;
  }
  
  
  public static void main(String[] args) {
    
    System.out.println(MaxSubArray.maxSubArray(new int[]{-2,-3,-4}));

  }

}
