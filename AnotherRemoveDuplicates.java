public class AnotherRemoveDuplicates {
  public static void main(String[] args) {
    int[] nums = {1,1,2};
    int res = removeDuplicatesValue(nums);
    System.out.println(res); 
  }
  public static int removeDuplicatesValue(int[] nums) {
    int i = 0 , counter = nums.length;
    for(int j = 1; j < nums.length; j++){
      if(nums[i] != nums[j]){
        counter --;
      }
      i++;
    }
    return counter;
  }
  
}
