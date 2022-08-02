import java.lang.Math.*;

public class MaxWater {
  public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    int area = maxArea(height);
    System.out.println(area);
  }
public static int maxArea(int[] height) {
  int water = 0, leftPointer = 0, rightPointer = height.length - 1;
  while(leftPointer < rightPointer){
    water = Math.max(water, Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer));
    if(height[leftPointer] > height[rightPointer]) rightPointer --;
    else leftPointer++;
  }
    return water;
  }
}