package leetcode.list;

import leetcode.pojo.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 * 反转linkedlist
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head){

       ListNode curr = head;
       ListNode prev = null;

       while (null != curr){
           ListNode tempNode = curr.next;
           curr.next = prev;
           prev = curr;
           curr = tempNode;
        }

       return prev;
    }


}
