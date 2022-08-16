public class LinkedListDeleteNode {
  int value;
  LinkedListDeleteNode next;
  LinkedListDeleteNode(int value, LinkedListDeleteNode next){
    this.value = value;
    this.next = next;
  }

public void delete(LinkedListDeleteNode node){
  node.value = node.next.value;
  node.next = node.next.next;
  }
}
