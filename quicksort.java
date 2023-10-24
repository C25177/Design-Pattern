import java.util.Vector;
public class quicksort {
  public static void main(String[] args){
    int[] a = {1, 2, 491, 21, 219, 31, 32};
    int n = a.length;
    sort(a);
    for(int i = 0; i < n; i++){
      System.out.println(a[i]);
    }
  }
  public static void sort(int[] a){
    int n = a.length;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(a[i] < a[j]){
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }
}
