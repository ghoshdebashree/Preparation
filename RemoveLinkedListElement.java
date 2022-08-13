public class RemoveLinkedListElement {
  int value;
  RemoveLinkedListElement next;
  RemoveLinkedListElement(int value, RemoveLinkedListElement next){
    this.value = value;
    this.next = next;
  }

public RemoveLinkedListElement remove(RemoveLinkedListElement head, int value){
  if(head == null) return null;
  head.next = remove(head.next, value);
  return head.value == value ? head.next : head;
  }
}
