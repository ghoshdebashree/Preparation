public class LinkedListRemoveDuplicates {
  int value;
  LinkedListRemoveDuplicates next;
  LinkedListRemoveDuplicates(int value, LinkedListRemoveDuplicates next){
    this.value = value;
    this.next = next;
  }  

public LinkedListRemoveDuplicates removeDuplicates(LinkedListRemoveDuplicates head){
  LinkedListRemoveDuplicates newNode = head;
  while(newNode != null && newNode.next != null){
    if(newNode.value == newNode.next.value) 
      newNode.next = newNode.next.next;
    else
      newNode = newNode.next;
  }
  return head;
}
}
