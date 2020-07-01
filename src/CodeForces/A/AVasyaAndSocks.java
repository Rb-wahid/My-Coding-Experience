package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Vasya and Socks
 *
 * link : https://codeforces.com/problemset/problem/460/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AVasyaAndSocks {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        double m = in.nextInt();

        int value = (int) Math.floor((n-1)/(m-1));
            out.println(n + value );
    }
}
