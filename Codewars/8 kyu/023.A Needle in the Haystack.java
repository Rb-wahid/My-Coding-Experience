//Codewars link --> https://www.codewars.com/kata/56676e8fabd2d1ff3000000c

public class Kata {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0;; i++) {
            if (haystack[i] == "needle") {
                return "found the needle at position " + i;
            }
        }
    }
}
