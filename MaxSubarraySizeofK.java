public class MaxSubarraySizeofK {
  public static void main(String[] args) {
    int[] arr = {2,1,5,1,3,2};
    int size = 3;
    int result = findMax(arr, size);
    System.out.println(result);
  }
public static int findMax(int[] arr, int size){
  int windowStart = 0, windowSum = 0, maxSum = 0;
  for(int windowEnd = 0; windowEnd < arr.length; windowEnd ++){
    windowSum += arr[windowEnd];
    if(windowEnd >= size - 1){
      maxSum = Math.max(windowSum, maxSum);
      windowSum -=arr[windowStart];
      windowStart++;
    }
  }
  return maxSum;
}
}
