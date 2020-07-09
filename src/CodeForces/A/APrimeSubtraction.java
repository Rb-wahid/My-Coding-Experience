package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Prime Subtraction
 *
 * link : https://codeforces.com/problemset/problem/1238/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class APrimeSubtraction {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();

        while (t-->0) {
            long x = in.nextLong();
            long z = in.nextLong();
                long num = x-z;
            if (num > 1)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
