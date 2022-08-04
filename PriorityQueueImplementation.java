import java.util.*;

class item{
  public int value;
  public int priority;
}
public class PriorityQueueImplementation {
  static item[] pr = new item[10000];
  static int size  = -1;
  public static void enQueue(int value, int priority){
    size++;
    pr[size] = new item();
    pr[size].value = value;
    pr[size].priority = priority;
  }
  public static int peek(){
    int heightestPriority = Integer.MIN_VALUE;
    int ind = -1;
    for(int i = 0; i <= size; i++){
      if((heightestPriority == pr[i].priority) && ind>-1 &&(pr[ind].value < pr[i].value)){
        heightestPriority = pr[i].priority;
        ind = i;
      }
      else if(heightestPriority < pr[i].priority){
        heightestPriority = pr[i].priority;
        ind = i;
      }
    }
    return ind;
  }
  public static void deQueue(){
    int ind = peek();
    for(int i = ind; i< size; i++){
      pr[i] = pr[i+ 1];
    }
    size -- ;
  }
  public static void main(String[] args) {
    enQueue(10, 2);
    enQueue(14, 4);
    enQueue(16, 4);
    enQueue(12, 3);

    int ind = peek();
    System.out.println(pr[ind].value);
    deQueue();
    ind = peek();
    System.out.println(pr[ind].value);
    deQueue();
    ind = peek();
    System.out.println(pr[ind].value);

  }

}
