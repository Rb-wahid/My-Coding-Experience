public class Kata {

 public static int grow(int[] x) {
  int value = 1;
  for (int i: x) {
   value *= i;
  }
  return value;
 }
}
