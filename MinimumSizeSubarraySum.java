public class MinimumSizeSubarraySum {
  public static void main(String[] args) {
    int[] arr = {2,1,5,2,3,2};
    int size = 7;
    int result = findMinimumSize(arr, size);
    System.out.println(result);
  }

public static int findMinimumSize(int[] arr, int size){
  int windowStart = 0, windowSum = 0, minLength = Integer.MAX_VALUE;
  for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
    windowSum += arr[windowEnd];
    while(windowSum >= size){
      minLength = Math.min(minLength, windowEnd - windowStart + 1);
      windowSum -= arr[windowStart];
      windowStart++;
    }
  }
  return minLength == Integer.MAX_VALUE ? 0 :minLength;
}
}
