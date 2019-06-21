package leetcode.tree;

import leetcode.pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. Binary Tree Paths
 * https://leetcode.com/problems/binary-tree-paths/
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root != null) helper(res, new StringBuilder(), root);
        return res;
    }


    public void helper(List<String> res, StringBuilder buffer, TreeNode root) {
        buffer.append(root.val);
        if (root.left == null && root.right == null) res.add(buffer.toString());
        buffer.append("->");
        if (root.left != null)
            helper(res, new StringBuilder(buffer), root.left);

        if (root.right != null)
            helper(res, new StringBuilder(buffer), root.right);
    }

}
