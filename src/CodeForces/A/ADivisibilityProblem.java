package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Divisibility Problem
 *
 * link : https://codeforces.com/problemset/problem/1328/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ADivisibilityProblem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0){
            int a = in.nextInt();
            double b = in.nextInt();
            double c = Math.ceil(a/b);
            out.println((int)(c * b) - a);
        }
    }
}
