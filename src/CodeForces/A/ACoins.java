package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Coins
 *
 * link : https://codeforces.com/problemset/problem/1061/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACoins {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        double n = in.nextInt();
        long s = in.nextLong();
        out.println((int) Math.ceil(s/n));
    }
}
