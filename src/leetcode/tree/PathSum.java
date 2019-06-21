package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * 112. Path Sum
 * https://leetcode.com/problems/path-sum/
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) return false;

        if (root.left == null && root.right == null) return sum == root.val;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

    }

}
