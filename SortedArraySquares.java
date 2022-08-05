public class SortedArraySquares {
  public static void main(String[] args) {
    int[] arr = {-2,1,0,2,3};
    int[] result = findSquares(arr);
    for(int i : result){
      System.out.print(i +" ");
    }
  }
public static int[] findSquares(int[] arr){
  int left = 0, right = arr.length - 1, heighestSqareIndex = arr.length - 1;
  int[] squares = new int[arr.length];
  while(left <= right){
    int leftSquare = arr[left] * arr[left];
    int rightSquare = arr[right] * arr[right];
    if(leftSquare > rightSquare){
      squares[heighestSqareIndex --] = leftSquare;
      left++;
    }
    else{
      squares[heighestSqareIndex --] = rightSquare;
      right--;
    }
  }
    return squares;
  }
}
