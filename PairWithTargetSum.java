public class PairWithTargetSum {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 6};
    int targetSum = 6;
    int[]result = findPair(arr, targetSum);
    for(int i = 0; i< result.length; i++){
      System.out.print(result[i]);
    } 
  }

public static int[] findPair(int[] arr, int targetSum){
  int left = 0, right = arr.length - 1;
  while(left < right){
    int pairSum = arr[left] + arr[right];
    if(pairSum == targetSum)
      return new int[] {left, right};
    if(targetSum > pairSum) 
      left++;
    else 
      right--;
  }
  return new int[] {-1,-1};
}
}
