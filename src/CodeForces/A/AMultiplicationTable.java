package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Multiplication Table
 *
 * link : https://codeforces.com/problemset/problem/577/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AMultiplicationTable {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        long k = in.nextLong();
        int count = 0;

        for (int i = 1; i <= n ; i++) {
            if (k%i == 0 && k/i <= n) {
                count++;
            }
        }
        out.println(count);
    }
}
