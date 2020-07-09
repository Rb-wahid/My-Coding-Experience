package CodeForces.C;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: C. K-th Not Divisible by n
 *
 * link : https://codeforces.com/problemset/problem/1352/C
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class CKThNotDivisibleByN {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        while (t-->0) {
            double a = in.nextLong();
            long b = in.nextLong();
            long n = (long) Math.floor((b-1)/(a-1));

            out.println(n+b);
           }
    }
}
