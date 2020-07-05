package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Vasya the Hipster
 *
 * link : https://codeforces.com/problemset/problem/581/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AVasyaTheHipster {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();

        int min = Math.min(a, b);
        int same = Math.abs(a-b);

        if ((same &1 ) == 1)
            same--;

        out.println(min + " " + (same>>1));
    }
}
