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
        String str = in.next();

        int length = str.length();

        out.println((length&1)==0? "YES" : "NO");
    }
}
