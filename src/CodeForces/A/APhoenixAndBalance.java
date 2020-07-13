package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Phoenix and Balance
 *
 * link : https://codeforces.com/problemset/problem/1348/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class APhoenixAndBalance {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            int a = 1<<n;
            int b = 0;

            for (int i = 1; i < n>>1; i++) {
                a += 1<<i;
            }
            for (int i = n>>1; i < n ; i++) {
                b += 1<<i;
            }

            out.println(Math.abs(a-b));
        }
    }
}
