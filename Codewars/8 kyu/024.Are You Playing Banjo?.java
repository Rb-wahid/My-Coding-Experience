//Codewars link --> https://www.codewars.com/kata/53af2b8861023f1d88000832

public class Kata {
    public static double find_average(int[] array) {
        double sum = 0.0 f;
        for (int i: array) {
            sum += i;
        }
        return sum / array.length;
    }
}
