package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Game With Sticks
 *
 * link : https://codeforces.com/problemset/problem/451/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AGameWithSticks {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int a = in.nextInt();
        int b = in.nextInt();

        a = Math.min(a, b);

        if ((a & 1) == 0)
            out.println("Malvika");
        else
            out.println("Akshat");
    }
}
