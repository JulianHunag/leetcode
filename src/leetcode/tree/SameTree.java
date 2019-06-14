package leetcode.tree;

import leetcode.pojo.TreeNode;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 100 https://leetcode.com/problems/same-tree/
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(null == p && null == q){
            return true;
        }

        if(null == p && null != q){
            return false;
        }

        if(null != p && null == q){
            return false;
        }

        if(p.val!=q.val) return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);


    }


}
