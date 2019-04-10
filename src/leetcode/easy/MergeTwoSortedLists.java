package leetcode.easy;

import leetcode.pojo.ListNode;

public class MergeTwoSortedLists {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2){
    for(int i = 0; i< l1.size(); i++){
      for(int j = 0; j<l2.size();j++){
        if(l1.get(i).val <= l2.get(j).val){
          l1.insert(i, l2.get(j).val);
        }
      }
    }
    
    return l1;
  }
    
  
  public static void main(String[] args) {
    ListNode l1 = new ListNode();
    l1.headInsert(1);
//    l1.addLast(2);
//    l1.addLast(4);
    l1.insert(1, 2);
    l1.insert(2, 4);
    l1.print();
    ListNode l2 = new ListNode();
    l2.headInsert(1);
    l2.addLast(3);
    l2.addLast(4);
    l2.print();
    
    MergeTwoSortedLists merge = new MergeTwoSortedLists();
    ListNode mergerNode =  merge.mergeTwoLists(l1,l2);
    mergerNode.print();
    
    
  }
  
}
