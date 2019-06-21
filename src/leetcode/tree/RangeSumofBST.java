package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * 938. Range Sum of BST
 * https://leetcode.com/problems/range-sum-of-bst/
 */
public class RangeSumofBST {

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        dfs(root, L, R);
        return sum;
    }

    public void dfs(TreeNode root, int L, int R) {
        if (root != null) {
            if (root.val >= L && root.val <= R) {
                sum += root.val;
            }
            if (root.val > L) {
                dfs(root.left, L, R);
            }
            if (root.val < R) {
                dfs(root.right, L, R);
            }
        }
    }
}
