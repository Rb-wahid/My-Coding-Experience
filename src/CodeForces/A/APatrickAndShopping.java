package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Patrick and Shopping
 *
 * link : https://codeforces.com/problemset/problem/599/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class APatrickAndShopping {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long d1 = in.nextLong();
        long d2 = in.nextLong();
        long d3 = in.nextLong();

        long op1 = (d1*2) + (d2*2);
        long op2 = Math.min(d1, d2)*2 + (d3*2);

        out.println(Math.min(Math.min(op1, op2), (d1+d2+d3)));
    }
}
