package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Chips Moving
 *
 * link : https://codeforces.com/problemset/problem/1213/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AChipsMoving {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int odd = 0;
        int even = 0;
        long x;
        for (int i = 0; i < n ; i++) {
             x = in.nextLong();

            if ((x & 1) == 0)
                even++;
        }
        odd = n - even;

        out.println(Math.min(odd, even));
    }
}
