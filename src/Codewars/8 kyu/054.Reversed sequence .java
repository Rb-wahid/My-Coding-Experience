public class Sequence{

  public static int[] reverse(int n){
    int[] arr = new int[n];
    int i = 0;
    while(n > 0){
        arr[i] = n;
        i++;
        n--;
    }
    return arr;
  }

}
