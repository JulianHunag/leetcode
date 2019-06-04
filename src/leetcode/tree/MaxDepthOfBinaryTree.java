package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * 104 https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 */
public class MaxDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        }


    }

}
