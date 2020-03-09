public class Kata {
  public static int[] digitize(long n) {
     String st = String.valueOf(n);
     int[] arr = new int[st.length()];
   
   for(int i = st.length() - 1, j = 0; i >= 0 ; i--, j++){
       arr[j] = st.charAt(i) - '0';
       
   }
   return arr;
  }
}
