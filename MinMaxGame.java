import java.lang.Math.*;

public class MinMaxGame {
  public static void main(String[] args) {
    int[] nums = {1,3,5,2,4,8,2,2};
    int result = minMaxGame(nums);
    System.out.println(result);
  }

public static int minMaxGame(int[] nums){
  if(nums.length == 1) return nums[0];
  int[] newNums = new int[nums.length / 2];
  for(int i = 0; i < newNums.length; i++){
    newNums[i] = (i % 2) == 0 ? Math.min(nums[2 * i], nums[2 * i + 1]) : Math.max(nums[2 * i], nums[2 * i + 1]);
  }
  return minMaxGame(newNums);
}
}
