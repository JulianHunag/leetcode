package leetcode.easy.list;

import leetcode.pojo.ListNode;

class MergeTwoSortedLists {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return null;
    }
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode result = new ListNode(0);
    ListNode prev = result;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        prev.next = l1; //头节点的下一个元素 = 值小的节点
        l1 = l1.next;
      } else {
        prev.next = l2;
        l2 = l2.next;
      }
      prev = prev.next;
    }
    if (l1 != null) { // 如果最后l1不指向空，也就是还没有完全遍历完l1这个节点的所有元素
      prev.next = l1;
    }
    if (l2 != null) {
      prev.next = l2;
    }
    return result.next;
  }
  
  
  public static void main(String[] args) {
    ListNode result = new ListNode(2);
    result.next = new ListNode(3);
    result.next.next = new ListNode(5);
    
    ListNode result1 = new ListNode(4);
    result1.next = new ListNode(6);
    result1.next.next = new ListNode(7);
    
    ListNode node = new MergeTwoSortedLists().mergeTwoLists(result,result1);
    System.out.println(node);
  }
  
  
  
}
