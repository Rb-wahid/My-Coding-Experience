package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. EhAb AnD gCd
 *
 * link : https://codeforces.com/problemset/problem/1325/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AEhAbAnDGCd {

    long gcd (long a, long b){
        if (b == 0)
            return a;
        return gcd(b, a%b);

    }

    long lcm(long b) {
        return (b) / gcd(1, b);
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            long x = in.nextLong();

            out.println(gcd(1, x-1) + " " + lcm(x-1));
        }
        }
}
