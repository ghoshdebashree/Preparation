import java.util.*;

public class ReplaceElementInArray {
  public static void main(String[] args) {
    int[] nums = {1,2,4,6};
    int[][] operations = {{1,3},{4,7},{6,1}};
    int[] result = arrayChange(nums, operations);
    for(int i = 0; i < result.length; i++){
      System.out.print(result[i]+" ");
    }  
  }

public static int[] arrayChange(int[] nums, int[][] operations) {
  HashMap<Integer, Integer> map = new HashMap<>();
  for(int i = 0; i< nums.length; i++){
    map.put(nums[i], i);
  }
  for(int i = 0; i< operations.length; i++){
    if(map.get(operations[i][0]) != null){
      nums[map.get(operations[i][0])] = operations[i][1];
      int index = map.get(operations[i][0]);
      map.put(map.get(operations[i][1]), index);
    }
  }
  return nums;
}
}
