package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Minimal Square
 *
 * link : http://codeforces.com/problemset/problem/1360/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AMinimalSquare {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            int a = in.nextInt();
            int b = in.nextInt();

            int side = Math.min(
                    Math.max(2*a, b), Math.max(a, 2*b)
            );

            out.println(side*side);
        }
    }
}
