package leetcode.tree;

import leetcode.pojo.TreeNode;

import java.util.*;

/**
 * 107. Binary Tree Level Order Traversal II
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */
public class BinaryTreeLevelOrderTraversalFromBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                currLevel.add(currNode.val);
                if (null != currNode.left)
                    queue.add(currNode.left);
                if (null != currNode.right)
                    queue.add(currNode.right);
            }
            res.add(currLevel);
        }
        Collections.reverse(res);
        return res;
    }
    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currLevel = new LinkedList<>();//使用linkedlist便于下面在头节点插入元素，速度优于arraylist
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                currLevel.add(currNode.val);
                if (null != currNode.left)
                    queue.add(currNode.left);
                if (null != currNode.right)
                    queue.add(currNode.right);
            }
            res.add(0,currLevel);
        }
        return res;
    }
    public List<List<Integer>> levelOrderBottom3(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (null == root) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currLevel = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                currLevel.add(currNode.val);
                if (null != currNode.left)
                    queue.add(currNode.left);
                if (null != currNode.right)
                    queue.add(currNode.right);
            }
            ((LinkedList<List<Integer>>) res).addFirst(currLevel);
        }
        return res;
    }


}
