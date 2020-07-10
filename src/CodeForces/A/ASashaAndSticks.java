package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Sasha and Sticks
 *
 * link : https://codeforces.com/problemset/problem/832/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ASashaAndSticks {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        long n = in.nextLong();
        long k = in.nextLong();
        long value = n - (k*2);
        if (n == k || value >= k)
            out.println("YES");
        else
            out.println("NO");
    }
}
