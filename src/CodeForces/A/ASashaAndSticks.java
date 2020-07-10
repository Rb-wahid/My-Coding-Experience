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
        double k = in.nextLong();
        long value = (long) Math.floor(n/k);
        if ((value&1) == 1)
            out.println("YES");
        else
            out.println("NO");
    }
}
