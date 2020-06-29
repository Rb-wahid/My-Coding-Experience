package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Required Remainder
 *
 * link : https://codeforces.com/contest/1374/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ARequiredRemainder {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-- > 0) {
            long x = in.nextLong();
        long y = in.nextLong();
        long n = in.nextLong();
        StringBuilder sb = new StringBuilder();
        long  mod = n % x;

        if (mod - y >= 0) {
            n = n - (mod-y);
        }
        else {
            n = n - mod-x+y;
        }

        out.println(n);
    }
    }
}
