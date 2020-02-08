//Codewars link --> https://www.codewars.com/kata/57a2013acf1fa5bfc4000921

public class Kata {
    public static double find_average(int[] array) {
        double sum = 0.0 f;
        for (int i: array) {
            sum += i;
        }
        return sum / array.length;
    }
}
