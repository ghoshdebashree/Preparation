public class RemoveDuplicationElement {
  public static void main(String[] args) {
    int[] arr = {2,3,3,6,9,9};
    int result = removeDuplicates(arr);
    System.out.println(result);
  }
public static int removeDuplicates(int[] arr){
  int nextnonDuplicate = 1;
  for(int i = 0; i<arr.length; i++){
    if(arr[nextnonDuplicate - 1] != arr[i]){
      arr[nextnonDuplicate] = arr[i];
      nextnonDuplicate++;
    }
  }
  return nextnonDuplicate;
}
}
