package leetcode.tree;


import leetcode.pojo.TreeNode;

/**
 * 111. Minimum Depth of Binary Tree
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinDepehOfBinaryTree {

    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 || right == 0){
            return left+right+1;
        }
        return  Math.min(left,right) + 1;
    }


}
