package leetcode.tree;

import leetcode.pojo.TreeNode;

/**
 * 101 https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode t1, TreeNode t2) {
        if (null == t1 && null == t2) return true;
        if (null == t1 || null == t2) return false;
        if (t1.val != t2.val) return false;
        return isSymmetric(t1.left, t2.right) && isSymmetric(t1.right, t2.left);
    }

}
