import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.lang.Math.*;

class SortedMedian{
  public static void main(String[] args) {
    int[] nums1 = {1,4,5,6};
    int[] nums2 = {2};
    List<Integer>list = new ArrayList<Integer>();
    for(int i = 0; i< nums1.length; i++){
        list.add(nums1[i]);
    }
    for(int i = 0; i< nums2.length; i++){
        list.add(nums2[i]);
    }
    Collections.sort(list);
    int len = list.size();
    if(len % 2 == 0){
      int middleElementIndex = ((len - 1)/ 2 ) ;
      int midEle = list.get(middleElementIndex);
      int nextTomid = list.get(middleElementIndex + 1);
      double median  = (midEle + nextTomid) / 2.0;
      System.out.println(median);
    } 
    else{
      int midIndex = ((len - 1) / 2) ;
      double median = list.get(midIndex);
      System.out.println(median);
    }
  }
}

