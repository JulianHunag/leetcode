package leetcode.tree;

import leetcode.pojo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102 https://leetcode.com/problems/binary-tree-level-order-traversal/
 * 分层打印二叉树
 */
public class BinaryTreeLevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (null == root) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int last = 0, count = 0;
        while (!q.isEmpty()) {
            count = 0;
            last = q.size();
            List<Integer> treeList = new ArrayList<>();
            while (count < last) {
                TreeNode t = q.poll();
                count++;
                treeList.add(t.val);
                if (null != t.left) {
                    q.add(t.left);
                }
                if (null != t.right) {
                    q.add(t.right);
                }
            }

            res.add(treeList);
        }
        return res;
    }

}
