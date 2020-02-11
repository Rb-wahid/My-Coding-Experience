package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Helpful Maths
 *
 *link : https://codeforces.com/contest/339/problem/A
 */
import FastIO.InputReader;
import FastIO.OutputWriter;

public class AHelpfulMaths {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        String string = in.next();
        string = string.replace("+", " ");
        String[] str = string.split(" ");

        int min = 0;
        String temp = "";
        for (int i = 0; i < str.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < str.length; j++) {
                if (Integer.valueOf(str[i]) > Integer.valueOf(str[j])) {
                    min = j;
                }
            }
            temp = str[i];
            str[i] = str[min];
            str[min] = temp;
        }
        for (int i = 0; i < str.length - 1; i++) {
            out.print(str[i] + "+");
        }
        out.print(str[str.length - 1]);
    }
}
