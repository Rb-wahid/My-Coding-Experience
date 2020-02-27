import java.util.*;
public class MonkeyCounter
{
  public static int[] monkeyCount(final int n){
  ArrayList<Integer> list=new ArrayList<Integer>();
     int x = 1;
     int i = n;
     while( i != 0){
         list.add(x);
         x++;
         i--;
     }
    int[] arr = new int[list.size()];
    
    for(int j = 0 ; j < arr.length; j++){
        arr[j] = list.get(j);
    }
     return arr;
  }
}
