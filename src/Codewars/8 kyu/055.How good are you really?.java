public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int sum = yourPoints;
    for(int i : classPoints){
       sum += i;
    }
    return (sum / (classPoints.length + 1)) < yourPoints;
  }
}
