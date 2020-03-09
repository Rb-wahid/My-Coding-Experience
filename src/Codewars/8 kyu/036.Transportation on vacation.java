public class Kata {
 public static int rentalCarCost(int d) {
  int cost = d * 40;
  if (d >= 3 && d < 7) {
   cost -= 20;
  } else if (d > 6) {
   cost -= 50;
  }
  return cost;
 }
}
