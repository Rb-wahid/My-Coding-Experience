public class Kata {

 public static double getVolumeOfCuboid(final double length, final double width, final double height) {
  if (length < 1 || width < 1 || height < 1) {
   return 0;
  }
  return length * width * height;
 }
}
