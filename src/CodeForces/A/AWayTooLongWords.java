package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: A. Way Too Long Words
 *
 *link : https://codeforces.com/contest/71/problem/A
 */
import FastIO.InputReader;
import FastIO.OutputWriter;

public class AWayTooLongWords {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            String words = in.next();
            if (words.length() < 11)
                out.println(words);
            else
                out.println(words.substring(0, 1) + (words.length() - 2) + words.substring(words.length() - 1, words.length()));
        }
    }
}
