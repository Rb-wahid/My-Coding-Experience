package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Maximum GCD
 *
 * link : https://codeforces.com/problemset/problem/1370/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AMaximumGCD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            int n = in.nextInt();
            out.println((int)Math.floor(n/2.0));
        }
    }
}
