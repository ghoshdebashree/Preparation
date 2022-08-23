public class EasyHashSetImp {
  public boolean[] arr;
  public EasyHashSetImp() {
      arr = new boolean[10000001];
      
  }
  
  public void add(int key) {
      arr[key] = true;
      
  }
  
  public void remove(int key) {
      arr[key] = false;
  }
  
  public boolean contains(int key) {
      return arr[key];
  }
}
