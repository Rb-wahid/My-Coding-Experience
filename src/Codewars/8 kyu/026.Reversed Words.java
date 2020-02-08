//Codewars link --> https://www.codewars.com/kata/51c8991dee245d7ddf00000e

public class ReverseWords {
    public static String reverseWords(String str) {
        String[] revW = str.split(" ");
        String ans = "";
        for (int i = revW.length - 1; i > 0; i--) {
            ans += revW[i] + " ";
        }
        ans += revW[0];
        return ans;
    }
}
