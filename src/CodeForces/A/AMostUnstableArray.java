package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Most Unstable Array
 *
 * link : https://codeforces.com/problemset/problem/1353/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AMostUnstableArray {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            long n = in.nextLong();
            long m = in.nextLong();

            out.println(Math.min(2, n-1)*m);
        }
    }
}
