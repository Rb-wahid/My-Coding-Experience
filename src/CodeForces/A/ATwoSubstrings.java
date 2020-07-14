package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Two Substrings
 *
 * link : https://codeforces.com/problemset/problem/550/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ATwoSubstrings {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String string = in.next();
        String str = string;
        str = str.replace("AB", "");
        str = str.replace("BA", "");

        int length = str.length();

        out.println((length+4)== string.length()? "YES" : "NO");
    }
}
