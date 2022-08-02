import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumPairs {
public static List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for(int i = 0; i< nums.length - 2; i++){
        if(i>0 && nums[i] == nums[i - 1]) continue;
        int left = i + 1;
        int right = nums.length - 1;
        while(left < right){
            int countResult = nums[i] + nums[left] + nums[right];
            if(countResult == 0){
                result.add(Arrays.asList(nums[i], nums[left] , nums[right]));
                left+=1;
                right-=1;
            while(left < right && nums[right] == nums[right + 1]) right-=1;
            }
            else if(countResult < 0) left +=1;
            else if(countResult > 0) right-=1;
        }
    }
    return result;     
  }
}

