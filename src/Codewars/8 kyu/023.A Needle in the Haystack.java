//Codewars link --> https://www.codewars.com/kata/56676e8fabd2d1ff3000000c

import java.util.Arrays;

public class Kata {
    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}
