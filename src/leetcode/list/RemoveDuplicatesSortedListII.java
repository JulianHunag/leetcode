package leetcode.list;

import leetcode.pojo.ListNode;

/**
 * 82. Remove Duplicates from Sorted List II
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 */
public class RemoveDuplicatesSortedListII {

    public ListNode deleteDuplicates(ListNode head) {

        if(null == head || head.next == null) return head;

        ListNode dummy = new ListNode(-1);
        ListNode fast = head;
        ListNode slow = dummy;

        slow.next = fast;

        while (fast != null){

            while (fast.next != null && fast.val == fast.next.val){
                fast =  fast.next;//略过重复结点
            }

            if(slow.next != fast){//有重复
                slow.next = fast.next;
                fast =  slow.next;
            }else{
                slow = slow.next;//继续向下
                fast = fast.next;
            }

        }
        return dummy.next;

    }

}
