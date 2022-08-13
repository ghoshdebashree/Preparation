public class LinkedListMiddleElement {
  int value;
  LinkedListMiddleElement next;
  LinkedListMiddleElement(int value, LinkedListMiddleElement next){
    this.value = value;
    this.next = next;
  }
  public LinkedListMiddleElement middle(LinkedListMiddleElement head){
    LinkedListMiddleElement mid = head;
    LinkedListMiddleElement curr = head;
    while(curr != null && mid != null && curr.next != null){
      mid = mid.next;
      curr = curr.next.next;
    }
    return mid;
  }
  
}
