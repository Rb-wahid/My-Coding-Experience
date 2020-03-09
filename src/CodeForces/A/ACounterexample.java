package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Counterexample
 *
 * link : http://codeforces.com/contest/483/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACounterexample {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long l = in.nextLong();
        long r = in.nextLong();

        if ((l&1) == 1)
            l++;
        if (Math.abs(l-r) < 2)
            out.println(-1);
        else
            out.println(l + " " + (l+1) + " " + (l+2));
    }
}
