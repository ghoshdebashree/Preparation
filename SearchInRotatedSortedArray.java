import java.util.*;

public class SearchInRotatedSortedArray {
  public static void main(String[] args) {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 0;
    int position = search(nums, target);
    System.out.println(position);
  }

public static int search(int[] nums, int target) {
  int index = 0;
  for(int i = 0; i< nums.length; i++){
    if(nums[i] == target){
      index = i;
      break;
    }
    else index = -1;
  }
  return index;
}

}
