public class RemoveElementWithKey {
  public static void main(String[] args) {
    int[] arr = {3, 2, 3, 6, 3, 10, 9, 3};
    int key = 3;
    int result = remove(arr, key);
    System.out.println(result);
  }
public static int remove(int[] arr, int key){
  int nextElement = 0;     //shift to next if there is a match with the key
  for(int i = 0; i< arr.length; i++){
    if(arr[i] != key){
      arr[nextElement] = arr[i];
      nextElement++;
    }
  }
  return nextElement;
}
}
