package leetcode.list;

import leetcode.pojo.ListNode;

/**
 * 83 Remove Duplicates from Sorted List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;
        if (null == curr) return null;
        while (null != curr.next) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
