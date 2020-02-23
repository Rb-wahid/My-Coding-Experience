package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Theatre Square
 *
 * link : http://codeforces.com/contest/1/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ATheatreSquare {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.nextLong();
        long m = in.nextLong();
        long a = in.nextLong();
        long x = n/a;
        long y = m/a;

        if (n%a != 0)
            x++;
        if (m%a != 0)
            y++;
        out.println(x*y);
    }
}
