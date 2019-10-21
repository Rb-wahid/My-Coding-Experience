//Codewars link --> https://www.codewars.com/kata/515e271a311df0350d00000f

public class Kata {
    public static int squareSum(int[] n) {
        int result = 0;
        for (int i: n) {
            result += (int) Math.pow(i, 2);
        }
        return result;
    }
}
