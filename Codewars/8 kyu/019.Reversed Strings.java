//Codewars link --> https://www.codewars.com/kata/5168bb5dfe9a00b126000018

public class Kata {
    public static String solution(String str) {
        char[] ch = str.toCharArray();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }
}
