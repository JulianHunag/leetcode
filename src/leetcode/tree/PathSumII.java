package leetcode.tree;

import leetcode.pojo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 113.Path Sum II
 * https://leetcode.com/problems/path-sum-ii/
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) return res;
        helper(res, list, root, sum);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> list, TreeNode root, int sum) {
        if (root == null) return;
        list.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList<>(list));
        }
        helper(res, list, root.left, sum - root.val);
        helper(res, list, root.right, sum - root.val);
        list.remove(list.size() - 1);
    }

}
