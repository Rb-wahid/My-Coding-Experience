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
        int m = in.nextInt();

        int newSocks = n/m;
        int totalSocks = n+newSocks;

        if (totalSocks % m == 0)
            out.println(totalSocks+1);
        else
            out.println(totalSocks);
    }
}
