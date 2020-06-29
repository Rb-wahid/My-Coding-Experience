package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Soldier and Bananas
 *
 * link : https://codeforces.com/problemset/problem/546/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ASoldierAndBananas {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int k = in.nextInt();
        long n = in.nextLong();
        long w = in.nextInt();
        long total = 0;

        for (int i = 1; i <= w ; i++) {
            total += i * k;
        }
        if (total - n < 0)
        out.println(0);
        else
        out.println(total - n);
    }
}
