public class LinkedListPalindromeCheck {
  
}
// logic ...........
public boolean check(LinkedListPalindromeCheck head){
  LinkedListPalindromeCheck first = head;
  LinkedListPalindromeCheck last = head;
  Stack<Integer> stack = new Stack<>();
  while(first != null){
    stack.push(first.val);
    first = first.next;
  }
  while(!stack.isEmpty())
    if(stack.pop() != last.val)
      return false;
  last = last.next;  
return true;
}
}
