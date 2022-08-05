public class DutchFlag {
   public static void calculate(int[] arr){
    int low = 0, high = arr.length - 1;
    for(int i = 0; i<= high;){
      if(arr[i] == 0){      //we point all zeros before low
        swap(arr, i , low);
        i++;
        low++;
      }
      else if(arr[i] == 1){    // all ones in between
        i++;
      }
      else{
        swap(arr, i, high);   // all twoes after high
        high -- ;
      }
    } 
  }
  public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void main(String[] args) {
    int[] arr = {1, 0, 2, 1, 0};
    DutchFlag.calculate(arr);
    for(int k : arr){
      System.out.print(k);
    }  
  }
}
