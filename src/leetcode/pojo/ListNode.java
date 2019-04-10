package leetcode.pojo;

public class ListNode {
 public int val;
  ListNode next;
  
  private ListNode  head;
  private int length;

 public ListNode (){
   head = null;
   length = 0;
 }
 
 public ListNode get(int p) {
   ListNode current = head;
   if (p > 0 && p <= length) {
       for (int i = 0; i < p - 1; i++) {
           current = current.next;
       }
       return current;
   }
   return null;

}

 
 public void headInsert(int data) {
   ListNode n = new ListNode();
   n.val = data;
   n.next = head;
   head = n;
   length++;

}
 
 public void addLast(int data) {
   ListNode last = get(length);
   ListNode n = new ListNode();
   n.val = data;
   last.next = n;
   last = n;
   length++;

}

 public void insert(int p, int data) {
   ListNode current = head;
   ListNode n = new ListNode();
   n.val = data;
   if (p > 0 && p <= length + 1) {
       for (int i = 0; i < p - 1; i++) {
           current = current.next;
       }
       n.next = current.next;
       current.next = n;
       length++;
   }

}

 public void print() {
   ListNode current = head;
   for (int i = 0; i < length; i++) {
       System.out.print(current.val + "-->");
       current = current.next;
   }
   System.out.println();
}

 
 public int size() {
   return this.length;
}
 
  
  
}
