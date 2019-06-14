package leetcode.tree;

import leetcode.pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *94 Binary Tree Inorder Traversal
 *https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class BinaryTreeInorderTraversal {

    List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return  res;
    }

}
