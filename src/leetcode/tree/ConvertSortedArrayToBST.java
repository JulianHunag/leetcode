package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * 108 Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class ConvertSortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return  helper(nums,0,nums.length - 1);
    }


    public TreeNode helper(int[] nums,int low, int high){
        if(low > high ) return null;
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,low,mid-1);
        node.right = helper(nums,mid+1,high);
        return node;
    }



}
