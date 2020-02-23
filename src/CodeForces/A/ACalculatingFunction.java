package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Calculating Function
 *
 * link : http://codeforces.com/contest/486/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;

public class ACalculatingFunction {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.nextLong();

            out.println((n&1) == 0 ? n/2 : -(n+1)/2);
    }
}
