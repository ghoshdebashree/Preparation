public class LinkedListCycle {
  int value;
  LinkedListCycle next;
  LinkedListCycle(int data){
    this.value = data;
    next = null;
  }
class LinkedListCycleDetection{
public boolean listCycle(ListNode head){
  LinkedListCycle slow = head;
  LinkedListCycle fast = head;
  while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
    if(slow == fast){
      return true;
    }
  }
  return fast;
  }
}