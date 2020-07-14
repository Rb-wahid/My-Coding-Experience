package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Vanya and Cubes
 *
 * link : https://codeforces.com/problemset/problem/492/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AVanyaAndCubes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int h = 0;
        int count = 0;
        while (count <= n) {
            h++;
            count += (h* (h+1))>>1;
        }
        out.println(--h);
    }
}
