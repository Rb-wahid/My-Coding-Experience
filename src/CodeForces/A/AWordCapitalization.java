package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Word Capitalization
 *
 * link : https://codeforces.com/problemset/problem/281/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AWordCapitalization {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String str = in.next();
        String first = String.valueOf(str.charAt(0));
        out.println(str.replaceFirst(first, first.toUpperCase()));
    }
}
