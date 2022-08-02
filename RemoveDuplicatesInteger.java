public class  RemoveDuplicatesInteger{
  public static void main(String[] args) {
  int[] nums = {1,1,2};
  int res = removeDuplicatesValue(nums);
  System.out.println(res); 
}
 public static int removeDuplicatesValue(int[] nums) {
   int i = 0;
   for(int j = 1; j < nums.length; j++){
     if(nums[j] != nums[i]){
       i++;
       nums[i] = nums[j];
     }
   }
   return i + 1;
}
}

