package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Park Lighting
 *
 * link : https://codeforces.com/problemset/problem/1358/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AParkLighting {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        int n, m;

        while (t-->0) {
            n = in.nextInt();
            m = in.nextInt();

            out.println((int)Math.ceil((n * m) / 2.0));
        }
    }
}
