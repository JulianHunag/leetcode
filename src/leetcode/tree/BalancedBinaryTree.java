package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * 110. Balanced Binary Tree
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (null == root) return true;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if (Math.abs(left - right) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }
}
