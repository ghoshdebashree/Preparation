public class LinkedListReverse {
  int value;
  LinkedListReverse next;
  LinkedListReverse(int val, ListNode next){
    this.value = val;
    this.next = next;
  } 
}
class Solution{                             // we have to convert 1 -> 2 -> 3 -> 4 -> 5
                                                  // 5 -> 4 -> 3 -> 2 ->1
  public ListNode reverse(ListNode head){
    ListNode curr = head;
    ListNode prev = null;
    ListNode last = null;
    while(curr != null){
      last = curr.next;
      curr.next = prev;
      prev = curr;
      curr = last;
    }
  }
}
