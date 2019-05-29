package leetcode.easy.list;

import leetcode.pojo.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {


        if (head == null) return false;

        ListNode slow = head; //慢指针

        if (slow == null) return false;

        ListNode fast = head.next;//快指针

        while (null != slow && null != fast) {

            if (slow == fast) { //如果相等，则有环
                return true;
            }

            slow = slow.next;//向下遍历

            fast = fast.next;//向下遍历

            if (null != fast)
                fast = fast.next;

        }

        return false;

    }


    public boolean hasCycle2(ListNode head) {


        Set<ListNode> sets = new HashSet<>();

        while (null != head){
            if(sets.contains(head)){
                return true;
            }else{
                sets.add(head);
            }
            head = head.next;
        }

        return false;

    }


}
