public class Kata {
    public static int[] getSize(int w,int h,int d) {
        int[] arr = new int[2];
        arr[0] = 2 * (d * w + d * h + w * h);
        arr[1] = w * h * d;
        return arr;
    }
}
