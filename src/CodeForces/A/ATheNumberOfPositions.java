package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. The number of positions
 *
 * link : https://codeforces.com/problemset/problem/124/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ATheNumberOfPositions {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        out.println(n-a);
    }
}
